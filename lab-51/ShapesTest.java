import java.util.Scanner;

public class ShapesTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();

        System.out.print("Enter the color of the rectangle: ");
        String color = sc.next();
        System.out.print("Is the rectangle filled? (true/false): ");
        boolean filled = sc.nextBoolean();

        Rectangle2 rectangle = new Rectangle2(length, width, color, filled);

        System.out.println("\nRectangle Info: ");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Is Filled: " + rectangle.isFilled());

        sc.close();
    }
}
