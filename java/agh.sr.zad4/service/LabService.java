package agh.sr.zad4.service;

import agh.sr.zad4.gen.*;
import io.grpc.stub.StreamObserver;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LabService extends LabServiceGrpc.LabServiceImplBase {
    private final Database db;

    public LabService(Database db) {
        this.db = db;
    }

    @Override
    public void addExamination(Empty empty, StreamObserver<SimpleResponse> responseObserver) {

        db.getPatients().forEach((PESEL, patient) -> {
            patient.getExaminationsList().forEach(examination -> {
                if (examination.getStatusCode().equals(Examination.StatusCode.PENDING)) {
                    // Create new filled list of parameters
                    List<Parameter> listOfParam = new ArrayList<>();

                    examination.getParametersList().forEach(parameter -> {
                        if (Database.getInitParameterNames().contains(parameter.getName())) {
                            int index = Database.getInitParameterNames().indexOf(parameter.getName());
                            listOfParam.add(Parameter.newBuilder()
                                    .setName(Database.getInitParameterNames().get(index))
                                    .setUnit(Database.getInitParameterUnits().get(index))
                                    .setValue((float) (Math.random() * Database.getInitParameterMaxValues().get(index)
                                            + Database.getInitParameterMinValues().get(index)))
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
                            .setDateLab(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()))
                            .addAllParameters(listOfParam)
                            .setStatusCode(Examination.StatusCode.DONE)
                            .build());
                    listOfExam.addAll(patient.getExaminationsList());
                    listOfExam.remove(examination);

                    // Create copy of old patient with corrected values + Deleting old patient
                    String patientName = patient.getName();
                    db.getPatients().remove(examination.getPESEL());
                    db.addPatient(examination.getPESEL(), patientName, listOfExam);

                }
            }); // foreach examination
        }); // foreach patient

        responseObserver.onNext(ResponseHandlers.okResponse("* checking..."));

        responseObserver.onCompleted();
    }

}
