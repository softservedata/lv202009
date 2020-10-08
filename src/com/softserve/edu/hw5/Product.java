package com.softserve.edu.hw5;

import java.util.Objects;

public class Product {
    private String ProductName;
    private double ProductPrice;

    public Product() {
        ProductName = "";
        ProductPrice = 0;
    }

    public Product(String ProductName, double ProductPrice) {
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

    public static Product GetMaxProduct(Product[] product_list) {
        Product ProductWithMaxPrice = product_list[0];
        for (int p = 1; p < product_list.length; p++) {
            if (product_list[p].getProductPrice() > ProductWithMaxPrice.getProductPrice()) {
                ProductWithMaxPrice = product_list[p];
            }
        }
        return ProductWithMaxPrice;
    }

    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;

        Product other = null;
        if (p instanceof Product) {
            other = (Product) p;
        }
        if ((other == null) || (ProductPrice != other.ProductPrice) || (!ProductName.equals(other.ProductName))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductName(), getProductPrice());
    }
}

