package com.exasol.adapter.document.files;

import java.io.*;

import com.azure.storage.file.datalake.DataLakeFileClient;

class HelperFunctions {
    static void uploadBytes(final byte[] bytes, final DataLakeFileClient fileClient) {
        final InputStream targetStream = new BufferedInputStream(new ByteArrayInputStream(bytes));
        final long fileSize = bytes.length;
        fileClient.upload(targetStream, fileSize, false);
    }
}
