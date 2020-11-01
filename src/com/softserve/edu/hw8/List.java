package com.softserve.edu.hw8;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(400, 1, 70, 2, 2, 1, 400));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 70, 2, 400));
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        
        for (Integer i : list1) {
            if (list2.contains(i) && !list3.contains(i)) {
                list3.add(i);
            }
        }
        
        System.out.println("List 3 with the same values: " + list3);
        
    }
}
