public class StackTest {
    public static void main(String[] args) {
        Stack s1 = new Stack(10);
        s1.push(1);
        s1.displayStack();
        s1.push(2);
        s1.displayStack();
        s1.push(3);
        s1.displayStack();
        s1.push(4);
        s1.displayStack();
        s1.push(5);
        s1.displayStack();
       
        s1.pop();
        s1.displayStack();
        s1.pop();
        s1.displayStack();
       
    }    
}