public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    Employee(String firstName, String lastName, double montlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = montlySalary;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setMonthlySalary(double monthlySalary) {
        if(monthlySalary >= 0)
            this.monthlySalary = monthlySalary;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}
