package agh.sr.zad4.service;

import agh.sr.zad4.gen.*;

class ResponseHandlers {

    static Examinations examinationsNotFound() {
        return Examinations
                .newBuilder()
                .setStatusCode(Examinations.StatusCode.NOT_FOUND)
                .build();
    }

    static Examinations examinationsFound(Patient patient, Examination examination) {
        return Examinations
                .newBuilder()
                .setStatusCode(Examinations.StatusCode.FOUND)
                .setExamination(examination)
                .setPatient(patient)
                .build();
    }

    static Patients patientsNotFound() {
        return Patients
                .newBuilder()
                .setStatusCode(Patients.StatusCode.NOT_FOUND)
                .build();
    }

    static Patients patientsFound(Patient patient) {
        return Patients
                .newBuilder()
                .setStatusCode(Patients.StatusCode.FOUND)
                .setPatient(patient)
                .build();
    }

    static SimpleResponse okResponse(String msg) {
        return SimpleResponse
                .newBuilder()
                .setStatusCode(SimpleResponse.StatusCode.OK)
                .setMsg(msg)
                .build();
    }

    static SimpleResponse errorResponse(String msg) {
        return SimpleResponse
                .newBuilder()
                .setStatusCode(SimpleResponse.StatusCode.ERROR)
                .setMsg(msg)
                .build();
    }

}
