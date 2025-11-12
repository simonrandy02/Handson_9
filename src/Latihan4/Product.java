package Latihan4;

public abstract class Product {
    protected String id, name;
    protected double price;
    protected int stock;

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() { return price; }
    public String getName() { return name; }
    public boolean isAvailable() { return stock > 0; }

    public void updateStock(int qty) {
        if (stock >= qty) stock -= qty;
    }

    public abstract void displayDetails();
}
