package com.softserve.edu.hw4;

public class Appl {
    public static void main(String[] args) {
        Product milk = new Product("milk", 30);
        Product butter = new Product("butter", 50);
        Product coffee = new Product("coffee", 100);
        Product bread = new Product("bread", 10);

        Product max = milk;
        if (max.getPrice() < butter.getPrice()) {
            max = butter;
        }
        if (max.getPrice() < coffee.getPrice()) {
            max = butter;
        }
        if (max.getPrice() < bread.getPrice()) {
            max = butter;
        }
        System.out.println("Product with maximum price is " + max);
    }
//            int[] array = new int[] {milk.price, butter.price, coffee.price, bread.price};
//            Arrays.sort(array);
//
//            System.out.println(array[array.length - 1]);
    }
