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
| [Project Lombok][12]                                            | [The MIT License][13]                         |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [Apache Commons Net][14]                        | [Apache License, Version 2.0][1]  |
| [Hamcrest][15]                                  | [BSD License 3][16]               |
| [Virtual Schema for document data in files][6]  | [MIT License][7]                  |
| [JUnit Jupiter Engine][17]                      | [Eclipse Public License v2.0][18] |
| [JUnit Jupiter Params][17]                      | [Eclipse Public License v2.0][18] |
| [mockito-core][19]                              | [The MIT License][20]             |
| [Testcontainers :: JUnit Jupiter Extension][21] | [MIT][11]                         |
| [Testcontainers :: Localstack][21]              | [MIT][11]                         |
| [Test Database Builder for Java][22]            | [MIT License][23]                 |
| [udf-debugging-java][24]                        | [MIT License][25]                 |
| [Matcher for SQL Result Sets][26]               | [MIT License][27]                 |
| [exasol-test-setup-abstraction-java][28]        | [MIT License][29]                 |
| [SnakeYAML][30]                                 | [Apache License, Version 2.0][4]  |
| [Performance Test Recorder Java][31]            | [MIT License][32]                 |
| [JaCoCo :: Agent][33]                           | [Eclipse Public License 2.0][34]  |

## Runtime Dependencies

| Dependency                 | License           |
| -------------------------- | ----------------- |
| [SLF4J API Module][35]     | [MIT License][36] |
| [SLF4J Simple Binding][35] | [MIT License][36] |

## Plugin Dependencies

| Dependency                                              | License                                       |
| ------------------------------------------------------- | --------------------------------------------- |
| [SonarQube Scanner for Maven][37]                       | [GNU LGPL 3][38]                              |
| [Apache Maven Compiler Plugin][39]                      | [Apache License, Version 2.0][1]              |
| [Apache Maven Enforcer Plugin][40]                      | [Apache License, Version 2.0][1]              |
| [Maven Flatten Plugin][41]                              | [Apache Software Licenese][4]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][42] | [ASL2][4]                                     |
| [Maven Surefire Plugin][43]                             | [Apache License, Version 2.0][1]              |
| [Versions Maven Plugin][44]                             | [Apache License, Version 2.0][1]              |
| [Project keeper maven plugin][45]                       | [The MIT License][46]                         |
| [Apache Maven Assembly Plugin][47]                      | [Apache License, Version 2.0][1]              |
| [Apache Maven JAR Plugin][48]                           | [Apache License, Version 2.0][1]              |
| [Artifact reference checker and unifier][49]            | [MIT][50]                                     |
| [Apache Maven Dependency Plugin][51]                    | [Apache License, Version 2.0][1]              |
| [Lombok Maven Plugin][52]                               | [The MIT License][50]                         |
| [Maven Failsafe Plugin][53]                             | [Apache License, Version 2.0][1]              |
| [JaCoCo :: Maven Plugin][54]                            | [Eclipse Public License 2.0][34]              |
| [error-code-crawler-maven-plugin][55]                   | [MIT License][56]                             |
| [Reproducible Build Maven Plugin][57]                   | [Apache 2.0][4]                               |
| [Maven Clean Plugin][58]                                | [The Apache Software License, Version 2.0][4] |
| [Maven Resources Plugin][59]                            | [The Apache Software License, Version 2.0][4] |
| [Maven Install Plugin][60]                              | [The Apache Software License, Version 2.0][4] |
| [Maven Deploy Plugin][61]                               | [The Apache Software License, Version 2.0][4] |
| [Maven Site Plugin 3][62]                               | [The Apache Software License, Version 2.0][4] |

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
[14]: https://commons.apache.org/proper/commons-net/
[15]: http://hamcrest.org/JavaHamcrest/
[16]: http://opensource.org/licenses/BSD-3-Clause
[17]: https://junit.org/junit5/
[18]: https://www.eclipse.org/legal/epl-v20.html
[19]: https://github.com/mockito/mockito
[20]: https://github.com/mockito/mockito/blob/main/LICENSE
[21]: https://testcontainers.org
[22]: https://github.com/exasol/test-db-builder-java/
[23]: https://github.com/exasol/test-db-builder-java/blob/main/LICENSE
[24]: https://github.com/exasol/udf-debugging-java/
[25]: https://github.com/exasol/udf-debugging-java/blob/main/LICENSE
[26]: https://github.com/exasol/hamcrest-resultset-matcher/
[27]: https://github.com/exasol/hamcrest-resultset-matcher/blob/main/LICENSE
[28]: https://github.com/exasol/exasol-test-setup-abstraction-java/
[29]: https://github.com/exasol/exasol-test-setup-abstraction-java/blob/main/LICENSE
[30]: https://bitbucket.org/snakeyaml/snakeyaml
[31]: https://github.com/exasol/performance-test-recorder-java/
[32]: https://github.com/exasol/performance-test-recorder-java/blob/main/LICENSE
[33]: https://www.eclemma.org/jacoco/index.html
[34]: https://www.eclipse.org/legal/epl-2.0/
[35]: http://www.slf4j.org
[36]: http://www.opensource.org/licenses/mit-license.php
[37]: http://sonarsource.github.io/sonar-scanner-maven/
[38]: http://www.gnu.org/licenses/lgpl.txt
[39]: https://maven.apache.org/plugins/maven-compiler-plugin/
[40]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[41]: https://www.mojohaus.org/flatten-maven-plugin/
[42]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[43]: https://maven.apache.org/surefire/maven-surefire-plugin/
[44]: http://www.mojohaus.org/versions-maven-plugin/
[45]: https://github.com/exasol/project-keeper/
[46]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[47]: https://maven.apache.org/plugins/maven-assembly-plugin/
[48]: https://maven.apache.org/plugins/maven-jar-plugin/
[49]: https://github.com/exasol/artifact-reference-checker-maven-plugin
[50]: https://opensource.org/licenses/MIT
[51]: https://maven.apache.org/plugins/maven-dependency-plugin/
[52]: https://anthonywhitford.com/lombok.maven/lombok-maven-plugin/
[53]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[54]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[55]: https://github.com/exasol/error-code-crawler-maven-plugin/
[56]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[57]: http://zlika.github.io/reproducible-build-maven-plugin
[58]: http://maven.apache.org/plugins/maven-clean-plugin/
[59]: http://maven.apache.org/plugins/maven-resources-plugin/
[60]: http://maven.apache.org/plugins/maven-install-plugin/
[61]: http://maven.apache.org/plugins/maven-deploy-plugin/
[62]: http://maven.apache.org/plugins/maven-site-plugin/
