<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                                                      | License                                       |
| --------------------------------------------------------------- | --------------------------------------------- |
| [Jackson-core][0]                                               | [The Apache Software License, Version 2.0][1] |
| [Jackson-annotations][2]                                        | [The Apache Software License, Version 2.0][1] |
| [jackson-databind][2]                                           | [The Apache Software License, Version 2.0][1] |
| [Jackson-dataformat-XML][3]                                     | [The Apache Software License, Version 2.0][4] |
| [Jackson datatype: JSR310][5]                                   | [The Apache Software License, Version 2.0][4] |
| [Virtual Schema for document data in files][6]                  | [MIT License][7]                              |
| [error-reporting-java][8]                                       | [MIT License][9]                              |
| [Microsoft Azure client library for Blob Storage][10]           | [The MIT License (MIT)][11]                   |
| [Microsoft Azure client library for File Storage Data Lake][10] | [The MIT License (MIT)][11]                   |
| [Microsoft Azure client library for Identity][10]               | [The MIT License (MIT)][11]                   |
| [Microsoft Azure Java Core Library][10]                         | [The MIT License (MIT)][11]                   |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [Hamcrest][12]                                  | [BSD License 3][13]               |
| [Virtual Schema for document data in files][6]  | [MIT License][7]                  |
| [JUnit Jupiter Engine][14]                      | [Eclipse Public License v2.0][15] |
| [JUnit Jupiter Params][14]                      | [Eclipse Public License v2.0][15] |
| [mockito-core][16]                              | [The MIT License][17]             |
| [Testcontainers :: JUnit Jupiter Extension][18] | [MIT][11]                         |
| [Testcontainers :: Localstack][18]              | [MIT][11]                         |
| [Test Database Builder for Java][19]            | [MIT License][20]                 |
| [udf-debugging-java][21]                        | [MIT][22]                         |
| [Matcher for SQL Result Sets][23]               | [MIT License][24]                 |
| [exasol-test-setup-abstraction-java][25]        | [MIT License][26]                 |
| [SnakeYAML][27]                                 | [Apache License, Version 2.0][4]  |
| [Performance Test Recorder Java][28]            | [MIT License][29]                 |
| [EqualsVerifier | release normal jar][30]       | [Apache License, Version 2.0][1]  |
| [JaCoCo :: Agent][31]                           | [Eclipse Public License 2.0][32]  |

## Runtime Dependencies

| Dependency                 | License           |
| -------------------------- | ----------------- |
| [SLF4J API Module][33]     | [MIT License][34] |
| [SLF4J Simple Binding][33] | [MIT License][34] |

## Plugin Dependencies

| Dependency                                              | License                                       |
| ------------------------------------------------------- | --------------------------------------------- |
| [SonarQube Scanner for Maven][35]                       | [GNU LGPL 3][36]                              |
| [Apache Maven Compiler Plugin][37]                      | [Apache License, Version 2.0][1]              |
| [Apache Maven Enforcer Plugin][38]                      | [Apache License, Version 2.0][1]              |
| [Maven Flatten Plugin][39]                              | [Apache Software Licenese][1]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][40] | [ASL2][4]                                     |
| [Maven Surefire Plugin][41]                             | [Apache License, Version 2.0][1]              |
| [Versions Maven Plugin][42]                             | [Apache License, Version 2.0][1]              |
| [Project keeper maven plugin][43]                       | [The MIT License][44]                         |
| [Apache Maven Assembly Plugin][45]                      | [Apache License, Version 2.0][1]              |
| [Apache Maven JAR Plugin][46]                           | [Apache License, Version 2.0][1]              |
| [Artifact reference checker and unifier][47]            | [MIT License][48]                             |
| [Apache Maven Dependency Plugin][49]                    | [Apache License, Version 2.0][1]              |
| [Maven Failsafe Plugin][50]                             | [Apache License, Version 2.0][1]              |
| [JaCoCo :: Maven Plugin][51]                            | [Eclipse Public License 2.0][32]              |
| [error-code-crawler-maven-plugin][52]                   | [MIT License][53]                             |
| [Reproducible Build Maven Plugin][54]                   | [Apache 2.0][4]                               |
| [Maven Clean Plugin][55]                                | [The Apache Software License, Version 2.0][4] |
| [Maven Resources Plugin][56]                            | [The Apache Software License, Version 2.0][4] |
| [Maven Install Plugin][57]                              | [The Apache Software License, Version 2.0][4] |
| [Maven Deploy Plugin][58]                               | [The Apache Software License, Version 2.0][4] |
| [Maven Site Plugin 3][59]                               | [The Apache Software License, Version 2.0][4] |

