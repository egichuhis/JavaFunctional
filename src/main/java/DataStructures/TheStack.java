package DataStructures;

import java.util.Stack;

//last in first out stack of objects (LIFO)
//push to insert object and pop to remove object, operations
//peek at the top item on the stack without removing it
public class TheStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(23);
        stack.push(83);
        stack.push(45);
        stack.push(26);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println();
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.println(stack.search(83));
    }
}
