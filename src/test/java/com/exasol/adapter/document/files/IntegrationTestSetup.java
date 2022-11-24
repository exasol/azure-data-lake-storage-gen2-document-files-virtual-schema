package com.exasol.adapter.document.files;

import com.azure.storage.file.datalake.DataLakeFileSystemClient;
import com.exasol.adapter.document.UdfEntryPoint;
import com.exasol.adapter.document.files.adlstestsetup.AdlsTestSetup;
import com.exasol.bucketfs.Bucket;
import com.exasol.bucketfs.BucketAccessException;
import com.exasol.dbbuilder.dialects.DatabaseObject;
import com.exasol.dbbuilder.dialects.exasol.*;
import com.exasol.dbbuilder.dialects.exasol.udf.UdfScript;
import com.exasol.exasoltestsetup.ExasolTestSetup;
import com.exasol.udfdebugging.UdfTestSetup;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonWriter;
import org.jetbrains.annotations.NotNull;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.concurrent.TimeoutException;

import static com.exasol.adapter.document.GenericUdfCallHandler.*;

public class IntegrationTestSetup implements AutoCloseable {
    private static final String ADAPTER_JAR = "document-files-virtual-schema-dist-7.1.2-azure-datalake-storage-gen2-1.1.3.jar";
    private final ExasolTestSetup exasolTestSetup;
    private final Connection exasolConnection;
    private final Statement exasolStatement;
    private final ExasolObjectFactory exasolObjectFactory;
    private final AdapterScript adapterScript;
    private final Bucket bucket;
    private final List<DatabaseObject> createdObjects = new LinkedList<>();
    private final AdlsTestSetup adlsTestSetup;
    private final DataLakeFileSystemClient adlsContainer;
    private final UdfTestSetup udfTestSetup;
    private final ConnectionDefinition connectionDefinition;

    public IntegrationTestSetup(final ExasolTestSetup exasolTestSetup, final AdlsTestSetup adlsTestSetup,
                                final DataLakeFileSystemClient adlsContainer)
            throws SQLException, BucketAccessException, TimeoutException, FileNotFoundException {

        this.adlsTestSetup = adlsTestSetup;
        this.adlsContainer = adlsContainer;

        this.exasolTestSetup = exasolTestSetup;
        this.exasolConnection = this.exasolTestSetup.createConnection();
        this.exasolStatement = this.exasolConnection.createStatement();
        this.exasolStatement.executeUpdate("ALTER SESSION SET QUERY_CACHE = 'OFF';");

        this.bucket = this.exasolTestSetup.getDefaultBucket();
        this.udfTestSetup = new UdfTestSetup(this.exasolTestSetup, this.exasolConnection);

        final List<String> jvmOptions = Arrays.asList(this.udfTestSetup.getJvmOptions());
        this.exasolObjectFactory = new ExasolObjectFactory(this.exasolConnection,
                ExasolObjectConfiguration.builder().withJvmOptions(jvmOptions.toArray(String[]::new)).build());
        final ExasolSchema adapterSchema = this.exasolObjectFactory.createSchema("ADAPTER");
        //create a connection to Azure Data Lake Storage Gen 2
        this.connectionDefinition = createConnectionDefinition();

        this.adapterScript = createAdapterScript(adapterSchema);

        createUdf(adapterSchema);
    }

    private static void createUdf(final ExasolSchema adapterSchema) {
        adapterSchema.createUdfBuilder("IMPORT_FROM_AZURE_DATA_LAKE_STORAGE_GEN2_DOCUMENT_FILES")
                .language(UdfScript.Language.JAVA).inputType(UdfScript.InputType.SET)
                .parameter(PARAMETER_DOCUMENT_FETCHER, "VARCHAR(2000000)")
                .parameter(PARAMETER_SCHEMA_MAPPING_REQUEST, "VARCHAR(2000000)")
                .parameter(PARAMETER_CONNECTION_NAME, "VARCHAR(500)").emits()
                .bucketFsContent(UdfEntryPoint.class.getName(), "/buckets/bfsdefault/default/" + ADAPTER_JAR).build();
    }

