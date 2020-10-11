package com.softserve.homework5;

import java.util.Objects;

public class Product implements Comparable{

    protected String productName;
    protected float productPrice;

    public Product() {
    }

    public Product(String productName, float productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
                this.productName = productName;
    }
    public float getProductPrice() {
                return productPrice;
    }
    public void setProductPrice(float productPrice) {
                this.productPrice = productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(product.productPrice, productPrice) == 0 &&
                Objects.equals(productName, product.productName);

    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice);
    }

    @Override
    public String toString() {
        return "Product " +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice;
    }

    public static void main(String[] args) {

        Product [] products = new Product [10];

        products[0] = new Product("Bag", 12.5f);
        products[1] = new Product("Backpack", 30);
        products[2] = new Product("Purse", 128);
        products[3] = new Product("Wallet", 18.25f);
        products[4] = new Product("Handbag", 12.5f);
        products[5] = new Product("Hat", 18.25f);
        products[6] = new Product("Coat", 234);
        products[7] = new Product("Scarf", 15);
        products[8] = new Product("Bag", 12.5f);
        products[9] = new Product("Coat", 234);

        for (int i=0; i<= products.length-1; i++) {
            for (int a=i+1; a<= products.length-1; a++) {
                if ( products[i].equals(products[a]) ) {
                    System.out.println("Found same products:\n" + products[i] + "\nand" +
                            "\n"+products[a]);
                    System.out.println();
                }
            }
        }


    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}