package com.softserve.homework10;

import javax.xml.soap.Text;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {

    public static void main(String[] args) {
        String text = "His \\)next class (is art). (]He [draws] on {paper} with {crayons} and pencils and [sometimes] uses a ruler. \n" +
                "Lucas (likes) art. It \\[{((is))} his [favorite class]. His \\(third [class] {is} science.";

        boolean result = verifyBrackets(text);
        System.out.println(result);
    }

    public static boolean verifyBrackets(String text) {

        if ((text == null) || (text.isEmpty())) {
            return false;
        }
        String result = text.replaceAll("(\\\\\\))|(\\\\\\()|(\\\\\\])|(\\\\\\[)|(\\\\\\{)|(\\\\\\})", "")
                .replaceAll("[^\\(\\)\\{\\]\\}\\[]", "");

        if (result.isEmpty()) {
            return true;
        } else {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < result.length(); i++) {
                char current = result.charAt(i);
                if (current == '(' || current == '[' || current == '{') {
                    stack.push(current);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char peekChar = stack.peek();
                    if ((current == ')' && peekChar != '(')
                            || (current == '}' && peekChar != '{')
                            || (current == ']' && peekChar != '[')) {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
            return true;
        }

    }
}