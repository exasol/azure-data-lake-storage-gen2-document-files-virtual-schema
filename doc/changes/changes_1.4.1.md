# Virtual Schema for Document Data in Files on Azure Data Lake Storage Gen 2 1.4.1, released 2023-05-09

Code name: CSV Performance Regression Tests

## Summary

This release updates performance regression rests for CSV files to use all data types (string, boolean, integer, double, date and timestamp) instead of only string. Please note that this might influence comparability of test results. Additionally the test names in the test report changed. They now use suffix `()` instead of `(TestInfo)`.

## Tests

* #33: Added CSV data type performance regression tests

## Dependency Updates

### Compile Dependency Updates

* Updated `com.azure:azure-core:1.38.0` to `1.39.0`
* Updated `com.azure:azure-identity:1.8.2` to `1.9.0`
* Updated `com.exasol:virtual-schema-common-document-files:7.3.0` to `7.3.2`

### Test Dependency Updates

* Updated `com.exasol:virtual-schema-common-document-files:7.3.0` to `7.3.2`
