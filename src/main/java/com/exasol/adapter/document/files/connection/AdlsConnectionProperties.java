package com.exasol.adapter.document.files.connection;

import java.util.Objects;

/**
 * Connection properties for Azure Data Lake Storage Gen 2.
 */
public final class AdlsConnectionProperties {
    private final String adlsStorageAccountName;
    private final String adlsStorageAccountKey;
    private final String adlsContainerName;

    private AdlsConnectionProperties(final Builder builder) {
        this.adlsStorageAccountName = builder.adlsStorageAccountName;
        this.adlsStorageAccountKey = builder.adlsStorageAccountKey;
        this.adlsContainerName = builder.adlsContainerName;
    }

    /**
     * Get the storage account name.
     *
     * @return storage account name
     */
    public String getAdlsStorageAccountName() {
        return adlsStorageAccountName;
    }

    /**
     * Get the storage account key.
     *
     * @return storage account key
     */
    public String getAdlsStorageAccountKey() {
        return adlsStorageAccountKey;
    }

    /**
     * Get the container name.
     *
     * @return container name
     */
    public String getAdlsContainerName() {
        return adlsContainerName;
    }

    @Override
    public String toString() {
        return "AdlsConnectionProperties(" + "adlsStorageAccountName='" + adlsStorageAccountName + '\''
                + ", adlsStorageAccountKey='" + adlsStorageAccountKey + '\'' + ", adlsContainerName='"
                + adlsContainerName + '\'' + ')';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final AdlsConnectionProperties that = (AdlsConnectionProperties) o;
        return Objects.equals(adlsStorageAccountName, that.adlsStorageAccountName)
                && Objects.equals(adlsStorageAccountKey, that.adlsStorageAccountKey)
                && Objects.equals(adlsContainerName, that.adlsContainerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adlsStorageAccountName, adlsStorageAccountKey, adlsContainerName);
    }

    /**
     * Create a builder for {@link AdlsConnectionProperties}
     *
     * @return builder
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Builder for {@link AdlsConnectionProperties}.
     */
    public static final class Builder {
        private String adlsStorageAccountName;
        private String adlsStorageAccountKey;
        private String adlsContainerName;

        /**
         * Create a new instance of a {@link Builder}.
         */
        public Builder() {
            // intentionally empty
        }

        /**
         * Set the storage account name.
         *
         * @param adlsStorageAccountName storage account name
         * @return self for fluent programming
         */
        public Builder adlsStorageAccountName(final String adlsStorageAccountName) {
            this.adlsStorageAccountName = adlsStorageAccountName;
            return this;
        }

        /**
         * Set the storage account kay.
         *
         * @param adlsStorageAccountKey storage account key
         * @return self for fluent programming
         */
        public Builder adlsStorageAccountKey(final String adlsStorageAccountKey) {
            this.adlsStorageAccountKey = adlsStorageAccountKey;
            return this;
        }

        /**
         * Set the container name.
         *
         * @param adlsContainerName container name
         * @return self for fluent programming
         */
        public Builder adlsContainerName(final String adlsContainerName) {
            this.adlsContainerName = adlsContainerName;
            return this;
        }

        /**
         * Builder new {@link AdlsConnectionProperties}.
         *
         * @return new connection properties
         */
        public AdlsConnectionProperties build() {
            return new AdlsConnectionProperties(this);
        }
    }
}
