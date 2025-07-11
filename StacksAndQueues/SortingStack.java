package StacksAndQueues;
import java.util.Stack;

public class SortingStack {

    // Main sorting function
    public void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        sortStack(stack); // recursive call on reduced stack

        InsertInAscOrder(stack, top); // insert in sorted order
    }

    // Helper to insert element into sorted stack
    public void InsertInAscOrder(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        int top = stack.pop();
        InsertInAscOrder(stack, element); // insert recursively
        stack.push(top); // restore the popped element
    }

    // For testing
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);
        SortingStack sorter = new SortingStack();
        sorter.sortStack(stack);
        System.out.println("Sorted Stack:   " + stack);
    }
}
