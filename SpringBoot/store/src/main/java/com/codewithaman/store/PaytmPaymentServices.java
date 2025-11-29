package com.codewithaman.store;

public class PaytmPaymentServices implements PaymentService{

    @Override
    public void processPayment(double amount) {
        System.out.println("PAYTM");
        System.out.println("Amount: " + amount);
    }
}
