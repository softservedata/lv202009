package com.softserve.edu.hw10;


    /*
    Дано текст, що містить дужки '(', ')', '{', '}', '[' та ']'.
   Послідовності "\\(", "\\)", "\\[", "\\]", "\\{" та "\\}" не вважати дужками.
   Напишіть метод
   public boolean verifyBrackets(String text) { ... }
   для перевірки вхідного тексту.
   Дужки повинні закриватися в правильному порядку.
   Наприклад, для випадків "()", "() [] {}", "{(())}" та "(\ ()" миповинніотримати true,
   а для "(]", ") (" та  "([)] " - false.
    Для коду використати пакет com.softserve.homework10
    */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class AppBracket {

    private static final String OPEN_BRACKETS = "([{";
    private static final String CLOSE_BRACKETS = ")]}";

    public static void main(String[] args) {
        Map<String,String> brackets = new HashMap<>();
        brackets.put("(", ")");
        brackets.put("[", "]");
        brackets.put("{", "}");
        //
        List<String> lst = Arrays.asList(
                "(\\[)", "() [\\}] {}", "{(())\\(}", "(\\ ()",
                "(]", ") (", "([)] ");
        Stack<String> stack = new Stack<String>();
        for (String current : lst) {
            stack.clear();
            System.out.print("\nCurrent = " + current);
            //current = current.replaceAll("\\(|\\)|\\[|\\]|\\{|\\}", ""); // Error
            current = current.replace("\\(","").replace("\\)","")
                    .replace("\\[","").replace("\\]","")
                    .replace("\\{","").replace("\\}","");
            //System.out.println(" \tUpdated = " + current);
            boolean result = true;
            for (int i = 0; i < current.length() && result; i++) {
                String symbol = current.substring(i, i+1);
                if (OPEN_BRACKETS.contains(symbol)) {
                    stack.push(brackets.get(symbol));
                } else if (CLOSE_BRACKETS.contains(symbol)) {
                    if (stack.isEmpty()) {
                        result = false;
                        break;
                    }
                    String topElement = stack.pop();
                    if (!topElement.equals(symbol)) {
                        result = false;
                        break;
                    }
                }
            }
            result = result && stack.isEmpty();
            System.out.println("  result = " + result);
        }
    }
}
