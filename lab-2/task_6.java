// Abdullah
// 455340
import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number to be converted: ");
        int binary = scanner.nextInt();

        int decimal = binToDecimal(binary);

        System.out.println("The decimal equivalen is : " + decimal);
        scanner.close();
    }

    public static int binToDecimal(int binary) {
        int base = 1, decimal = 0;

        while(binary != 0) {
            int digit = binary % 10;
            decimal = decimal + digit * base;
            binary /= 10;
            base *= 2;
        }
        return decimal;
    }
}
