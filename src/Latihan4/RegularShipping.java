package Latihan4;

public class RegularShipping extends ShippingMethod {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 10000;
    }

    @Override
    public String getEstimatedDelivery() {
        return "3-5 days";
    }
}
