# Virtual Schema for document data in files on Azure Data Lake Storage Gen 2 1.1.3, released 2022-11-21

Code name: Fixed CVE-2022-42004

## Summary

The dependency `com.fasterxml.jackson.core:jackson-databind` in version 2.13.4 is vulnerable to CVE-2022-42004, so we updated to 2.14.0, which is not affected.

We also removed Lombok from the project.

### Known Issues

The following vulnerabilities are still open because no update existed at the time of this release in the upstream.

* CVE-2020-8908 (aka. sonatype-2020-0926) (in `com.google.guava:guava`) There is a local information disclosure issue in Guava when using temporary directories. Google reacted by [deprecating the functions around creating temporary directories](https://github.com/google/guava/commit/fec0dbc4634006a6162cfd4d0d09c962073ddf40). The vulnerability itself persists if such functions are used.
* sonatype-2022-5820 (in Hadoop Common)
* CVE-2022-31684 (in the Netty HTTP server) Accidental HTTP header logging on log level WARN
* CVE-2022-38752 (in SnakeYaml) DOS when parsing untrusted YAML files
* sonatype-2022-5732 (in HDFS) XXE when receiving XML from untrusted source. Only ["ec" command line tool affected](https://issues.apache.org/jira/browse/HDFS-16766).

## Bugfixes

* 17: Updated `com.fasterxml.jackson.core:jackson-databind` CVE-2022-42004

## Dependency Updates

### Compile Dependency Updates

* Updated `com.azure:azure-core:1.33.0` to `1.34.0`
* Updated `com.azure:azure-identity:1.6.1` to `1.7.1`
* Updated `com.azure:azure-storage-blob:12.20.0` to `12.20.1`
* Updated `com.azure:azure-storage-file-datalake:12.13.0` to `12.13.1`
* Updated `com.fasterxml.jackson.core:jackson-annotations:2.13.4` to `2.14.1`
* Updated `com.fasterxml.jackson.core:jackson-core:2.13.4` to `2.14.1`
* Updated `com.fasterxml.jackson.core:jackson-databind:2.13.4.2` to `2.14.1`
* Updated `com.fasterxml.jackson.dataformat:jackson-dataformat-xml:2.13.4` to `2.14.1`
* Updated `com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.13.4` to `2.14.1`

### Runtime Dependency Updates

* Updated `org.slf4j:slf4j-api:2.0.3` to `2.0.4`
* Updated `org.slf4j:slf4j-simple:2.0.3` to `2.0.4`

### Test Dependency Updates

* Updated `com.exasol:exasol-test-setup-abstraction-java:0.3.2` to `1.0.0`
* Updated `com.exasol:udf-debugging-java:0.6.4` to `0.6.5`
* Added `nl.jqno.equalsverifier:equalsverifier:3.11.1`
* Updated `org.mockito:mockito-core:4.8.1` to `4.9.0`
* Updated `org.testcontainers:junit-jupiter:1.17.5` to `1.17.6`
* Updated `org.testcontainers:localstack:1.17.5` to `1.17.6`

### Plugin Dependency Updates

* Updated `com.exasol:artifact-reference-checker-maven-plugin:0.4.0` to `0.4.2`
* Updated `com.exasol:error-code-crawler-maven-plugin:1.1.2` to `1.2.1`
* Updated `com.exasol:project-keeper-maven-plugin:2.8.0` to `2.9.1`
* Updated `io.github.zlika:reproducible-build-maven-plugin:0.15` to `0.16`
* Updated `org.apache.maven.plugins:maven-assembly-plugin:3.3.0` to `3.4.2`
* Updated `org.apache.maven.plugins:maven-failsafe-plugin:3.0.0-M5` to `3.0.0-M7`
* Updated `org.apache.maven.plugins:maven-jar-plugin:3.2.2` to `3.3.0`
* Updated `org.apache.maven.plugins:maven-surefire-plugin:3.0.0-M5` to `3.0.0-M7`
* Updated `org.codehaus.mojo:flatten-maven-plugin:1.2.7` to `1.3.0`
* Updated `org.codehaus.mojo:versions-maven-plugin:2.10.0` to `2.13.0`
* Removed `org.projectlombok:lombok-maven-plugin:1.18.20.0`
