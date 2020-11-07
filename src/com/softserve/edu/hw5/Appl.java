package com.softserve.edu.hw5;

public class Appl {
    public static void main(String[] args) {
        Product[] array = {
                new Product("milk", 30),
                new Product("coffee", 130),
                new Product("rise", 50),
                new Product("onion", 10),
                new Product("milk", 30),
                new Product("potato", 20),
                new Product("coffee", 30),
                new Product("milk", 30),
                new Product("sausage", 120),
                new Product("carrot", 30)
        };

        for (int i = 0; i < array.length - 1; i++) {
            boolean isFound = false;
            if (array[i] == null) {
                continue;
            }
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        isFound = true;
                        array[j] = null;

                        // System.out.println("Product " + array[j].getName() + " is repeat in: " + j + " and " + i);
                    }
            }
                if (isFound) {
                    System.out.println(array[i]);
                }
        }
    }
}