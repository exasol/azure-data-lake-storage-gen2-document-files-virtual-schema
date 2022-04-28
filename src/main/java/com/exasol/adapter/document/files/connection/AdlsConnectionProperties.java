package com.exasol.adapter.document.files.connection;

import lombok.Builder;
import lombok.Data;

/**
 * Connection properties for Azure Data Lake Storage Gen 2.
 */
@Data
@Builder
public class AdlsConnectionProperties {
    @Builder.Default
    private final String adlsStorageAccountName = null;
    @Builder.Default
    private final String adlsStorageAccountKey = null;
    @Builder.Default
    private final String adlsContainerName = null;

}
