public class ComplexTest {
    public static void main(String[] args) {
        Complex complex1 = new Complex(1, 2);
        Complex complex2 = new Complex(3, 4);

        System.out.println("The comple number 1 is: ");
        complex1.displayComplex(complex1);

        Complex result = complex1.add(complex2);

        System.out.println("Sum:");
        result.displayComplex(result);

        result = complex1.subtract(complex2);
        System.out.println("Difference:");

        result.displayComplex(result);
    }
}
