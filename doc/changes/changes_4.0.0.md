# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 4.0.0, released 2026-10-29

Code name: Dependency Security Updates

## Summary

This release fixes reported vulnerabilities in runtime and test dependencies.

## Security

* #155: Fixed CVE-2026-47843 (DNS resolver reuse can misroute traffic) in `io.projectreactor.netty:reactor-netty-core:1.3.6`
* Fixed CVE-2026-116486 (symbolic name mapped to the wrong object) in `org.objenesis:objenesis:3.4`
* #177: Fixed CVE-2026-68498 (resource exhaustion) in `com.fasterxml.jackson.core:jackson-core:2.22.1`
* #205: Fixed CVE-2026-89407 (slow regular expression processing) in `com.fasterxml.jackson.core:jackson-core:2.22.1`
* #206: Fixed CVE-2026-89425 (unbounded error token allocation) in `com.fasterxml.jackson.core:jackson-core:2.22.1`
* #164: Fixed CVE-2026-73334 (untrusted KMS URL handling) in `org.apache.parquet:parquet-hadoop:1.17.1`
* #195: Fixed CVE-2026-100659 (HTTP request smuggling) in `io.netty:netty-codec-http3:4.2.16.Final`
* #196: Fixed CVE-2026-100660 (unbounded resource allocation) in `io.netty:netty-codec-http3:4.2.16.Final`
* #197: Fixed CVE-2026-100661 (resource exhaustion) in `io.netty:netty-codec-http3:4.2.16.Final`
* #198: Fixed CVE-2026-100662 (resource exhaustion) in `io.netty:netty-codec-http3:4.2.16.Final`
* #199: Fixed CVE-2026-100663 (improper input validation) in `io.netty:netty-codec-http3:4.2.16.Final`
* #200: Fixed CVE-2026-100664 (improper input validation) in `io.netty:netty-codec-http3:4.2.16.Final`
* #165: Fixed CVE-2026-89044 (HTTP request smuggling) in `io.netty:netty-codec-http3:4.2.16.Final`
* #201: Fixed CVE-2026-93568 (improper input validation) in `io.netty:netty-codec-http3:4.2.16.Final`
* #213: Fixed CVE-2026-110262 (unbounded memory allocation) in `org.ow2.asm:asm-commons:9.10.1`
* #214: Fixed CVE-2026-110270 (algorithmic complexity denial of service) in `org.ow2.asm:asm-commons:9.10.1`
* #160: Fixed CVE-2026-62380 (poison null byte handling) in `io.netty:netty-codec-socks:4.2.16.Final`
* #157: Fixed CVE-2026-47857 (integer overflow) in `io.projectreactor:reactor-core:3.7.18`
* #158: Fixed CVE-2026-47863 (pipeline can hang indefinitely) in `io.projectreactor:reactor-core:3.7.18`
* #161: Fixed CVE-2026-75595 (TLS client authentication bypass) in `io.netty:netty-handler:4.2.16.Final`
* #156: Fixed CVE-2026-75596 (inefficient algorithmic complexity) in `io.netty:netty-handler:4.2.16.Final`
* #162: Fixed CVE-2026-62243 (hostname verification bypass) in `io.netty:netty-handler:4.2.16.Final`
* #152: Fixed CVE-2026-47845 (HTTP authentication bypass) in `io.projectreactor.netty:reactor-netty-http:1.3.6`
* #153: Fixed CVE-2026-47848 (credentials exposed on redirect) in `io.projectreactor.netty:reactor-netty-http:1.3.6`
* #154: Fixed CVE-2026-47874 (HTTP server denial of service) in `io.projectreactor.netty:reactor-netty-http:1.3.6`
* #208: Fixed CVE-2026-104880 (CSV interpretation conflict) in `de.siegmar:fastcsv:3.7.0`
* #215: Fixed CVE-2026-110257 (uncontrolled memory allocation) in `org.ow2.asm:asm:9.10.1`
* #216: Fixed CVE-2026-110258 (uncontrolled memory allocation) in `org.ow2.asm:asm:9.10.1`
* #217: Fixed CVE-2026-110259 (uncontrolled recursion) in `org.ow2.asm:asm:9.10.1`
* #218: Fixed CVE-2026-110260 (algorithmic complexity denial of service) in `org.ow2.asm:asm:9.10.1`
* #219: Fixed CVE-2026-110261 (algorithmic complexity denial of service) in `org.ow2.asm:asm:9.10.1`
* #220: Fixed CVE-2026-110263 (uncontrolled recursion) in `org.ow2.asm:asm:9.10.1`
* #204: Fixed CVE-2026-100665 (QUIC hostname verification bypass) in `io.netty:netty-codec-classes-quic:4.2.16.Final`
* Fixed CVE-2026-116539 (out-of-bounds write) in `io.netty:netty-tcnative-boringssl-static:2.0.78.Final`
* Fixed CVE-2026-116541 (incorrect calculation) in `io.netty:netty-tcnative-boringssl-static:2.0.78.Final`
* Fixed CVE-2026-116542 (improper Unicode handling) in `io.netty:netty-tcnative-boringssl-static:2.0.78.Final`
* #168: Fixed CVE-2026-89044 (HTTP request smuggling) in `io.netty:netty-codec-http2:4.2.16.Final`
* #191: Fixed CVE-2026-93492 (security issue) in `io.netty:netty-codec-http2:4.2.16.Final`
* #192: Fixed CVE-2026-93567 (improper input validation) in `io.netty:netty-codec-http2:4.2.16.Final`
* #193: Fixed CVE-2026-93568 (improper input validation) in `io.netty:netty-codec-http2:4.2.16.Final`
* #194: Fixed CVE-2026-93579 (security issue) in `io.netty:netty-codec-http2:4.2.16.Final`
* #169: Fixed CVE-2026-87795 (out-of-bounds read) in `com.github.luben:zstd-jni:1.5.7-3`
* #170: Fixed CVE-2026-87823 (integer overflow) in `com.github.luben:zstd-jni:1.5.7-3`
* #171: Fixed CVE-2026-89045 (infinite loop) in `com.github.luben:zstd-jni:1.5.7-3`
* #222: Fixed CVE-2026-110879 (unsafe deserialization) in `com.fasterxml.jackson.core:jackson-databind:2.22.1`
* #148: Fixed CVE-2026-19032 (unrestricted URI schemes in path deserialization) in `com.fasterxml.jackson.core:jackson-databind:2.22.1`
* #149: Fixed CVE-2026-68497 (unbounded resource allocation) in `com.fasterxml.jackson.core:jackson-databind:2.22.1`
* #173: Fixed CVE-2026-91776 (resource exhaustion) in `com.fasterxml.jackson.core:jackson-databind:2.22.1`
* #174: Fixed CVE-2026-91777 (resource exhaustion) in `com.fasterxml.jackson.core:jackson-databind:2.22.1`
* #175: Fixed CVE-2026-83557 (unsafe deserialization) in `com.fasterxml.jackson.core:jackson-databind:2.22.1`
* #210: Fixed CVE-2026-108104 (double free) in `org.xerial.snappy:snappy-java:1.1.10.7`
* #211: Fixed CVE-2026-108106 (uncontrolled memory allocation) in `org.xerial.snappy:snappy-java:1.1.10.7`
* #176: Fixed CVE-2026-90559 (out-of-bounds write) in `org.xerial.snappy:snappy-java:1.1.10.7`
* #202: Fixed CVE-2026-93451 (out-of-bounds write) in `org.xerial.snappy:snappy-java:1.1.10.7`
* #203: Fixed CVE-2026-93452 (out-of-bounds write) in `org.xerial.snappy:snappy-java:1.1.10.7`
* #146: Fixed CVE-2026-59903 (sensitive information in cache) in `io.netty:netty-codec-http:4.2.16.Final`
* #166: Fixed CVE-2026-89044 (HTTP request smuggling) in `io.netty:netty-codec-http:4.2.16.Final`
* #183: Fixed CVE-2026-93488 (unbounded resource allocation) in `io.netty:netty-codec-http:4.2.16.Final`
* #184: Fixed CVE-2026-93491 (unbounded resource allocation) in `io.netty:netty-codec-http:4.2.16.Final`
* #185: Fixed CVE-2026-93558 (security issue) in `io.netty:netty-codec-http:4.2.16.Final`
* #186: Fixed CVE-2026-93562 (security issue) in `io.netty:netty-codec-http:4.2.16.Final`
* #187: Fixed CVE-2026-93565 (security issue) in `io.netty:netty-codec-http:4.2.16.Final`
* #188: Fixed CVE-2026-93574 (HTTP request smuggling) in `io.netty:netty-codec-http:4.2.16.Final`
* #189: Fixed CVE-2026-93566 (HTTP request smuggling) in `io.netty:netty-codec-http:4.2.16.Final`
* #190: Fixed CVE-2026-93573 (interpretation conflict) in `io.netty:netty-codec-http:4.2.16.Final`
* #182: Fixed CVE-2026-100666 (HTTP request smuggling) in `io.netty:netty-codec-http:4.2.16.Final`
* #167: Fixed CVE-2026-86231 (certificate expiration validation) in `com.github.mwiede:jsch:2.28.4`
## Dependency Updates

