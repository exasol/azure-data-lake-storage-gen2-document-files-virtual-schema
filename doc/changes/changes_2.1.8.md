# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 2.1.8, released 2025-??-??

Code name: Fixed vulnerability CVE-2025-58057 in io.netty:netty-codec:jar:4.1.124.Final:compile

## Summary

This release fixes the following vulnerability:

### CVE-2025-58057 (CWE-409) in dependency `io.netty:netty-codec:jar:4.1.124.Final:compile`
netty-codec - Improper Handling of Highly Compressed Data (Data Amplification)
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2025-58057?component-type=maven&component-name=io.netty%2Fnetty-codec&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2025-58057
* https://github.com/netty/netty/security/advisories/GHSA-3p8m-j85q-pgmj

## Security

* #91: Fixed vulnerability CVE-2025-58057 in dependency `io.netty:netty-codec:jar:4.1.124.Final:compile`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.azure:azure-core:1.55.0` to `1.56.0`
* Updated `com.azure:azure-identity:1.15.1` to `1.17.0`
* Updated `com.azure:azure-storage-file-datalake:12.22.0` to `12.24.2`
* Updated `com.exasol:virtual-schema-common-document-files:8.1.7` to `8.1.12`
* Updated `com.nimbusds:nimbus-jose-jwt:10.0.2` to `10.4.2`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:2.1.7` to `2.1.9`
* Updated `com.exasol:hamcrest-resultset-matcher:1.7.0` to `1.7.2`
* Updated `com.exasol:performance-test-recorder-java:0.1.4` to `0.1.5`
* Updated `com.exasol:test-db-builder-java:3.6.0` to `3.6.3`
* Updated `com.exasol:virtual-schema-common-document-files:8.1.7` to `8.1.12`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.19` to `4.1`
* Updated `org.junit.jupiter:junit-jupiter-params:5.11.4` to `5.13.4`
* Updated `org.mockito:mockito-core:5.15.2` to `5.19.0`
