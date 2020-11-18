package com.softserve.edu.hw9;

/*
Homework 9 (from 26.10.2020)
1) Нехай задано список з номерами телефонів, які можуть містити пробіли мінуси та круглі дужки.
   Створити мапу з номерами телефонів погрупованих по коду, з локальними та помилковими.
   For example,
   [["093 987 65 43", "(050)1234567", "12-345"],
    ["067-21-436-57", "050-2345678", "0939182736", "224-19-28"],
    ["(093)-11-22-334", "044 435-62-18", "721-73-45"]]
   you should get
  {"050"=["1234567", "2345678"], "067"=["2143657"], "093"=["1122334", "9182736", "9876543"], "044"=["4356218"], "loc"=["2241928", "7217345"], "err"=["12345"]}
Для коду використати пакет com.softserve.homework9
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppPhones {
    private static final String LOCAL = "loc";
    private static final String ERROR = "err";

    public static void main(String[] args) {
        // List<String> lst = new ArrayList<>();
        List<String> lst = Arrays.asList(
                "093 987 65 43", "(050)1234567", "12-345",
                "067-21-436-57", "050-2345678", "0939182736",
                "224-19-28", "(093)-11-22-334",
                "044 435-62-18", "721-73-45");
        Map<String, List<String>> map = new HashMap<>();
        List<String> phones = null;
        for (String current : lst) {
//            current = current.replace(" ", "").replace("-", "").replace("(", "").replace(")", "");
            current = current.replaceAll(" |-|\\(|\\)", "").trim();
            // System.out.println(current);
            switch (current.length()) {
                case 7:
                    phones = map.get(LOCAL);
                    if (phones == null) {
                        phones = new ArrayList<>();
                        map.put(LOCAL, phones);
                    }
                    phones.add(current);
                    break;
                case 10:
                    String code = current.substring(0, 3); // 0,1,2
                    phones = map.get(code);
                    if (phones == null) {
                        phones = new ArrayList<>();
                        map.put(code, phones);
                    }
                    phones.add(current.substring(3));
                    break;
                default:
                    phones = map.get(ERROR);
                    if (phones == null) {
                        phones = new ArrayList<>();
                        map.put(ERROR, phones);
                    }
                    phones.add(current);
                    break;
            }
        }
        System.out.println("Result = " + map);
    }

}
