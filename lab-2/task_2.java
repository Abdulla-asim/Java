// Abdullah
// 455340
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a 5 digit number: ");
            int number = input.nextInt();

            int[] array = new int[20];
            int i = 0;
            for( ; number != 0; i++){
                array[i] = number % 10;
                number /= 10;
            }
            for (i -= 1; i >= 0; i--)
                System.out.print(array[i] + "   ");
                
            input.close();
        }
    }
}
