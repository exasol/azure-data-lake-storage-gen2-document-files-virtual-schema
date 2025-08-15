# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 2.1.7, released 2025-??-??

Code name: Fixed vulnerability CVE-2025-55163 in io.netty:netty-codec-http2:jar:4.1.118.Final:compile

## Summary

This release fixes the following vulnerability:

### CVE-2025-55163 (CWE-770) in dependency `io.netty:netty-codec-http2:jar:4.1.118.Final:compile`
Netty is an asynchronous, event-driven network application framework. Prior to versions 4.1.124.Final and 4.2.4.Final, Netty is vulnerable to MadeYouReset DDoS. This is a logical vulnerability in the HTTP/2 protocol, that uses malformed HTTP/2 control frames in order to break the max concurrent streams limit - which results in resource exhaustion and distributed denial of service. This issue has been patched in versions 4.1.124.Final and 4.2.4.Final.
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2025-55163?component-type=maven&component-name=io.netty%2Fnetty-codec-http2&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2025-55163
* https://github.com/advisories/GHSA-prj3-ccx8-p6x4

## Security

* #88: Fixed vulnerability CVE-2025-55163 in dependency `io.netty:netty-codec-http2:jar:4.1.118.Final:compile`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.azure:azure-core:1.55.0` to `1.56.0`
* Updated `com.azure:azure-identity:1.15.1` to `1.17.0`
* Updated `com.azure:azure-storage-file-datalake:12.22.0` to `12.24.1`
* Updated `com.exasol:virtual-schema-common-document-files:8.1.7` to `8.1.12`
* Updated `com.nimbusds:nimbus-jose-jwt:10.0.2` to `10.4.2`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:2.1.7` to `2.1.8`
* Updated `com.exasol:hamcrest-resultset-matcher:1.7.0` to `1.7.1`
* Updated `com.exasol:test-db-builder-java:3.6.0` to `3.6.3`
* Updated `com.exasol:virtual-schema-common-document-files:8.1.7` to `8.1.12`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.19` to `4.0.7`
* Updated `org.junit.jupiter:junit-jupiter-params:5.11.4` to `5.13.4`
* Updated `org.mockito:mockito-core:5.15.2` to `5.18.0`
