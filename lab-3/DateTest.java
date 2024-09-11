public class DateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();

        System.out.println("The default date is: ");
        date1.displayDate();

        date1.setMonth(10);
        date1.setday(14);
        date1.setyear(2006);

        System.out.println("The updated date (using display function): ");
        date1.displayDate();

        System.out.println("The updated date (using get functions): ");
        System.out.println(date1.getMonth() + "\\" + date1.getday() + "\\" + date1.getyear() + ".\n");
    }

}
