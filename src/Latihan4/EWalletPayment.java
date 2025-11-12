package Latihan4;

import java.util.UUID;

public class EWalletPayment implements Payment {
    private String phoneNumber;
    private String transactionId;

    public EWalletPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        transactionId = "EW-" + UUID.randomUUID().toString().substring(0, 8);
        System.out.println("Processing E-Wallet payment: Rp " + amount);
        System.out.println("Payment successful via E-Wallet");
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "E-Wallet";
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }
}
