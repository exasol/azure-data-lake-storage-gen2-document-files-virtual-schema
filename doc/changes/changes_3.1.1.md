# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 3.1.1, released 2026-??-??

Code name: Fixed vulnerability CVE-2026-104880 in de.siegmar:fastcsv:jar:3.7.0:compile

## Summary

This release fixes the following vulnerability:

### CVE-2026-104880 (CWE-436) in dependency `de.siegmar:fastcsv:jar:3.7.0:compile`
de.siegmar:fastcsv - Interpretation Conflict
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-104880?component-type=maven&component-name=de.siegmar%2Ffastcsv&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-104880
* https://github.com/osiegmar/FastCSV/security/advisories/GHSA-64pw-j3v7-xc9q

## Security

* #208: Fixed vulnerability CVE-2026-104880 in dependency `de.siegmar:fastcsv:jar:3.7.0:compile`

## Dependency Updates

### Compile Dependency Updates

* Updated `com.azure:azure-core:1.58.1` to `1.60.0`
* Updated `com.azure:azure-identity:1.18.4` to `1.18.7`
* Updated `com.azure:azure-storage-file-datalake:12.28.0` to `12.28.1`
* Updated `com.exasol:virtual-schema-common-document-files:9.1.0` to `9.1.1`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:3.0.0` to `3.0.1`
* Updated `com.exasol:hamcrest-resultset-matcher:1.7.3` to `1.7.4`
* Updated `com.exasol:test-db-builder-java:4.0.2` to `4.0.3`
* Updated `com.exasol:virtual-schema-common-document-files:9.1.0` to `9.1.1`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.19.4` to `4.5.2`
* Updated `org.junit.jupiter:junit-jupiter-params:5.14.4` to `6.1.3`
* Updated `org.mockito:mockito-junit-jupiter:5.23.0` to `5.24.0`
* Updated `org.slf4j:slf4j-jdk14:1.7.36` to `2.0.20`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:5.7.4` to `5.7.6`
