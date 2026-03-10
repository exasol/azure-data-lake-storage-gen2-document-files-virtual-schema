# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 2.2.0, released 2026-03-10

Code name: Speedup listing ADLS containers

## Summary

This release speeds up listing ADLS containers with a large number of files by only listing the files from the relevant sub-path. Before, the virtual schema always listed all files in the container which was very inefficient for containers with many files. Thanks a lot to [@sensalytics-fabian-eulitz](https://github.com/sensalytics-fabian-eulitz) for contributing this!

## Features

- PR #97 / #98: Optimize `AdlsRemoteFileFinder#getQuickFilteredObjectKeys()` to list from deepest deterministic directory. Thanks to [@sensalytics-fabian-eulitz](https://github.com/sensalytics-fabian-eulitz) for this contribution!

## Dependency Updates

### Compile Dependency Updates

- Updated `com.azure:azure-core:1.55.0` to `1.57.1`
- Updated `com.azure:azure-identity:1.15.1` to `1.18.2`
- Updated `com.azure:azure-storage-file-datalake:12.22.0` to `12.26.2`
- Updated `com.exasol:error-reporting-java:1.0.1` to `1.0.2`
- Removed `com.nimbusds:nimbus-jose-jwt:10.0.2`

### Test Dependency Updates

- Updated `com.exasol:hamcrest-resultset-matcher:1.7.0` to `1.7.2`
- Updated `com.exasol:performance-test-recorder-java:0.1.4` to `0.1.5`
- Updated `com.exasol:test-db-builder-java:3.6.0` to `3.6.4`
- Updated `com.exasol:udf-debugging-java:0.6.17` to `0.6.18`
- Updated `nl.jqno.equalsverifier:equalsverifier:3.19` to `3.19.4`
- Updated `org.junit.jupiter:junit-jupiter-params:5.11.4` to `5.14.1`
- Updated `org.mockito:mockito-core:5.15.2` to `5.22.0`
- Added `org.slf4j:slf4j-jdk14:1.7.36`
