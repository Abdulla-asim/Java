public class Task6 {
    public static void main(String[] args) {
        try {
            method(1, 1);
        } catch (Exception e) {
            System.out.println("Illegal Argument Exception: " + e.getMessage());
        }
    }

    // Function throws a new Exceprion created using Anonymous classes
    public static void method(int a, int b) throws IllegalArgumentException{
        if (a == b)
        {
            throw new IllegalArgumentException() // Anonymous class, creates MY NEW EXCEPTION
            {
                @Override
                public String getMessage() {
                    return "a and b are equal";
                }
            };
        }
    }
}
