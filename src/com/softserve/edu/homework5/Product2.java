package com.softserve.edu.homework5;

import java.util.Arrays;

public class Product2 {
    private String productName;
    private double price;

    public Product2(String productName, double price){
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

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int)this.getPrice();
        result = prime * result + ((this.getProductName() == null) ? 0 : this.getProductName().hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Product2 other = (Product2) obj;
        if (this.getPrice() != other.getPrice()) return false;
        if (this.getProductName() == null) {
            if (other.getProductName() != null) return false;
        } else if (!this.getProductName().equals(other.getProductName())) return false;
        return true;
    }

    public static void main(String [] ARGS) {
        Product2[] product = {
                new Product2("Prod1", 7.55),
                new Product2("Prod2", 4),
                new Product2("Prod3", 12.2),
                new Product2("Prod4", 1),
                new Product2("Prod5", 9.5),
                new Product2("Prod6", -1),
                new Product2("Prod7", 15),
                new Product2("Prod1", 7.55),
                new Product2("Prod9", 6),
                new Product2("Prod10", 2)};
        System.out.println("ALL PRODUCTS: "+ Arrays.toString(product)+'\n');
        for(int j=product.length-1;j>=0;j--){
            for (int i=0;i<j;i++){
                if (product[i].equals(product[j])) {
                    System.out.println("Product \""+product[i].getProductName()+"\" is on position "+i+" and "+j);
                }
            }
        }
    }
}