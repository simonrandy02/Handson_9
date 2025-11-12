package Latihan4;

public abstract class Customer {
    protected String id, name, email;

    public Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public abstract double getDiscountPercentage();

    public void displayInfo() {
        System.out.println("Customer: " + name + " (" + email + ")");
        System.out.println("Discount: " + getDiscountPercentage() + "%\n");
    }
}
