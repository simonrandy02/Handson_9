package Latihan4;

public class RegularCustomer extends Customer {
    public RegularCustomer(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public double getDiscountPercentage() {
        return 0;
    }
}
