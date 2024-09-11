public class DateTest1 {
    public static void main(String[] args) {
        MyDate date = new MyDate(null, 0, 0);
        System.out.println("Date 1:");
        date.displayDate();

        date = new MyDate("January", 1, 2000);
        System.out.println("Date 2");
        date.displayDate();
        
        date = new MyDate(null, 1, 2000);
        System.out.println("Date 3");
        date.displayDate();
    }
}
