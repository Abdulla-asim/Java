import java.time.Year;

public class HeartRates {
    String firstName;
    String lastName;
    int month;
    int day;
    int year;
    int currentyear = Year.now().getValue();

    HeartRates(String firstName, String lastName, int month, int day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void setLasrName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    // Getters
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
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
}
