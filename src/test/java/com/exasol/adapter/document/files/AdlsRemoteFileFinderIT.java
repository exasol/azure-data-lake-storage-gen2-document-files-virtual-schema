package com.exasol.adapter.document.files;

import com.exasol.adapter.document.files.adlstestsetup.AdlsTestSetup;
import com.exasol.adapter.document.files.adlstestsetup.OnlineAdlsTestSetup;
import com.exasol.adapter.document.files.connection.AdlsConnectionProperties;
import com.exasol.adapter.document.files.stringfilter.wildcardexpression.WildcardExpression;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

@Tag("integration")
class AdlsRemoteFileFinderIT {
    private static final AdlsTestSetup TEST_SETUP = new OnlineAdlsTestSetup();
    private static final String CONTENT_1 = "content-1";
    private static final String CONTENT_2 = "content-2";
    private static final String CONTENT_OTHER = "other";
    private static AdlsConnectionProperties connectionInformation;
    private static TestContainer testContainer;

    @BeforeAll
    static void beforeAll() {
        testContainer = new TestContainer(TEST_SETUP);
        var dlFileSystemClient = testContainer.getDataLakeFileSystemClient();
        var file1= dlFileSystemClient.getFileClient("file-1.json");
        Helperfunctions.uploadBytes(CONTENT_1.getBytes(),file1);//.upload(BinaryData.fromBytes(CONTENT_1.getBytes()));
        var file2 = dlFileSystemClient.getFileClient("file-2.json");
        Helperfunctions.uploadBytes(CONTENT_2.getBytes(),file2);
        var file3 = dlFileSystemClient.getFileClient("other.json");
        Helperfunctions.uploadBytes(CONTENT_OTHER.getBytes(),file3);
        connectionInformation = AdlsConnectionProperties.builder() //
                .adlsContainerName(testContainer.getDataLakeFileSystemClient().getFileSystemName()) //
                .adlsStorageAccountKey(TEST_SETUP.getStorageAccountKey()) //
                .adlsStorageAccountName(TEST_SETUP.getStorageAccountName()) //
                .build(); //
    }

    @AfterAll
    static void afterAll() {
        testContainer.close();
    }

    @Test
    void testReadFile() {
        final AdlsRemoteFileFinder absFileLoader = new AdlsRemoteFileFinder(
                WildcardExpression.forNonWildcardString("file-1.json"), connectionInformation);
        assertThat(runAndGetFirstLines(absFileLoader), containsInAnyOrder(CONTENT_1));
    }

    private List<String> runAndGetFirstLines(final AdlsRemoteFileFinder absFileLoader) {
        final List<String> result = new ArrayList<>();
        absFileLoader.loadFiles()
                .forEachRemaining(file -> result.add(readFirstLine(file.getContent().getInputStream())));
        return result;
    }

    @CsvSource({ //
            "file-*.json", //
            "file*.json", //
            "file-?.json" //
    })
    @ParameterizedTest
    void testReadFilesWithWildcard(final String fileGlob) {
        final WildcardExpression filePattern = WildcardExpression.fromGlob(fileGlob);
        final AdlsRemoteFileFinder absFileLoader = new AdlsRemoteFileFinder(filePattern, connectionInformation);
        assertThat(runAndGetFirstLines(absFileLoader), containsInAnyOrder(CONTENT_1, CONTENT_2));
    }

    @Test
    void testReadAllFiles() {
        final WildcardExpression filePattern = WildcardExpression.fromGlob("*");
        final AdlsRemoteFileFinder absRemoteFileFinder = new AdlsRemoteFileFinder(filePattern, connectionInformation);
        assertThat(runAndGetFirstLines(absRemoteFileFinder), containsInAnyOrder(CONTENT_1, CONTENT_2, CONTENT_OTHER));
    }

    private String readFirstLine(final InputStream stream) {
        try (final BufferedReader reader = new BufferedReader(new InputStreamReader(stream))) {
            return reader.readLine();
        } catch (final IOException exception) {
            throw new IllegalArgumentException("", exception);
        }
    }
}