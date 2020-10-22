package com.softserve.hw04;

public class Appl {
    public static void main(String[] args) {
        Product p1 = new Product("Coffee", 40);
        Product p2 = new Product("Water", 20);
        Product p3 = new Product("Bear", 50);
        Product p4 = new Product("Milk", 20);
        //
        Product max = p1;
        if (max.getPrice() < p2.getPrice()) {
            max = p2;
        }
        if (max.getPrice() < p3.getPrice()) {
            max = p3;
        }
        if (max.getPrice() < p4.getPrice()) {
            max = p4;
        }
        System.out.println("max = " + max);
    }
}
