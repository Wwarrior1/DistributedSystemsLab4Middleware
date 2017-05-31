package agh.sr.zad4;

import agh.sr.zad4.gen.Examination;
import agh.sr.zad4.gen.Parameter;
import agh.sr.zad4.service.Database;
import agh.sr.zad4.service.DoctorService;
import agh.sr.zad4.service.LabService;
import agh.sr.zad4.service.PatientService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainServer {
    private static final int PORT = 9090;
    private final Database db = new Database();

    private MainServer() {
        System.out.println("\033[37m** Loading data... \033[0m");
        loadInitData();
        System.out.println("\033[37m** Starting server... \033[0m");
        start();
    }

    public static void main(String[] args) {
        new MainServer();
    }

    private void loadInitData() {
        // Add initial patients to database
        for (List<String> initPatient : Database.getInitPatients()) {
            String PESEL = initPatient.get(0);
            String name = initPatient.get(1);

            // Generate random Examinations
            int randExam = new Random().nextInt(5 - 1 + 1) + 1; // ((max-min) + 1) + min

            List<Examination> examinationList = new ArrayList<>(randExam);
            for (int i = 0; i < randExam; i++) {
                examinationList.add(Examination.newBuilder()
                        .setPESEL(PESEL)
                        .setDoctorId(Math.abs(new Random().nextInt(50 - 1 + 1) + 1)) // ((max-min) + 1) + min
                        .setDateDoctor("2017-01-01 15:20:00")
                        .setDateLab("2017-01-01 16:40:00")
                        .setStatusCode(Examination.StatusCode.DONE)
                        .addAllParameters(generateParameters())
                        .build());
            }

            // Add patient with previously generated examinations
            db.addPatient(PESEL, name, examinationList);
        }

        System.out.println("\033[35m** \033[1;35mData loaded \033[0m");
    }

    private List<Parameter> generateParameters() {
        // Generate random nr of parameters
        int n = new Random().nextInt(5 - 1 + 1) + 1; // ((max-min) + 1) + min

        // Generate random n-parameters (chosen randomly from all of available parameters)
        int[] randParams = new Random()
                .ints(0, 5)
                .distinct()
                .limit(n)
                .toArray();
        List<Parameter> parameters = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            int parameterId = randParams[i];    // actual chosen parameter index in Database parameters list

            parameters.add(Parameter.newBuilder()
                    .setName(Database.getInitParameterNames().get(parameterId))
                    .setUnit(Database.getInitParameterUnits().get(parameterId))
                    .setValue((float) (Math.random() * Database.getInitParameterMaxValues().get(parameterId)
                            + Database.getInitParameterMinValues().get(parameterId)))
                    .setMinValue(Database.getInitParameterMinValues().get(parameterId))
                    .setMaxValue(Database.getInitParameterMaxValues().get(parameterId))
                    .build()
            );
        }

        return parameters;
    }

    private void start() {
        final Server server = ServerBuilder.forPort(PORT)
                .addService(new LabService(db))
                .addService(new PatientService(db))
                .addService(new DoctorService(db))
                .build();

        try {
            server.start();
            System.out.println("\033[32m** \033[1;32mServer started\033[32m - listening on " + PORT + "\033[0m");
            server.awaitTermination();
        } catch (InterruptedException | IOException e) {
            System.out.println("\033[31m** Error !!! \033[0m");
            server.shutdown();
            System.out.println("\033[31m** Server is shutdown \033[0m");
        }
    }

}
