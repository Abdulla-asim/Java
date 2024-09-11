package Hospital;

import java.util.ArrayList;
import java.util.Date;

public class Surgeon extends Doctor{
    private ArrayList<Patient> patients;

    public Surgeon(int id, String name, char gender) {
        super(id, name, gender);
    }

    @Override
    public void treatPatient(Patient patient) {
        System.out.println("Surgeon treating patient");
    }
    
    public void showPatients() {
        for (Patient patient : patients) {
            int index = patients.indexOf(patient) + 1;
            System.out.println(index + " " + patient);
        }
    }
}
