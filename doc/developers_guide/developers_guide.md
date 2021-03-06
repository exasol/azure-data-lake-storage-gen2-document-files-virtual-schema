# Developers Guide

This guide contains information for developers.

## Credentials
Since we don't have an emulator most tests are run on an actual datalake storage account.
You got to provide an accountkey.txt and accountname.txt file with the corresponding values for the datalake storage account (key and accountname) if you want to run the tests locally.

## Running Regression Test

This project contains some regression tests to monitor the performance cross releases. To run them locally use:

```shell
mvn verify -PregressionTests
```

However, a local run won't give you reliable numbers, since it's dependent on your local hardware configuration.

## Getting Debug Output

In order to get the log output from inside the database set the system property `test.udf-logs=true` (by adding it with `-D` as jvm option in your IDE's test config) and check the files in `target/udf-logs/`.

## Debugging & Profiling

You can use a remote debugger and profiler for this project's integration tests. To do so, use the system properties from [UDF debugging Java](https://github.com/exasol/udf-debugging-java/).

When you enable debugging or profiling, this project's test will set the UDF concurrency to 1. Debugging concurrent UDFs is currently not possible due to reverse connection.