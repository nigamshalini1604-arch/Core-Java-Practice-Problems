package org.example.ecommerceorderprocessing;

import java.util.Date;

public class Order {
    public int orderId;
    public Date orderDate;
    public String customerName;
    public double totalAmount;

    public void processOrder() {
        // Logic to process the order
    }
    public double total_amount(){
        return totalAmount;
    }
}
