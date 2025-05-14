import java.util.*;

// Stack Interface
interface Stack {
    int size = 5;
    void push();
    int pop();
    void display();
    void overflow();
    void underflow();
}
class Integerstack implements Stack {
    int[] stack = new int[size];
    int top = -1;
    Scanner sc = new Scanner(System.in);


    public void push() {
        if (top == size - 1) {
            overflow();
        } else {
            System.out.print("Enter element to push: ");
            int value = sc.nextInt();
            stack[++top] = value;
            System.out.println(value + " pushed to stack");
        }
    }
    public int pop() {
        if (top == -1) {
            underflow();
            return -1;
        } else {
            int poppedv = stack[top--];
            System.out.println(poppedv + " popped from stack.");
            return poppedv;
        }
    }
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
    public void overflow() {
        System.out.println("Stack Overflow! Cannot push more elements.");
    }
    public void underflow() {
        System.out.println("Stack Underflow! Cannot pop.");
    }
}
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integerstack stack = new Integerstack();

        while (true) {
            System.out.println("\n1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("4: Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
