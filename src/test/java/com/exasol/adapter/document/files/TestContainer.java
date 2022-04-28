package com.exasol.adapter.document.files;

import com.azure.storage.file.datalake.DataLakeDirectoryClient;
import com.azure.storage.file.datalake.DataLakeFileClient;
import com.azure.storage.file.datalake.DataLakeFileSystemClient;
import com.azure.storage.file.datalake.DataLakeServiceClient;
import com.azure.storage.file.datalake.models.PathItem;
import com.exasol.adapter.document.files.adlstestsetup.AdlsTestSetup;
import lombok.Getter;

public class TestContainer implements AutoCloseable {
    @Getter
    private final DataLakeFileSystemClient dataLakeFileSystemClient;
    @Getter
    private final String blobContainerName;
    public TestContainer(final AdlsTestSetup testSetup) {
        final String containerName = "abs-document-vs-test-" + System.currentTimeMillis();
        final DataLakeServiceClient adlsServiceClient = testSetup.getAdlsServiceClient();
        this.dataLakeFileSystemClient = adlsServiceClient.createFileSystem(containerName);
        this.blobContainerName = containerName;
    }
    //https://github.com/Azure/azure-sdk-for-java/issues/10180
    public void empty() {
        for (final PathItem path : dataLakeFileSystemClient.listPaths()){
            if (path.isDirectory()) {
                    DataLakeDirectoryClient dlDirectoryClient = dataLakeFileSystemClient.getDirectoryClient((path.getName()));
                //dlDirectoryClient.delete()
                    dlDirectoryClient.deleteWithResponse(true,null,null,null);
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
}
