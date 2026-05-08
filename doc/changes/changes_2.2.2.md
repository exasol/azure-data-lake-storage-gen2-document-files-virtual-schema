# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 2.2.2, released 2026-??-??

Code name: Fixed vulnerability CVE-2026-41417 in io.netty:netty-codec-http:jar:4.2.12.Final:compile

## Summary

This release fixes the following vulnerability:

### CVE-2026-41417 (CWE-93) in dependency `io.netty:netty-codec-http:jar:4.2.12.Final:compile`
io.netty:netty-codec-http - CRLF Injection
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-41417?component-type=maven&component-name=io.netty%2Fnetty-codec-http&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-41417
* https://github.com/advisories/GHSA-v8h7-rr48-vmmv

## Security

* #102: Fixed vulnerability CVE-2026-41417 in dependency `io.netty:netty-codec-http:jar:4.2.12.Final:compile`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.azure:azure-core:1.57.1` to `1.58.0`
* Updated `com.azure:azure-identity:1.18.2` to `1.18.3`
* Updated `com.azure:azure-storage-file-datalake:12.26.2` to `12.26.4`

### Test Dependency Updates

* Updated `com.exasol:test-db-builder-java:3.6.4` to `4.0.0`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.19.4` to `4.5`
* Updated `org.junit.jupiter:junit-jupiter-params:5.14.3` to `6.0.3`
* Updated `org.slf4j:slf4j-jdk14:1.7.36` to `2.0.17`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:5.4.6` to `5.6.1`
