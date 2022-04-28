package com.exasol.adapter.document.files;

import lombok.Data;

/**
 * This class represents a reference to a ABS object.
 */
@Data
class AdlsObjectDescription {
    private final String name;
    private final long size;
}
