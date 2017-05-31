#!/bin/bash

rm -r gen/com gen/agh

cd grpc-java-1.3.0/examples/build/generated/source/proto/main
rm -r grpc/agh java/agh
cd ../../../../.. # we are in 'examples' now
./gradlew clean build install installDist && cd ../..

cp -r grpc-java-1.3.0/examples/build/generated/source/proto/main/grpc/agh gen
cp -r grpc-java-1.3.0/examples/build/generated/source/proto/main/java/agh gen
cp -r grpc-java-1.3.0/examples/build/generated/source/proto/main/java/com gen

# Run program
#./grpc-java-1.3.0/examples/build/install/examples/bin/main-server