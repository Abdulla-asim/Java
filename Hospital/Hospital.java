package Hospital;

import java.util.ArrayList;

public class Hospital {
    private String name;
    private String address;
    private ArrayList<Patient> patients;
    private ArrayList<Department> departments;

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
        this.patients = new ArrayList<Patient>();
        this.departments = new ArrayList<Department>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void removePatient(Patient patient) {
        patients.remove(patient);
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    public void displayPatients() {
        System.out.println("PATIENTS:");
        System.out.printf("%5s | %10s | %10s | %10s | %10s | %10s | %10s |",
        "ID","Name", "Gender", "Stay", "Birth Date", "Doctor", "Department");

        for (Patient patient : patients) {
            int i = patients.indexOf(patient);
            System.out.printf("%5d | %10s | %10s | %10s | %10s | %10s | %10s |",
             (i+1) ,patient.getName(), patient.getGender(), patient.getSTAY(), patient.getBirthDate(), patient.getDoctor());
        }
    }

}
