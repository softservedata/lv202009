package com.softserve.edu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {
    public static void main(String[] args) throws IOException {
        /*-
        System.out.println("Hello World!");
        int x = 11;
        int y = 7;
        //
        int a = x + y; // a = 18
        int s = x - y; // s = 4
        int m = x * y; // m = 77
        int d = x / y; // d = 1
        int r = x % y; // r = 4
        double d1 = (double)x / y;
        //
        System.out.println("d = " + d);
        System.out.println("r = " + r);
        System.out.println("d1 = " + d1);
        //
        System.out.println("x / y = " + x / y);
        System.out.println("x / y = " + 1.0 *(x / y) );
        System.out.println("x / y = " + (1.0 * x) / y);
        */
        /*-
        int x = 5;
        int a, b;
        //
        a = x++; // a = 5 x = 6
        x--; // x = 5
        b = ++x; // x = 6, b = 6;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        // x = 6; a = 5
        // int c = x++ + a; // c= 11; x = 7;
        int c = x++ + ++a; // c= 12; x = 7;
        System.out.println("c = " + c + "  x = " + x);
        //
        double d = 1.2;
        System.out.println("d = " + ++d);
        //
        boolean bool = true;
        // true
        System.out.println(bool);
        // false
        System.out.println(!bool);
        */
        /*-
        int x = 5;
        int y = -5;
        boolean bool = x > y;
        System.out.println("x > y = " + bool);
        //
        int t = 5, s = 4, v = 9;
        System.out.println(t > s && t > v || s < v);
        System.out.println((t < v || s > v) && t < s);
        //
        System.out.println("t & v = " + (t & v));
        System.out.println("t | v = " + (t | v));
        //
        if (t + 6 < 10) {
            System.out.println("t<10 true");
        } else {
            System.out.println("t<10 false");
        }
        //
        String str = t < 10 ? "t<10 true" : "t<10 false";
        System.out.println(str);
        */
        //
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Do you enjoy Java? (yes/no/maybe): ");
        String input = br.readLine();
        //
        switch (input.toLowerCase().replace(" ", "")) {
        case "yes":
            System.out.println("get yes");
            System.out.println("Super!");
            break;
        case "maybe":
            System.out.println("get maybe");
            System.out.println("Great!");
            break;
        case "no":
            System.out.println("Too bad!");
            break;
        default:
            System.out.println("Wrong!");
        }
        //
        String s0 = input.toLowerCase().replace(" ", "");
        if (s0.equals("yes")) {
            System.out.println("get yes");
            System.out.println("Super!");
        } else if (s0.equals("maybe")) {
            System.out.println("get maybe");
            System.out.println("Great!");
        } else if (s0.equals("no")) {
            System.out.println("get no");
            System.out.println("Too bad!");
        } else {
            System.out.println("Wrong!");
        }
        System.out.println("done");
    }
}
