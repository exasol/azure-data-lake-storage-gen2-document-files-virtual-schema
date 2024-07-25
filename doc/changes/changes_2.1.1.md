# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 2.1.1, released 2024-??-??

Code name: Fixed vulnerability CVE-2024-25638 in dnsjava:dnsjava:jar:3.4.0:compile

## Summary

This release fixes the following vulnerability:

### CVE-2024-25638 (CWE-345) in dependency `dnsjava:dnsjava:jar:3.4.0:compile`
dnsjava is an implementation of DNS in Java. Records in DNS replies are not checked for their relevance to the query, allowing an attacker to respond with RRs from different zones. This vulnerability is fixed in 3.6.0.
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2024-25638?component-type=maven&component-name=dnsjava%2Fdnsjava&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2024-25638
* https://github.com/dnsjava/dnsjava/security/advisories/GHSA-cfxw-4h78-h7fw

## Security

* #63: Fixed vulnerability CVE-2024-25638 in dependency `dnsjava:dnsjava:jar:3.4.0:compile`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.azure:azure-core:1.49.1` to `1.50.0`
* Updated `com.azure:azure-identity:1.12.2` to `1.13.1`
* Updated `com.azure:azure-storage-file-datalake:12.19.1` to `12.20.0`
* Updated `com.exasol:virtual-schema-common-document-files:8.1.0` to `8.1.1`

### Test Dependency Updates

* Updated `com.exasol:virtual-schema-common-document-files:8.1.0` to `8.1.1`
* Updated `org.junit.jupiter:junit-jupiter-params:5.10.2` to `5.10.3`
