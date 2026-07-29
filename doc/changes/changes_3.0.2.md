# Virtual Schema for document data in files on Azure Data Lake Storage Gen 2 3.0.2, released 2026-07-29

Code name: Fixed vulnerabilities GHSA-r7wm-3cxj-wff9, CVE-2026-59888, CVE-2026-59889, CVE-2026-54515, CVE-2026-54514, CVE-2026-54512, GHSA-mhm7-754m-9p8w, CVE-2026-54513, CVE-2026-54518, CVE-2026-59901, GHSA-mfg7-5gfp-c4w3, CVE-2026-59898, CVE-2026-56746, CVE-2026-55831, CVE-2026-59921, CVE-2026-56745, CVE-2026-55833, CVE-2026-59899, CVE-2026-59900, CVE-2026-56819, CVE-2026-9563, CVE-2017-7503

## Summary

This release fixes the following 22 vulnerabilities:

### GHSA-R7WM-3CXJ-WFF9 (CWE-770) in dependency `com.fasterxml.jackson.core:jackson-core:jar:2.18.6:compile`
jackson-core: Async parser maxNumberLength bypass via chunked digit accumulation (incomplete fix for GHSA-72hv-8253-57qq)
#### References
* https://github.com/FasterXML/jackson-core/security/advisories/GHSA-r7wm-3cxj-wff9
* https://github.com/FasterXML/jackson-core/pull/1611
* https://github.com/FasterXML/jackson-core/commit/050b429804dce2a7e08f0be1b0b4c3d040fdb9cd
* https://github.com/FasterXML/jackson-core/commit/4cdd529749da396cc7edf6d4a2aad41d47902641
* https://github.com/FasterXML/jackson-core/commit/c5941e5aae7fd5aeac55d66933cfb82b9aabeef8
* https://github.com/FasterXML/jackson-core

### CVE-2026-59888, GHSA-3PJW-73GF-8QR5 (CWE-915) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
jackson-databind: @JsonIgnore on a Record property is bypassed with a PropertyNamingStrategy
#### References
* https://github.com/FasterXML/jackson-databind/security/advisories/GHSA-3pjw-73gf-8qr5
* https://nvd.nist.gov/vuln/detail/CVE-2026-59888
* https://github.com/FasterXML/jackson-databind/pull/5974
* https://github.com/FasterXML/jackson-databind/commit/baa2cdf5ca2b2717fbb88d91955d69d8651df3e4
* https://github.com/FasterXML/jackson-databind/commit/c7c678360624da5bc7eed2152789fa522880db9d
* https://github.com/FasterXML/jackson-databind

### CVE-2026-59889, GHSA-5GVW-P9QM-JGWH (CWE-863) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
jackson-databind: @JsonView ypassed for @JsonUnwrapped container properties on deserialization
#### References
* https://github.com/FasterXML/jackson-databind/security/advisories/GHSA-5gvw-p9qm-jgwh
* https://nvd.nist.gov/vuln/detail/CVE-2026-59889
* https://github.com/FasterXML/jackson-databind/issues/6060
* https://github.com/FasterXML/jackson-databind/pull/6056
* https://github.com/FasterXML/jackson-databind/commit/d627a8a86fcb062429282f79f3f256f181ed2c7b
* https://github.com/FasterXML/jackson-databind

### CVE-2026-54515, GHSA-5JMJ-H7XM-6Q6V (CWE-915) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
jackson-databind has case-insensitive deserialization bypasses per-property @JsonIgnoreProperties
#### References
* https://github.com/FasterXML/jackson-databind/security/advisories/GHSA-5jmj-h7xm-6q6v
* https://nvd.nist.gov/vuln/detail/CVE-2026-54515
* https://github.com/FasterXML/jackson-databind/issues/5962
* https://github.com/FasterXML/jackson-databind/issues/5964
* https://github.com/FasterXML/jackson-databind/commit/0e1b0b211f7a53baa62ba2f4c9bd006c7bf4d5fa
* https://github.com/FasterXML/jackson-databind

### CVE-2026-54514, GHSA-HGJ6-7826-R7M5 (CWE-918) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
jackson-databind: InetSocketAddress deserialization triggers eager DNS resolution (SSRF)
#### References
* https://github.com/FasterXML/jackson-databind/security/advisories/GHSA-hgj6-7826-r7m5
* https://nvd.nist.gov/vuln/detail/CVE-2026-54514
* https://github.com/FasterXML/jackson-databind/pull/5951
* https://github.com/FasterXML/jackson-databind/commit/1f5a1037b1e9e05920e755cb35f198bcd46667e4
* https://github.com/FasterXML/jackson-databind

