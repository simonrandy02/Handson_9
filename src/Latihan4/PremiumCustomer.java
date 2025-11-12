package Latihan4;

public class PremiumCustomer extends Customer {
    public PremiumCustomer(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public double getDiscountPercentage() {
        return 10;
    }
}
