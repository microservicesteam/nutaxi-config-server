# nutaxi-config-service

[![Build Status](https://travis-ci.org/microservicesteam/nutaxi-config-server.svg?branch=master)](https://travis-ci.org/microservicesteam/nutaxi-config-server) [![codecov](https://codecov.io/gh/microservicesteam/nutaxi-config-server/branch/master/graph/badge.svg)](https://codecov.io/gh/microservicesteam/nutaxi-config-server)


The minimal Spring boot implementation of our central configuration server. Configs are fetched from Github, see the [nutaxi-configs](https://github.com/microservicesteam/nutaxi-configs) repository.

## Build locally
```
mvn clean install
```
This will execute all the checks and tests.

## Run locally
```
mvn clean spring-boot:run
```
Configuration will be fetched from the remove configuration server.

## Docker integration
TO BE DONE