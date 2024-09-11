import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter first name: ");
        String firstName = input.nextLine();
        System.out.printf("Enter last name: ");
        String lastName = input.nextLine();
        System.out.printf("Enter Birth Information" + "\n" + "Enter day: ");
        int day = input.nextInt();
        System.out.printf("Enter month: ");
        int month = input.nextInt();
        System.out.printf("Enter year: ");
        int year = input.nextInt();

        HeartRates p1 = new HeartRates(firstName, lastName, month, day, year);

        System.out.println("-------------------------------\n\tINFORMATION\n" + "First Name: " + p1.getFirstName());
        System.out.println("Last Name: " + p1.getLastName());
        System.out.printf("Date of Birth: %d//%d//%d%n", p1.getMonth(), p1.getDay(), p1.getYear());
        System.out.println("Age: " + p1.getAge());
        System.out.println("Max Heart Rate: " + p1.getMaxHeartRate());
        p1.displayTargetHeartRate();

        input.close();
    }
}




