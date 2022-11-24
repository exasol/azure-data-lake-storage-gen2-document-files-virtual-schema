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
| [JaCoCo :: Agent][30]                           | [Eclipse Public License 2.0][31]  |

## Runtime Dependencies

| Dependency                 | License           |
| -------------------------- | ----------------- |
| [SLF4J API Module][32]     | [MIT License][33] |
| [SLF4J Simple Binding][32] | [MIT License][33] |

## Plugin Dependencies

| Dependency                                              | License                                       |
| ------------------------------------------------------- | --------------------------------------------- |
| [SonarQube Scanner for Maven][34]                       | [GNU LGPL 3][35]                              |
| [Apache Maven Compiler Plugin][36]                      | [Apache License, Version 2.0][1]              |
| [Apache Maven Enforcer Plugin][37]                      | [Apache License, Version 2.0][1]              |
| [Maven Flatten Plugin][38]                              | [Apache Software Licenese][1]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][39] | [ASL2][4]                                     |
| [Maven Surefire Plugin][40]                             | [Apache License, Version 2.0][1]              |
| [Versions Maven Plugin][41]                             | [Apache License, Version 2.0][1]              |
| [Project keeper maven plugin][42]                       | [The MIT License][43]                         |
| [Apache Maven Assembly Plugin][44]                      | [Apache License, Version 2.0][1]              |
| [Apache Maven JAR Plugin][45]                           | [Apache License, Version 2.0][1]              |
| [Artifact reference checker and unifier][46]            | [MIT License][47]                             |
| [Apache Maven Dependency Plugin][48]                    | [Apache License, Version 2.0][1]              |
| [Maven Failsafe Plugin][49]                             | [Apache License, Version 2.0][1]              |
| [JaCoCo :: Maven Plugin][50]                            | [Eclipse Public License 2.0][31]              |
| [error-code-crawler-maven-plugin][51]                   | [MIT License][52]                             |
| [Reproducible Build Maven Plugin][53]                   | [Apache 2.0][4]                               |
| [Maven Clean Plugin][54]                                | [The Apache Software License, Version 2.0][4] |
| [Maven Resources Plugin][55]                            | [The Apache Software License, Version 2.0][4] |
| [Maven Install Plugin][56]                              | [The Apache Software License, Version 2.0][4] |
| [Maven Deploy Plugin][57]                               | [The Apache Software License, Version 2.0][4] |
| [Maven Site Plugin 3][58]                               | [The Apache Software License, Version 2.0][4] |

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
[30]: https://www.eclemma.org/jacoco/index.html
[31]: https://www.eclipse.org/legal/epl-2.0/
[32]: http://www.slf4j.org
[33]: http://www.opensource.org/licenses/mit-license.php
[34]: http://sonarsource.github.io/sonar-scanner-maven/
[35]: http://www.gnu.org/licenses/lgpl.txt
[36]: https://maven.apache.org/plugins/maven-compiler-plugin/
[37]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[38]: https://www.mojohaus.org/flatten-maven-plugin/
[39]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[40]: https://maven.apache.org/surefire/maven-surefire-plugin/
[41]: https://www.mojohaus.org/versions-maven-plugin/
[42]: https://github.com/exasol/project-keeper/
[43]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[44]: https://maven.apache.org/plugins/maven-assembly-plugin/
[45]: https://maven.apache.org/plugins/maven-jar-plugin/
[46]: https://github.com/exasol/artifact-reference-checker-maven-plugin/
[47]: https://github.com/exasol/artifact-reference-checker-maven-plugin/blob/main/LICENSE
[48]: https://maven.apache.org/plugins/maven-dependency-plugin/
[49]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[50]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[51]: https://github.com/exasol/error-code-crawler-maven-plugin/
[52]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[53]: http://zlika.github.io/reproducible-build-maven-plugin
[54]: http://maven.apache.org/plugins/maven-clean-plugin/
[55]: http://maven.apache.org/plugins/maven-resources-plugin/
[56]: http://maven.apache.org/plugins/maven-install-plugin/
[57]: http://maven.apache.org/plugins/maven-deploy-plugin/
[58]: http://maven.apache.org/plugins/maven-site-plugin/
