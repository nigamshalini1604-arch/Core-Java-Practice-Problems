package org.example.oopsPractice;

public class PaymentMain {
    public static void main(String...args){
        Payment CreditCardPayment = new CreditCardPayment();
        CreditCardPayment.processPayment();
        Payment PaypalPayment = new PaypalPayment();
        PaypalPayment.processPayment();
    }
}
