package com.exasol.adapter.document.files;

import com.azure.storage.file.datalake.DataLakeFileClient;
import com.azure.storage.file.datalake.DataLakeFileSystemClient;
import com.exasol.adapter.document.documentfetcher.files.RemoteFileContent;
import com.exasol.adapter.document.documentfetcher.files.randomaccessinputstream.RandomAccessInputStream;
import com.exasol.adapter.document.documentfetcher.files.randomaccessinputstream.RandomAccessInputStreamCache;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Future;


/**
 * {@link RemoteFileContent} for Azure Data Lake Storage Gen 2.
 */
class AdlsRemoteFileContent implements RemoteFileContent {
    private static final int SIZE_1_MB = 1000000;
    private final DataLakeFileSystemClient dlFilesystemClient;
    private final AdlsObjectDescription fileToRead;
    private final ExecutorServiceFactory executorServiceFactory;

    /**
     * Create a new instance of {@link AdlsRemoteFileContent}.
     *
     * @param dlFileSystemClient ADLS dlFileSystemClient
     * @param fileToRead         file to read
     * @param executorServiceFactory ExecutorServiceFactory
     */
    public AdlsRemoteFileContent(final DataLakeFileSystemClient dlFileSystemClient, final AdlsObjectDescription fileToRead,
                                 final ExecutorServiceFactory executorServiceFactory) {
        this.dlFilesystemClient = dlFileSystemClient;
        this.fileToRead = fileToRead;
        this.executorServiceFactory = executorServiceFactory;
    }

    @Override
    public InputStream getInputStream() {
        return getFile().openInputStream().getInputStream();
    }

    private DataLakeFileClient getFile() {
        return this.dlFilesystemClient.getFileClient(this.fileToRead.getName());
    }

    @Override
    public RandomAccessInputStream getRandomAccessInputStream() {
        return new RandomAccessInputStreamCache(new AdlsRandomAccessInputStream(getFile(), this.fileToRead.getSize()),
                SIZE_1_MB);
    }

    @Override
    public Future<byte[]> loadAsync() {
        return this.executorServiceFactory.getExecutorService().submit(() -> {
            ByteArrayOutputStream oStream = new ByteArrayOutputStream();
            getFile().read(oStream);
            return oStream.toByteArray();
        });
    }
}
