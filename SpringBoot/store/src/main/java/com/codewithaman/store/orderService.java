package com.codewithaman.store;

public class orderService {
    private PaymentService paymentService;


    public orderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}
