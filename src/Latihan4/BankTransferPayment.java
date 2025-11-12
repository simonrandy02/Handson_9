package Latihan4;

import java.util.UUID;

public class BankTransferPayment implements Payment {
    private String accountNumber;
    private String transactionId;

    public BankTransferPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        transactionId = "BT-" + UUID.randomUUID().toString().substring(0, 8);
        System.out.println("Processing Bank Transfer payment: Rp " + amount);
        System.out.println("Payment successful via Bank Transfer");
        return true;
    }

    @Override
    public String getPaymentMethod() {
        return "Bank Transfer";
    }

    @Override
    public String getTransactionId() {
        return transactionId;
    }
}
