public class EmployeeTest {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Max", "Martin", null, null, null, 2000000);
        Employee1 e2 = new Employee1("John", "Elia", null, null, null, 1000000);

        
        System.out.println("The monthly salary of " + e1.getFirstName() + e1.getLastName() + 
        " is : " + e1.getMonthlySalary());
        
        System.out.println("The monthly salary of " + e2.getFirstName() + e2.getLastName() + 
        " is : " + e2.getMonthlySalary());
        System.out.println("");
        
        double e1Salary = e1.getMonthlySalary();
        double e2Salary = e2.getMonthlySalary();
        
        // Increasing salary by 10%
        e1.setMonthlySalary(e1Salary + e1Salary * 0.1);
        e2.setMonthlySalary(e2Salary + e2Salary * 0.1);

        System.out.println("The monthly salary of " + e1.getFirstName() + e1.getLastName() + 
                            " is : " + e1.getMonthlySalary());
                            
        System.out.println("The monthly salary of " + e2.getFirstName() + e2.getLastName() + 
                            " is : " + e2.getMonthlySalary());        

    }
}

