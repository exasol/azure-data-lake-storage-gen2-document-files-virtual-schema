package com.exasol.adapter.document.files;

import lombok.Data;

/**
 * This class represents a reference to an ADLS object.
 */
@Data
class AdlsObjectDescription {
    private final String name;
    private final long size;
}
