public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 0) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    
    public MyDate(String month, int day, int year) {
        this(day, convertMonthToNumber(month), year);
        
        if (day < 1 || day > 31 || year < 0) {
            throw new IllegalArgumentException("Invalid date");
        }
    }
    
    public MyDate(int dayInYear, int year) {
        this.day = dayInYear;
        this.year = year;
        this.month = -1;
    }

    private static int convertMonthToNumber(String month) {
        switch (month.toLowerCase()) {
            case "january": return 1;
            case "february": return 2;
            case "march": return 3;
            case "april": return 4;
            case "may": return 5;
            case "june": return 6;
            case "july": return 7;
            case "august": return 8;
            case "september": return 9;
            case "october": return 10;
            case "november": return 11;
            case "december": return 12;
            default: throw new IllegalArgumentException("Invalid month");
        }
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

    public String toString() {
        if (month == -1) {
            return String.format("%d %d", day, year);
        }
        return String.format("%d/%d/%d", day, month, year);
    }

    public void displayDate() {
        System.out.println(toString() + "\n");
    }
}
