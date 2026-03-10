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
import com.exasol.adapter.document.iterators.*;

import static java.util.Objects.requireNonNull;

import java.util.Collections;


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
        this(filePattern, buildAdlsClient(connectionProperties).getFileSystemClient(connectionProperties.getAdlsContainerName()));
    }

    AdlsRemoteFileFinder(final StringFilter filePattern, final DataLakeFileSystemClient dlFileSystemClient) {
        this.filePattern = requireNonNull(filePattern, "filePattern must not be null");
        this.dlFileSystemClient = requireNonNull(dlFileSystemClient, "dlFileSystemClient must not be null");
    }

    private static DataLakeServiceClient buildAdlsClient(final AdlsConnectionProperties connectionProperties) {
        StorageSharedKeyCredential sharedKeyCredential = new StorageSharedKeyCredential(connectionProperties.getAdlsStorageAccountName(),
                connectionProperties.getAdlsStorageAccountKey());
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
                adlsObject -> filePatternMatcher.matches(adlsObject.getName()));
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
        // Extract the deepest directory from the static prefix (everything before the last '/') so that ADLS only lists
        // the relevant subtree instead of scanning the entire container.
        final String staticPrefix = this.filePattern.getStaticPrefix();
        final String path = staticPrefix.contains("/")
                ? staticPrefix.substring(0, staticPrefix.lastIndexOf('/'))
                : "";

        // If the derived path does not exist in the container — no files can match the pattern.
        // An empty path refers to the container root, which always exists, so we only
        // check non-empty prefixes.
        if (!path.isEmpty() && !directoryExists(path)) {
            return new CloseableIteratorWrapper<>(Collections.emptyIterator());
        }

        final ListPathsOptions options = new ListPathsOptions()
                .setRecursive(true)
                .setPath(path); // requires an actual path, not a wildcard

        final CloseableIterator<PathItem> paths = new CloseableIteratorWrapper<>(
                this.dlFileSystemClient.listPaths(options, null).iterator()
        );

        final FilteringIterator<PathItem> files = new FilteringIterator<>(paths, item -> !item.isDirectory());

        return new TransformingIterator<>(files, file -> new AdlsObjectDescription(file.getName(), file.getContentLength()));
    }

    private boolean directoryExists(final String path) {
        final Boolean exists = this.dlFileSystemClient.getDirectoryClient(path).exists();
        return exists != null && exists.booleanValue();
    }

    private RemoteFile loadFile(final AdlsObjectDescription fileDescription,
                                final ExecutorServiceFactory executorServiceFactory) {
        return new RemoteFile(fileDescription.getName(), fileDescription.getSize(),
                new AdlsRemoteFileContent(this.dlFileSystemClient, fileDescription, executorServiceFactory));
    }
}
