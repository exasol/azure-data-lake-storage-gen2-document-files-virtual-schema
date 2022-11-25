# Developers Guide

This guide contains information for developers.

## Credentials
Since we don't have an emulator most tests are run on an actual datalake storage account.
You got to provide an `accountkey.txt` and `accountname.txt` file with the corresponding values for the datalake storage account (key and account name) if you want to run the tests locally.

## Running Regression Test

This project contains some regression tests to monitor the performance cross releases. To run them locally use:

```shell
mvn verify -PregressionTests
```

However, a local run won't give you reliable numbers, since it's dependent on your local hardware configuration.

## Getting Debug Output

You can control the log output produced by the Virtual Schema with the following system properties:

| System property                          | Meaning                                  | Default value |
|------------------------------------------|------------------------------------------|---------------|
| `com.exasol.virtualschema.debug.address` | Sets host and port of the log receiver   | `null`        |
| `com.exasol.virtualschema.debug.level`   | Sets the log level                       | `ALL`         | 

See also: [Remote Logging](https://docs.exasol.com/db/latest/database_concepts/virtual_schema/logging.htm) 

## Debugging & Profiling

You can use a remote debugger and profiler for this project's integration tests. To do so, use the system properties from [UDF debugging Java](https://github.com/exasol/udf-debugging-java/).

When you enable debugging or profiling, this project's test will set the UDF concurrency to 1. Debugging concurrent UDFs is currently not possible due to reverse connection.