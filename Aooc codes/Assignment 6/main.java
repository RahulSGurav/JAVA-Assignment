import ExceptionHandlingDemo.Calculator;
import ExceptionHandlingDemo.DivisionException;
import java.util.*;

public class main
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enetr 1st number:");
        int a=sc.nextInt();

        System.out.println("Enetr 2nd number:");
        int b=sc.nextInt();

        Calculator calc =new Calculator();

        try
        {
            int result=calc.devide(a,b);
            System.out.println("Result:" +result);
        }
        catch(DivisionException e)
        {
            System.out.println("Error" +e.getMessage());
        }
    }
}
