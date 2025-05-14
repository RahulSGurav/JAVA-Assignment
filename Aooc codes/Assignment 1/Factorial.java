import java.util.*;
public class Factorial {
    public static void main(String args[])
    {
        int factorial=1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number to find factorial:");
        int num=sc.nextInt();

        for(int i=1;i<=num;i++)
        {
            factorial *=i;
        }
        System.out.print("The factorial of enter number"+num+"is"+factorial);

    }
}
