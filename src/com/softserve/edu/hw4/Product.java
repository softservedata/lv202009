package com.softserve.edu.hw4;


public class Product extends com.softserve.homework5.Product {

    private String productName;
    private float productPrice;

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
    public String toString() {
        return "Product " +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice;
    }

    public static void main(String[] args) {
        Product prod1 = new Product("Bag", 12.5f);
        Product prod2 = new Product("Backpack", 30);
        Product prod3 = new Product();
        prod3.setProductName("Purse");
        prod3.setProductPrice(128);
        Product prod4 = new Product();
        prod4.setProductName("Wallet");
        prod4.setProductPrice(18.25f);

        Product mostExpensiveProduct = prod1;
        if (mostExpensiveProduct.getProductPrice() < prod2.getProductPrice()) {
            mostExpensiveProduct = prod2;
        }
        if (mostExpensiveProduct.getProductPrice() < prod3.getProductPrice()) {
            mostExpensiveProduct = prod3;
        }
        if (mostExpensiveProduct.getProductPrice() < prod4.getProductPrice()) {
            mostExpensiveProduct = prod4;
        }

        System.out.println("Most expensive product is: "
                + mostExpensiveProduct.getProductName());
    }


}
