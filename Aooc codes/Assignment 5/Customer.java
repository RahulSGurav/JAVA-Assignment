package Ecommerce;

public class Customer {
    public String name;

    public Customer(String name) {
        this.name = name;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
    }
}
