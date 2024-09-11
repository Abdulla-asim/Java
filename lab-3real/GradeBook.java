public class GradeBook {
    private float[] grades;
    private double avereage;
    private float lowestGrade;
    private float highestGrade;
    private String course;

    GradeBook(float[] grades, int size, String course) {
        this.grades = new float[size];
        this.course = course;

        int i = 0;
        for ( ; i < size; i++) {
            this.grades[i] = grades[i];
            avereage += grades[i];

            if (i == 0) {
                lowestGrade = grades[i];
                highestGrade = grades[i];
            }
            else {

                if (grades[i] < lowestGrade) 
                    lowestGrade = grades[i];
                if (grades[i] > highestGrade) 
                    highestGrade = grades[i];
                }
            }
            avereage /= (double) i;
        }

    public double getAvereage() {
        return avereage;
    }

    public float[] getGrades() {
        return grades;
    }

    public float getLowestGrade() {
        return lowestGrade;
    }

    public float getHighestGrade() {
        return highestGrade;
    }

    public String getCourse() {
        return course;
    }

    public void displayReprt() {
        System.out.printf("%14s\t| ", course);
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + "  | ");
        }
        System.out.print(avereage + "    | " + lowestGrade + "         | " + highestGrade + "  \t |\n");
    }
}
