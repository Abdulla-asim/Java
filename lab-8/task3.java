public class task3 {
    public static void main(String[] args) {
        A obj = new B();
        try {
            obj.function();
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

class A {
    public void function() throws Exception {
        if (true) {
            throw new Exception("Exception from functionA");
        }
    }
}

class B extends A{
    public void function() throws Exception{
        if (true) {
            throw new Exception("Exception from functionB");
        }
    }
}