### CVE-2026-54512, GHSA-J3RV-43J4-C7QM (CWE-184, CWE-502) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
jackson-databind has a PolymorphicTypeValidator bypass via generic type parameters that allows arbitrary class instantiation
#### References
* https://github.com/FasterXML/jackson-databind/security/advisories/GHSA-j3rv-43j4-c7qm
* https://nvd.nist.gov/vuln/detail/CVE-2026-54512
* https://github.com/FasterXML/jackson-databind/issues/5988
* https://github.com/FasterXML/jackson-databind/commit/434d6c511de7fdd9872f29157aafb6162d12d8d5
* https://github.com/FasterXML/jackson-databind

### GHSA-MHM7-754M-9P8W (CWE-863) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
jackson-databind: `@JsonView` bypass for creator properties with `@JsonTypeInfo(include=As.EXTERNAL_PROPERTY)`
#### References
* https://github.com/FasterXML/jackson-databind/security/advisories/GHSA-mhm7-754m-9p8w
* https://github.com/FasterXML/jackson-databind/commit/c628b357ed143d8492756d5c1458cfb9fbeb29ed
* https://github.com/FasterXML/jackson-databind/commit/dea7eb466e98cc226c4ac65587581fb49926820c
* https://github.com/FasterXML/jackson-databind

### CVE-2026-54513, GHSA-RMJ7-2VXQ-3G9F (CWE-184) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
jackson-databind has an array subtype allowlist bypass in BasicPolymorphicTypeValidator (allowIfSubTypeIsArray)
#### References
* https://github.com/FasterXML/jackson-databind/security/advisories/GHSA-rmj7-2vxq-3g9f
* https://nvd.nist.gov/vuln/detail/CVE-2026-54513
* https://github.com/FasterXML/jackson-databind/issues/5983
* https://github.com/FasterXML/jackson-databind/issues/5981
* https://github.com/FasterXML/jackson-databind/pull/5984
* https://github.com/FasterXML/jackson-databind/commit/24529da29fdf46ff94ca38de9ebf31cd188f5e8e
* https://github.com/FasterXML/jackson-databind/commit/01d1692c8d0ed03e51a0e3c4f8a9e6908e4931e5
* https://security.access.redhat.com/data/csaf/v2/vex/2026/cve-2026-54513.json
* https://github.com/FasterXML/jackson-databind
* https://bugzilla.redhat.com/show_bug.cgi?id=2492010
* https://access.redhat.com/security/cve/CVE-2026-54513
* https://access.redhat.com/errata/RHSA-2026:44271
* https://access.redhat.com/errata/RHSA-2026:44066
* https://access.redhat.com/errata/RHSA-2026:44065
* https://access.redhat.com/errata/RHSA-2026:44064
* https://access.redhat.com/errata/RHSA-2026:44063
* https://access.redhat.com/errata/RHSA-2026:44062
* https://access.redhat.com/errata/RHSA-2026:44061
* https://access.redhat.com/errata/RHSA-2026:43400
* https://access.redhat.com/errata/RHSA-2026:43218
* https://access.redhat.com/errata/RHSA-2026:41951
* https://access.redhat.com/errata/RHSA-2026:40895
* https://access.redhat.com/errata/RHSA-2026:36839

### CVE-2026-54518 (CWE-863) in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
jackson-databind contains the general-purpose data-binding functionality and tree-model for Jackson Data Processor. From 2.21.0 until 2.21.4 and 3.1.4, UnwrappedPropertyHandler.processUnwrappedCreatorProperties() replays buffered JSON into creator parameters but never consults prop.visibleInView(activeView). The normal property-based creator path gates creator properties on the active view, but this unwrapped-creator replay path bypasses that check, so a constructor parameter annotated with both @JsonView(AdminView.class) and @JsonUnwrapped is populated from attacker JSON even when a more restrictive view is active. This vulnerability is fixed in 2.21.4 and 3.1.4.

Sonatype's research suggests that this CVE's details differ from those defined at NVD. See https://guide.sonatype.com/vulnerability/CVE-2026-54518 for details
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-54518?component-type=maven&component-name=com.fasterxml.jackson.core%2Fjackson-databind&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-54518
* https://bodhi.fedoraproject.org/updates/FEDORA-2026-ddde3cf003
* https://github.com/FasterXML/jackson-databind/security/advisories/GHSA-rcqc-6cw3-h962

