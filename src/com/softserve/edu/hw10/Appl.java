package com.softserve.edu.hw10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {


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

    private Matcher m;

    public static void main(String[] args) {

        String pattern = "[a-z]";
        Pattern pattern1 = Pattern.compile(pattern);
        String text = "'('текст, що містить дужки')','{'текст, що містить дужки'}','['текст, що містить дужки']'";

        Matcher m = pattern1.matcher(text);

        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()));

        }
    }

    //public boolean verifyBrackets(String text) {
        // if (text.contains() {





}
