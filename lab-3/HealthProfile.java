import java.time.Year;

public class HealthProfile {
    String firstName;
    String lastName;
    String gender;
    double height;
    double weight;
    int month;
    int day;
    int year;
    int currentyear = Year.now().getValue();

    HealthProfile(String firstName, String lastName, String gender, double height, double weight,
                 int month, int day, int year) {
                    this.firstName = firstName;
                    this.lastName = lastName;
                    this.gender = gender;
                    this.height = height;
                    this.weight = weight;
                    this.day = day;
                    this.month = month;
                    this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public int getDay() {
        return day;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getGender() {
        return gender;
    }
    public double getHeight() {
        return height;
    }
    public String getLastName() {
        return lastName;
    }
    public int getMonth() {
        return month;
    }
    public double getWeight() {
        return weight;
    }
    public int getYear() {
        return year;
    }

    public int getAge() {
        return currentyear - year;
    }
    public int getMaxHeartRate() {
        return 220 - getAge();
    }
    public void displayTargetHeartRate() {
        System.out.println("Target heart-rate range is: " + getMaxHeartRate() * 0.5 + " - " + getMaxHeartRate() * 0.85 + "\n");
    }

    public double getBMI() {
        return 703 * weight/(height*height);
    }

    public void displayBMIChart() {
        System.out.println("BMI VALUES:\n" + "Underweight:  less than 18.5\nNormal:\tbetween 18.8 to 24.9\n" +
        "Overweight: between 25 and 29.9\nObese: 30 or greater.\n");
    }
}