### CVE-2026-59901, GHSA-558V-64GR-WGG4 (CWE-835) in dependency `io.netty:netty-codec-compression:jar:4.2.15.Final:compile`
Netty: [Bzip2Decoder] Infinite Loop in RLE State Machine Leads to Event-Loop Thread Hang
#### References
* https://github.com/netty/netty/security/advisories/GHSA-558v-64gr-wgg4
* https://github.com/netty/netty
* https://github.com/netty/netty/releases/tag/netty-4.1.136.Final
* https://github.com/netty/netty/releases/tag/netty-4.2.16.Final

### GHSA-MFG7-5GFP-C4W3 (CWE-772) in dependency `io.netty:netty-codec-dns:jar:4.2.15.Final:compile`
Netty: Memory Leak in DNS Record Decoder via Malformed Domain Names
#### References
* https://github.com/netty/netty/security/advisories/GHSA-mfg7-5gfp-c4w3
* https://github.com/netty/netty/pull/17063
* https://github.com/netty/netty/pull/17065
* https://github.com/netty/netty/commit/5b68c61f37aa4a3045cba624cbea239655c9003b
* https://github.com/netty/netty/commit/bb2ff68a1fb71cb4b0eb9a9e17b66c52aff680c6
* https://github.com/netty/netty
* https://github.com/netty/netty/releases/tag/netty-4.1.136.Final
* https://github.com/netty/netty/releases/tag/netty-4.2.16.Final

### CVE-2026-59898, GHSA-4MP9-239F-G9HG (CWE-444) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
Netty: WebSockets V07/V08 handshaker missing Connection/Upgrade validation
#### References
* https://github.com/netty/netty/security/advisories/GHSA-4mp9-239f-g9hg
* https://github.com/netty/netty
* https://github.com/netty/netty/releases/tag/netty-4.1.136.Final
* https://github.com/netty/netty/releases/tag/netty-4.2.16.Final

### CVE-2026-56746, GHSA-6CQP-G7GG-8HR5 (CWE-284) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
Netty: Security Control Bypass via CORS Short-Circuit Failure
#### References
* https://github.com/netty/netty/security/advisories/GHSA-6cqp-g7gg-8hr5
* https://nvd.nist.gov/vuln/detail/CVE-2026-56746
* https://github.com/netty/netty
* https://github.com/netty/netty/releases/tag/netty-4.1.136.Final
* https://github.com/netty/netty/releases/tag/netty-4.2.16.Final

### CVE-2026-55831, GHSA-6JQX-86GH-F27W (CWE-400) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
Netty SPDY SETTINGS frame count materializes unbounded settings map
#### References
* https://github.com/netty/netty/security/advisories/GHSA-6jqx-86gh-f27w
* https://nvd.nist.gov/vuln/detail/CVE-2026-55831
* https://github.com/netty/netty/commit/5b68c61f37aa4a3045cba624cbea239655c9003b
* https://github.com/netty/netty/commit/bb2ff68a1fb71cb4b0eb9a9e17b66c52aff680c6
* https://github.com/netty/netty
* https://github.com/netty/netty/releases/tag/netty-4.1.136.Final
* https://github.com/netty/netty/releases/tag/netty-4.2.16.Final

### CVE-2026-59921, GHSA-GCJF-9MGH-3P7G (CWE-93) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
Netty: CRLF Injection via Multipart Filename in Netty HttpPostRequestEncoder
#### References
* https://github.com/netty/netty/security/advisories/GHSA-gcjf-9mgh-3p7g
* https://github.com/netty/netty
* https://github.com/netty/netty/releases/tag/netty-4.1.136.Final
* https://github.com/netty/netty/releases/tag/netty-4.2.16.Final

### CVE-2026-56745, GHSA-JPPX-W49H-X2QQ (CWE-400) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
Netty: [SpdyHttpDecoder] ByteBuf Reference Leak on RST_STREAM Leads to Native Memory Exhaustion
#### References
* https://github.com/netty/netty/security/advisories/GHSA-jppx-w49h-x2qq
* https://nvd.nist.gov/vuln/detail/CVE-2026-56745
* https://github.com/netty/netty/commit/5b68c61f37aa4a3045cba624cbea239655c9003b
* https://github.com/netty/netty/commit/bb2ff68a1fb71cb4b0eb9a9e17b66c52aff680c6
* https://github.com/netty/netty
* https://github.com/netty/netty/releases/tag/netty-4.1.136.Final
* https://github.com/netty/netty/releases/tag/netty-4.2.16.Final

