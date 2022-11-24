package com.exasol.adapter.document.files.connection;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static com.exasol.adapter.document.files.connection.AdlsConnectionProperties.builder;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class AdlsConnectionPropertiesTest {
    @Test
    void getAdlsStorageAccountName() {
        assertThat(builder().adlsStorageAccountName("the account").build().getAdlsStorageAccountName(),
                equalTo("the account"));
    }

    @Test
    void getAdlsStorageAccountKey() {
        assertThat(builder().adlsStorageAccountKey("the key").build().getAdlsStorageAccountKey(), equalTo("the key"));
    }

    @Test
    void getAdlsContainerName() {
        assertThat(builder().adlsContainerName("the container").build().getAdlsContainerName(),
                equalTo("the container"));
    }

    @Test
    void testToString() {
        assertThat(
                builder().adlsContainerName("container").adlsStorageAccountName("account").adlsStorageAccountKey("key")
                        .build().toString(),
                equalTo("AdlsConnectionProperties(adlsStorageAccountName='account', " +
                        "adlsStorageAccountKey='key', adlsContainerName='container')"));
    }

    @Test
    void testEqualsContract() {
        EqualsVerifier.forClass(AdlsConnectionProperties.class).verify();
    }
}