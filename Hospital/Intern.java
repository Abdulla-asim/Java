package Hospital;

public class Intern extends Doctor{

    SeniorDoctor supervisor;

    public Intern(int id, String name, char gender) {
        super(id, name, gender);
    }

    @Override
    public void treatPatient(Patient patient) {
        System.out.println("Intern treating patient");
    }

    public void setSupervisor(SeniorDoctor supervisor) {
        this.supervisor = supervisor;
    }
    
}
