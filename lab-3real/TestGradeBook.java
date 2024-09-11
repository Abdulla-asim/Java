import java.util.Scanner;

public class TestGradeBook {
    public static void main (String[] args) {
        
        float[] gradeArray = new float[10];
        Scanner sc = new Scanner(System.in);
        
        for (int j = 0; j < 10; j++) {
            System.out.print("Enter DLD grades for student " + (j+1) + " : ");
            gradeArray[j] = sc.nextFloat();
        }
        GradeBook DLD =  new GradeBook(gradeArray, 10, "DLD");

        System.out.println("");
        for (int j = 0; j < 10; j++) {
            System.out.print("Enter OOP grades for student " + (j+1) + " : ");
            gradeArray[j] = sc.nextFloat();
        }
        GradeBook OOP =  new GradeBook(gradeArray, 10, "OOP");

        System.out.println("");
        for (int j = 0; j < 10; j++) {
            System.out.print("Enter Linear Algebra grades for student " + (j+1) + " : ");
            gradeArray[j] = sc.nextFloat();
        }
        System.out.println("");
        GradeBook linearAlgebra =  new GradeBook(gradeArray, 10, "linearAlgebra");

        DLD.displayReprt();
        OOP.displayReprt();
        linearAlgebra.displayReprt();

        sc.close();
    }
}
