package DSProblemsJava;

class Stack {
    private int[] array;
    private int top;

    public Stack(int capacity) {
        array = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        if (top == array.length - 1) {
            System.out.println("Stack overflow");
            return;
        }
        array[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return array[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class StackExample {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek: " + stack.peek()); // Output: 30
        System.out.println("Pop: " + stack.pop());   // Output: 30

        System.out.println("Peek: " + stack.peek()); // Output: 20
        System.out.println("Pop: " + stack.pop());   // Output: 20

        System.out.println("Peek: " + stack.peek()); // Output: 10
        System.out.println("Pop: " + stack.pop());   // Output: 10

        System.out.println("Is Empty: " + stack.isEmpty()); // Output: true
        System.out.println("Pop: " + stack.pop());         // Output: Stack underflow
    }
}
