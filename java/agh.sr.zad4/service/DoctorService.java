package agh.sr.zad4.service;

import agh.sr.zad4.gen.*;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DoctorService extends DoctorServiceGrpc.DoctorServiceImplBase {
    private final Database db;

    public DoctorService(Database db) {
        this.db = db;
    }

    @Override
    public void findPatients(Empty request, StreamObserver<Patients> responseObserver) {
        if (db.getPatients().isEmpty()) {
            responseObserver.onNext(ResponseHandlers.patientsNotFound());
        } else {
            db.getPatients().forEach((s, patient) ->
                    responseObserver.onNext(ResponseHandlers.patientsFound(patient))
            );
        }
        responseObserver.onCompleted();
    }

    @Override
    public void findExaminations(PatientPESEL patientPESEL, StreamObserver<Examinations> responseObserver) {
        if (!db.getPatients().containsKey(patientPESEL.getPESEL())) {
            responseObserver.onNext(ResponseHandlers.examinationsNotFound());
        } else {
            Patient patient = db.getPatients().get(patientPESEL.getPESEL());
            patient.getExaminationsList().forEach(
                    examination -> responseObserver.onNext(ResponseHandlers.examinationsFound(patient, examination))
            );
        }
        responseObserver.onCompleted();
    }

    @Override
    public void findExaminationsAll(Empty request, StreamObserver<Examinations> responseObserver) {
        if (db.getPatients().isEmpty()) {
            responseObserver.onNext(ResponseHandlers.examinationsNotFound());
        } else {
            db.getPatients().forEach((s, patient) ->
                    patient.getExaminationsList().forEach(
                            examination -> responseObserver.onNext(ResponseHandlers.examinationsFound(patient, examination))
                    )
            );
        }
        responseObserver.onCompleted();
    }

    @Override
    public void createPatient(Patient patient, StreamObserver<SimpleResponse> responseObserver) {
        if (db.getPatients().containsKey(patient.getPESEL())) {
            responseObserver.onNext(ResponseHandlers.errorResponse("Patient exists !"));
        } else {
            db.addPatient(patient.getPESEL(), patient.getName(), new ArrayList<>());
            responseObserver.onNext(ResponseHandlers.okResponse("Patient added to database"));
        }
        responseObserver.onCompleted();
    }

    @Override
    public void orderExamination(Examination examination, StreamObserver<SimpleResponse> responseObserver) {
        if (!db.getPatients().containsKey(examination.getPESEL())) {
            responseObserver.onNext(ResponseHandlers.errorResponse("Not found such patient in database !"));
        } else {
            Optional<Patient> patient = db.getPatient(examination.getPESEL());
            if (!patient.isPresent()) {
                responseObserver.onNext(ResponseHandlers.errorResponse("Not found such patient !"));
            } else {
                // As it is hard to change GRPC-created objects like Patient / Examination / Patient
                // I will create the new ones with updated info. Just copy and fill with new data.

                // Create new list of Parameters
                List<Parameter> listOfParam = new ArrayList<>();

                examination.getParametersList().forEach(parameter -> {
                    if (Database.getInitParameterNames().contains(parameter.getName())) {
                        int index = Database.getInitParameterNames().indexOf(parameter.getName());
                        listOfParam.add(Parameter.newBuilder()
                                .setName(Database.getInitParameterNames().get(index))
                                .setUnit(Database.getInitParameterUnits().get(index))
                                .setMinValue(Database.getInitParameterMinValues().get(index))
                                .setMaxValue(Database.getInitParameterMaxValues().get(index))
                                .build());
                    } else {
                        listOfParam.add(Parameter.newBuilder()
                                .setName(parameter.getName())
                                .build());
                    }
                });

                // Create new list od Examinations
                List<Examination> listOfExam = new ArrayList<>();

                listOfExam.add(Examination.newBuilder()
                        .setPESEL(examination.getPESEL())
                        .setDoctorId(examination.getDoctorId())
                        .setDateDoctor(examination.getDateDoctor())
                        .addAllParameters(listOfParam)
                        .setStatusCode(Examination.StatusCode.PENDING)
                        .build());
                listOfExam.addAll(patient.get().getExaminationsList());

                // Create copy of old patient with corrected values + Deleting old patient
                String patientName = patient.get().getName();
                db.getPatients().remove(examination.getPESEL());
                db.addPatient(examination.getPESEL(), patientName, listOfExam);

                responseObserver.onNext(ResponseHandlers.okResponse("Examination ordered"));
            }
        }
        responseObserver.onCompleted();
    }

}
