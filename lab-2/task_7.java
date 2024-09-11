// Abdullah
// 455340
import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a non-negative number : ");
            num = scanner.nextInt();
        } while (num < 0);

        int factorial = factOf(num);

        System.out.printf("Factorial of %d is %d%n", num, factorial);
        scanner.close();
    }

    public static int factOf(int num){
        // base case
        if (num == 0 || num == 1) return 1;

        // Recursive case
        return num * factOf(num - 1);
    }
}
