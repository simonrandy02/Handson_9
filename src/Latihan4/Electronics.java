package Latihan4;

public class Electronics extends Product {
    private String warranty;
    private int powerConsumption;

    public Electronics(String id, String name, double price, int stock, String warranty, int powerConsumption) {
        super(id, name, price, stock);
        this.warranty = warranty;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public void displayDetails() {
        System.out.println("[Electronics] " + name);
        System.out.println("ID: " + id + " | Price: Rp " + price + " | Stock: " + stock);
        System.out.println("Warranty: " + warranty + " | Power: " + powerConsumption + "W\n");
    }
}
