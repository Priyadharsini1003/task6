package student;

import java.util.EmptyStackException;

public class StackPop {
    private static final int MAX_SIZE = 1000;
    private int[] array;
    private int top;

    public StackPop() {
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

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedElement = array[top--];
        System.out.println("Popped " + poppedElement + " from the stack.");
        return poppedElement;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        StackPop stack = new StackPop();

        // Push some elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        
        stack.pop();
        stack.pop();
        stack.pop();
        
    }
}

