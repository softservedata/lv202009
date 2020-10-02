package com.softserve.edu.hw2;

public class Appl {
    public static void main(String[] args){
        {
            int k = 16;
            System.out.println(k++);
            // k=16
        }
        {
            int k = 16;
            System.out.println(++k);
            // K=17
        }

        {
            int k = 16;
            System.out.println(k++ + k);
            // k=33
        }

        {
            int k = 16;
            System.out.println(50 - (--k));
            // k= 35
        }

        {
            int k = 16;
            System.out.println(k * k);
            // k=256
        }

        {
            int k = 16;
            System.out.println(k / 3);
            // k=5
        }

        {
            int k = 16;
            System.out.println(k % 3);
            // k=1
        }

        {
            int k = 16;
            System.out.println(k++ < ++k);
            // true
        }

    }

}
