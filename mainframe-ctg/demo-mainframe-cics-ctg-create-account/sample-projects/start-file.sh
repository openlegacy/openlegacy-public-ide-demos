#!/bin/bash

cd mainframe-ctg-sdk/
mvn clean install
cd ../mainframe-ctg-api
mvn spring-boot:run