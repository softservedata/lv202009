package com.softserve.edu.hw10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    
    public static void main(String[] args) {
        String text = "() [] {}";
        App app = new App();
        System.out.println("Correct ? - " + app.verifyBrackets(text));
        
    }
    
    public boolean verifyBrackets(String text) {
        boolean isTrue = true;
        
        @SuppressWarnings({ "unchecked", "rawtypes" })
        
        List<String> list = new ArrayList();
        String pattern = "\\(+|\\)+|\\[+|\\]+|\\{+|\\}+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        m.reset();
        
        while (m.find()) {
            list.add(text.substring(m.start(), m.end()));
        }
        
        for (int i = 0; i < list.size(); i++) {
            if (isTrue == false) {
                break;
            }
            
            for (int j = i + 1; j < list.size(); j++) {
                if (i != list.size() && (list.get(i).equals("(") && !list.get(i + 1).equals(")")
                        || list.get(i).equals("[") && !list.get(i + 1).equals("]")
                        || list.get(i).equals("{") && !list.get(i + 1).equals("}"))) {
                    isTrue = false;
                    break;
                }
                if (list.get(i).equals("(") && list.get(j).equals(")")
                        || list.get(i).equals("{") && list.get(j).equals("}")
                        || list.get(i).equals("[") && list.get(j).equals("]")) {
                    isTrue = true;
                    break;
                }
            }
        }
        
        return isTrue;
        
    }
    
}