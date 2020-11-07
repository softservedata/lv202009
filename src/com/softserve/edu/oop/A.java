package com.softserve.edu.oop;

public class A {
    private int i =12;

    // default constructor
    public A() {
        System.out.println("Constructor A() - default");
    }


    // constructor - перезапише значення і=12
    public A (int i) {
        this.i=i;
        System.out.println("Constructor A(int i) - with param");
    }

    public int getI() {
        System.out.println("\tgetI() from A");
        return i;
    }
 }
