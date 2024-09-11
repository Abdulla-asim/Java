public class SameVarName {
    public static void main(String[] args) {
        int a = 100;
        //for (int i = 1; i < 10; i++)
            a = a + 1; 
        // cannot declare a variable with same name again like in C. (even in a different scope)
    }
}
