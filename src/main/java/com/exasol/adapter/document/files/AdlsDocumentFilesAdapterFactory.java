package com.exasol.adapter.document.files;

import com.exasol.adapter.AdapterFactory;
import com.exasol.adapter.VirtualSchemaAdapter;
import com.exasol.adapter.document.DocumentAdapter;
import com.exasol.logging.VersionCollector;

/**
 * Factory for the ADLS Virtual Schema adapter.
 *
 * <p>
 * This factory is loaded via a service loader (resources/services/com.exasol.adapter.AdapterFactory).
 * </p>
 */
public class AdlsDocumentFilesAdapterFactory implements AdapterFactory {
    /**
     * Name of the adapter
     */
    public static final String ADAPTER_NAME = "AZURE_DATA_LAKE_STORAGE_GEN2_DOCUMENT_FILES";

    @Override
    public VirtualSchemaAdapter createAdapter() {
        return new DocumentAdapter(new DocumentFilesAdapter(ADAPTER_NAME, new AdlsFileFinderFactory()));
    }

    @Override
    public String getAdapterVersion() {
        final VersionCollector versionCollector = new VersionCollector(
                "META-INF/maven/com.exasol/azure-data-lake-storage-gen2-document-files-virtual-schema/pom.properties");
        return versionCollector.getVersionNumber();
    }

    @Override
    public String getAdapterName() {
        return ADAPTER_NAME;
    }
}
