package org.example.ecommerceorderprocessing;

public class EcommerceMain {
    public static void main(String[] args) {
        PrimeOrder primeOrder = new PrimeOrder(101, "Alice", 250.0, "123 Main St", "Express", 987654, 20.0, "Yes", "Yes");

        System.out.println("Order ID: " + primeOrder.orderId);
        System.out.println("Customer Name: " + primeOrder.customerName);
        System.out.println("Total Amount before Discount: $" + primeOrder.totalAmount);
        System.out.println("Total Amount after Prime Discount: $" + primeOrder.applyPrimeDiscount());
        System.out.println(primeOrder.sendConfirmationEmail());
        primeOrder.trackOrder();
        System.out.println(primeOrder.accessPrioritySupport());
    }
}
