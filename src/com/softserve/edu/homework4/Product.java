package com.softserve.edu.homework4;

import java.util.Arrays;

public class Product {
    private String productName;
    private double price;

    public Product(String productName, double price){
        this.productName=productName;
        this.price=price;
    }

    @Override
    public String toString(){
        return "\nProduct: "+getProductName()+"  Price: "+ "$"+getPrice();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public static void main(String [] ARGS){
        Product [] product=new Product[4];
        product[0]=new Product("Prod1",7.55);
        product[1]=new Product("Prod2", 4);
        product[2]=new Product("Prod3", 12.2);
        product[3]=new Product("Prod4",1);
        System.out.println("ALL PRODUCTS: "+ Arrays.toString(product));
        double maxPrice=product[0].getPrice();
        String productOfMaxPrice=product[0].getProductName();
        for (int i=1;i<product.length;i++){
            if (product[i].getPrice()>maxPrice){
                maxPrice=product[i].getPrice();
                productOfMaxPrice=product[i].getProductName();
            }
        }
        System.out.println("\nProduct "+productOfMaxPrice+" has max price "+maxPrice);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
