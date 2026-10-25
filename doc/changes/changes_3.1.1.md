# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 3.1.1, released 2026-??-??

Code name: Fixed vulnerability CVE-2026-110879 in com.fasterxml.jackson.core:jackson-databind:jar:2.22.1:compile

## Summary

This release fixes the following vulnerability:

### CVE-2026-110879 (CWE-502) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.22.1:compile`
jackson-databind - Deserialization of Untrusted Data
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-110879?component-type=maven&component-name=com.fasterxml.jackson.core%2Fjackson-databind&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-110879
* https://github.com/FasterXML/jackson/wiki/Jackson-Release-2.18.12
* https://github.com/FasterXML/jackson-databind/pull/6287

## Security

* #222: Fixed vulnerability CVE-2026-110879 in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.22.1:compile`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.azure:azure-core:1.58.1` to `1.60.0`
* Updated `com.azure:azure-identity:1.18.4` to `1.18.7`
* Updated `com.azure:azure-storage-file-datalake:12.28.0` to `12.29.0`
* Updated `com.exasol:virtual-schema-common-document-files:9.1.0` to `9.1.1`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:3.0.0` to `3.0.1`
* Updated `com.exasol:hamcrest-resultset-matcher:1.7.3` to `1.7.4`
* Updated `com.exasol:test-db-builder-java:4.0.2` to `4.0.3`
* Updated `com.exasol:udf-debugging-java:0.6.20` to `0.6.22`
* Updated `com.exasol:virtual-schema-common-document-files:9.1.0` to `9.1.1`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.19.4` to `4.5.2`
* Updated `org.junit.jupiter:junit-jupiter-params:5.14.4` to `6.1.3`
* Updated `org.mockito:mockito-junit-jupiter:5.23.0` to `5.24.0`
* Updated `org.slf4j:slf4j-jdk14:1.7.36` to `2.0.20`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:5.7.4` to `5.8.1`
