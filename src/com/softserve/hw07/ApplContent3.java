package com.softserve.hw07;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApplContent3 {
    public static void main(String[] args) {
        List<Product> lst1 = Arrays.asList(
                new Product("Coffee", 40),
                new Product("Milk", 20),
                new Product("Water", 20),
                new Product("Bear", 50),
                new Product("Milk", 20)
                );
        List<Product> lst2 = Arrays.asList(
                new Product("Coffee", 40),
                new Product("Milk", 20),
                new Product("Bear", 50),
                new Product("Water", 20),
                new Product("Coffee", 40),
                new Product("Bear", 50),
                new Product("Milk", 20)
                );
        //
        // 1.
        System.out.println("lst1 = " + lst1);
        System.out.println("lst2 = " + lst2);
        //
        Set<Product> set1 = new HashSet<>(lst1);
        Set<Product> set2 = new HashSet<>(lst2);
        //
        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        //
        boolean isEquals = set1.equals(set2);
        System.out.println("isEquals = " + isEquals);
    }
}
