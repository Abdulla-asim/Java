// Abdullah
// 455340
import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Equation: s = s(i) + v(i).t  + (1/2).a.t^2");

        System.out.print("Enter initial displacement 's(i)': ");
        double s_i = scanner.nextInt();

        System.out.print("Enter initial velocity 'v(i): ");
        double v_i = scanner.nextInt();

        System.out.print("Enter time 't': ");
        double t = scanner.nextInt();

        System.out.print("Enter acceleration 'a': ");
        double a = scanner.nextInt();

        double s = s_i + v_i * t  + (1/2) * a * t * t;

        System.out.print("\n>> Answer 's' = " + s + " units");
        scanner.close();
    }
}
