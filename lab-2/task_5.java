// Abdullah
// 455340
import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int digits, number;
            do{
                System.out.print("Enter a 5-digit number: ");
                number = scanner.nextInt();
                digits = countDigits(number);
            } while (digits != 5);

            int[] array = new int[20];
            int i = 0, number2 = number;
            for( ; number2 != 0; i++){
                array[i] = number2 % 10;
                number2 /= 10;
            }

            if (array[0] == array[4] && array[1] == array[3]) 
                System.out.printf("The number %d is a palindrome", number);

            scanner.close();
        }
    }

    public static int countDigits(int number){
        String numStr = Integer.toString(number);
        return numStr.length();
    }
}
