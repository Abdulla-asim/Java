public class TestArrayGradeBook {
    public static void main (String[] args) {
        String[] courseName = {"Discrete Math", "FOCP", "Calculus-1", "English", "AoICT", "OOP", "Linear Algebra",  "Calculus-3", "DLD",   "Databases"};
        float[][] grades = {
            {90, 80, 70, 60, 50, 40, 30, 20, 10, 34},
            {90, 80, 70, 60, 50, 40, 30, 20, 10, 34},
            {90, 80, 70, 60, 50, 40, 30, 20, 10, 34},
            {90, 80, 70, 60, 50, 40, 30, 20, 10, 34},
            {90, 80, 70, 60, 50, 40, 30, 20, 10, 34},
            {90, 80, 70, 60, 50, 40, 30, 20, 10, 34},
            {90, 80, 70, 60, 50, 40, 30, 20, 10, 34},
            {90, 80, 70, 60, 50, 40, 30, 20, 10, 34},
            {90, 80, 70, 60, 50, 40, 30, 20, 10, 34},
            {90, 80, 70, 60, 50, 40, 30, 20, 10, 34}
        };    
        GradeBook[] book = new GradeBook[10];

        for (int i = 0; i < 10; i++) 
            book[i] = new GradeBook(grades[i], 10, courseName[i]);
        
        System.out.printf("COURSES\t\t| S1\t| S2 \t| S3 \t| S4 \t| S5 \t| S6 \t| S7 \t| S8 \t| S9 \t| S10 \t| Average | Lowest score | Highest Score |\n");
        for (int i = 0; i < 10; i++) {
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------+");
            book[i].displayReprt();
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------+");
    }
}