[0]: https://github.com/FasterXML/jackson-core
[1]: https://www.apache.org/licenses/LICENSE-2.0.txt
[2]: https://github.com/FasterXML/jackson
[3]: https://github.com/FasterXML/jackson-dataformat-xml
[4]: http://www.apache.org/licenses/LICENSE-2.0.txt
[5]: https://github.com/FasterXML/jackson-modules-java8/tree/2.14/datetime
[6]: https://github.com/exasol/virtual-schema-common-document-files/
[7]: https://github.com/exasol/virtual-schema-common-document-files/blob/main/LICENSE
[8]: https://github.com/exasol/error-reporting-java/
[9]: https://github.com/exasol/error-reporting-java/blob/main/LICENSE
[10]: https://github.com/Azure/azure-sdk-for-java
[11]: http://opensource.org/licenses/MIT
[12]: http://hamcrest.org/JavaHamcrest/
[13]: http://opensource.org/licenses/BSD-3-Clause
[14]: https://junit.org/junit5/
[15]: https://www.eclipse.org/legal/epl-v20.html
[16]: https://github.com/mockito/mockito
[17]: https://github.com/mockito/mockito/blob/main/LICENSE
[18]: https://testcontainers.org
[19]: https://github.com/exasol/test-db-builder-java/
[20]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[21]: https://github.com/exasol/udf-debugging-java/
[22]: https://opensource.org/licenses/MIT
[23]: https://github.com/exasol/hamcrest-resultset-matcher/
[24]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[25]: https://github.com/exasol/exasol-test-setup-abstraction-java/
[26]: https://github.com/exasol/exasol-test-setup-abstraction-java/blob/main/LICENSE
[27]: https://bitbucket.org/snakeyaml/snakeyaml
[28]: https://github.com/exasol/performance-test-recorder-java/
[29]: https://github.com/exasol/performance-test-recorder-java/blob/main/LICENSE
[30]: https://www.jqno.nl/equalsverifier
[31]: https://www.eclemma.org/jacoco/index.html
[32]: https://www.eclipse.org/legal/epl-2.0/
[33]: http://www.slf4j.org
[34]: http://www.opensource.org/licenses/mit-license.php
[35]: http://sonarsource.github.io/sonar-scanner-maven/
[36]: http://www.gnu.org/licenses/lgpl.txt
[37]: https://maven.apache.org/plugins/maven-compiler-plugin/
[38]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[39]: https://www.mojohaus.org/flatten-maven-plugin/
[40]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[41]: https://maven.apache.org/surefire/maven-surefire-plugin/
[42]: https://www.mojohaus.org/versions-maven-plugin/
[43]: https://github.com/exasol/project-keeper/
[44]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[45]: https://maven.apache.org/plugins/maven-assembly-plugin/
[46]: https://maven.apache.org/plugins/maven-jar-plugin/
[47]: https://github.com/exasol/artifact-reference-checker-maven-plugin/
[48]: https://github.com/exasol/artifact-reference-checker-maven-plugin/blob/main/LICENSE
[49]: https://maven.apache.org/plugins/maven-dependency-plugin/
[50]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[51]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[52]: https://github.com/exasol/error-code-crawler-maven-plugin/
[53]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[54]: http://zlika.github.io/reproducible-build-maven-plugin
[55]: http://maven.apache.org/plugins/maven-clean-plugin/
[56]: http://maven.apache.org/plugins/maven-resources-plugin/
[57]: http://maven.apache.org/plugins/maven-install-plugin/
[58]: http://maven.apache.org/plugins/maven-deploy-plugin/
[59]: http://maven.apache.org/plugins/maven-site-plugin/
