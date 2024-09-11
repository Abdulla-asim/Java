public class Task5 {
    public static void main(String[] args) {
        try {
            functionA();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }

    public static void functionA() throws Exception { // throws Exception
        if (true) {
            throw new Exception("Exception from functionA");
        }
    }
}
