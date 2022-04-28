package com.exasol.adapter.document.files.connection;

import com.exasol.adapter.document.connection.ConnectionPropertiesReader;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.startsWith;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AdlsConnectionPropertiesReaderTest {
    @Test
    void testReadOnlyRequired() {
        final AdlsConnectionProperties properties = runReader(
                "{\"adlsStorageAccountName\": \"my-accountname\",\"adlsStorageAccountKey\": \"my-accountkey\", \"adlsContainerName\": \"my-containername\" }");
        assertAll(
                () -> assertThat(properties.getAdlsStorageAccountName(), equalTo("my-accountname")),
                () -> assertThat(properties.getAdlsStorageAccountKey(), equalTo("my-accountkey")),
                () -> assertThat(properties.getAdlsContainerName(), equalTo("my-containername"))
        );

    }

    private AdlsConnectionProperties runReader(final String json) {
        return new AdlsConnectionPropertiesReader().read(new ConnectionPropertiesReader(json, ""));
    }

    @Test
    void testMissingRequired() {
        final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> runReader("{ }"));
        assertThat(exception.getMessage(), startsWith(
                "E-VSD-93: Invalid connection."));
    }
}