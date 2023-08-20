package DSProblemsJava;

import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            if (stack.peek().equals(minStack.peek())) {
                minStack.pop();
            }
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

public class Main {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(3);
        minStack.push(5);
        minStack.push(2);
        minStack.push(7);

        System.out.println("Minimum element: " + minStack.getMin()); // Output: 2

        minStack.pop();
        minStack.pop();

        System.out.println("Top element: " + minStack.top()); // Output: 5
        System.out.println("Minimum element: " + minStack.getMin()); // Output: 3
    }
}


/* Problem: Implement a Stack with Minimum Element Retrieval
Implement a stack data structure that supports the following operations:

push(int x): Pushes the element x onto the stack.
pop(): Removes the element on the top of the stack.
top(): Returns the element on the top of the stack without removing it.
getMin(): Retrieves the minimum element in the stack in constant time

In this solution, we use two stacks: one for the actual elements and another to keep track of the minimum element at each step.
When pushing an element onto the stack, we compare it with the top element of the minimum stack and push it onto the minimum stack if it's smaller. When popping, we remove elements from both stacks as needed. The top() and getMin() methods simply retrieve the top elements of the main stack and the minimum stack, respectively.

This problem demonstrates how to implement a common data structure, the stack,
 while maintaining additional information to efficiently retrieve the minimum element.
 */
