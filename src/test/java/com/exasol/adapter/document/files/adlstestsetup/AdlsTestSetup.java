package com.exasol.adapter.document.files.adlstestsetup;

import com.azure.storage.file.datalake.DataLakeServiceClient;

import java.util.Optional;

public interface AdlsTestSetup extends AutoCloseable {
    DataLakeServiceClient getAdlsServiceClient();

    String getStorageAccountName();

    String getStorageAccountKey();

    @Override
    void close();

    boolean useSsl();

    Optional<String> getHostOverride();
}
