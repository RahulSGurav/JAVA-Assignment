import java.util.*;;
class area {
    double length;
    double breadth;
    double areaofrect;

    void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    double getAreaq() {
        return areaofrect = length * breadth;
    }
}

public class arearect {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double length;
        double breadth;

        System.out.print("Enter the length: ");
        length = sc.nextDouble();
        System.out.print("Enter the breadth: ");
        breadth = sc.nextDouble();

        area a1 = new area();
        a1.setDim(length, breadth);
        System.out.println("The area of rectangle is : " + a1.getAreaq());

    }
}
