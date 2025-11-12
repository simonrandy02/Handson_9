package Latihan4;

public abstract class ShippingMethod {
    public abstract double calculateShippingCost(double weight);
    public abstract String getEstimatedDelivery();

    public void displayInfo() {
        System.out.println("Shipping Method: " + getClass().getSimpleName());
        System.out.println("Estimated Delivery: " + getEstimatedDelivery());
    }
}
