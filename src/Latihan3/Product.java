package Latihan3;

public class Product {
    private String name;
    private double price;
    private int stock;

    // Constructor 1
    public Product(String name) {
        this(name, 0, 0);
    }

    // Constructor 2
    public Product(String name, double price) {
        this(name, price, 0);
    }

    // Constructor 3
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void tampilkanInfo() {
        System.out.println("Product: " + name + " | Price: Rp " + price + " | Stock: " + stock);
    }
}
