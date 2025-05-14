import java.util.*;

class LowBalanceException extends Exception
{
    public LowBalanceException(String Message)
    {
        super(Message);
    }
}
class NegativeNumberException extends Exception
{
    public NegativeNumberException(String Message)
    {
        super(Message);
    }
}
class BankAccount
{
    public String AccHolder;
    public double balance;

    public BankAccount(String AccHolder,double balance)
    {
        this.AccHolder=AccHolder;
        this.balance=balance;
    }

    public void balanceEnquiry()
    {
        System.out.println("Current Balance"+balance);
    }

    public void deposite(double amount) throws NegativeNumberException
    {
        if(amount < 0)
        {
            throw new NegativeNumberException("cannot deposite negative amount");
        }
        balance+=amount;
        System.out.println("$"+amount+"Deposited successfully");
    }

    public void withdraw(double amount) throws NegativeNumberException ,LowBalanceException
    {
        if(amount < 0)
        {
            throw new NegativeNumberException("cannot withdraw negative amount");
        }
        if(amount > balance)
        {
            throw new LowBalanceException("Insufficient Balance");
        }
        balance-=amount;
        System.out.println("$"+amount+"Withdraw successfully");
    }

    public String toString()
    {
        return "Account Holder:"+ AccHolder+ "Balance:"+balance;
    }
}
public class BankApp
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Account Holder Name:");
        String name=sc.nextLine();

        System.out.println("Enter the Initial Balance:");
        double initialBalance=sc.nextDouble();

        BankAccount Account =new BankAccount(name,initialBalance);
        int choice;

        do
        {
            System.out.println("------Bank Account Details------");
            System.out.println("1. Balance Enquiry");
            System.out.println("2. Deposite");
            System.out.println("3. Withdraw");
            System.out.println("4. show account Detail");
            System.out.println("5. Exit");
            System.out.println("Enter choice");
            choice=sc.nextInt();

            try
            {
                switch (choice)
                {
                    case 1:
                        Account.balanceEnquiry();
                        break;

                    case 2:
                        System.out.println("Enter the amount to deposite:");
                        double depamount=sc.nextDouble();
                        Account.deposite(depamount);
                        break;

                    case 3:
                        System.out.println("Enter the amount to Withdraw:");
                        double withamount=sc.nextDouble();
                        Account.withdraw(withamount);
                        break;

                    case 4:
                        System.out.println(Account);

                    case 5:
                        System.out.println("Thank you for using bank app:");
                        break;

                    default:
                        System.out.println("invalid choice");

                }

            } catch(NegativeNumberException | LowBalanceException e)
            {
                System.out.println("Error"+e.getMessage());
            }

        }while(choice !=5);

    }
}
