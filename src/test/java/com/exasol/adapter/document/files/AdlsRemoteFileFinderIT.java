package com.exasol.adapter.document.files;

import com.azure.storage.file.datalake.DataLakeFileSystemClient;
import com.exasol.adapter.document.documentfetcher.files.RemoteFile;
import com.exasol.adapter.document.files.adlstestsetup.AdlsTestSetup;
import com.exasol.adapter.document.files.adlstestsetup.OnlineAdlsTestSetup;
import com.exasol.adapter.document.files.connection.AdlsConnectionProperties;
import com.exasol.adapter.document.files.stringfilter.wildcardexpression.WildcardExpression;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertTimeout;

@Tag("integration")
class AdlsRemoteFileFinderIT {
    private static final AdlsTestSetup TEST_SETUP = new OnlineAdlsTestSetup();
    private static final String CONTENT_1 = "content-1";
    private static final String CONTENT_2 = "content-2";
    private static final String CONTENT_OTHER = "other";

    private static AdlsConnectionProperties connectionInformation;
    private static TestContainer testContainer;
    private static DataLakeFileSystemClient dlFileSystemClient;

    @BeforeAll
    static void beforeAll() {
        testContainer = new TestContainer(TEST_SETUP);
        dlFileSystemClient = testContainer.getDataLakeFileSystemClient();
        connectionInformation = AdlsConnectionProperties.builder()
                .adlsContainerName(testContainer.getDataLakeFileSystemClient().getFileSystemName())
                .adlsStorageAccountKey(TEST_SETUP.getStorageAccountKey())
                .adlsStorageAccountName(TEST_SETUP.getStorageAccountName())
                .build();
    }

    @BeforeEach
    void beforeEach() {
        testContainer.empty();
    }

    @AfterAll
    static void afterAll() {
        testContainer.close();
    }

    @Test
    void testReadFile() {
        HelperFunctions.uploadBytes(CONTENT_1.getBytes(), dlFileSystemClient.getFileClient("file-1.json"));
        HelperFunctions.uploadBytes(CONTENT_2.getBytes(), dlFileSystemClient.getFileClient("file-2.json"));

        final AdlsRemoteFileFinder adlsFileLoader = new AdlsRemoteFileFinder(
                WildcardExpression.forNonWildcardString("file-1.json"), connectionInformation);
        assertThat(runAndGetFirstLines(adlsFileLoader), containsInAnyOrder(CONTENT_1));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "file-*.json",
            "file*.json",
            "file-?.json"
    })
    void testReadFilesWithWildcard(final String fileGlob) {
        HelperFunctions.uploadBytes(CONTENT_1.getBytes(), dlFileSystemClient.getFileClient("file-1.json"));
        HelperFunctions.uploadBytes(CONTENT_2.getBytes(), dlFileSystemClient.getFileClient("file-2.json"));
        HelperFunctions.uploadBytes(CONTENT_OTHER.getBytes(), dlFileSystemClient.getFileClient("subdir/file-1.json"));

        final WildcardExpression filePattern = WildcardExpression.fromGlob(fileGlob);
        final AdlsRemoteFileFinder adlsFileLoader = new AdlsRemoteFileFinder(filePattern, connectionInformation);
        assertThat(runAndGetFirstLines(adlsFileLoader), containsInAnyOrder(CONTENT_1, CONTENT_2));
    }

    @Test
    void testReadAllFiles() {
        HelperFunctions.uploadBytes(CONTENT_1.getBytes(), dlFileSystemClient.getFileClient("file-1.json"));
        HelperFunctions.uploadBytes(CONTENT_2.getBytes(), dlFileSystemClient.getFileClient("file-2.json"));
        HelperFunctions.uploadBytes(CONTENT_OTHER.getBytes(), dlFileSystemClient.getFileClient("subdir/file-1.json"));

        final WildcardExpression filePattern = WildcardExpression.fromGlob("*");
        final AdlsRemoteFileFinder adlsRemoteFileFinder = new AdlsRemoteFileFinder(filePattern, connectionInformation);
        assertThat(runAndGetFirstLines(adlsRemoteFileFinder), containsInAnyOrder(CONTENT_1, CONTENT_2, CONTENT_OTHER));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "subdir/*",
            "subdir/*.json"
    })
    void testReadFileInSubdirectory(final String fileGlob) {
        HelperFunctions.uploadBytes(CONTENT_1.getBytes(), dlFileSystemClient.getFileClient("file-1.json"));
        HelperFunctions.uploadBytes(CONTENT_OTHER.getBytes(), dlFileSystemClient.getFileClient("subdir/file-1.json"));

        final WildcardExpression filePattern = WildcardExpression.fromGlob(fileGlob);
        final AdlsRemoteFileFinder adlsRemoteFileFinder = new AdlsRemoteFileFinder(filePattern, connectionInformation);
        assertThat(runAndGetFirstLines(adlsRemoteFileFinder), containsInAnyOrder(CONTENT_OTHER));
    }

    /**
     * Regression test: {@link AdlsRemoteFileFinder#loadFiles()} must scope its listing to the static prefix
     * directory and complete within 1 second, regardless of how large the noise tree is.
     *
     * <p>Each row defines a noise tree (files the finder must ignore). The target tree is always
     * 10 files at depth 1. Columns: noiseFileCount, noiseTreeDepth.</p>
     */
    @Tag("regression")
    @ParameterizedTest
    @CsvSource({
            "100,1",
            "500,5",
            "1000,10",
            "1000,20",
    })
    void testLoadFilesDeepNestedTree(final int noiseFileCount, final int noiseTreeDepth) {
        final int targetFileCount = 10;
        final int targetTreeDepth = 1;

        HelperFunctions.createFileTree("noise", noiseFileCount, noiseTreeDepth, dlFileSystemClient);
        HelperFunctions.createFileTree("target", targetFileCount, targetTreeDepth, dlFileSystemClient);

        final WildcardExpression filePattern = WildcardExpression.fromGlob("target/*");
        final AdlsRemoteFileFinder adlsRemoteFileFinder = new AdlsRemoteFileFinder(filePattern, connectionInformation);

        final List<RemoteFile> foundFiles = new ArrayList<>();
        assertTimeout(Duration.ofSeconds(1), () -> adlsRemoteFileFinder.loadFiles()
                .forEachRemaining(foundFiles::add)
        );

        assertThat(foundFiles, hasSize(targetFileCount));
    }

    private List<String> runAndGetFirstLines(final AdlsRemoteFileFinder adlsFileLoader) {
        final List<String> result = new ArrayList<>();
        adlsFileLoader.loadFiles()
                .forEachRemaining(file -> result.add(readFirstLine(file.getContent().getInputStream())));
        return result;
    }

    private String readFirstLine(final InputStream stream) {
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
            return reader.readLine();
        } catch (final IOException exception) {
            throw new UncheckedIOException("Error reading first line", exception);
        }
    }
}