# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 2.1.4, released 2025-02-12

Code name: Fix vulnerabilities CVE-2025-25193 and CVE-2025-24970 in dependencies

## Summary

This release fixes the following vulnerabilities in dependencies:

* `io.netty:netty-common:jar:4.1.115.Final:compile`: CVE-2025-25193
* `io.netty:netty-handler:jar:4.1.115.Final:compile`: CVE-2025-24970

## Security

* #73: Fixed CVE-2025-25193 in `io.netty:netty-common:jar:4.1.115.Final:compile`
* #72: Fixed CVE-2025-24970 in `io.netty:netty-handler:jar:4.1.115.Final:compile`

## Dependency Updates

### Compile Dependency Updates

* Removed `com.azure:azure-core-http-netty:1.15.8`

### Test Dependency Updates

* Removed `com.exasol:bucketfs-java:3.2.1`
* Updated `com.exasol:exasol-test-setup-abstraction-java:2.1.6` to `2.1.7`
