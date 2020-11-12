package com.softserve.hw13;

import java.util.HashMap;
import java.util.Map;

public class Brackets {
    private Map<String, String> brackets;
    private String openBrackets;
    private String closeBrackets;

    public Brackets() {
        init();
    }

    private void init() {
        brackets = new HashMap<>();
        brackets.put("(", ")");
        brackets.put("[", "]");
        brackets.put("{", "}");
        //
        openBrackets = "";
        closeBrackets = "";
        for (Map.Entry<String, String> entry : brackets.entrySet()) {
            openBrackets = openBrackets + entry.getKey();
            closeBrackets = closeBrackets + entry.getValue();
        }
        System.out.println("openBrackets = " + openBrackets);
        System.out.println("closeBrackets = " + closeBrackets);
    }

    public boolean verifyBrackets(String current) {
        String stack = "";
        boolean result = true;
        current = current.replace("\\(","").replace("\\)","")
                .replace("\\[","").replace("\\]","")
                .replace("\\{","").replace("\\}","");
        //System.out.println("***See = " + current);
        for (int i = 0; i < current.length() && result; i++) {
            String symbol = current.substring(i, i+1);
            if (openBrackets.contains(symbol)) {
                stack = brackets.get(symbol) + stack;
            } else if (closeBrackets.contains(symbol)) {
                if (stack.isEmpty()) {
                    result = false;
                    break;
                }
                String topElement = stack.substring(0, 1);
                stack = stack.substring(1);
                if (!topElement.equals(symbol)) {
                    result = false;
                    break;
                }
            }
        }
        result = result && stack.isEmpty();
        //System.out.println("  result = " + result);
        return result;
    }
}
