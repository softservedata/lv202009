package com.softserve.edu.homework6;

import com.softserve.edu.homework5.Product;

public class Wine extends Product {
    private String productName;
    private double price;
    private String originCountry;
    public Wine(String productName, double price, String originCountry) {
        this.setPrice(price);
        this.setProductName(productName);
        this.setOriginCountry(originCountry);
    }

    @Override
    public String toString() {
        System.out.println("WINE: "+getProductName()+"- $"+getPrice()+"  _country: "+ getOriginCountry());
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String getProductName() {
        return productName;
    }

    @Override
    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
}
