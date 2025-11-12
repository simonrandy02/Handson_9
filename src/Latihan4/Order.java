package Latihan4;

public class Order {
    private String orderId;
    private Customer customer;
    private ShoppingCart cart;
    private Payment payment;
    private ShippingMethod shipping;
    private double weight;

    public Order(String orderId, Customer customer, ShoppingCart cart, Payment payment, ShippingMethod shipping, double weight) {
        this.orderId = orderId;
        this.customer = customer;
        this.cart = cart;
        this.payment = payment;
        this.shipping = shipping;
        this.weight = weight;
    }

    public void displayOrderSummary() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getClass().getSimpleName());
        System.out.println("Payment Method: " + payment.getPaymentMethod());
        System.out.println("Transaction ID: " + payment.getTransactionId());
        shipping.displayInfo();
        System.out.println("Total Weight: " + weight + " kg");
        System.out.println("Final Total: Rp " + cart.calculateTotal() + "\n");
        System.out.println("Thank you for shopping with TechMart!");
    }
}
