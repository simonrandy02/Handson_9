package Latihan4;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;
    private Customer customer;

    public ShoppingCart(Customer customer) {
        this.customer = customer;
        this.items = new ArrayList<>();
    }

    public void addItem(Product product, int qty) {
        items.add(new CartItem(product, qty));
        product.updateStock(qty);
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) total += item.getSubtotal();
        double discount = total * (customer.getDiscountPercentage() / 100);
        return total - discount;
    }

    public void displayCart() {
        System.out.println("Shopping Cart for " + customer.getClass().getSimpleName() + " - " + customer.getDiscountPercentage() + "% discount");
        for (CartItem item : items) item.displayItem();
        System.out.println("Total after discount: Rp " + calculateTotal());
    }

    public List<CartItem> getItems() { return items; }
}
