package org.example.oopsPractice;

public class ProductMain {
    public static void main(String...args){
        Product product1 = new Product(101,"Laptop",8900.55);
        Product product2 = new Product(102,"Smartphone",5500.75);
        Product product3 = new Product(103,"Tablet",3200.40);
        Product product4 = new Product(104,"Monitor",1500.00);
        Product product5 = new Product(105,"Keyboard",300.25);
        // array of products can also be created
        Product[] products = {product1, product2, product3, product4, product5};
        Product product = new Product();
        product.displayProductDetails(products);
    }
}
