package com.softserve.edu.hw10;

public class Main {
    public static boolean verifyBrackets(String text) {

        for (int i = 0; i < text.length()-1; i++) {
            if (text.isEmpty() ||
                    text.charAt(0) == ')' || text.charAt(0) == '}' || text.charAt(0) == ']' ||
                    text.length() % 2 != 0)
//                    text.charAt(i) = "\\(" || text.charAt(i) = "\\)" ||
//                    text.charAt(i) == '\\[' || text.charAt(i) == '\\]' ||
//                    text.charAt(i) == '\\{' || text.charAt(i) == '\\}')
                return false;
        }

        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                counter++;
            } else if (text.charAt(i) == ')') {
                if (counter == 0) {
                    return false;
                }
                counter--;
            }
        }
        return counter == 0;
    }

        public static void main(String[] args) {

        String stringValue1 = new String("{[(()[]{})]}");
        String stringValue2 = new String("(()))");

        System.out.println("s1: " + stringValue1);
        System.out.println("Input s1 is " + verifyBrackets(stringValue1));

        System.out.println("s2: " + stringValue2);
        System.out.println("Input s2 is " + verifyBrackets(stringValue2));
    }
}