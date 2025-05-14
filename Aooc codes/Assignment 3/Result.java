import java.util.*;
class student
{
	int roll;
}
class Test extends student
{
	float sub1,sub2;
}
class Result extends Test
{	
	void Display(int r,float a,float b)
	{
		System.out.println("***Result***");
		System.out.println("Name: "+r);
		System.out.println("Sub1: "+a);
		System.out.println("Sub2: "+b);
		System.out.println("Result: "+(((a+b)/200)*100)+"%");
	}
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		Result r1 = new Result();
		System.out.println("Enter the roll number of student");
		r1.roll = sc.nextInt();
		System.out.println("Enter the marks of subject 1 and subject2 out of 100");
		r1.sub1 = sc.nextFloat();
		r1.sub2 = sc.nextFloat();
		r1.Display(r1.roll,r1.sub1,r1.sub2);
		
	}
}
