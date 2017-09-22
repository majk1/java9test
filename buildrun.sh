#!/bin/sh

if ! java -version 2>&1 | grep -q 'java version "9"'; then
    echo "Java 9 required"
    exit 1
fi

mvn clean package
if [ $? -eq 0 ]; then
    echo "Running..."
    java --module-path libs -m java9test.cli/io.codelens.fun.java9test.App
fi
