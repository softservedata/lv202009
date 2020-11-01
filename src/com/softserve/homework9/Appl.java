package com.softserve.homework9;

import java.util.*;

public class Appl {

    private static final int MOBILE_NUMBER_LENGTH = 10;
    private static final int LOCAL_NUMBER_LENGTH = 7;
    private static String LOCAL_NUMBER = "loc";
    private static String ERROR_NUMBER = "err";

    public static void main(String[] args) {
        List<String> phoneNumbers = new ArrayList<>(Arrays.asList("093 481 56 75", "093-976-4567", "(067)4553346",
                "0674570854", "234-11-33", "044 679-64-65", "2356486", "(093)215-18-45", "765-42", "-067-322-22-12-",
                "(222)-22-12", "12345", "093-321-67-12"));
        Map<String, List<String>> phoneHashMap = new HashMap<>();
        groupedPhonesMap(phoneNumbers, phoneHashMap);

        phoneHashMap.forEach((key, value) -> System.out.println("For key: " + key + "   Values are: " + value));
    }

    public static void groupedPhonesMap(List<String> phoneNumbers, Map<String, List<String>> phoneHashMap) {

        for (String number : phoneNumbers) {
            String result = number.replaceAll("[^0-9]", "");
            if (result.length() == MOBILE_NUMBER_LENGTH) {
                String key = result.substring(0, 3);
                String value = result.substring(3);
                if (phoneHashMap.containsKey(key)) {
                    phoneHashMap.get(key).add(value);
                } else {
                    phoneHashMap.put(key, new ArrayList<>(Arrays.asList(value)));
                }
            } else if (result.length() == LOCAL_NUMBER_LENGTH) {
                if (phoneHashMap.containsKey(LOCAL_NUMBER)) {
                    phoneHashMap.get(LOCAL_NUMBER).add(result);
                } else {
                    phoneHashMap.put(LOCAL_NUMBER, new ArrayList<>(Arrays.asList(result)));
                }
            } else {
                if (phoneHashMap.containsKey(ERROR_NUMBER)) {
                    phoneHashMap.get(ERROR_NUMBER).add(result);
                } else {
                    phoneHashMap.put(ERROR_NUMBER, new ArrayList<>(Arrays.asList(result)));
                }
            }
        }

    }
}
