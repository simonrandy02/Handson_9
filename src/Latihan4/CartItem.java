package Latihan4;

public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getSubtotal() {
        return product.getPrice() * quantity;
    }

    public void displayItem() {
        System.out.println(product.getName() + " x" + quantity + " = Rp " + getSubtotal());
    }

    public Product getProduct() { return product; }
}
