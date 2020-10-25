package com.softserve.edu.hw8;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 10, 2, 20, 2, 2, 2, 2));
            ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 10, 20, 2));

            ArrayList<Integer> list3 = new ArrayList<Integer>();
            for (Integer a : list1) {
                if (list2.contains(a) && !list3.contains(a)) {
                    list3.add(a);
                }
            }

            System.out.println("New list: " + list3);
            System.out.println("New list: " + Arrays.toString(list3.toArray()).
                    replace("[", "").replace("]", ""));
        }
}