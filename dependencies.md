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
| [Virtual Schema for document data in files][10]                 | [MIT License][11]                             |
| [error-reporting-java][12]                                      | [MIT][13]                                     |
| [Microsoft Azure client library for Blob Storage][14]           | [The MIT License (MIT)][15]                   |
| [Microsoft Azure client library for File Storage Data Lake][14] | [The MIT License (MIT)][15]                   |
| [Microsoft Azure client library for Identity][14]               | [The MIT License (MIT)][15]                   |
| [Microsoft Azure Java Core Library][14]                         | [The MIT License (MIT)][15]                   |
| [Project Lombok][22]                                            | [The MIT License][23]                         |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [Hamcrest][24]                                  | [BSD License 3][25]               |
| [Virtual Schema for document data in files][10] | [MIT License][11]                 |
| [JUnit Jupiter Engine][28]                      | [Eclipse Public License v2.0][29] |
| [JUnit Jupiter Params][28]                      | [Eclipse Public License v2.0][29] |
| [mockito-core][32]                              | [The MIT License][33]             |
| [Testcontainers :: JUnit Jupiter Extension][34] | [MIT][15]                         |
| [Testcontainers :: Localstack][34]              | [MIT][15]                         |
| [Test Database Builder for Java][38]            | [MIT License][39]                 |
| [udf-debugging-java][40]                        | [MIT][13]                         |
| [Matcher for SQL Result Sets][42]               | [MIT][13]                         |
| [exasol-test-setup-abstraction-java][44]        | [MIT License][45]                 |
| [SnakeYAML][46]                                 | [Apache License, Version 2.0][1]  |
| [Performance Test Recorder Java][48]            | [MIT][13]                         |
| [JaCoCo :: Agent][50]                           | [Eclipse Public License 2.0][51]  |

## Runtime Dependencies

| Dependency                 | License           |
| -------------------------- | ----------------- |
| [SLF4J API Module][52]     | [MIT License][53] |
| [SLF4J Simple Binding][52] | [MIT License][53] |

## Plugin Dependencies

| Dependency                                              | License                                       |
| ------------------------------------------------------- | --------------------------------------------- |
| [SonarQube Scanner for Maven][56]                       | [GNU LGPL 3][57]                              |
| [Apache Maven Compiler Plugin][58]                      | [Apache License, Version 2.0][59]             |
| [Apache Maven Enforcer Plugin][60]                      | [Apache License, Version 2.0][59]             |
| [Maven Flatten Plugin][62]                              | [Apache Software Licenese][1]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][64] | [ASL2][1]                                     |
| [Reproducible Build Maven Plugin][66]                   | [Apache 2.0][1]                               |
| [Maven Surefire Plugin][68]                             | [Apache License, Version 2.0][59]             |
| [Versions Maven Plugin][70]                             | [Apache License, Version 2.0][59]             |
| [Project keeper maven plugin][72]                       | [The MIT License][73]                         |
| [Apache Maven Assembly Plugin][74]                      | [Apache License, Version 2.0][59]             |
| [Apache Maven JAR Plugin][76]                           | [Apache License, Version 2.0][59]             |
| [Artifact reference checker and unifier][78]            | [MIT][13]                                     |
| [Apache Maven Dependency Plugin][80]                    | [Apache License, Version 2.0][59]             |
| [Lombok Maven Plugin][82]                               | [The MIT License][13]                         |
| [Maven Failsafe Plugin][84]                             | [Apache License, Version 2.0][59]             |
| [JaCoCo :: Maven Plugin][86]                            | [Eclipse Public License 2.0][51]              |
| [error-code-crawler-maven-plugin][88]                   | [MIT][13]                                     |
| [Maven Clean Plugin][90]                                | [The Apache Software License, Version 2.0][1] |
| [Maven Resources Plugin][92]                            | [The Apache Software License, Version 2.0][1] |
| [Maven Install Plugin][94]                              | [The Apache Software License, Version 2.0][1] |
| [Maven Deploy Plugin][96]                               | [The Apache Software License, Version 2.0][1] |
| [Maven Site Plugin 3][98]                               | [The Apache Software License, Version 2.0][1] |

[50]: https://www.eclemma.org/jacoco/index.html
[12]: https://github.com/exasol/error-reporting-java
[1]: http://www.apache.org/licenses/LICENSE-2.0.txt
[22]: https://projectlombok.org
[68]: https://maven.apache.org/surefire/maven-surefire-plugin/
[90]: http://maven.apache.org/plugins/maven-clean-plugin/
[13]: https://opensource.org/licenses/MIT
[32]: https://github.com/mockito/mockito
[62]: https://www.mojohaus.org/flatten-maven-plugin/
[6]: https://github.com/FasterXML/jackson-dataformat-xml
[70]: http://www.mojohaus.org/versions-maven-plugin/
[72]: https://github.com/exasol/project-keeper/
[25]: http://opensource.org/licenses/BSD-3-Clause
[58]: https://maven.apache.org/plugins/maven-compiler-plugin/
[39]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[44]: https://github.com/exasol/exasol-test-setup-abstraction-java/
[51]: https://www.eclipse.org/legal/epl-2.0/
[2]: http://github.com/FasterXML/jackson
[57]: http://www.gnu.org/licenses/lgpl.txt
[86]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[33]: https://github.com/mockito/mockito/blob/main/LICENSE
[23]: https://projectlombok.org/LICENSE
[42]: https://github.com/exasol/hamcrest-resultset-matcher
[66]: http://zlika.github.io/reproducible-build-maven-plugin
[45]: https://github.com/exasol/exasol-test-setup-abstraction-java/blob/main/LICENSE
[53]: http://www.opensource.org/licenses/mit-license.php
[56]: http://sonarsource.github.io/sonar-scanner-maven/
[40]: https://github.com/exasol/udf-debugging-java/
[28]: https://junit.org/junit5/
[46]: https://bitbucket.org/snakeyaml/snakeyaml
[10]: https://github.com/exasol/virtual-schema-common-document-files/
[24]: http://hamcrest.org/JavaHamcrest/
[52]: http://www.slf4j.org
[92]: http://maven.apache.org/plugins/maven-resources-plugin/
[78]: https://github.com/exasol/artifact-reference-checker-maven-plugin
[0]: https://github.com/FasterXML/jackson-core
[76]: https://maven.apache.org/plugins/maven-jar-plugin/
[38]: https://github.com/exasol/test-db-builder-java/
[8]: https://github.com/FasterXML/jackson-modules-java8/tree/2.14/datetime
[84]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[48]: https://github.com/exasol/performance-test-recorder-java
[15]: http://opensource.org/licenses/MIT
[73]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[80]: https://maven.apache.org/plugins/maven-dependency-plugin/
[59]: https://www.apache.org/licenses/LICENSE-2.0.txt
[60]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[14]: https://github.com/Azure/azure-sdk-for-java
[29]: https://www.eclipse.org/legal/epl-v20.html
[94]: http://maven.apache.org/plugins/maven-install-plugin/
[64]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[11]: https://github.com/exasol/virtual-schema-common-document-files/blob/main/LICENSE
[34]: https://testcontainers.org
[82]: https://anthonywhitford.com/lombok.maven/lombok-maven-plugin/
[96]: http://maven.apache.org/plugins/maven-deploy-plugin/
[98]: http://maven.apache.org/plugins/maven-site-plugin/
[88]: https://github.com/exasol/error-code-crawler-maven-plugin
[74]: https://maven.apache.org/plugins/maven-assembly-plugin/
