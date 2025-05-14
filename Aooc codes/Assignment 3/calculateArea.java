import java.util.*;
abstract class shape
{
	float dim1,dim2;

	void setdim()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the dimension1:");
		dim1=sc.nextFloat();
		System.out.println("Enter the dimension2:");
		dim2=sc.nextFloat();
		
	}
	abstract float area();

}
class rectangle extends shape
{
	float area()
	{
		return dim1*dim2;
		
	}
}
class triangle extends shape
{
	float area()
	{
		return (dim1*dim2)/2;
		
	}
}
class calculateArea
{
	public static void main(String args[])
	{
		rectangle r1=new rectangle();
		System.out.println("RECTANGLE");
		r1.setdim();
		r1.area();
		System.out.println("Area of Rectangle:"+r1.area());

		System.out.println("TRIANGLE");
		triangle t1=new triangle();
		t1.setdim();
		t1.area();
		System.out.println("Area of triangle:"+r1.area());
		
		

	}
}
