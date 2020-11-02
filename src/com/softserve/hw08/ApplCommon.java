package com.softserve.hw08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ApplCommon {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(1, 2, 1, 7, 2, 3);
        List<Integer> lst2 = Arrays.asList(3, 3, 2, 5, 2, 1, 1);
        //
        System.out.println("lst1 = " + lst1);
        System.out.println("lst2 = " + lst2);
        //
        // 1.
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < lst1.size(); i++) {
            boolean isExist = false;
            for (int j = 0; j < lst2.size(); j++) {
                if (lst1.get(i) == lst2.get(j)) {
                    isExist = true;
                    break;
                }
            }
            if (isExist && !result.contains(lst1.get(i))) {
                result.add(lst1.get(i));
            }
        }
        Collections.sort(result);
        System.out.println("result = " + result);
    }
}
