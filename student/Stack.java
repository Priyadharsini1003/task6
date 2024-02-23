package student;


public class Stack {
    private static final int MAX_SIZE = 5;
    private int[] array;
    private int top;

    public Stack() {
        array = new int[MAX_SIZE];
        top = -1; 
    }
    public void push(int element) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow: Cannot push element onto a full stack.");
            return;
        }
        array[++top] = element;
        System.out.println("Pushed " + element + " onto the stack.");
    }
    

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
    }
}



