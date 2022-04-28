package com.exasol.adapter.document.files;

import com.exasol.adapter.document.documentfetcher.files.RemoteFileContent;
import com.exasol.adapter.document.files.adlstestsetup.AdlsTestSetup;
import com.exasol.adapter.document.files.adlstestsetup.OnlineAdlsTestSetup;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AdlsRemoteFileContentTest {
    private static final String TEST_DATA_VALUE = "test content";
    private static final String TEST_DATA_KEY = "TEST_DATA";
    private static AdlsTestSetup testSetup;
    private static RemoteFileContent remoteFileContent;
    private static TestContainer testBucket;
    private static ExecutorServiceFactory executorServiceFactory;

    @BeforeAll
    static void beforeAll() {
        testSetup = new OnlineAdlsTestSetup();
        testBucket = new TestContainer(testSetup);
        var dlFilesystemClient = testBucket.getDataLakeFileSystemClient();
                var dlFileClient = dlFilesystemClient.getFileClient(TEST_DATA_KEY);//.upload(BinaryData.fromBytes( TEST_DATA_VALUE.getBytes()));
        Helperfunctions.uploadBytes(TEST_DATA_VALUE.getBytes(),dlFileClient);
        executorServiceFactory = new ExecutorServiceFactory();
        remoteFileContent = new AdlsRemoteFileContent(testBucket.getDataLakeFileSystemClient(),
                new AdlsObjectDescription(TEST_DATA_KEY, TEST_DATA_VALUE.length()), executorServiceFactory);
    }

    @AfterAll
    static void afterAll() throws Exception {
        executorServiceFactory.close();
        testBucket.close();
        testSetup.close();
    }

    @Test
    void testGetInputStream() throws IOException {
        assertThat(remoteFileContent.getInputStream().readAllBytes(),
                equalTo(TEST_DATA_VALUE.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void testGetRandomAccessInputStream() throws IOException {
        assertThat(remoteFileContent.getRandomAccessInputStream().readAllBytes(),
                equalTo(TEST_DATA_VALUE.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void testLoadAsync() throws ExecutionException, InterruptedException {
        final byte[] byteArray = remoteFileContent.loadAsync().get();
        assertThat(byteArray, equalTo(TEST_DATA_VALUE.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void testLoadAsyncWithTimeout() throws ExecutionException, InterruptedException, TimeoutException {
        final byte[] byteArray = remoteFileContent.loadAsync().get(10, TimeUnit.SECONDS);
        assertThat(byteArray, equalTo(TEST_DATA_VALUE.getBytes(StandardCharsets.UTF_8)));
    }

    @Test
    void testCancelAsyncLoading() {
        final Future<byte[]> future = remoteFileContent.loadAsync();
        future.cancel(true);
        assertTrue(future.isCancelled());
    }
}