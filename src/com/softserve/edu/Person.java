package com.softserve.edu;

public class Person {
    String name;

    // Overload
    public void print() {
        System.out.println(name);
    }

    // Overload
    public void print(String s) {
        System.out.println(s + " " + name);
    }

    public void print(String welcomeMessage, Object... messages) {
        System.out.print(welcomeMessage);
        for (Object msg : messages) {
            System.out.print(msg + " ");
        }
    }
}
