// Abdullah
// 455340
import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your year (Freshman, Sophomore, Junior, senior): ");
        String year = input.nextLine();

        System.out.print("\nHow many courses are you taking: ");
        int courses = input.nextInt();

        System.out.print("\nEnter your GPA: ");
        float gpa = input.nextFloat();

        System.out.printf("\n--Your Information--\nYear: %s\nCourses: %d\nGPA: %f", year, courses, gpa);

        input.close();
    }
}
