package Latihan4;

public class SameDayShipping extends ShippingMethod {
    @Override
    public double calculateShippingCost(double weight) {
        return weight * 35000;
    }

    @Override
    public String getEstimatedDelivery() {
        return "Same Day";
    }
}
