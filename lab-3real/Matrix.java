import java.util.Scanner;

public class Matrix {
    int[][] matrix;
    int rows;
    int cols;

    Matrix (int rows) {
        this(rows, rows);
    }

    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public void setMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter the elements of row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter the element : " + (i + 1) + "x" + (j + 1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }

    public void setElement(int row, int col, int value) {
        matrix[row][col] = value;
    }

    public int[][] getMatrix() {
        displayMatrix(matrix, "Matrix");
        return matrix;
    }

    public int[][] getTranspose() {
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) 
            for (int j = 0; j < cols; j++) 
                transpose[j][i] = matrix[i][j];
        displayMatrix(transpose, "Transpose");
        return transpose;
    }

    public int[][] getInverse() {
        int determinant = getDeterminant();
        int[][] inverse = new int[rows][cols];
        if (determinant == 0) {
            System.out.println("The matrix is not invertible");
            return null;
        }
        if (rows == 2 && cols == 2) {
            inverse[0][0] = matrix[1][1];
            inverse[0][1] = -matrix[0][1];
            inverse[1][0] = -matrix[1][0];
            inverse[1][1] = matrix[0][0];
            for (int i = 0; i < rows; i++) 
                for (int j = 0; j < cols; j++) 
                    inverse[i][j] /= determinant;
            displayMatrix(inverse ,"Inverse");
            return inverse;
        }
        return null;
    }
    
    public int getDeterminant() {
        return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
    }
    
    public void getOrder() {
        System.out.println("The order of the matrix is: " + rows + "x" + cols);
    }

    private void displayMatrix(int[][] m, String string) {
        System.out.println(string + ":\n");
        for (int i = 0; i < rows; i++) {
            System.out.print("[ ");
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d   ", m[i][j]);
            }
            System.out.println("]");
        }
        System.out.println("");
    }
}