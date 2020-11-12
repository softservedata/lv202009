package com.softserve.edu.hw10;

public class Main {
        public static void main(String[] args) {

        String stringValue1 = new String("{[(()[]{})]}");
        String stringValue2 = new String("(()]");

        System.out.println("s1: " + stringValue1);
        System.out.println("Input s1 is " + VerifyBrackets.verifyBrackets(stringValue1));

        System.out.println("s2: " + stringValue2);
        System.out.println("Input s2 is " + VerifyBrackets.verifyBrackets(stringValue2));
        }
}