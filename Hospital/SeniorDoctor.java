package Hospital;

import java.util.ArrayList;
import java.util.Date;

public class SeniorDoctor extends Doctor {
    private ArrayList<Patient> patients;

    public SeniorDoctor(int id, String name, char gender) {
        super(id, name, gender);
    }

    @Override
    public void treatPatient(Patient patient) {
        System.out.println("Senior Doctor treating patient");
    }

    public void showPatients() {
        for (Patient patient : patients) {
            int index = patients.indexOf(patient);
            System.out.println(index + " " + patient);
        }
    }
}
