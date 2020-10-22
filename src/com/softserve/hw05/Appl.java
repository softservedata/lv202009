package com.softserve.hw05;

public class Appl {
    public static void main(String[] args) {
        Product[] products = { new Product("Coffee", 40),
                new Product("Water", 20),
                new Product("Coffee", 40),
                new Product("Bear", 50),
                new Product("Milk", 20),
                new Product("Coffee", 40),
                new Product("Bear", 50),
                new Product("Milk", 10),};
        //
        for (int i = 0; i < products.length - 1; i++) {
            //System.out.println("for i = " + i);
            boolean isFound = false;
            if (products[i] == null) {
                //System.out.println("continue");
                continue;
            }
            for (int j = i + 1; j < products.length; j++) {
                //System.out.println("\tfor j = " + j);
                if (products[i].equals(products[j])) {
                    isFound = true;
                    products[j] = null;
                }
            }
            if (isFound) {
                System.out.println(products[i]);
            }
        }
        System.out.println("done");
    }
}
