#!/bin/bash

ARGS="$@"

./mvnw exec:java -Dexec.args="$ARGS"