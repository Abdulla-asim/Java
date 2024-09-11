public class IncDec {
    public static void main(String[] args) {
        int x = 0, y = 0;
        System.out.println("Post Increment Op \t" + "Pre Increment Op");
        for ( ; ; )
        {
            System.out.print("The value of x is: " + x++ + "\t");
            System.out.println("The value of y is: " + ++y);
            
            if (x >= 10 && y >= 10) break;
        }
        System.out.println("Final values of x and y are: " + x + " and " + y);
    }
}