### CVE-2026-55833, GHSA-MVH2-CRG5-V77C (CWE-400) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
Netty SPDY zlib header block continues decoded expansion after maxHeaderSize truncation
#### References
* https://github.com/netty/netty/security/advisories/GHSA-mvh2-crg5-v77c
* https://nvd.nist.gov/vuln/detail/CVE-2026-55833
* https://github.com/netty/netty/commit/5b68c61f37aa4a3045cba624cbea239655c9003b
* https://github.com/netty/netty/commit/bb2ff68a1fb71cb4b0eb9a9e17b66c52aff680c6
* https://github.com/netty/netty
* https://github.com/netty/netty/releases/tag/netty-4.1.136.Final
* https://github.com/netty/netty/releases/tag/netty-4.2.16.Final

### CVE-2026-59899, GHSA-Q4F6-JM68-57WW (CWE-770) in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
Netty: [HttpContentEncoder] Unbounded Per-Connection Queue Growth via HTTP/1.1 Pipelining Leads to Denial of Service
#### References
* https://github.com/netty/netty/security/advisories/GHSA-q4f6-jm68-57ww
* https://github.com/netty/netty
* https://github.com/netty/netty/releases/tag/netty-4.1.136.Final
* https://github.com/netty/netty/releases/tag/netty-4.2.16.Final

### CVE-2026-59900, GHSA-C69G-56F8-XWQJ (CWE-444) in dependency `io.netty:netty-codec-http2:jar:4.2.15.Final:compile`
Netty: [codec-http2] Lack of Host Header Deduplication in HTTP/2→HTTP/1.x Translation Leads to Request Routing Bypass
#### References
* https://github.com/netty/netty/security/advisories/GHSA-c69g-56f8-xwqj
* https://github.com/netty/netty
* https://github.com/netty/netty/releases/tag/netty-4.1.136.Final
* https://github.com/netty/netty/releases/tag/netty-4.2.16.Final

### CVE-2026-56819 (CWE-400) in dependency `io.netty:netty-codec-http2:jar:4.2.15.Final:compile`
Netty is a network application framework for development of protocol servers and clients. In versions 4.2.0.Final through 4.2.15.Final and 4.1.0.Final through 4.1.135.Final, a remote unauthenticated peer can leak one direct `ByteBuf` per HTTP/2 `DATA` frame in applications that enable HTTP/2 content decompression via `DelegatingDecompressorFrameListener`. When a `DATA` frame is processed for a stream whose decompressor has already been closed, `Http2Decompressor.decompress(...)` calls `decompressor.writeInbound(data.retain())` and does not release the retained buffer on the error path, eventually exhausting direct memory and crashing the JVM. This issue is fixed in versions 4.1.136.Final and 4.2.16.Final.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-56819?component-type=maven&component-name=io.netty%2Fnetty-codec-http2&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-56819
* https://github.com/netty/netty/security/advisories/GHSA-93wv-jw9v-4972

### CVE-2026-9563 (CWE-400) in dependency `org.eclipse.parsson:parsson:jar:1.1.7:compile`
In Eclipse Parsson published Maven Central artifacts before version 1.1.8, the JSON parser did not enforce a default maximum on the number of characters consumed while parsing a single JSON document. Applications that parse attacker- controlled JSON can be forced to consume excessive CPU and memory by processing very large documents, including large arrays, objects, strings, numbers, whitespace, or nested structures, resulting in a denial of service. Eclipse Parsson 1.1.8 introduces a configurable maximum parsing limit with a default limit of 15 million parser-consumed characters.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2026-9563?component-type=maven&component-name=org.eclipse.parsson%2Fparsson&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2026-9563
* https://github.com/eclipse-ee4j/parsson/pull/169
* https://gitlab.eclipse.org/security/vulnerability-reports/-/work_items/444

### CVE-2017-7503 (CWE-611) in dependency `xerces:xercesImpl:jar:2.12.2:compile`
It was found that the Red Hat JBoss EAP 7.0.5 implementation of javax.xml.transform.TransformerFactory is vulnerable to XXE. An attacker could use this flaw to launch DoS or SSRF attacks, or read files from the server where EAP is deployed.
#### References
* https://guide.sonatype.com/vulnerability/CVE-2017-7503?component-type=maven&component-name=xerces%2FxercesImpl&utm_source=ossindex-client&utm_medium=integration&utm_content=1.8.1
* http://web.nvd.nist.gov/view/vuln/detail?vulnId=CVE-2017-7503
* https://bugzilla.redhat.com/show_bug.cgi?id=CVE-2017-7503

