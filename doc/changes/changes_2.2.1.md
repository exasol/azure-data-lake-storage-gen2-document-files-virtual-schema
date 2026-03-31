# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 2.2.1, released 2026-03-31

Code name: Fixed vulnerabilities CVE-2026-33871, CVE-2026-33870

## Summary

This release fixes the following 2 vulnerabilities:

### CVE-2026-33871 (CWE-770) in dependency `io.netty:netty-codec-http2:jar:4.1.130.Final:compile`
io.netty:netty-codec-http2 - Allocation of Resources Without Limits or Throttling
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2026-33871?component-type=maven&component-name=io.netty%2Fnetty-codec-http2&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-33871
* https://github.com/advisories/GHSA-w9fj-cfpg-grvv
* https://www.sonatype.com/products/sonatype-guide/oss-index-users

### CVE-2026-33870 (CWE-444) in dependency `io.netty:netty-codec-http:jar:4.1.130.Final:compile`
netty-codec-http - Inconsistent Interpretation of HTTP Requests ('HTTP Request/Response Smuggling')
#### References
* https://ossindex.sonatype.org/vulnerability/CVE-2026-33870?component-type=maven&component-name=io.netty%2Fnetty-codec-http&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-33870
* https://github.com/advisories/GHSA-pwqr-wmgm-9rr8
* https://gitlab.com/gitlab-org/advisories-community/-/blob/main/maven/io.netty/netty-codec-http/CVE-2026-33870.yml
* https://osv-vulnerabilities.storage.googleapis.com/Maven/GHSA-pwqr-wmgm-9rr8.json
* https://www.sonatype.com/products/sonatype-guide/oss-index-users

## Security

* #99: Fixed vulnerability CVE-2026-33871 in dependency `io.netty:netty-codec-http2:jar:4.1.130.Final:compile`
* #100: Fixed vulnerability CVE-2026-33870 in dependency `io.netty:netty-codec-http:jar:4.1.130.Final:compile`

## Dependency Updates

### Test Dependency Updates

* Updated `nl.jqno.equalsverifier:equalsverifier:3.19.4` to `4.4.1`
* Updated `org.junit.jupiter:junit-jupiter-params:5.14.1` to `6.0.3`
* Updated `org.mockito:mockito-junit-jupiter:5.22.0` to `5.23.0`
* Updated `org.slf4j:slf4j-jdk14:1.7.36` to `2.0.17`
