package org.example.ecommerceorderprocessing;

public class Onlineorder extends Order{
    public String deliveryAddress;
    public String shippingMethod;
    public int  trackingNumber;

    public Onlineorder(int orderId, String customerName, double totalAmount, String deliveryAddress, String shippingMethod, int trackingNumber) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.deliveryAddress = deliveryAddress;
        this.shippingMethod = shippingMethod;
        this.trackingNumber = trackingNumber;
    }
    public String sendConfirmationEmail(){
        return "Confirmation email sent to " + customerName;
    }
    public void trackOrder(){
        System.out.println("Tracking order " + orderId + " with tracking number " + trackingNumber);
    }
}