## Security

* #140: Fixed vulnerability GHSA-R7WM-3CXJ-WFF9 in dependency `com.fasterxml.jackson.core:jackson-core:jar:2.18.6:compile`
* #125: Fixed vulnerability CVE-2026-59888, GHSA-3PJW-73GF-8QR5 in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
* #126: Fixed vulnerability CVE-2026-59889, GHSA-5GVW-P9QM-JGWH in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
* #123: Fixed vulnerability CVE-2026-54515, GHSA-5JMJ-H7XM-6Q6V in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
* #122: Fixed vulnerability CVE-2026-54514, GHSA-HGJ6-7826-R7M5 in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
* #120: Fixed vulnerability CVE-2026-54512, GHSA-J3RV-43J4-C7QM in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
* #141: Fixed vulnerability GHSA-MHM7-754M-9P8W in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
* #121: Fixed vulnerability CVE-2026-54513, GHSA-RMJ7-2VXQ-3G9F in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
* #124: Fixed vulnerability CVE-2026-54518 in dependency `com.fasterxml.jackson.core:jackson-databind:jar:2.18.6:compile`
* #128: Fixed vulnerability CVE-2026-59901, GHSA-558V-64GR-WGG4 in dependency `io.netty:netty-codec-compression:jar:4.2.15.Final:compile`
* #142: Fixed vulnerability GHSA-MFG7-5GFP-C4W3 in dependency `io.netty:netty-codec-dns:jar:4.2.15.Final:compile`
* #136: Fixed vulnerability CVE-2026-59898, GHSA-4MP9-239F-G9HG in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
* #135: Fixed vulnerability CVE-2026-56746, GHSA-6CQP-G7GG-8HR5 in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
* #132: Fixed vulnerability CVE-2026-55831, GHSA-6JQX-86GH-F27W in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
* #129: Fixed vulnerability CVE-2026-59921, GHSA-GCJF-9MGH-3P7G in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
* #134: Fixed vulnerability CVE-2026-56745, GHSA-JPPX-W49H-X2QQ in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
* #133: Fixed vulnerability CVE-2026-55833, GHSA-MVH2-CRG5-V77C in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
* #137: Fixed vulnerability CVE-2026-59899, GHSA-Q4F6-JM68-57WW in dependency `io.netty:netty-codec-http:jar:4.2.15.Final:compile`
* #138: Fixed vulnerability CVE-2026-59900, GHSA-C69G-56F8-XWQJ in dependency `io.netty:netty-codec-http2:jar:4.2.15.Final:compile`
* #130: Fixed vulnerability CVE-2026-56819 in dependency `io.netty:netty-codec-http2:jar:4.2.15.Final:compile`
* #119: Fixed vulnerability CVE-2026-9563 in dependency `org.eclipse.parsson:parsson:jar:1.1.7:compile`
* #117: Fixed vulnerability CVE-2017-7503 in dependency `xerces:xercesImpl:jar:2.12.2:compile`
## Dependency Updates

### Test Dependency Updates

* Updated `com.exasol:udf-debugging-java:0.6.18` to `0.6.20`
* Updated `org.jacoco:org.jacoco.agent:0.8.14` to `0.8.15`

### Plugin Dependency Updates

* Updated `com.exasol:artifact-reference-checker-maven-plugin:0.4.4` to `1.0.1`
* Updated `com.exasol:error-code-crawler-maven-plugin:2.0.7` to `2.1.0`
* Updated `com.exasol:project-keeper-maven-plugin:5.6.2` to `5.7.4`
* Removed `com.exasol:quality-summarizer-maven-plugin:0.2.1`
* Updated `org.apache.maven.plugins:maven-dependency-plugin:3.10.0` to `3.11.0`
* Updated `org.apache.maven.plugins:maven-enforcer-plugin:3.6.2` to `3.6.3`
* Updated `org.apache.maven.plugins:maven-failsafe-plugin:3.5.5` to `3.5.6`
* Updated `org.apache.maven.plugins:maven-site-plugin:3.21.0` to `3.22.0`
* Updated `org.apache.maven.plugins:maven-surefire-plugin:3.5.5` to `3.5.6`
* Updated `org.jacoco:jacoco-maven-plugin:0.8.14` to `0.8.15`
* Updated `org.sonarsource.scanner.maven:sonar-maven-plugin:5.5.0.6356` to `5.7.0.6970`
* Added `org.spdx:spdx-maven-plugin:1.0.4`
