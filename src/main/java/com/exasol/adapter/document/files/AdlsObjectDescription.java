package com.exasol.adapter.document.files;

import java.util.Objects;

/**
 * This class represents a reference to an ADLS object.
 */
final class AdlsObjectDescription {
    private final String name;
    private final long size;

    /**
     * Create a new instance of an {@link AdlsObjectDescription}.
     *
     * @param name name
     * @param size size
     */
    public AdlsObjectDescription(final String name, final long size) {
        this.name = name;
        this.size = size;
    }

    /**
     * Get the name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the size.
     *
     * @return size
     */
    public long getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "AdlsObjectDescription(" + "name='" + name + '\'' + ", size=" + size + ')';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final AdlsObjectDescription that = (AdlsObjectDescription) o;
        return size == that.size && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}
