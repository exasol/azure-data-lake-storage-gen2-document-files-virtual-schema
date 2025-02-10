# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 2.1.3, released 2025-02-10

Code name: Fixed vulnerability CVE-2024-57699 

## Summary

This release fixes CVE-2024-57699 in transitive dependency net.minidev:json-smart:jar:2.5.0:compile used by 
the `com.azure:azure-identity` library

## Security

* #70: Fixed vulnerability CVE-2024-57699 in transitive dependency net.minidev:json-smart:jar:2.5.0:compile

## Dependency Updates

### Compile Dependency Updates

* Updated `com.azure:azure-core-http-netty:1.15.7` to `1.15.8`
* Updated `com.azure:azure-core:1.54.1` to `1.55.0`
* Updated `com.azure:azure-identity:1.14.2` to `1.15.1`

### Test Dependency Updates

* Updated `com.exasol:udf-debugging-java:0.6.13` to `0.6.14`
* Updated `nl.jqno.equalsverifier:equalsverifier:3.17.3` to `3.19`
* Updated `org.junit.jupiter:junit-jupiter-params:5.11.3` to `5.11.4`
* Updated `org.mockito:mockito-core:5.14.2` to `5.15.2`

### Plugin Dependency Updates

* Updated `com.exasol:project-keeper-maven-plugin:4.4.0` to `4.5.0`
* Updated `org.apache.maven.plugins:maven-dependency-plugin:3.8.0` to `3.8.1`
* Updated `org.apache.maven.plugins:maven-failsafe-plugin:3.5.1` to `3.5.2`
* Updated `org.apache.maven.plugins:maven-site-plugin:3.9.1` to `3.21.0`
* Updated `org.apache.maven.plugins:maven-surefire-plugin:3.5.1` to `3.5.2`
* Updated `org.codehaus.mojo:versions-maven-plugin:2.17.1` to `2.18.0`
* Updated `org.sonarsource.scanner.maven:sonar-maven-plugin:4.0.0.4121` to `5.0.0.4389`
