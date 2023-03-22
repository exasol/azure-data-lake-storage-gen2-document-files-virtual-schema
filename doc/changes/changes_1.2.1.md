# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 1.2.1, released 2023-02-07

Code name: Reviewed and fixed vulnerabilities, updated dependencies.

## Summary

Reviewed and fixed vulnerabilities.
## Bugfixes / Vulnerabilities

* Fixed vulnerabilities
    * CVE-2021-37533 - Overrode transitive test dependency to fix vulnerability.
* Ignored vulnerabilities
    * `sonatype-2022-6438` - Exploit requires write access to the source code repository and attempts to inject malicious code will be detected during regular code reviews.
    * CVE-2020-36641 - Vulnerability is rated as a false positive since CVE-2020-36641 is reported to be fixed in aXMLRPC 1.12.1, while ETAJ uses version 1.13.0.
    * CVE-2022-1471 - Dependency is used by the test framework.
    * CVE-2020-36641 - Exploit requires access to manipulate hosted JSON files.

## Dependency Updates

### Compile Dependency Updates

* Updated `com.azure:azure-core:1.34.0` to `1.36.0`
* Updated `com.azure:azure-identity:1.7.1` to `1.8.0`
* Removed `com.azure:azure-storage-blob:12.20.1`
* Updated `com.azure:azure-storage-file-datalake:12.13.1` to `12.13.2`
* Updated `com.exasol:virtual-schema-common-document-files:7.1.2` to `7.1.4`
* Updated `com.fasterxml.jackson.core:jackson-annotations:2.14.1` to `2.14.2`
* Updated `com.fasterxml.jackson.core:jackson-core:2.14.1` to `2.14.2`
* Updated `com.fasterxml.jackson.core:jackson-databind:2.14.1` to `2.14.2`
* Updated `com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.14.1` to `2.14.2`
* Updated `com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.1` to `2.14.2`

### Runtime Dependency Updates

* Updated `org.slf4j:slf4j-api:2.0.4` to `2.0.6`
* Updated `org.slf4j:slf4j-simple:2.0.4` to `2.0.6`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:1.0.0` to `2.0.0`
* Updated `com.exasol:test-db-builder-java:3.4.1` to `3.4.2`
* Updated `com.exasol:udf-debugging-java:0.6.5` to `0.6.7`
* Updated `com.exasol:virtual-schema-common-document-files:7.1.2` to `7.1.4`
* Added `commons-net:commons-net:3.9.0`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.11.1` to `3.13`
* Updated `org.junit.jupiter:junit-jupiter-engine:5.9.1` to `5.9.2`
* Updated `org.junit.jupiter:junit-jupiter-params:5.9.1` to `5.9.2`
* Updated `org.mockito:mockito-core:4.9.0` to `5.1.1`

### Plugin Dependency Updates

* Updated `com.exasol:error-code-crawler-maven-plugin:1.2.1` to `1.2.2`
* Updated `com.exasol:project-keeper-maven-plugin:2.9.1` to `2.9.3`
* Updated `org.apache.maven.plugins:maven-dependency-plugin:3.3.0` to `3.5.0`
* Updated `org.apache.maven.plugins:maven-failsafe-plugin:3.0.0-M7` to `3.0.0-M8`
* Updated `org.apache.maven.plugins:maven-surefire-plugin:3.0.0-M7` to `3.0.0-M8`
* Updated `org.codehaus.mojo:versions-maven-plugin:2.13.0` to `2.14.2`
