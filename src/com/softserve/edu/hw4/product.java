package com.softserve.edu.hw4;

public class product {
    private String ProductName;
    private double ProductPrice;

    public product(String ProductName, double ProductPrice) {
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
    }

    public String getProductName() {
        return this.ProductName;
    }

    public double getProductPrice() {
        return this.ProductPrice;
    }

    public void setProductName() {
        this.ProductName = ProductName;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public String toString() {
        return String.format("Product Name: %s, Product Price: %.2f", this.ProductName, this.ProductPrice);
    }

    public static product GetMaxProduct(product[] product_list) {
        product ProductWithMaxPrice = product_list[0];
        for (int p = 1; p < product_list.length; p++) {
            if (product_list[p].getProductPrice() > ProductWithMaxPrice.getProductPrice()) {
                ProductWithMaxPrice = product_list[p];
            }
        }
        return ProductWithMaxPrice;
    }
}
