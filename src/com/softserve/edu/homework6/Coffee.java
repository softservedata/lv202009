package com.softserve.edu.homework6;

import com.softserve.edu.homework5.Product;

public class Coffee extends Product {
    private String productName;
    private double price;
    private int aroma;
    public Coffee(String productName, double price, int aroma) {
        this.setAroma(aroma);
        this.setProductName(productName);
        this.setPrice(price);
    }

    @Override
    public String toString() {
        System.out.println("COFFEE: "+getProductName()+"- $"+getPrice()+"  _aroma: "+getAroma());
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

    public int getAroma() {
        return aroma;
    }

    public void setAroma(int aroma) {
        this.aroma = aroma;
    }
}
