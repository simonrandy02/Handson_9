package Latihan4;

import java.util.UUID;

public class CreditCardPayment implements Payment {
    private String cardNumber;
    private String transactionId;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        transactionId = "CC-" + UUID.randomUUID().toString().substring(0, 8);
        System.out.println("Processing Credit Card payment: Rp " + amount);
        System.out.println("Payment successful via Credit Card");
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }
}
