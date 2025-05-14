package Ecommerce;

public class Order {
    public Customer customer;
    public Product product;
    public int quantity;

    public Order(Customer customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    public void placeOrder() {
        System.out.println("--- Order Placed ---");
        customer.displayCustomer();
        product.displayProduct();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    public double calculateTotalCost() {
        return product.price * quantity;
    }
}
