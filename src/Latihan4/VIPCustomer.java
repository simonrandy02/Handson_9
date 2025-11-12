package Latihan4;

public class VIPCustomer extends Customer {
    public VIPCustomer(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public double getDiscountPercentage() {
        return 20;
    }
}
