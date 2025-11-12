package Latihan4;

public class ECommerceSystemPractice {
    public static void main(String[] args) {
        /*
         * COMPREHENSIVE PROJECT: E-Commerce System
         * Menggunakan konsep Abstraction & Polymorphism
         */

        // ===== SYSTEM STARTUP =====
        System.out.println("=== E-COMMERCE SYSTEM ===");
        System.out.println("TechMart E-Commerce System Initialized\n");

        // ===== PRODUCT CREATION =====
        System.out.println("=== PRODUCT CATALOG ===");
        System.out.println("All Products Available:\n");

        Product laptop = new Electronics("E001", "Laptop ASUS ROG", 15000000, 10, "2 Years", 65);
        Book book = new Book("B001", "Clean Code", 250000, 50, "Robert C. Martin", 464, "978-0132350884");
        Clothing kaos = new Clothing("C001", "Kaos Polos Premium", 75000, 100, "L", "Cotton", "Black");

        laptop.displayDetails();
        book.displayDetails();
        kaos.displayDetails();

        // ===== CUSTOMER REGISTRATION =====
        System.out.println("\n=== CUSTOMER REGISTRATION ===");

        RegularCustomer budi = new RegularCustomer("C001", "Budi", "budi@email.com");
        PremiumCustomer ani = new PremiumCustomer("C002", "Ani", "ani@email.com");
        VIPCustomer charlie = new VIPCustomer("C003", "Charlie", "charlie@email.com");

        budi.displayInfo();
        ani.displayInfo();
        charlie.displayInfo();

        // ===== SHOPPING CART =====
        System.out.println("\n=== SHOPPING CART ===");
        ShoppingCart cart = new ShoppingCart(ani);
        cart.addItem(laptop, 1);
        cart.addItem(book, 2);
        cart.displayCart();

        // ===== PAYMENT =====
        System.out.println("\n=== PAYMENT PROCESSING ===");
        Payment payment = new CreditCardPayment("1234567890123456");
        double total = cart.calculateTotal();

        if (payment.processPayment(total)) {
            System.out.println("Payment successful!");
            System.out.println("Transaction ID: " + payment.getTransactionId());
        } else {
            System.out.println("Payment failed.");
        }

        // ===== SHIPPING =====
        System.out.println("\n=== SHIPPING ===");
        ShippingMethod shipping = new ExpressShipping();
        shipping.displayInfo();
        double shippingCost = shipping.calculateShippingCost(2.5);
        System.out.println("Shipping Cost: Rp " + shippingCost);

        // ===== ORDER SUMMARY =====
        System.out.println("\n=== ORDER SUMMARY ===");
        Order order = new Order("ORD-20251107-001", ani, cart, payment, shipping, 2.5);
        order.displayOrderSummary();

        System.out.println("\n=== THANK YOU FOR SHOPPING AT TECHMART ===");
    }
}
