# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 1.4.2, released 2023-07-04

Code name: Update dependencies on top of 1.4.1

## Summary

This release fixes vulnerabilities in the following compile dependencies:

* `org.xerial.snappy:snappy-java`
  * CVE-2023-34453, severity CWE-190: Integer Overflow or Wraparound (7.5)
  * CVE-2023-34454, severity CWE-190: Integer Overflow or Wraparound (7.5)
  * CVE-2023-34455, severity CWE-770: Allocation of Resources Without Limits or Throttling (7.5)
* `io.netty:netty-handler`
  * CVE-2023-34462, severity CWE-770: Allocation of Resources Without Limits or Throttling (6.5)

## Security

* #35: Updated dependencies

## Dependency Updates

### Compile Dependency Updates

* Updated `com.azure:azure-core:1.39.0` to `1.40.0`
* Updated `com.azure:azure-identity:1.9.0` to `1.9.1`
* Updated `com.azure:azure-storage-file-datalake:12.15.0` to `12.15.3`
* Updated `com.exasol:virtual-schema-common-document-files:7.3.2` to `7.3.3`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:2.0.1` to `2.0.2`
* Updated `com.exasol:virtual-schema-common-document-files:7.3.2` to `7.3.3`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.14.1` to `3.14.3`
* Updated `org.mockito:mockito-core:5.3.1` to `5.4.0`
