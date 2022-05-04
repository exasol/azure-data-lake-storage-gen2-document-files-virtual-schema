<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                                                      | License                                       |
| --------------------------------------------------------------- | --------------------------------------------- |
| [Jackson-core][0]                                               | [The Apache Software License, Version 2.0][1] |
| [Jackson-annotations][2]                                        | [The Apache Software License, Version 2.0][1] |
| [jackson-databind][2]                                           | [The Apache Software License, Version 2.0][1] |
| [Jackson-dataformat-XML][6]                                     | [The Apache Software License, Version 2.0][1] |
| [Jackson datatype: JSR310][8]                                   | [The Apache Software License, Version 2.0][1] |
| [Virtual Schema for document data in files][10]                 | [MIT][11]                                     |
| [error-reporting-java][12]                                      | [MIT][11]                                     |
| [Microsoft Azure client library for Blob Storage][14]           | [The MIT License (MIT)][15]                   |
| [Microsoft Azure client library for File Storage Data Lake][14] | [The MIT License (MIT)][15]                   |
| [Microsoft Azure client library for Identity][14]               | [The MIT License (MIT)][15]                   |
| [Microsoft Azure Java Core Library][14]                         | [The MIT License (MIT)][15]                   |
| [Project Lombok][22]                                            | [The MIT License][23]                         |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [Hamcrest][24]                                  | [BSD License 3][25]               |
| [Virtual Schema for document data in files][10] | [MIT][11]                         |
| [JUnit Jupiter Engine][28]                      | [Eclipse Public License v2.0][29] |
| [JUnit Jupiter Params][28]                      | [Eclipse Public License v2.0][29] |
| [mockito-core][32]                              | [The MIT License][33]             |
| [JUnit][34]                                     | [Eclipse Public License 1.0][35]  |
| [Testcontainers :: JUnit Jupiter Extension][36] | [MIT][15]                         |
| [Testcontainers :: Localstack][36]              | [MIT][15]                         |
| [Test Database Builder for Java][40]            | [MIT License][41]                 |
| [JaCoCo :: Core][42]                            | [Eclipse Public License 2.0][43]  |
| [udf-debugging-java][44]                        | [MIT][11]                         |
| [Matcher for SQL Result Sets][46]               | [MIT][11]                         |
| [exasol-test-setup-abstraction-java][48]        | [MIT][11]                         |
| [SnakeYAML][50]                                 | [Apache License, Version 2.0][1]  |
| [JaCoCo :: Agent][42]                           | [Eclipse Public License 2.0][43]  |

## Runtime Dependencies

| Dependency                 | License           |
| -------------------------- | ----------------- |
| [SLF4J API Module][54]     | [MIT License][55] |
| [SLF4J Simple Binding][54] | [MIT License][55] |

## Plugin Dependencies

| Dependency                                              | License                                       |
| ------------------------------------------------------- | --------------------------------------------- |
| [Apache Maven Enforcer Plugin][58]                      | [Apache License, Version 2.0][59]             |
| [Maven Flatten Plugin][60]                              | [Apache Software Licenese][1]                 |
| [Apache Maven Compiler Plugin][62]                      | [Apache License, Version 2.0][59]             |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][64] | [ASL2][1]                                     |
| [Reproducible Build Maven Plugin][66]                   | [Apache 2.0][1]                               |
| [Maven Surefire Plugin][68]                             | [Apache License, Version 2.0][59]             |
| [Versions Maven Plugin][70]                             | [Apache License, Version 2.0][59]             |
| [Project keeper maven plugin][72]                       | [MIT][11]                                     |
| [Apache Maven Assembly Plugin][74]                      | [Apache License, Version 2.0][59]             |
| [Apache Maven JAR Plugin][76]                           | [Apache License, Version 2.0][59]             |
| [Artifact reference checker and unifier][78]            | [MIT][11]                                     |
| [Apache Maven Dependency Plugin][80]                    | [Apache License, Version 2.0][59]             |
| [Lombok Maven Plugin][82]                               | [The MIT License][11]                         |
| [Maven Failsafe Plugin][84]                             | [Apache License, Version 2.0][59]             |
| [JaCoCo :: Maven Plugin][86]                            | [Eclipse Public License 2.0][43]              |
| [error-code-crawler-maven-plugin][88]                   | [MIT][11]                                     |
| [Maven Clean Plugin][90]                                | [The Apache Software License, Version 2.0][1] |
| [Maven Resources Plugin][92]                            | [The Apache Software License, Version 2.0][1] |
| [Maven Install Plugin][94]                              | [The Apache Software License, Version 2.0][1] |
| [Maven Deploy Plugin][96]                               | [The Apache Software License, Version 2.0][1] |
| [Maven Site Plugin 3][98]                               | [The Apache Software License, Version 2.0][1] |

