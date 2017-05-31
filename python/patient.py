import grpc

import Hospital_pb2
import Hospital_pb2_grpc

channel = grpc.insecure_channel('localhost:9090')
stub = Hospital_pb2_grpc.PatientSericeStub(channel)

print("+ ------------- +")
print("|    PATIENT    |")
print("+ ------------- +")

try:
    pesel = str(input("Give your PESEL: "))
    query = Hospital_pb2.PatientPESEL(PESEL=pesel)
    print("")

    runOnce = True

    for response in stub.findPatient(query):
        if response.statusCode == 1:
            print("Unfortunately, could not find any examinations !")
        elif response.statusCode == 0:
            if runOnce is True:
                print("\033[0;32mWelcome \033[1;32m" + response.patient.name + " !\033[0m\n")
                runOnce = False

            print("\033[1;36m* Doctor " + str(response.examination.doctorId) +
                  "\033[0;36m commissioned the examination: \033[1;36m" + response.examination.dateDoctor +
                  "\033[0m", end='')

            if response.examination.statusCode == 0:
                print("\033[0;33m   Done: \033[1;31m" + "Waiting... \033[0m")
            elif response.examination.statusCode == 1:
                print("\033[0;33m   Done: \033[1;33m" + response.examination.dateLab + "\033[0m")
            else:
                print("")

            for param in response.examination.parameters:
                print("| " + param.name + "   \t" +
                      str(round(param.value, 2)) + " \t[" + param.unit + "]  \t[" +
                      str(param.minValue) + " - " + str(param.maxValue) + "]")
    print("")


except ValueError:
    print("Something went wrong !")
