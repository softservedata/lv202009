package com.softserve.homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Appl {
    public static void main(String[] args) {
        ArrayList<String> numbersList = new ArrayList<>(Arrays.asList("093 987 65 43", "(050)1234567", "12-345",
                "067-21-436-57", "050-2345678", "0939182736", "224-19-28", "(093)-11-22-334", "044 435-62-18", "721-73-45"));

        HashMap<String, ArrayList<String>> numbersMap = new HashMap<>();

        for (String number: numbersList){
            String cleanNumber = number.replaceAll("[() -]", "");

            if(!cleanNumber.matches("[0-9]+")){
                putNumberInMap("err", cleanNumber, numbersMap);
            } else if(cleanNumber.length() == 7){
                putNumberInMap("loc", cleanNumber, numbersMap);
            } else if(cleanNumber.length() == 10){
                putNumberInMap(cleanNumber.substring(0, 3), cleanNumber.substring(3, 10), numbersMap);
            } else {
                putNumberInMap("err", cleanNumber, numbersMap);
            }
        }

        System.out.println("Numbers map: " + numbersMap);
    }

    private static void putNumberInMap(String key, String number, HashMap<String, ArrayList<String>> numbersMap){
        if(!numbersMap.containsKey(key))
        {
            numbersMap.put(key, new ArrayList<String>());
        }
        numbersMap.get(key).add(number);
    }
}
