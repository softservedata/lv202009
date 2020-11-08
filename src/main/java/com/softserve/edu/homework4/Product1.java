package com.softserve.edu.homework4;

import java.util.Arrays;

public class Product1 {
    private String productName;
    private double price;

    public Product1(String productName, double price){
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String [] ARGS){
        Product1[] product=new Product1[4];
        product[0]=new Product1("Prod1",7.55);
        product[1]=new Product1("Prod2", 4);
        product[2]=new Product1("Prod3", 12.2);
        product[3]=new Product1("Prod4",1);
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
}