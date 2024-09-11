import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter first name: ");
        String firstName = sc.nextLine();
        System.out.printf("Enter last name: ");
        String lastName = sc.nextLine();
        System.out.printf("Enter Gender: ");
        String gender = sc.nextLine();
        System.out.printf("Enter height (in inches): ");
        double height = sc.nextDouble();
        System.out.printf("Enter weight (in pounds): ");
        double weight = sc.nextDouble();
        System.out.printf("Enter Birth Information" + "\n" + "Enter day: ");
        int day = sc.nextInt();
        System.out.printf("Enter month: ");
        int month = sc.nextInt();
        System.out.printf("Enter year: ");
        int year = sc.nextInt();

        HealthProfile p1 = new HealthProfile(firstName, lastName, gender, height, weight, month, day, year);

        System.out.println("-------------------------------\n\tINFORMATION\n" + "First Name: " + p1.getFirstName());
        System.out.println("Last Name: " + p1.getLastName());
        System.out.printf("Date of Birth: %d//%d//%d%n", p1.getMonth(), p1.getDay(), p1.getYear());
        System.out.println("Age: " + p1.getAge() + "\nGender: " + p1.getGender() + "\nBMI : " + p1.getBMI());
        System.out.println("Max Heart Rate: " + p1.getMaxHeartRate());
        p1.displayTargetHeartRate();
        p1.displayBMIChart();

        sc.close();
    }
}
