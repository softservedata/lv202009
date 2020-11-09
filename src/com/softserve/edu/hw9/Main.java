package com.softserve.edu.hw9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> phoneNumbers = new ArrayList<String>();
        phoneNumbers.add("095-345-34-34");
        phoneNumbers.add("(093)-123-12-12");
        phoneNumbers.add("(044)-456-45-45");
        phoneNumbers.add("(067)-123-12 12");
        phoneNumbers.add("097 555-25 22");
        phoneNumbers.add("095-123-12-1");
        phoneNumbers.add("(044)1231212");
        phoneNumbers.add("097 555-25 0000");

        phoneNumbers.replaceAll(e -> e.replace("-", ""));
        phoneNumbers.replaceAll(e -> e.replace("(", ""));
        phoneNumbers.replaceAll(e -> e.replace(")", ""));
        phoneNumbers.replaceAll(e -> e.replace(" ", ""));

        ArrayList<String> mobileOperators = new ArrayList<String>();
        mobileOperators.add("063");
        mobileOperators.add("095");
        mobileOperators.add("067");
        mobileOperators.add("097");

        ArrayList<String> localOperators = new ArrayList<String>();
        localOperators.add("044");

        Map<String, ArrayList<String>> map = new HashMap<>();
        map.put("err", new ArrayList<String>());
        map.put("loc", new ArrayList<String>());

        for (String number : phoneNumbers) {
            String code = number.substring(0, 3);

            if ((!mobileOperators.contains(code)) && (!localOperators.contains(code))) {
                map.get("err").add(number);
                continue;
            }

            if (number.length() != 10) {
                map.get("err").add(number);
                continue;
            }

            if (localOperators.contains(code)) {
                map.get("loc").add(number);
                continue;
            }

            map.computeIfAbsent(code, k -> new ArrayList<String>());
            map.get(code).add(number);
        }
        System.out.println(map);
    }
}