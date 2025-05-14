import java.util.Scanner;
interface Shape {
    void area();
}
class Rectangle implements Shape {
    int length, breadth;

    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        length = sc.nextInt();
        System.out.print("Enter breadth of rectangle: ");
        breadth = sc.nextInt();
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
}
class Triangle implements Shape {
    int base, height;

    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of triangle: ");
        base = sc.nextInt();
        System.out.print("Enter height of triangle: ");
        height = sc.nextInt();
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}
public class Shapetest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.area();

        Triangle tri = new Triangle();
        tri.area();
    }
}
