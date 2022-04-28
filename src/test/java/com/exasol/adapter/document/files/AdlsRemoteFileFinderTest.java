package com.exasol.adapter.document.files;

import com.exasol.adapter.document.files.connection.AdlsConnectionProperties;
import com.exasol.adapter.document.files.stringfilter.wildcardexpression.WildcardExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class AdlsRemoteFileFinderTest {
    @Test
    void testInvalidAdlsCsException() {
        final var connectionInformation = AdlsConnectionProperties.builder() //
                .adlsContainerName("my-bucket") //
                .adlsStorageAccountKey("bleh") //
                .adlsStorageAccountName("{ invalid JSON").build(); //
        final WildcardExpression filter = WildcardExpression.fromGlob("*");
        final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> new AdlsRemoteFileFinder(filter, connectionInformation));

    }
}