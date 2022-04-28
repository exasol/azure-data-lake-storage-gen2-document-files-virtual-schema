package com.exasol.adapter.document.files;

import com.azure.storage.file.datalake.DataLakeFileClient;
import com.exasol.adapter.document.documentfetcher.files.randomaccessinputstream.RandomAccessInputStream;
import com.exasol.adapter.document.documentfetcher.files.randomaccessinputstream.RandomAccessInputStreamTestBase;
import com.exasol.adapter.document.files.adlstestsetup.AdlsTestSetup;
import com.exasol.adapter.document.files.adlstestsetup.OnlineAdlsTestSetup;


class AdlsRandomAccessInputStreamTest extends RandomAccessInputStreamTestBase {
    private static final String TEST_DATA_KEY = "TEST_DATA";
    long testDataLength;
    private AdlsTestSetup testSetup;
    private TestContainer testContainer;
    private DataLakeFileClient dlFileClient;

    @Override
    protected void prepareTestSetup(final byte[] bytes) {
        this.testSetup = new OnlineAdlsTestSetup();
        this.testContainer = new TestContainer(this.testSetup);
        this.testDataLength = bytes.length;

        var dlFileSystemClient = testContainer.getDataLakeFileSystemClient();
         dlFileClient= dlFileSystemClient.getFileClient(TEST_DATA_KEY);
        Helperfunctions.uploadBytes(bytes, dlFileClient);
//        try {
//            DLSClient.DLUploadFileBytes("",TEST_DATA_KEY,bytes);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (Exception e){
//            //e.printStackTrace();
//        }

        //this.blob = this.testContainer.getBlobContainerClient().getBlobClient(TEST_DATA_KEY);//"\\" +
        //this.blob.upload(BinaryData.fromBytes(bytes));
    }

    @Override
    protected void cleanupTestSetup() {
        this.testContainer.close();
        this.testSetup.close();
    }

    @Override
    protected RandomAccessInputStream getSeekableInputStream() {
        return new AdlsRandomAccessInputStream(this.dlFileClient, this.testDataLength);
    }
}