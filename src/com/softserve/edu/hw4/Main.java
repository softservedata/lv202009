package com.softserve.edu.hw4;

public class Main {

    public static void main(String[] args) {
        product[] products = new product[] {
            new product("Strawberry", -25.50),
            new product("Raspberry", 34.34),
            new product("Cherry", 47.47),
            new product("Blueberry", 0.53)
        };

        product ProductWithMaxPrice = product.GetMaxProduct(products);
        System.out.println(ProductWithMaxPrice.toString());
    }
}
