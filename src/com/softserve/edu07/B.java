package com.softserve.edu07;

public class B extends A {
    public int j = 321; // Achitecture (Encapsulation) Error
    
    public B() {
        //super(321);
        System.out.println("constructor B()");
    }
    
    @Override
    public int getI() {
        System.out.println("\tgetI() from B");
        return super.getI();
    }
}
