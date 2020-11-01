package com.softserve.edu.hw7;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(400, 1, 70, 2, 2, 1, 400));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 70, 2, 300));
        
        Boolean equals = list1.containsAll(list2) && list2.containsAll(list1);
        String result = "";
        
        if (equals == true) {
            result ="coincides";
        }
        if (equals == false) {
            result ="does not match";
        }
        System.out.println("List 1 and List2 - " + result);
    }
}
