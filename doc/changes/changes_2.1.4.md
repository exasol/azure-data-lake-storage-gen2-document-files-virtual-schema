# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 2.1.4, released 2025-??-??

Code name: Fixed vulnerabilities CVE-2025-24970, CVE-2025-25193

## Summary

This release fixes the following 2 vulnerabilities:

### CVE-2025-24970 (CWE-20) in dependency `io.netty:netty-handler:jar:4.1.115.Final:compile`
Netty, an asynchronous, event-driven network application framework, has a vulnerability starting in version 4.1.91.Final and prior to version 4.1.118.Final. When a special crafted packet is received via SslHandler it doesn't correctly handle validation of such a packet in all cases which can lead to a native crash. Version 4.1.118.Final contains a patch. As workaround its possible to either disable the usage of the native SSLEngine or change the code manually.
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2025-24970?component-type=maven&component-name=io.netty%2Fnetty-handler&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2025-24970
* https://github.com/advisories/GHSA-4g8c-wm8x-jfhw
* https://gitlab.com/gitlab-org/advisories-community/-/blob/main/maven/io.netty/netty-handler/CVE-2025-24970.yml
* https://osv-vulnerabilities.storage.googleapis.com/Maven/GHSA-4g8c-wm8x-jfhw.json

### CVE-2025-25193 (CWE-400) in dependency `io.netty:netty-common:jar:4.1.115.Final:compile`
Netty, an asynchronous, event-driven network application framework, has a vulnerability in versions up to and including 4.1.118.Final. An unsafe reading of environment file could potentially cause a denial of service in Netty. When loaded on an Windows application, Netty attempts to load a file that does not exist. If an attacker creates such a large file, the Netty application crash. A similar issue was previously reported as CVE-2024-47535. This issue was fixed, but the fix was incomplete in that null-bytes were not counted against the input limit. Commit d1fbda62d3a47835d3fb35db8bd42ecc205a5386 contains an updated fix.
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2025-25193?component-type=maven&component-name=io.netty%2Fnetty-common&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2025-25193
* https://github.com/netty/netty/security/advisories/GHSA-389x-839f-4rhx

## Security

* #72: Fixed vulnerability CVE-2025-24970 in dependency `io.netty:netty-handler:jar:4.1.115.Final:compile`
* #73: Fixed vulnerability CVE-2025-25193 in dependency `io.netty:netty-common:jar:4.1.115.Final:compile`

## Dependency Updates

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:2.1.6` to `2.1.7`
