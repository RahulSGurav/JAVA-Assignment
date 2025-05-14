import java.util.*;
class Area
{
    float length,breadth;
    void setDim()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle");
length = sc.nextFloat();
breadth = sc.nextFloat();
 }
void getArea()
{
    System.out.println("Area of rectangle: "+(length*breadth));
}
}
class rectangle
{
    public static void main(String args[])
    {
        Area a1 = new Area();
        a1.setDim();
        a1.getArea();
    }
} 