package org.example.oopsPractice;
//Design a Product class with attributes
// such as productId, productName, and price.
// Use a constructor to initialize these attributes
// and create a method to display product details.
public class Product {
    private int productId;
    private String productName;
    private double price;
    public Product(){

    }
    public Product (int productId,String productName,double price){
        this.productId=productId;
        this.productName=productName;
        this.price=price;
    }
    public void displayProductDetails(Product[] products){
        for(int i=0;i<5;i++){
            System.out.println("Here is the Details of Product with Product ID:"+products[i].productId);
            System.out.println(" Productname:"+products[i].productName+" Price:"+products[i].price);
        }
    }
}
