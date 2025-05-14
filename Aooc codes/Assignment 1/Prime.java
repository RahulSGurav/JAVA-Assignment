import java.util.*;
public class Prime {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=sc.nextInt();

        int count=0;

        if(num<1)
        {
            System.out.println(num+"is not a prime number");
        }

        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                count++;
                break;
            }
            else if(count==0)
            {
                System.out.println(num+"is a prime number");
            }
            else {
                System.out.println(num+"is a prime number");
            }
        }
    }
}
