package org.example.ecommerceorderprocessing;

public class PrimeOrder extends Onlineorder {
    public double primeDiscount;
    public String prioritySupport;
    public String freeDelivery;
    public PrimeOrder(int orderId, String customerName, double totalAmount, String deliveryAddress, String shippingMethod, int trackingNumber, double primeDiscount, String prioritySupport, String freeDelivery) {
        super(orderId, customerName, totalAmount, deliveryAddress, shippingMethod, trackingNumber);
        this.primeDiscount = primeDiscount;
        this.prioritySupport = prioritySupport;
        this.freeDelivery = freeDelivery;
    }
    public double applyPrimeDiscount() {
        return totalAmount - primeDiscount;
    }
    public String accessPrioritySupport() {
        return "Accessing priority support for " + customerName;
    }

}
