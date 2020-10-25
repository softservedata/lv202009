package com.softserve.edu.hw7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 10, 2, 20, 2, 2, 2, 2));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 10, 20, 2));

        System.out.println("List 1 equals List2: " + (list1.containsAll(list2) && list2.containsAll(list1)));
    }
}