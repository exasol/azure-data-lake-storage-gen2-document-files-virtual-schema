package com.exasol.adapter.document.files;

import java.io.*;
import com.exasol.adapter.document.files.adlstestsetup.AdlsTestSetup;
import com.exasol.adapter.document.files.adlstestsetup.OnlineAdlsTestSetup;
import com.exasol.adapter.document.files.connection.AdlsConnectionProperties;
import com.exasol.adapter.document.files.stringfilter.wildcardexpression.WildcardExpression;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

@Tag("integration")
class AdlsRemoteFileFinderOnlineIT {
    private static final AdlsTestSetup TEST_SETUP = new OnlineAdlsTestSetup();
    private static final String CONTENT_1 = "content-1";
    private static AdlsConnectionProperties connectionInformation;
    private static TestContainer testContainer;

    @BeforeAll
    static void beforeAll() {
        testContainer = new TestContainer(TEST_SETUP);
        var dlFileSystemClient = testContainer.getDataLakeFileSystemClient();
        var file1 = dlFileSystemClient.getFileClient("file-1.json");
        Helperfunctions.uploadBytes(CONTENT_1.getBytes(), file1);
        connectionInformation = AdlsConnectionProperties.builder() //
                .adlsContainerName(testContainer.getDataLakeFileSystemClient().getFileSystemName()) //
                .adlsStorageAccountName(TEST_SETUP.getStorageAccountName()) //
                .adlsStorageAccountKey(TEST_SETUP.getStorageAccountKey()) //
                .build(); //
    }

    @AfterAll
    static void afterAll() {
        testContainer.close();
    }

    @Test
    void testReadFile() {
        final AdlsRemoteFileFinder adlsFileLoader = new AdlsRemoteFileFinder(
                WildcardExpression.forNonWildcardString("file-1.json"), connectionInformation);
        assertThat(runAndGetFirstLines(adlsFileLoader), containsInAnyOrder(CONTENT_1));
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