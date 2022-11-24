package com.exasol.adapter.document.files;

import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

class AdlsObjectDescriptionTest {
    @Test
    void getName() {
        assertThat(new AdlsObjectDescription("the name", 0).getName(), equalTo("the name"));
    }

    @Test
    void getSize() {
        assertThat(new AdlsObjectDescription(null, 42L).getSize(), equalTo(42L));
    }

    @Test
    void testToString() {
        assertThat(new AdlsObjectDescription("name", 1234).toString(),
                equalTo("AdlsObjectDescription(name='name', size=1234)"));
    }

    @Test
    void testEqualContract() {
        EqualsVerifier.forClass(AdlsObjectDescription.class).verify();
    }
}