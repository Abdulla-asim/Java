package Hospital;

import java.util.Date;

public abstract class Doctor extends Staff{
    protected String specialty;

    public Doctor(int id, String name, char gender) {
        super(id, name, gender);
    }

    public abstract void treatPatient(Patient patient);

    public String getReport(Patient patient) {
        return patient.getReport();
    }
}
