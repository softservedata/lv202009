package com.softserve.homework5;

import java.io.IOException;

public class Appl {
    public static void main(String[] args) throws IOException {
        Product[] products = new Product[10];

        products[0] = new Product("Product A", 1);
        products[1] = new Product("Product B", 100);
        products[2] = new Product("Product C", 50);
        products[3] = new Product("Product D", 75);
        products[4] = new Product("Product E", 65);
        products[5] = new Product("Product F", 70);
        products[6] = new Product("Product D", 75);
        products[7] = new Product("Product G", 75);
        products[8] = new Product("Product H", 125);
        products[9] = new Product("Product I", 725);

        for (int i = 0; i < products.length; i++)
        {
            for (int j = i + 1; j < products.length; j++)
            {
                if(products[i].equals(products[j]))
                {
                    System.out.println("Product at position " + i + ": '" + products[i] + "' equals to product " +
                            "at position " + j + ": '" + products[j] + "'");

                }
            }
        }
    }
}