[42]: https://www.eclemma.org/jacoco/index.html
[12]: https://github.com/exasol/error-reporting-java
[10]: https://github.com/exasol/virtual-schema-common-document-files
[1]: http://www.apache.org/licenses/LICENSE-2.0.txt
[22]: https://projectlombok.org
[68]: https://maven.apache.org/surefire/maven-surefire-plugin/
[90]: http://maven.apache.org/plugins/maven-clean-plugin/
[11]: https://opensource.org/licenses/MIT
[32]: https://github.com/mockito/mockito
[6]: https://github.com/FasterXML/jackson-dataformat-xml
[70]: http://www.mojohaus.org/versions-maven-plugin/
[25]: http://opensource.org/licenses/BSD-3-Clause
[62]: https://maven.apache.org/plugins/maven-compiler-plugin/
[41]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[34]: http://junit.org
[43]: https://www.eclipse.org/legal/epl-2.0/
[2]: http://github.com/FasterXML/jackson
[86]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[33]: https://github.com/mockito/mockito/blob/main/LICENSE
[23]: https://projectlombok.org/LICENSE
[46]: https://github.com/exasol/hamcrest-resultset-matcher
[66]: http://zlika.github.io/reproducible-build-maven-plugin
[55]: http://www.opensource.org/licenses/mit-license.php
[72]: https://github.com/exasol/project-keeper-maven-plugin/project-keeper-maven-plugin-generated-parent/project-keeper-maven-plugin
[28]: https://junit.org/junit5/
[60]: https://www.mojohaus.org/flatten-maven-plugin/flatten-maven-plugin
[24]: http://hamcrest.org/JavaHamcrest/
[54]: http://www.slf4j.org
[92]: http://maven.apache.org/plugins/maven-resources-plugin/
[78]: https://github.com/exasol/artifact-reference-checker-maven-plugin
[48]: https://github.com/exasol/exasol-test-setup-abstraction-java
[0]: https://github.com/FasterXML/jackson-core
[76]: https://maven.apache.org/plugins/maven-jar-plugin/
[50]: http://www.snakeyaml.org
[40]: https://github.com/exasol/test-db-builder-java/
[84]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[15]: http://opensource.org/licenses/MIT
[8]: https://github.com/FasterXML/jackson-modules-java8/jackson-datatype-jsr310
[35]: http://www.eclipse.org/legal/epl-v10.html
[80]: https://maven.apache.org/plugins/maven-dependency-plugin/
[59]: https://www.apache.org/licenses/LICENSE-2.0.txt
[58]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[82]: https://awhitford.github.com/lombok.maven/lombok-maven-plugin/
[14]: https://github.com/Azure/azure-sdk-for-java
[29]: https://www.eclipse.org/legal/epl-v20.html
[94]: http://maven.apache.org/plugins/maven-install-plugin/
[64]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[36]: https://testcontainers.org
[44]: https://github.com/exasol/udf-debugging-java
[96]: http://maven.apache.org/plugins/maven-deploy-plugin/
[98]: http://maven.apache.org/plugins/maven-site-plugin/
[88]: https://github.com/exasol/error-code-crawler-maven-plugin
[74]: https://maven.apache.org/plugins/maven-assembly-plugin/
