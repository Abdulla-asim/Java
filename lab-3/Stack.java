class Stack {
    private int[] stck;
    private int tos;
    private static int calls;
   
    Stack(int size) {
        stck = new int[size];
        tos = -1;
        calls = 0;
    }
   
    void push(int element) {
        stck[++tos] = element;
    }
   
    int pop() {
        return stck[tos--];
    }
   
    void displayStack() {
        System.out.print("\n\nSTACK " + calls++ + ": \nSize = " + (tos+1) + "\nData: ");
        for(int i = 0; i <= tos; i++)
        {
            System.out.print(stck[i] + " \t");
        }
    }
}