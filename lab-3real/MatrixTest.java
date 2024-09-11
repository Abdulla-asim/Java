public class MatrixTest {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2, 2);
        matrix.setMatrix();
        matrix.getMatrix();
        matrix.getTranspose();
        matrix.getInverse();
        System.out.println("Determinant: " + matrix.getDeterminant());
    }
}
