#!/bin/bash

# cp grpc-java-1.3.0/examples/src/main/proto/Hospital.proto ./Hospital.proto
python -m grpc_tools.protoc -I. --python_out=./python --grpc_python_out=./python ./Hospital.proto
# rm Hospital.proto