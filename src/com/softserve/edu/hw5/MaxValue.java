package com.softserve.edu.hw5;

public class MaxValue {
    public static void main(String[] args) {
        Product[] products = { new Product("toy", 40), new Product("egg", 3), new Product("apple", 10),
                        new Product("cheese", 55), new Product("toy", 40), new Product("toy", 40),
                        new Product("cat", 20), new Product("egg", 3), new Product("dog", 11) };
        
        for (int i = 0; i < products.length - 1; i++) {
            boolean isFound = false;
            if (products[i] == null) {
                continue;
            }
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].equals(products[j])) {
                    isFound = true;
                    products[j] = null;
                }
            }
            if (isFound) {
                System.out.println(products[i]);
            }
        }
    }
}
