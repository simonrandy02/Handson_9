package Latihan4;

public class ExpressShipping extends ShippingMethod {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 20000;
    }

    @Override
    public String getEstimatedDelivery() {
        return "1-2 days";
    }
}
