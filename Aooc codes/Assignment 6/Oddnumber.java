import java.util.*;

class OddNumberException extends Exception
{
    public OddNumberException(String message)
    {
        super(message);
    }
}
public class Oddnumber
{
    public static void OddNumber (int number) throws OddNumberException
    {
        if(number % 2 != 0)
        {
            throw new OddNumberException("Number is Odd");
        }
        else {
            System.out.println("number  is even");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number =sc.nextInt();

        try
        {
            OddNumber(number);
        }catch(OddNumberException e)
        {
            System.out.println("Exception:" +e.getMessage());
        }
    }
}
