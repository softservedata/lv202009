package com.softserve.homework4;

import java.io.IOException;

public class Appl {
    public static void main(String[] args) throws IOException {
        Product product1 = new Product("Product A", 1);
        Product product2 = new Product("Product B", 100);
        Product product3 = new Product("Product C", 50);
        Product product4 = new Product("Product D", 75);

        Product biggestPrice = product1;
        if(biggestPrice.getPrice() < product2.getPrice())
        {
            biggestPrice = product2;
        }

        if(biggestPrice.getPrice() < product3.getPrice())
        {
            biggestPrice = product3;
        }

        if(biggestPrice.getPrice() < product4.getPrice())
        {
            biggestPrice = product4;
        }

        System.out.println(biggestPrice);
    }
}
