import java.util.Scanner;

public class RationalTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a rational number: " + "\nNumerator: ");
        int a = sc.nextInt();
        System.out.print("Denominator: ");
        int b = sc.nextInt();
        Rational r1 = new Rational(a, b);

        System.out.print("\nWhat precision do you want for displaying outputs: ");
        int precision = sc.nextInt();
        System.out.print("Your rational Number: ");
        r1.displayRational(precision);

        System.out.print("\nEnter another rational number to add to the prev one " + "\nNumerator: ");
        a = sc.nextInt();
        System.out.print("Denominator: ");
        b = sc.nextInt();

        Rational r2 = new Rational(a, b);

        r1.displayRational(precision);
        System.out.print(" + ");
        r2.displayRational(precision);
        System.out.println(" = ");
        Rational.add(r1, r2).displayRational(precision);

        System.out.print("\nEnter another rational number to subtract from the prev one " + "\nNumerator: ");
        a = sc.nextInt();
        System.out.print("Denominator: ");
        b = sc.nextInt();

        r2 = new Rational(a, b);

        r1.displayRational(precision); 
        System.out.print(" - ");
        r2.displayRational(precision);
        System.out.print(" = ");
        Rational.subtract(r1, r2).displayRational(precision);

        System.out.print("\nEnter another rational number to multiply with the prev one " + "\nNumerator: ");
        a = sc.nextInt();
        System.out.print("Denominator: ");
        b = sc.nextInt();

        r2 = new Rational(a, b);

        r1.displayRational(precision);
        System.out.print(" * ");
        r2.displayRational(precision);
        System.out.print(" = ");
        Rational.multiply(r1, r2).displayRational(precision);

        System.out.print("\nEnter another rational number to divide the prev one " + "\nNumerator: ");
        a = sc.nextInt();
        System.out.print("Denominator: ");
        b = sc.nextInt();

        r2 = new Rational(a, b);

        r1.displayRational(precision);
        System.out.print(" / ");
        r2.displayRational(precision);
        System.out.print(" = ");
        Rational.divide(r1, r2).displayRational(precision);

        sc.close();
    }
}