### Compile Dependency Updates

* Updated `com.azure:azure-core:1.58.1` to `1.60.0`
* Updated `com.azure:azure-identity:1.18.4` to `1.18.7`
* Updated `com.azure:azure-storage-file-datalake:12.28.0` to `12.29.0`
* Updated `com.exasol:virtual-schema-common-document-files:9.1.0` to `10.0.1`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:3.0.0` to `3.0.1`
* Updated `com.exasol:hamcrest-resultset-matcher:1.7.3` to `1.7.4`
* Updated `com.exasol:test-db-builder-java:4.0.2` to `4.0.3`
* Updated `com.exasol:udf-debugging-java:0.6.20` to `0.6.22`
* Updated `com.exasol:virtual-schema-common-document-files:9.1.0` to `10.0.1`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.19.4` to `4.5.2`
* Removed `org.junit.jupiter:junit-jupiter-params:5.14.4`
* Added `org.junit.jupiter:junit-jupiter:6.1.3`
* Updated `org.mockito:mockito-junit-jupiter:5.23.0` to `5.24.0`

### Plugin Dependency Updates

* Updated `com.exasol:error-code-crawler-maven-plugin:2.1.0` to `2.1.2`
* Updated `com.exasol:project-keeper-maven-plugin:5.7.4` to `5.8.1`
* Updated `io.github.git-commit-id:git-commit-id-maven-plugin:10.0.0` to `10.0.1`
* Updated `org.apache.maven.plugins:maven-artifact-plugin:3.6.1` to `3.7.0`
* Updated `org.apache.maven.plugins:maven-compiler-plugin:3.15.0` to `3.16.0`
* Updated `org.apache.maven.plugins:maven-failsafe-plugin:3.5.6` to `3.6.0`
* Updated `org.apache.maven.plugins:maven-install-plugin:3.1.4` to `3.2.0`
* Updated `org.apache.maven.plugins:maven-jar-plugin:3.5.0` to `3.5.1`
* Updated `org.apache.maven.plugins:maven-surefire-plugin:3.5.6` to `3.6.0`
* Updated `org.apache.maven.plugins:maven-toolchains-plugin:3.2.0` to `3.3.0`
* Updated `org.codehaus.mojo:flatten-maven-plugin:1.7.3` to `1.8.0`
* Updated `org.codehaus.mojo:versions-maven-plugin:2.21.0` to `2.23.0`
* Updated `org.sonarsource.scanner.maven:sonar-maven-plugin:5.7.0.6970` to `5.8.0.7211`
