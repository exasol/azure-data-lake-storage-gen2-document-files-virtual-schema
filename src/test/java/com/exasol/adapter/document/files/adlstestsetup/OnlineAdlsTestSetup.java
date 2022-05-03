package com.exasol.adapter.document.files.adlstestsetup;

import com.azure.storage.common.StorageSharedKeyCredential;
import com.azure.storage.file.datalake.DataLakeServiceClient;
import com.azure.storage.file.datalake.DataLakeServiceClientBuilder;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;

public class OnlineAdlsTestSetup implements AdlsTestSetup {
    private static final String ACCOUNTKEY_FILE = "accountkey.txt";
    private static final String ACCOUNTNAME_FILE = "accountname.txt";
    private final DataLakeServiceClient dataLakeServiceClient;
    private final String accountKey;
    private final String accountName;

    public OnlineAdlsTestSetup() {
        if (!Files.exists(Path.of(ACCOUNTKEY_FILE))) {
            throw new IllegalStateException("Could not find " + ACCOUNTKEY_FILE
                    + ". Please create a Azure Data Lake Storage Gen 2 account, get the key string and store it in this project in "
                    + ACCOUNTKEY_FILE + ".");
        }
        if (!Files.exists(Path.of(ACCOUNTNAME_FILE))) {
            throw new IllegalStateException("Could not find " + ACCOUNTNAME_FILE
                    + ". Please create a Azure Data Lake Storage Gen 2 account, get the key string and store it in this project in "
                    + ACCOUNTNAME_FILE + ".");
        }
        try {
            this.accountKey = Files.readString(Path.of(ACCOUNTKEY_FILE)).replace("\n", "").replace("\r", "");
            this.accountName = Files.readString(Path.of(ACCOUNTNAME_FILE)).replace("\n", "").replace("\r", "");
            StorageSharedKeyCredential sharedKeyCredential =
                    new StorageSharedKeyCredential(this.accountName, accountKey);
            DataLakeServiceClientBuilder builder = new DataLakeServiceClientBuilder();

            builder.credential(sharedKeyCredential);
            String endPointStr = "https://" + this.accountName + ".dfs.core.windows.net";
            builder.endpoint(endPointStr);
            this.dataLakeServiceClient = builder.buildClient();

        } catch (final IOException exception) {
            throw new UncheckedIOException("Failed to read ADLS credentials from file.", exception);
        }
    }

    @Override
    public DataLakeServiceClient getAdlsServiceClient() {
        return this.dataLakeServiceClient;
    }

    @Override
    public String getStorageAccountName() {
        return accountName;
    }

    @Override
    public String getStorageAccountKey() {
        return accountKey;
    }

    @Override
    public void close() {
        // nothing to do
    }

    @Override
    public boolean useSsl() {
        return true;
    }

    @Override
    public Optional<String> getHostOverride() {
        return Optional.empty();
    }
}
