package com.exasol.adapter.document.files;

import com.azure.storage.common.StorageSharedKeyCredential;
import com.azure.storage.file.datalake.DataLakeFileSystemClient;
import com.azure.storage.file.datalake.DataLakeServiceClient;
import com.azure.storage.file.datalake.DataLakeServiceClientBuilder;
import com.azure.storage.file.datalake.models.ListPathsOptions;
import com.azure.storage.file.datalake.models.PathItem;
import com.exasol.adapter.document.documentfetcher.files.RemoteFile;
import com.exasol.adapter.document.documentfetcher.files.RemoteFileFinder;
import com.exasol.adapter.document.files.connection.AdlsConnectionProperties;
import com.exasol.adapter.document.files.stringfilter.StringFilter;
import com.exasol.adapter.document.iterators.CloseableIterator;
import com.exasol.adapter.document.iterators.CloseableIteratorWrapper;
import com.exasol.adapter.document.iterators.FilteringIterator;
import com.exasol.adapter.document.iterators.TransformingIterator;


/**
 * File finder for files on Azure Data Lake Storage Gen 2.
 */
public class AdlsRemoteFileFinder implements RemoteFileFinder {
    private final StringFilter filePattern;
    private final DataLakeFileSystemClient dlFileSystemClient;

    /**
     * Create a new instance of {@link AdlsRemoteFileFinder}.
     *
     * @param filePattern          pattern to search for
     * @param connectionProperties connection information
     */
    //the c'tor sets up a Data Lake Storage Container/File System client and saves the file pattern for internal operations.
    public AdlsRemoteFileFinder(final StringFilter filePattern, final AdlsConnectionProperties connectionProperties) {
        //"storage" in GCP
        final DataLakeServiceClient datalakeServiceClient = buildAdlsClient(connectionProperties);
        //"container" is the equivalent to the "bucket" in GCP
        this.dlFileSystemClient = datalakeServiceClient.getFileSystemClient(connectionProperties.getAdlsContainerName());
        this.filePattern = filePattern;
    }

    private DataLakeServiceClient buildAdlsClient(final AdlsConnectionProperties connectionProperties) {
        StorageSharedKeyCredential sharedKeyCredential =
                new StorageSharedKeyCredential(connectionProperties.getAdlsStorageAccountName(), connectionProperties.getAdlsStorageAccountKey());
        var builder = new DataLakeServiceClientBuilder();
        builder.credential(sharedKeyCredential);
        builder.endpoint("https://" + connectionProperties.getAdlsStorageAccountName() + ".dfs.core.windows.net");
        return builder.buildClient();
    }

    @SuppressWarnings("java:S2095") // executorServiceFactory is closed by CloseInjectIterator
    @Override
    public CloseableIterator<RemoteFile> loadFiles() {
        //get the files info
        final CloseableIterator<AdlsObjectDescription> objectKeys = getQuickFilteredObjectKeys();
        //filter files again
        final com.exasol.adapter.document.files.stringfilter.matcher.Matcher filePatternMatcher = this.filePattern
                .getDirectoryIgnoringMatcher();
        final FilteringIterator<AdlsObjectDescription> filteredObjectKeys = new FilteringIterator<>(objectKeys,
                s3Object -> filePatternMatcher.matches(s3Object.getName()));
        //load all the files
        final ExecutorServiceFactory executorServiceFactory = new ExecutorServiceFactory();
        final CloseableIterator<RemoteFile> loadedFiles = new TransformingIterator<>(filteredObjectKeys,
                description -> this.loadFile(description, executorServiceFactory));
        return new CloseInjectIterator<>(loadedFiles, executorServiceFactory::close);
    }

    /**
     * Get a list of object keys.
     *
     * <p>
     * This method only applies the filters that can be applied on ADLS. So you have to filter the output once again with
     * a more featured matcher.
     * </p>
     *
     * @return partially filtered list of object keys
     */
    private CloseableIterator<AdlsObjectDescription> getQuickFilteredObjectKeys() {
        ListPathsOptions options = new ListPathsOptions()
                .setRecursive(true)
                .setPath(""); // can't filter on this, this has to be an actual path, not a wildcard

        final CloseableIterator<PathItem> files = new CloseableIteratorWrapper<>(
                this.dlFileSystemClient.listPaths(options, null).iterator()
        );
        return new TransformingIterator<>(files, file -> new AdlsObjectDescription(file.getName(), file.getContentLength()));
    }

    private RemoteFile loadFile(final AdlsObjectDescription fileDescription,
                                final ExecutorServiceFactory executorServiceFactory) {
        return new RemoteFile(fileDescription.getName(), fileDescription.getSize(),
                new AdlsRemoteFileContent(this.dlFileSystemClient, fileDescription, executorServiceFactory));
    }
}
