package com.exasol.adapter.document.files.connection;

import com.exasol.adapter.document.connection.ConnectionPropertiesReader;

/**
 * Reads out the Azure Data Lake Storage Gen 2 connection properties.
 */
public class AdlsConnectionPropertiesReader {

    /**
     * Read the {@link AdlsConnectionProperties} from the given reader.
     *
     * @param reader connection properties reader
     * @return read {@link AdlsConnectionProperties}
     */
    public AdlsConnectionProperties read(final ConnectionPropertiesReader reader) {
        return AdlsConnectionProperties.builder()//
                .adlsStorageAccountName(reader.readRequiredString("adlsStorageAccountName")) //
                .adlsStorageAccountKey(reader.readRequiredString("adlsStorageAccountKey")) //
                .adlsContainerName(reader.readRequiredString("adlsContainerName")) //
                .build(); //
    }
}
