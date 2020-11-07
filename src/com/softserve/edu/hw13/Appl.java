package com.softserve.edu.hw13;

import java.util.Scanner;

public class Appl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.println("sum = " + (a + b));
    }
}