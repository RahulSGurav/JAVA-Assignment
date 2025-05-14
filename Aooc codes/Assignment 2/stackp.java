import java.util.*;
public class stackp {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println("Stack: " + stack);

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
