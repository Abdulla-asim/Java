package Hospital;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        // Doctors
        Surgeon surgeon1 = new Surgeon(1, "surgeon1", 'M');

        SeniorDoctor seniorDoc1 = new SeniorDoctor(2, "seniorDoc1",'M');

        Intern intern1 = new Intern(3,"intern1",'M');
        Intern intern2 = new Intern(4,"intern2",'F');

        Nurse nurse1 = new Nurse(5,"nurse1",'F');

        // Departments
        Department cardiology = new Department("Cardiology");
        Department neurology = new Department("Neurology");
        cardiology.addStaff(surgeon1);
        cardiology.addStaff(nurse1);
        neurology.addStaff(seniorDoc1);
        neurology.addStaff(intern1);

        // Hospital
        Hospital hospital = new Hospital("Abdullah's Hospital","Islamabad");
        hospital.addDepartment(cardiology);
        hospital.addDepartment(neurology);

        // Patients
        Patient patient1 = new Patient("Patient1", 'M', LocalDate.of(2000, 7,9),
                20, seniorDoc1, new Report("R1", "ABC"));

        Patient patient2 = new Patient("Patient1", 'M', LocalDate.of(2005, 5,6),
                4, intern2, new Report("R2", "ABC"));
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        // Treatment of patients
        intern1.setSupervisor(seniorDoc1);
        intern1.treatPatient(patient1);
        intern2.treatPatient(patient2);

        seniorDoc1.treatPatient(patient1);
        surgeon1.treatPatient(patient2);

        // get report of patient1
        System.out.println(seniorDoc1.getReport(patient1));

        // get report of patient2
        System.out.println(intern2.getReport(patient2));
    }
}