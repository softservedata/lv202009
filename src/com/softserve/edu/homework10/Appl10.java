package com.softserve.edu.homework10;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl10 {
    public static void main(String [] ARGS) {
        String text="(hello) (People) [(]) {add} number [10] and \\(0\\)";
        Appl10 appl0=new Appl10();
        System.out.println("Correct? - "+appl0.verifyBrackets(text));
    }

    public boolean verifyBrackets(String text) {
        boolean isTrue=true;
        List<String> list=new ArrayList();
        String pattern = "\\(+|\\)+|\\[+|\\]+|\\{+|\\}+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        m.reset();
        while (m.find()) {
            list.add(text.substring(m.start(), m.end()));
            System.out.print(text.substring(m.start(), m.end()) + ".");
        }
        System.out.println("\n");
        for (int i=0; i< list.size();i++) {
            if (isTrue==false){
                break;
            }
            for (int j=i+1; j<list.size(); j++){
                if (i!=list.size()&&(list.get(i).equals("(")&&!list.get(i+1).equals(")")||list.get(i).equals("[")&&!list.get(i+1).equals("]")
                ||list.get(i).equals("{")&&!list.get(i+1).equals("}"))){
                    System.out.println("false");
                    isTrue=false;
                    break;
                }
                if (list.get(i).equals("(")&&list.get(j).equals(")")||list.get(i).equals("{")&&list.get(j).equals("}")
                ||list.get(i).equals("[")&&list.get(j).equals("]")) {
                    System.out.println("true");
                    isTrue=true;
                    break;
                }
            }
        }
        return isTrue;
    }

}
/*
Дано текст, що містить дужки '(', ')', '{', '}', '[' та ']'.
   Послідовності "\\(", "\\)", "\\[", "\\]", "\\{" та "\\}" не вважати дужками.
   Напишіть метод
   public boolean verifyBrackets(String text) { ... }
   для перевірки вхідного тексту.
   Дужки повинні закриватися в правильному порядку.
   Наприклад, для випадків "()", "() [] {}", "{(())}" та "(\ ()" миповинніотримати true,
   а для "(]", ") (" та  "([)] " - false.

 */