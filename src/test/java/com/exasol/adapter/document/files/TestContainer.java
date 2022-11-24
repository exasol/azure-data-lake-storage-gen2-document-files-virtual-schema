package com.exasol.adapter.document.files;

import com.azure.storage.file.datalake.DataLakeDirectoryClient;
import com.azure.storage.file.datalake.DataLakeFileClient;
import com.azure.storage.file.datalake.DataLakeFileSystemClient;
import com.azure.storage.file.datalake.DataLakeServiceClient;
import com.azure.storage.file.datalake.models.PathItem;
import com.exasol.adapter.document.files.adlstestsetup.AdlsTestSetup;

public class TestContainer implements AutoCloseable {
    private final DataLakeFileSystemClient dataLakeFileSystemClient;
    private final String adlsContainerName;

    public TestContainer(final AdlsTestSetup testSetup) {
        final String containerName = "adls-document-vs-test-" + System.currentTimeMillis();
        final DataLakeServiceClient adlsServiceClient = testSetup.getAdlsServiceClient();
        this.dataLakeFileSystemClient = adlsServiceClient.createFileSystem(containerName);
        this.adlsContainerName = containerName;
    }

    //https://github.com/Azure/azure-sdk-for-java/issues/10180
    public void empty() {
        for (final PathItem path : dataLakeFileSystemClient.listPaths()) {
            if (path.isDirectory()) {
                DataLakeDirectoryClient dlDirectoryClient = dataLakeFileSystemClient.getDirectoryClient((path.getName()));
                dlDirectoryClient.deleteWithResponse(true, null, null, null);
            } else {
                DataLakeFileClient dlFileClient = dataLakeFileSystemClient.getFileClient((path.getName()));
                dlFileClient.delete();
            }
        }
    }

    @Override
    public void close() {
        empty();
        this.dataLakeFileSystemClient.delete();
    }

    /**
     * Get the data lake filesystem client.
     *
     * @return file system client
     */
    public DataLakeFileSystemClient getDataLakeFileSystemClient() {
        return dataLakeFileSystemClient;
    }

    /**
     * Get the container name.
     *
     * @return container name
     */
    public String getAdlsContainerName() {
        return adlsContainerName;
    }
}
