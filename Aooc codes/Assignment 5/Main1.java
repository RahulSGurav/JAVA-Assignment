import java.util.Scanner;
import Ecommerce.Product;
import Ecommerce.Customer;
import Ecommerce.Order;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Product Name: ");
        String pname = sc.nextLine();
        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();
        sc.nextLine();


        System.out.print("Enter Customer Name: ");
        String cname = sc.nextLine();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Product p = new Product(pname, price);
        Customer c = new Customer(cname);
        Order o = new Order(c, p, qty);

        o.placeOrder();


    }
}
