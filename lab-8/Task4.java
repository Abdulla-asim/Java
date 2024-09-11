import java.util.Scanner;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        try {
            System.out.print("Enter the size of array: ");
            int[] arr = new int[sc.nextInt()];
            
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100);
            }
            System.out.println("The elements are: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Invalid Input " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
            sc.close();
        }
    }
}

