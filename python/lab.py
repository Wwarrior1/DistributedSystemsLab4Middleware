import time

import grpc

import Hospital_pb2
import Hospital_pb2_grpc

channel = grpc.insecure_channel('localhost:9090')
stub = Hospital_pb2_grpc.LabServiceStub(channel)

print("+ ------------- +")
print("|      LAB      |")
print("+ ------------- +")

while True:
    query = Hospital_pb2.Empty()
    response = stub.AddExamination(query)
    print(response.msg)

    time.sleep(10)
