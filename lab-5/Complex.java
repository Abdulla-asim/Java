public class Complex {
    int real;
    int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex(int real) {
        this(real, 0);
    }

    public Complex() {
        this(0, 0);
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }   

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public void displayComplex(Complex complex) {
        System.out.println(complex.real + " + " + complex.imaginary + "i\n");
    }
}
