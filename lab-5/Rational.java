public class Rational {
    private int numerator;
    private int denominator;

    Rational() {
        this(1, 1);
    }

    Rational(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;  
        this.denominator = denominator / gcd;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }

    public static Rational add(Rational a, Rational b) {
        int newNumerator = a.numerator * b.denominator + b.numerator * a.denominator;
        int newDenominator = a.denominator * b.denominator;
        int gcd = gcd(newNumerator, newDenominator);
        newNumerator /= gcd;
        newDenominator /= gcd;
        return new Rational(newNumerator, newDenominator);
    }

    public static Rational subtract(Rational a, Rational b) {
        int newNumerator = a.numerator * b.denominator - b.numerator * a.denominator;
        int newDenominator = a.denominator * b.denominator;
        int gcd = gcd(newNumerator, newDenominator);
        newNumerator /= gcd;
        newDenominator /= gcd;
        return new Rational(newNumerator, newDenominator);
    }

    public static Rational multiply(Rational a, Rational b) {
        int newNumerator = a.numerator * b.numerator;
        int newDenominator = a.denominator * b.denominator;
        int gcd = gcd(newNumerator, newDenominator);
        newNumerator /= gcd;
        newDenominator /= gcd;
        return new Rational(newNumerator, newDenominator);
    }

    public static Rational divide(Rational a, Rational b) {
        int newNumerator = a.numerator * b.denominator;
        int newDenominator = a.denominator * b.numerator;
        int gcd = gcd(newNumerator, newDenominator);
        newNumerator /= gcd;
        newDenominator /= gcd;
        return new Rational(newNumerator, newDenominator);
    }

    public void displayRational(int precision) {
        System.out.printf("%." + precision + "f" + "/" + "%." + precision + "f", (double) this.numerator , (double) this.denominator);
    }
}
