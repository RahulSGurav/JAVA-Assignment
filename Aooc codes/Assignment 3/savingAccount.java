import java.util.*;

class BankAccount
{
	float bal,wd;
	void deposite()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter deposted amount:");
		bal=sc.nextFloat();

	}

	void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		
			System.out.println("Enter withdraw amount:");
			wd=sc.nextFloat();
			bal=bal-wd;
			System.out.println("Balance:"+bal);
		

		
	}
}
class savingAccount extends BankAccount

{

		void error()
		{
			System.out.println("Your balance is less than 100 so you can't withdraw amount");
		
		}
	public static void main(String args[])
		{
	
			savingAccount s1=new savingAccount();
			s1.deposite();
			if(s1.bal<=100)
			{
				s1.error();
			}
			else
			{
			s1.withdraw();
			}
			
		}
}
