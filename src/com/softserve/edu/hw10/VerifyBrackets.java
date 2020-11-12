package com.softserve.edu.hw10;

public class VerifyBrackets {
    public static boolean verifyBrackets(String text) {

        for (int i = 0; i < text.length()-1; i++) {
            if (text.isEmpty() || text.charAt(0) == ')' || text.charAt(0) == '}' || text.charAt(0) == ']' ||
                    text.length() % 2 != 0 || text.substring(i,i).equals("\\(") || text.substring(i,i).equals("\\)") ||
                    text.substring(i,i).equals("\\[") || text.substring(i,i).equals("\\]") ||
                    text.substring(i,i).equals("\\{") || text.substring(i,i).equals("\\}"))
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
}
