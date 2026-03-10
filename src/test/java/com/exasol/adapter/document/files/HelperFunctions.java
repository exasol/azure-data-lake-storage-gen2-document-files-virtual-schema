package com.exasol.adapter.document.files;

import com.azure.storage.file.datalake.DataLakeFileClient;
import com.azure.storage.file.datalake.DataLakeFileSystemClient;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

public class HelperFunctions {
    public static void uploadBytes(final byte[] bytes, final DataLakeFileClient fileClient) {
        final InputStream targetStream = new BufferedInputStream(new ByteArrayInputStream(bytes));
        final long fileSize = bytes.length;
        fileClient.upload(targetStream, fileSize, false);
    }

    /**
     * Creates a balanced tree of {@code fileCount} files under {@code rootPath}, spread across {@code treeDepth}
     * directory levels.
     *
     * <p>The branching factor per level is computed as {@code ceil(fileCount^(1/treeDepth))}, so files are
     * distributed evenly across the tree.</p>
     *
     * @param rootPath           root directory for the tree (no leading/trailing slash)
     * @param fileCount          total number of files to create
     * @param treeDepth          number of directory levels above each file
     * @param dlFileSystemClient ADLS file-system dlFileSystemClient
     */
    public static void createFileTree(final String rootPath, final int fileCount, final int treeDepth, final DataLakeFileSystemClient dlFileSystemClient) {
        final int branchingFactor = Math.max(2, (int) Math.ceil(Math.pow(fileCount, 1.0 / treeDepth)));

        final Map<DataLakeFileClient, byte[]> files = new LinkedHashMap<>();
        for (int fileIndex = 0; fileIndex < fileCount; fileIndex++) {
            final String filePath = buildFileTreePath(rootPath, fileIndex, treeDepth, branchingFactor);
            final byte[] fileContent = ("content-" + fileIndex).getBytes();

            files.put(dlFileSystemClient.getFileClient(filePath), fileContent);
        }

        HelperFunctions.uploadBytesParallel(files);
    }

    /**
     * Builds the ADLS path for a single file in the tree.
     *
     * <p>Each directory level uses {@code fileIndex % branchingFactor} (with successive integer-division
     * of {@code fileIndex}) so that consecutive files fan out across different branches.</p>
     *
     * @param rootPath        root directory prefix
     * @param fileIndex       zero-based index of the file
     * @param treeDepth       number of directory levels
     * @param branchingFactor number of subdirectories per directory level
     * @return full path, e.g. {@code rootPath/dir-2/dir-0/dir-1/file-7.json}
     */
    private static String buildFileTreePath(final String rootPath,
                                            final int fileIndex,
                                            final int treeDepth,
                                            final int branchingFactor) {
        final StringBuilder sb = new StringBuilder(rootPath);

        int shiftedIndex = fileIndex;
        for (int i = 0; i < treeDepth; i++, shiftedIndex /= branchingFactor) {
            sb.append("/dir-").append(shiftedIndex % branchingFactor);
        }

        return sb.append("/file-").append(fileIndex).append(".json").toString();
    }


    public static void uploadBytesParallel(final Map<DataLakeFileClient, byte[]> fileClientMap) {
        if (fileClientMap.isEmpty()) {
            return;
        }

        final int threadCount = Math.min(fileClientMap.size(), 32);
        final ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        try {
            final List<Future<?>> futures = fileClientMap.entrySet().stream()
                    .map(entry -> executor.submit(
                            () -> uploadBytes(entry.getValue(), entry.getKey())))
                    .collect(Collectors.toList());

            for (final Future<?> future : futures) {
                future.get();
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            executor.shutdown();
        }
    }
}
