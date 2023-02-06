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
| [Microsoft Azure client library for File Storage Data Lake][10] | [The MIT License (MIT)][11]                   |
| [Microsoft Azure client library for Identity][10]               | [The MIT License (MIT)][11]                   |
| [Microsoft Azure Java Core Library][10]                         | [The MIT License (MIT)][11]                   |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [Apache Commons Net][12]                        | [Apache License, Version 2.0][1]  |
| [Hamcrest][13]                                  | [BSD License 3][14]               |
| [Virtual Schema for document data in files][6]  | [MIT License][7]                  |
| [JUnit Jupiter Engine][15]                      | [Eclipse Public License v2.0][16] |
| [JUnit Jupiter Params][15]                      | [Eclipse Public License v2.0][16] |
| [mockito-core][17]                              | [The MIT License][18]             |
| [Testcontainers :: JUnit Jupiter Extension][19] | [MIT][11]                         |
| [Testcontainers :: Localstack][19]              | [MIT][11]                         |
| [Test Database Builder for Java][20]            | [MIT License][21]                 |
| [udf-debugging-java][22]                        | [MIT License][23]                 |
| [Matcher for SQL Result Sets][24]               | [MIT License][25]                 |
| [exasol-test-setup-abstraction-java][26]        | [MIT License][27]                 |
| [SnakeYAML][28]                                 | [Apache License, Version 2.0][4]  |
| [Performance Test Recorder Java][29]            | [MIT License][30]                 |
| [EqualsVerifier | release normal jar][31]       | [Apache License, Version 2.0][1]  |
| [JaCoCo :: Agent][32]                           | [Eclipse Public License 2.0][33]  |

## Runtime Dependencies

| Dependency                 | License           |
| -------------------------- | ----------------- |
| [SLF4J API Module][34]     | [MIT License][35] |
| [SLF4J Simple Binding][34] | [MIT License][35] |

## Plugin Dependencies

| Dependency                                              | License                                       |
| ------------------------------------------------------- | --------------------------------------------- |
| [SonarQube Scanner for Maven][36]                       | [GNU LGPL 3][37]                              |
| [Apache Maven Compiler Plugin][38]                      | [Apache License, Version 2.0][1]              |
| [Apache Maven Enforcer Plugin][39]                      | [Apache License, Version 2.0][1]              |
| [Maven Flatten Plugin][40]                              | [Apache Software Licenese][1]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][41] | [ASL2][4]                                     |
| [Maven Surefire Plugin][42]                             | [Apache License, Version 2.0][1]              |
| [Versions Maven Plugin][43]                             | [Apache License, Version 2.0][1]              |
| [Project keeper maven plugin][44]                       | [The MIT License][45]                         |
| [Apache Maven Assembly Plugin][46]                      | [Apache License, Version 2.0][1]              |
| [Apache Maven JAR Plugin][47]                           | [Apache License, Version 2.0][1]              |
| [Artifact reference checker and unifier][48]            | [MIT License][49]                             |
| [Apache Maven Dependency Plugin][50]                    | [Apache License, Version 2.0][1]              |
| [Maven Failsafe Plugin][51]                             | [Apache License, Version 2.0][1]              |
| [JaCoCo :: Maven Plugin][52]                            | [Eclipse Public License 2.0][33]              |
| [error-code-crawler-maven-plugin][53]                   | [MIT License][54]                             |
| [Reproducible Build Maven Plugin][55]                   | [Apache 2.0][4]                               |
| [Maven Clean Plugin][56]                                | [The Apache Software License, Version 2.0][4] |
| [Maven Resources Plugin][57]                            | [The Apache Software License, Version 2.0][4] |
| [Maven Install Plugin][58]                              | [The Apache Software License, Version 2.0][4] |
| [Maven Deploy Plugin][59]                               | [The Apache Software License, Version 2.0][4] |
| [Maven Site Plugin 3][60]                               | [The Apache Software License, Version 2.0][4] |

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
[12]: https://commons.apache.org/proper/commons-net/
[13]: http://hamcrest.org/JavaHamcrest/
[14]: http://opensource.org/licenses/BSD-3-Clause
[15]: https://junit.org/junit5/
[16]: https://www.eclipse.org/legal/epl-v20.html
[17]: https://github.com/mockito/mockito
[18]: https://github.com/mockito/mockito/blob/main/LICENSE
[19]: https://testcontainers.org
[20]: https://github.com/exasol/test-db-builder-java/
[21]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[22]: https://github.com/exasol/udf-debugging-java/
[23]: https://github.com/exasol/udf-debugging-java/blob/main/LICENSE
[24]: https://github.com/exasol/hamcrest-resultset-matcher/
[25]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[26]: https://github.com/exasol/exasol-test-setup-abstraction-java/
[27]: https://github.com/exasol/exasol-test-setup-abstraction-java/blob/main/LICENSE
[28]: https://bitbucket.org/snakeyaml/snakeyaml
[29]: https://github.com/exasol/performance-test-recorder-java/
[30]: https://github.com/exasol/performance-test-recorder-java/blob/main/LICENSE
[31]: https://www.jqno.nl/equalsverifier
[32]: https://www.eclemma.org/jacoco/index.html
[33]: https://www.eclipse.org/legal/epl-2.0/
[34]: http://www.slf4j.org
[35]: http://www.opensource.org/licenses/mit-license.php
[36]: http://sonarsource.github.io/sonar-scanner-maven/
[37]: http://www.gnu.org/licenses/lgpl.txt
[38]: https://maven.apache.org/plugins/maven-compiler-plugin/
[39]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[40]: https://www.mojohaus.org/flatten-maven-plugin/
[41]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[42]: https://maven.apache.org/surefire/maven-surefire-plugin/
[43]: https://www.mojohaus.org/versions/versions-maven-plugin/
[44]: https://github.com/exasol/project-keeper/
[45]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[46]: https://maven.apache.org/plugins/maven-assembly-plugin/
[47]: https://maven.apache.org/plugins/maven-jar-plugin/
[48]: https://github.com/exasol/artifact-reference-checker-maven-plugin/
[49]: https://github.com/exasol/artifact-reference-checker-maven-plugin/blob/main/LICENSE
[50]: https://maven.apache.org/plugins/maven-dependency-plugin/
[51]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[52]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[53]: https://github.com/exasol/error-code-crawler-maven-plugin/
[54]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[55]: http://zlika.github.io/reproducible-build-maven-plugin
[56]: http://maven.apache.org/plugins/maven-clean-plugin/
[57]: http://maven.apache.org/plugins/maven-resources-plugin/
[58]: http://maven.apache.org/plugins/maven-install-plugin/
[59]: http://maven.apache.org/plugins/maven-deploy-plugin/
[60]: http://maven.apache.org/plugins/maven-site-plugin/
