package com.softserve.edu;

public class Appl {
     public static void main(String[] args) {
            int k = 16;
            int m = 50;
            System.out.println(k++);  // Increment after print
            System.out.println(++k);  // Increment before print
            System.out.println(k+++k); // Similar to k++ + k
            System.out.println(m---k); // m - k and decrement m after
            System.out.println(k*k);
            System.out.println(k/3);
            System.out.println(k%3);
            System.out.println(k++<++k);  // True because increment after always < increment now
     }
}