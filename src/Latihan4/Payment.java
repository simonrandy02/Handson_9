package Latihan4;

public interface Payment {
    boolean processPayment(double amount);
    String getPaymentMethod();
    String getTransactionId();
}
