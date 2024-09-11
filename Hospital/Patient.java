package Hospital;

import java.time.LocalDate;

public class Patient {

    private final int STAY;

    private String name;
    private char gender;
    private LocalDate birthDate;
    private Doctor doctor;
    private Report report;

    public Patient(String name, char gender, LocalDate birthDate, int stay, Doctor doctor, Report report) {
        this.name = name;
        this.gender = gender;
        this.STAY = stay;
        this.doctor = doctor;
        this.report = report;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public char getGender() {
        return gender;
    }

    public int getSTAY() {
        return STAY;
    }

    public String getReport() {
        return report.getReport();
    }
}


