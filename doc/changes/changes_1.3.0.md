# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 1.3.0, released 2023-03-22

Code name: Auto-inference for Parquet

## Summary

This release adds automatic schema inference for Parquet files. This means that you don't need to specify a `mapping` element in the EDML definition. Instead VSBFS will automatically detect the mapping from the Parquet files. See the [EDML user guide](https://github.com/exasol/virtual-schema-common-document/blob/main/doc/user_guide/edml_user_guide.md#automatic-mapping-inference) for details.

## Features

* #24: Added auto-inference for Parquet files

## Dependency Updates

### Compile Dependency Updates

* Updated `com.azure:azure-core:1.36.0` to `1.37.0`
* Updated `com.azure:azure-identity:1.8.0` to `1.8.1`
* Updated `com.azure:azure-storage-file-datalake:12.13.2` to `12.14.1`
* Updated `com.exasol:error-reporting-java:1.0.0` to `1.0.1`
* Updated `com.exasol:virtual-schema-common-document-files:7.1.4` to `7.2.0`
* Removed `com.fasterxml.jackson.core:jackson-annotations:2.14.2`
* Removed `com.fasterxml.jackson.core:jackson-core:2.14.2`
* Removed `com.fasterxml.jackson.core:jackson-databind:2.14.2`
* Removed `com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.14.2`
* Removed `com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.2`

### Runtime Dependency Updates

* Removed `org.slf4j:slf4j-api:2.0.6`
* Removed `org.slf4j:slf4j-simple:2.0.6`

### Test Dependency Updates

* Added `com.exasol:exasol-testcontainers:6.5.1`
* Updated `com.exasol:udf-debugging-java:0.6.7` to `0.6.8`
* Updated `com.exasol:virtual-schema-common-document-files:7.1.4` to `7.2.0`
* Removed `commons-net:commons-net:3.9.0`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.13` to `3.14.1`
* Updated `org.mockito:mockito-core:5.1.1` to `5.2.0`
* Removed `org.testcontainers:junit-jupiter:1.17.6`
* Removed `org.testcontainers:localstack:1.17.6`
* Removed `org.yaml:snakeyaml:1.33`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:2.9.3` to `2.9.6`
* Updated `org.apache.maven.plugins:maven-assembly-plugin:3.4.2` to `3.5.0`
* Updated `org.apache.maven.plugins:maven-enforcer-plugin:3.1.0` to `3.2.1`
