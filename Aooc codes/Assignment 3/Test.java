import java.util.*;

class Employee
{
	String name, address, jobtitle;
	float salary,bonus;
	
	void data()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name:");
		name=sc.nextLine();
		System.out.println("Enter address:");
		address=sc.nextLine();
		System.out.println("Enter Job Title:");
		jobtitle=sc.nextLine();
		System.out.println("Enter salary:");
		salary=sc.nextFloat();
		System.out.println("Enter bonus:");
		bonus=sc.nextFloat();
	}
}
class Manager extends Employee
{
	void disply()
	{
		System.out.println("*****Manager Info******");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Job Title:"+jobtitle);
		System.out.println("Salary"+salary);
		System.out.println("Salary after getting bonus:"+(salary+bonus));
	}
}

class Developer extends Employee
{
	void disply()
	{
		System.out.println("*****Developer Info******");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Job Title:"+jobtitle);
		System.out.println("Salary"+salary);
		System.out.println("Salary after getting bonus:"+(salary+bonus));
	}
}

class Programer extends Employee
{
	void disply()
	{
		System.out.println("*****Programer Info******");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Job Title:"+jobtitle);
		System.out.println("Salary"+name);
		System.out.println("Salary after getting bonus:"+(salary+bonus));
	}
}



class Test
{
	public static void main(String args[])
	{
		Manager m1=new Manager();
		m1.data();
		m1.disply();

		Developer d1=new Developer();
		d1.data();
		d1.disply();

		Programer p1=new Programer();
		p1.data();
		p1.disply();
	}
}
