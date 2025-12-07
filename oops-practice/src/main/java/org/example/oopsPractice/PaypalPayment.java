package org.example.oopsPractice;

public class PaypalPayment extends Payment{
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}
