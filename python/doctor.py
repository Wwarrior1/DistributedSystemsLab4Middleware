import datetime

import grpc

import Hospital_pb2
import Hospital_pb2_grpc


def find_patients():
    query = Hospital_pb2.Empty()
    my_set = set()

    print("")

    for response in stub.findPatients(query):
        if response.statusCode == 1:
            print("Unfortunately, could not find any patients !")
        elif response.statusCode == 0:

            if response.patient.PESEL not in my_set:
                my_set.add(response.patient.PESEL)
                print("\033[1;32m" + response.patient.name + " \033[0;32m(PESEL: " +
                      response.patient.PESEL + ")\033[0m")
    print("")


def find_examinations():
    pesel = str(input("Give a PESEL: "))
    query = Hospital_pb2.PatientPESEL(PESEL=pesel)
    print("")

    runOnce = True

    for response in stub.findExaminations(query):
        if response.statusCode == 1:
            print("Unfortunately, could not find any examinations !")
        elif response.statusCode == 0:
            if runOnce is True:
                print("\033[1;32m" + response.patient.name + " \033[0;32m(PESEL: " +
                      response.patient.PESEL + ")\033[0m")
                runOnce = False

            print("\033[1;36m* Doctor " + str(response.examination.doctorId) +
                  "\033[0;36m commissioned the examination : \033[1;36m" + response.examination.dateDoctor +
                  "\033[0m", end='')

            if response.examination.statusCode == 0:
                print("\033[0;33m   Done: \033[1;31m" + "Waiting... \033[0m")
            elif response.examination.statusCode == 1:
                print("\033[0;33m   Done: \033[1;33m" + response.examination.dateLab + "\033[0m")
            else:
                print("")

            for param in response.examination.parameters:
                print("  | " + param.name + "   \t" +
                      str(round(param.value, 2)) + " \t[" + param.unit + "]  \t[" +
                      str(param.minValue) + " - " + str(param.maxValue) + "]")
    print("")


def find_examinations_all():
    query = Hospital_pb2.Empty()
    my_set = set()

    for response in stub.findExaminationsAll(query):
        if response.statusCode == 1:
            print("Unfortunately, could not find any examinations !")
        elif response.statusCode == 0:

            if response.patient.PESEL not in my_set:
                my_set.add(response.patient.PESEL)
                print("\n\033[1;32m" + response.patient.name + " \033[0;32m(PESEL: " +
                      response.patient.PESEL + ")\033[0m")

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
                print("  | " + param.name + "   \t" +
                      str(round(param.value, 2)) + " \t[" + param.unit + "]  \t[" +
                      str(param.minValue) + " - " + str(param.maxValue) + "]")
    print("")


def create_patient():
    PESEL = input("Give a PESEL: ")
    name = input("Give a name: ")

    query = Hospital_pb2.Patient(PESEL=PESEL, name=name)
    response = stub.createPatient(query)
    print(response.msg)


def order_examination():
    PESEL = input("Give a PESEL: ")
    doctor_id = input("Give your ID: ")
    dateDoctor = str(datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S'))

    nr_of_params = int(input("How many parameters: "))
    parameters = []

    i = 0
    while i < nr_of_params:
        paramName = str(input("Give a name of parameter: "))
        parameters.append(Hospital_pb2.Parameter(name=paramName))
        i = i + 1

    query = Hospital_pb2.Examination(PESEL=PESEL, doctorId=int(doctor_id), dateDoctor=dateDoctor, parameters=parameters,
                                     statusCode=0)
    response = stub.orderExamination(query)
    print(response.msg)


# --- MAIN ------------------------------------
channel = grpc.insecure_channel('localhost:9090')
stub = Hospital_pb2_grpc.DoctorServiceStub(channel)

print("+ -------------- +")
print("|     DOCTOR     |")
print("+ -------------- +")

help = "  * COMMANDS:\n" + \
       "  * 1 - show all patients\n" + \
       "  * 2 - show patient's examinations\n" + \
       "  * 3 - show all patients examinations\n" + \
       "  * 4 - new patient\n" + \
       "  * 5 - order examination\n" + \
       "  * q/quit/exit\n" + \
       "  * h/help/-h/--h/-help/--help"
print(help)

while True:
    command = str(input(">> "))
    if command == "1":
        find_patients()
    elif command == "2":
        find_examinations()
    elif command == "3":
        find_examinations_all()
    elif command == "4":
        create_patient()
    elif command == "5":
        order_examination()
    elif command.lower() in ["h", "help", "-h", "--h", "-help", "--help"]:
        print(help)
    elif command.lower() in ["q", "quit", "exit"]:
        break
