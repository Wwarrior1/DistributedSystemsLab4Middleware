package agh.sr.zad4.service;

import agh.sr.zad4.gen.Examinations;
import agh.sr.zad4.gen.Patient;
import agh.sr.zad4.gen.PatientPESEL;
import agh.sr.zad4.gen.PatientSericeGrpc;
import io.grpc.stub.StreamObserver;

public class PatientService extends PatientSericeGrpc.PatientSericeImplBase {
    private final Database db;

    public PatientService(Database db) {
        this.db = db;
    }

    @Override
    public void findPatient(PatientPESEL patientPESEL, StreamObserver<Examinations> responseObserver) {
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
}
