public class MyDate1 {
    private int month;
    private int day;
    private int year;

    MyDate1(String string, int i, int j) {
        month = 1;
        day = 1;
        year = 2024;
    }
    public MyDate1() {
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
    { System.out.println(month + "\\" + day + "\\" + year + ".\n"); } 

    @Override
    public String toString() {
        return super.toString();
    }
}
