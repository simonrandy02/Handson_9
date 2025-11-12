package Latihan4;

public class Clothing extends Product {
    private String size, material, color;

    public Clothing(String id, String name, double price, int stock, String size, String material, String color) {
        super(id, name, price, stock);
        this.size = size;
        this.material = material;
        this.color = color;
    }

    @Override
    public void displayDetails() {
        System.out.println("[Clothing] " + name);
        System.out.println("Size: " + size + " | Material: " + material + " | Color: " + color);
        System.out.println("Price: Rp " + price + " | Stock: " + stock + "\n");
    }
}
