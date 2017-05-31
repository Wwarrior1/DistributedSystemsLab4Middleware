package agh.sr.zad4.service;

import agh.sr.zad4.gen.Examination;
import agh.sr.zad4.gen.Patient;
import agh.sr.zad4.gen.SimpleResponse;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Database {
    private Map<String, Patient> patientTable = new ConcurrentHashMap<>();

    public static List<String> getInitParameterNames() {
        return new ArrayList<String>() {{
            add("Choles.");
            add("Iron");
            add("Sodium");
            add("Potas.");
            add("CRP");
        }};
    }

    public static List<String> getInitParameterUnits() {
        return new ArrayList<String>() {{
            add("mg/dl");
            add("ug/dl");
            add("mmol/l");
            add("mmol/l");
            add("mg/l");
        }};
    }

    public static List<Float> getInitParameterMinValues() {
        return new ArrayList<Float>() {{
            add(160f);
            add(37f);
            add(135f);
            add(3.5f);
            add(0f);
        }};
    }

    public static List<Float> getInitParameterMaxValues() {
        return new ArrayList<Float>() {{
            add(200f);
            add(145f);
            add(145f);
            add(5f);
            add(5f);
        }};
    }

    public static List<List<String>> getInitPatients() {
        List<List<String>> patients = new ArrayList<>();
        patients.add(new ArrayList<>(Arrays.asList("11", "Paul")));
        patients.add(new ArrayList<>(Arrays.asList("22", "Emma")));
        patients.add(new ArrayList<>(Arrays.asList("33", "Peter")));
        patients.add(new ArrayList<>(Arrays.asList("44", "John")));
        patients.add(new ArrayList<>(Arrays.asList("55", "Annie")));

        return patients;
    }

    public synchronized void addPatient(String PESEL, String name, List<Examination> examinationList) {
        if (PESEL.isEmpty() || name.isEmpty()) {
            SimpleResponse.newBuilder()
                    .setStatusCode(SimpleResponse.StatusCode.ERROR)
                    .build();
        } else {
            Patient newPatient;

            if (examinationList != null) {
                newPatient = Patient.newBuilder()
                        .setPESEL(PESEL)
                        .setName(name)
                        .addAllExaminations(examinationList)
                        .build();
            } else {
                newPatient = Patient.newBuilder()
                        .setPESEL(PESEL)
                        .setName(name)
                        .build();
            }
            patientTable.put(PESEL, newPatient);

            SimpleResponse.newBuilder()
                    .setStatusCode(SimpleResponse.StatusCode.OK)
                    .build();
        }
    }

    Map<String, Patient> getPatients() {
        return patientTable;
    }

    Optional<Patient> getPatient(String PESEL) {
        return Optional.ofNullable(patientTable.get(PESEL));
    }
}
