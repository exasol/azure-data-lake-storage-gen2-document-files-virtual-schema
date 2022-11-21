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
| [Project Lombok][12]                                            | [The MIT License][13]                         |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [Hamcrest][14]                                  | [BSD License 3][15]               |
| [Virtual Schema for document data in files][6]  | [MIT License][7]                  |
| [JUnit Jupiter Engine][16]                      | [Eclipse Public License v2.0][17] |
| [JUnit Jupiter Params][16]                      | [Eclipse Public License v2.0][17] |
| [mockito-core][18]                              | [The MIT License][19]             |
| [Testcontainers :: JUnit Jupiter Extension][20] | [MIT][11]                         |
| [Testcontainers :: Localstack][20]              | [MIT][11]                         |
| [Test Database Builder for Java][21]            | [MIT License][22]                 |
| [udf-debugging-java][23]                        | [MIT][24]                         |
| [Matcher for SQL Result Sets][25]               | [MIT License][26]                 |
| [exasol-test-setup-abstraction-java][27]        | [MIT License][28]                 |
| [SnakeYAML][29]                                 | [Apache License, Version 2.0][4]  |
| [Performance Test Recorder Java][30]            | [MIT License][31]                 |
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
| [Lombok Maven Plugin][51]                               | [The MIT License][24]                         |
| [Maven Failsafe Plugin][52]                             | [Apache License, Version 2.0][1]              |
| [JaCoCo :: Maven Plugin][53]                            | [Eclipse Public License 2.0][33]              |
| [error-code-crawler-maven-plugin][54]                   | [MIT License][55]                             |
| [Reproducible Build Maven Plugin][56]                   | [Apache 2.0][4]                               |
| [Maven Clean Plugin][57]                                | [The Apache Software License, Version 2.0][4] |
| [Maven Resources Plugin][58]                            | [The Apache Software License, Version 2.0][4] |
| [Maven Install Plugin][59]                              | [The Apache Software License, Version 2.0][4] |
| [Maven Deploy Plugin][60]                               | [The Apache Software License, Version 2.0][4] |
| [Maven Site Plugin 3][61]                               | [The Apache Software License, Version 2.0][4] |

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
[12]: https://projectlombok.org
[13]: https://projectlombok.org/LICENSE
[14]: http://hamcrest.org/JavaHamcrest/
[15]: http://opensource.org/licenses/BSD-3-Clause
[16]: https://junit.org/junit5/
[17]: https://www.eclipse.org/legal/epl-v20.html
[18]: https://github.com/mockito/mockito
[19]: https://github.com/mockito/mockito/blob/main/LICENSE
[20]: https://testcontainers.org
[21]: https://github.com/exasol/test-db-builder-java/
[22]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[23]: https://github.com/exasol/udf-debugging-java/
[24]: https://opensource.org/licenses/MIT
[25]: https://github.com/exasol/hamcrest-resultset-matcher/
[26]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[27]: https://github.com/exasol/exasol-test-setup-abstraction-java/
[28]: https://github.com/exasol/exasol-test-setup-abstraction-java/blob/main/LICENSE
[29]: https://bitbucket.org/snakeyaml/snakeyaml
[30]: https://github.com/exasol/performance-test-recorder-java/
[31]: https://github.com/exasol/performance-test-recorder-java/blob/main/LICENSE
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
[43]: https://www.mojohaus.org/versions-maven-plugin/
[44]: https://github.com/exasol/project-keeper/
[45]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[46]: https://maven.apache.org/plugins/maven-assembly-plugin/
[47]: https://maven.apache.org/plugins/maven-jar-plugin/
[48]: https://github.com/exasol/artifact-reference-checker-maven-plugin/
[49]: https://github.com/exasol/artifact-reference-checker-maven-plugin/blob/main/LICENSE
[50]: https://maven.apache.org/plugins/maven-dependency-plugin/
[51]: https://anthonywhitford.com/lombok.maven/lombok-maven-plugin/
[52]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[53]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[54]: https://github.com/exasol/error-code-crawler-maven-plugin/
[55]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[56]: http://zlika.github.io/reproducible-build-maven-plugin
[57]: http://maven.apache.org/plugins/maven-clean-plugin/
[58]: http://maven.apache.org/plugins/maven-resources-plugin/
[59]: http://maven.apache.org/plugins/maven-install-plugin/
[60]: http://maven.apache.org/plugins/maven-deploy-plugin/
[61]: http://maven.apache.org/plugins/maven-site-plugin/
