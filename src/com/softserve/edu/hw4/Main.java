package com.softserve.edu.hw4;

public class Main {

    public static void main(String[] args) {
        Product[] Products = new Product[] {
                new Product("Strawberry", -25.50),
                new Product("Raspberry", 34.34),
                new Product("Cherry", 47.47),
                new Product("Blueberry", 0.53)
        };

        Product ProductWithMaxPrice = Product.GetMaxProduct(Products);
        System.out.println(ProductWithMaxPrice);
    }
}