    private ConnectionDefinition createConnectionDefinition() {
        final JsonObjectBuilder configJson = getConnectionConfig();
        return createConnectionDefinition(configJson);
    }

    public JsonObjectBuilder getConnectionConfig() {
        final JsonObjectBuilder objectBuilder = Json.createObjectBuilder();
        return objectBuilder//
                .add("adlsContainerName", this.adlsContainer.getFileSystemName())//
                .add("adlsStorageAccountName", this.adlsTestSetup.getStorageAccountName())//
                .add("adlsStorageAccountKey", this.adlsTestSetup.getStorageAccountKey());
    }

    public ConnectionDefinition createConnectionDefinition(final JsonObjectBuilder details) {
        String json = toJson(details.build());
        return this.exasolObjectFactory.createConnectionDefinition("ADLS_CONNECTION_" + System.currentTimeMillis(), "",
                "", json);
    }

    private String toJson(final JsonObject configJson) {
        try (final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
             final JsonWriter writer = Json.createWriter(outputStream)) {
            writer.write(configJson);
            return outputStream.toString(StandardCharsets.UTF_8);
        } catch (final IOException exception) {
            throw new UncheckedIOException("Failed to serialize connection settings", exception);
        }
    }

    private AdapterScript createAdapterScript(final ExasolSchema adapterSchema)
            throws BucketAccessException, TimeoutException, FileNotFoundException {
        this.bucket.uploadFile(Path.of("target", ADAPTER_JAR), ADAPTER_JAR);
        return adapterSchema.createAdapterScriptBuilder("FILES_ADAPTER")
                .bucketFsContent("com.exasol.adapter.RequestDispatcher", "/buckets/bfsdefault/default/" + ADAPTER_JAR)
                .language(AdapterScript.Language.JAVA).build();
    }

    @Override
    public void close() throws Exception {
        this.udfTestSetup.close();
        this.exasolStatement.close();
        this.exasolConnection.close();
        this.exasolTestSetup.close();
    }

    public Statement getExasolStatement() {
        return this.exasolStatement;
    }

    protected VirtualSchema createVirtualSchema(final String schemaName, final String mapping) {
        return createVirtualSchema(schemaName, mapping, this.connectionDefinition);
    }

    protected VirtualSchema createVirtualSchema(final String schemaName, final String mapping,
                                                final ConnectionDefinition connection) {
        final VirtualSchema virtualSchema = getPreconfiguredVirtualSchemaBuilder(schemaName)
                .connectionDefinition(connection)//
                .properties(getVirtualSchemaProperties(mapping)).build();
        this.createdObjects.add(virtualSchema);
        return virtualSchema;
    }

    @NotNull
    private Map<String, String> getVirtualSchemaProperties(final String mapping) {
        final Map<String, String> properties = new HashMap<>(Map.of("MAPPING", mapping));
        final String debugProperty = System.getProperty("test.debug", "");
        final String profileProperty = System.getProperty("test.jprofiler", "");
        if (!debugProperty.isBlank() || !profileProperty.isBlank()) {
            properties.put("MAX_PARALLEL_UDFS", "1");
        }
        if (System.getProperty("test.vs-logs", "false").equals("true")) {
            properties.put("DEBUG_ADDRESS", "127.0.0.1:3001");
            properties.put("LOG_LEVEL", "ALL");
        }
        return properties;
    }

    public void dropCreatedObjects() {
        for (final DatabaseObject createdObject : this.createdObjects) {
            createdObject.drop();
        }
        this.createdObjects.clear();
    }

    public Bucket getBucket() {
        return this.bucket;
    }

    public ExasolObjectFactory getExasolObjectFactory() {
        return this.exasolObjectFactory;
    }

    public VirtualSchema.Builder getPreconfiguredVirtualSchemaBuilder(final String schemaName) {
        return this.exasolObjectFactory.createVirtualSchemaBuilder(schemaName)
                .connectionDefinition(this.connectionDefinition).adapterScript(this.adapterScript);
    }
}
