#!/bin/bash

cd mainframe-mq-sdk/
mvn clean install
cd ../mainframe-mq-api
mvn spring-boot:run