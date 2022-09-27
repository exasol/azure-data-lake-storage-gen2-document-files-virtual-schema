<!-- @formatter:off -->
# Dependencies

## Compile Dependencies

| Dependency                                                     | License                                       |
| -------------------------------------------------------------- | --------------------------------------------- |
| [Jackson-core][0]                                              | [The Apache Software License, Version 2.0][1] |
| [Jackson-annotations][2]                                       | [The Apache Software License, Version 2.0][1] |
| [jackson-databind][2]                                          | [The Apache Software License, Version 2.0][1] |
| [Jackson-dataformat-XML][3]                                    | [The Apache Software License, Version 2.0][1] |
| [Jackson datatype: JSR310][4]                                  | [The Apache Software License, Version 2.0][1] |
| [Virtual Schema for document data in files][5]                 | [MIT License][6]                              |
| [error-reporting-java][7]                                      | [MIT][8]                                      |
| [Microsoft Azure client library for Blob Storage][9]           | [The MIT License (MIT)][10]                   |
| [Microsoft Azure client library for File Storage Data Lake][9] | [The MIT License (MIT)][10]                   |
| [Microsoft Azure client library for Identity][9]               | [The MIT License (MIT)][10]                   |
| [Microsoft Azure Java Core Library][9]                         | [The MIT License (MIT)][10]                   |
| [Project Lombok][11]                                           | [The MIT License][12]                         |

## Test Dependencies

| Dependency                                      | License                           |
| ----------------------------------------------- | --------------------------------- |
| [Hamcrest][13]                                  | [BSD License 3][14]               |
| [Virtual Schema for document data in files][5]  | [MIT License][6]                  |
| [JUnit Jupiter Engine][15]                      | [Eclipse Public License v2.0][16] |
| [JUnit Jupiter Params][15]                      | [Eclipse Public License v2.0][16] |
| [mockito-core][17]                              | [The MIT License][18]             |
| [Testcontainers :: JUnit Jupiter Extension][19] | [MIT][10]                         |
| [Testcontainers :: Localstack][19]              | [MIT][10]                         |
| [Test Database Builder for Java][20]            | [MIT License][21]                 |
| [udf-debugging-java][22]                        | [MIT][8]                          |
| [Matcher for SQL Result Sets][23]               | [MIT][8]                          |
| [exasol-test-setup-abstraction-java][24]        | [MIT License][25]                 |
| [SnakeYAML][26]                                 | [Apache License, Version 2.0][1]  |
| [Performance Test Recorder Java][27]            | [MIT][8]                          |
| [JaCoCo :: Agent][28]                           | [Eclipse Public License 2.0][29]  |

## Runtime Dependencies

| Dependency                 | License           |
| -------------------------- | ----------------- |
| [SLF4J API Module][30]     | [MIT License][31] |
| [SLF4J Simple Binding][30] | [MIT License][31] |

## Plugin Dependencies

| Dependency                                              | License                                       |
| ------------------------------------------------------- | --------------------------------------------- |
| [SonarQube Scanner for Maven][32]                       | [GNU LGPL 3][33]                              |
| [Apache Maven Compiler Plugin][34]                      | [Apache License, Version 2.0][35]             |
| [Apache Maven Enforcer Plugin][36]                      | [Apache License, Version 2.0][35]             |
| [Maven Flatten Plugin][37]                              | [Apache Software Licenese][1]                 |
| [org.sonatype.ossindex.maven:ossindex-maven-plugin][38] | [ASL2][1]                                     |
| [Maven Surefire Plugin][39]                             | [Apache License, Version 2.0][35]             |
| [Versions Maven Plugin][40]                             | [Apache License, Version 2.0][35]             |
| [Project keeper maven plugin][41]                       | [The MIT License][42]                         |
| [Apache Maven Assembly Plugin][43]                      | [Apache License, Version 2.0][35]             |
| [Apache Maven JAR Plugin][44]                           | [Apache License, Version 2.0][35]             |
| [Artifact reference checker and unifier][45]            | [MIT][8]                                      |
| [Apache Maven Dependency Plugin][46]                    | [Apache License, Version 2.0][35]             |
| [Lombok Maven Plugin][47]                               | [The MIT License][8]                          |
| [Maven Failsafe Plugin][48]                             | [Apache License, Version 2.0][35]             |
| [JaCoCo :: Maven Plugin][49]                            | [Eclipse Public License 2.0][29]              |
| [error-code-crawler-maven-plugin][50]                   | [MIT License][51]                             |
| [Reproducible Build Maven Plugin][52]                   | [Apache 2.0][1]                               |
| [Maven Clean Plugin][53]                                | [The Apache Software License, Version 2.0][1] |
| [Maven Resources Plugin][54]                            | [The Apache Software License, Version 2.0][1] |
| [Maven Install Plugin][55]                              | [The Apache Software License, Version 2.0][1] |
| [Maven Deploy Plugin][56]                               | [The Apache Software License, Version 2.0][1] |
| [Maven Site Plugin 3][57]                               | [The Apache Software License, Version 2.0][1] |

