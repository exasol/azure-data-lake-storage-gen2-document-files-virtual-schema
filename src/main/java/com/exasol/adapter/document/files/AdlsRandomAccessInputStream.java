package com.exasol.adapter.document.files;

import com.azure.storage.file.datalake.DataLakeFileClient;
import com.azure.storage.file.datalake.models.FileRange;
import com.azure.storage.file.datalake.options.DataLakeFileInputStreamOptions;
import com.exasol.adapter.document.documentfetcher.files.randomaccessinputstream.RandomAccessInputStream;
import com.exasol.errorreporting.ExaError;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class AdlsRandomAccessInputStream extends RandomAccessInputStream {
    private static final Logger LOGGER = Logger.getLogger(AdlsRandomAccessInputStream.class.getName());
    private final long fileSize;
    private final DataLakeFileClient dlFileClient;
    private long position = 0;

    /**
     * Create a new instance of {@link AdlsRandomAccessInputStream}.
     *
     * @param DataLakeFileClient dlFileClient
     * @param fileSize           file size in bytes
     */
    AdlsRandomAccessInputStream(final DataLakeFileClient dlFileClient, final long fileSize) {
        this.dlFileClient = dlFileClient;
        this.fileSize = fileSize;
    }

    @Override
    public void seek(final long position) {
        LOGGER.log(Level.FINEST, "Seek to position {0}", position);
        this.position = position;
    }

    @Override
    public long getPos() {
        return this.position;
    }

    @Override
    public long getLength() {
        return this.fileSize;
    }

    @Override
    public int read() {
        LOGGER.finest("Performing single read at position.");
        if (this.position < getLength()) {
            final byte[] data;
            DataLakeFileInputStreamOptions sOptions = new DataLakeFileInputStreamOptions();
            FileRange fr = new FileRange(position, 1L);
            sOptions.setRange(fr);
            var stream = this.dlFileClient.openInputStream(sOptions);
            try (var inputStream = stream.getInputStream()){
                data = inputStream.readNBytes(1);
            } catch (final IOException exception) {
                throw getReadFailedException(exception);
            }
            this.position++;
            return data[0] & 0xFF;
        } else {
            return -1;
        }
    }

    @Override
    public int read(final byte[] targetBuffer, final int offset, final int length) {
        LOGGER.log(Level.FINEST, "read - length: {0} - offset: {1}", new Object[]{length, offset});
        if (length == 0) {
            return 0;
        }
        final long remainingBytesInFile = getLength() - this.position;
        int actualReadLength = (int) Math.min(length, remainingBytesInFile);
        if (actualReadLength > 0) {
            DataLakeFileInputStreamOptions sOptions = new DataLakeFileInputStreamOptions();
            FileRange fr = new FileRange(position, (long) actualReadLength);
            sOptions.setRange(fr);
            var stream = this.dlFileClient.openInputStream(sOptions);
            try (var inputStream = stream.getInputStream()){
                actualReadLength = inputStream.read(targetBuffer);
            } catch (final IOException exception) {
                throw getReadFailedException(exception);
            }
            this.position += actualReadLength;
        }
        return actualReadLength == 0 ? -1 : actualReadLength;
    }

    private UncheckedIOException getReadFailedException(final IOException exception) {
        return new UncheckedIOException(
                ExaError.messageBuilder("E-VSADLG2-8").message("Failed to read from Azure Data Lake Storage Gen 2.").toString(),
                exception);
    }
}
