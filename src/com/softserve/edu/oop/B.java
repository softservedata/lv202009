package com.softserve.edu.oop;

public class B extends A {
    public int j = 321; // architecture (encapsulation) error, because couldn't be PUBLIC!

    public B() {
        // super();
        System.out.println("Constructor B() ");
    }
}