[0]: https://github.com/FasterXML/jackson-core
[1]: http://www.apache.org/licenses/LICENSE-2.0.txt
[2]: http://github.com/FasterXML/jackson
[3]: https://github.com/FasterXML/jackson-dataformat-xml
[4]: https://github.com/FasterXML/jackson-modules-java8/tree/2.14/datetime
[5]: https://github.com/exasol/virtual-schema-common-document-files/
[6]: https://github.com/exasol/virtual-schema-common-document-files/blob/main/LICENSE
[7]: https://github.com/exasol/error-reporting-java
[8]: https://opensource.org/licenses/MIT
[9]: https://github.com/Azure/azure-sdk-for-java
[10]: http://opensource.org/licenses/MIT
[11]: https://projectlombok.org
[12]: https://projectlombok.org/LICENSE
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
[23]: https://github.com/exasol/hamcrest-resultset-matcher
[24]: https://github.com/exasol/exasol-test-setup-abstraction-java/
[25]: https://github.com/exasol/exasol-test-setup-abstraction-java/blob/main/LICENSE
[26]: https://bitbucket.org/snakeyaml/snakeyaml
[27]: https://github.com/exasol/performance-test-recorder-java
[28]: https://www.eclemma.org/jacoco/index.html
[29]: https://www.eclipse.org/legal/epl-2.0/
[30]: http://www.slf4j.org
[31]: http://www.opensource.org/licenses/mit-license.php
[32]: http://sonarsource.github.io/sonar-scanner-maven/
[33]: http://www.gnu.org/licenses/lgpl.txt
[34]: https://maven.apache.org/plugins/maven-compiler-plugin/
[35]: https://www.apache.org/licenses/LICENSE-2.0.txt
[36]: https://maven.apache.org/enforcer/maven-enforcer-plugin/
[37]: https://www.mojohaus.org/flatten-maven-plugin/
[38]: https://sonatype.github.io/ossindex-maven/maven-plugin/
[39]: https://maven.apache.org/surefire/maven-surefire-plugin/
[40]: http://www.mojohaus.org/versions-maven-plugin/
[41]: https://github.com/exasol/project-keeper/
[42]: https://github.com/exasol/project-keeper/blob/main/LICENSE
[43]: https://maven.apache.org/plugins/maven-assembly-plugin/
[44]: https://maven.apache.org/plugins/maven-jar-plugin/
[45]: https://github.com/exasol/artifact-reference-checker-maven-plugin
[46]: https://maven.apache.org/plugins/maven-dependency-plugin/
[47]: https://anthonywhitford.com/lombok.maven/lombok-maven-plugin/
[48]: https://maven.apache.org/surefire/maven-failsafe-plugin/
[49]: https://www.jacoco.org/jacoco/trunk/doc/maven.html
[50]: https://github.com/exasol/error-code-crawler-maven-plugin/
[51]: https://github.com/exasol/error-code-crawler-maven-plugin/blob/main/LICENSE
[52]: http://zlika.github.io/reproducible-build-maven-plugin
[53]: http://maven.apache.org/plugins/maven-clean-plugin/
[54]: http://maven.apache.org/plugins/maven-resources-plugin/
[55]: http://maven.apache.org/plugins/maven-install-plugin/
[56]: http://maven.apache.org/plugins/maven-deploy-plugin/
[57]: http://maven.apache.org/plugins/maven-site-plugin/
