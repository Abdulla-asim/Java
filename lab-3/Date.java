public class Date {
    private int month;
    private int day;
    private int year;

    public Date() {
        month = 1;
        day = 1;
        year = 2024;
    }
    void setMonth(int month) 
    { this.month = month; }

    void setday(int day) 
    { this.day = day; }

    void setyear(int year) 
    { this.year = year; }

    int getMonth() 
    { return month; }

    int getday() 
    { return day; }

    int getyear()
    { return year; }

    void displayDate() 
    { System.out.println(month + "\\" + day + "\\" + year + ".\n"); } } // end of code
