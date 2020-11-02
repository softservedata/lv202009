package com.softserve.hw07;

import java.util.Arrays;
import java.util.List;

public class ApplContent {

    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(1, 2, 1, 2, 3);
        List<Integer> lst2 = Arrays.asList(3, 3, 2, 5, 2, 1, 1);
        //
        // 1.
        boolean isEquals = true;
        for (int i = 0; i < lst1.size() && isEquals; i++) {
            boolean isExist = false;
            for (int j = 0; j < lst2.size(); j++) {
                if (lst1.get(i) == lst2.get(j)) {
                    isExist = true;
                    break;
                }
            }
            isEquals = isEquals && isExist;
        }
        //
        for (int j = 0; j < lst2.size() && isEquals; j++) {
            boolean isExist = false;
            for (int i = 0; i < lst1.size(); i++) {
                if (lst1.get(i) == lst2.get(j)) {
                    isExist = true;
                    break;
                }
            }
            isEquals = isEquals && isExist;
        }
        //
        System.out.println("isEquals = " + isEquals);
    }
}
