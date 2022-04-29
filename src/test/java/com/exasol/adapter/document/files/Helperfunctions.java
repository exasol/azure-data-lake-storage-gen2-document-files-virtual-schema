package com.exasol.adapter.document.files;

import com.azure.storage.file.datalake.DataLakeFileClient;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Helperfunctions {
    public static void uploadBytes(byte[] bytes, DataLakeFileClient fileClient) {

        InputStream targetStream = new BufferedInputStream(new ByteArrayInputStream(bytes));

        long fileSize = bytes.length;

        fileClient.upload(targetStream, fileSize, false);
    }
}
