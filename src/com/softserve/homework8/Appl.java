package com.softserve.homework8;

import java.util.ArrayList;
import java.util.Arrays;

public class Appl {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 1, 6, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 3, 2, 2, 5, 1, 1));

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        if(list1.equals(list2)){
            System.out.println("List 1 and 2 are equals");
        } else {
            list1.retainAll(list2);

            System.out.println("Same elements in the lists: " + list1);
        }

    }
}
