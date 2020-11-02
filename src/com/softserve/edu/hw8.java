package com.softserve.edu;

import java.util.ArrayList;
import java.util.Collections;

public class hw8 {
    /*-----------------------------------------*/
    // Task 8
/*
Homework 8 (from 22.10.2020)
1) Задати два списки (ArrayList), які містять цілі значення.
   На підставі цих двох лістів створити новий List, який містить лише спільні елементи з обох заданих списків.
Для коду використати пакет com.softserve.homework8
 */
    public static void main(String[] args) {
        // Collection (List)
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(2, 200);

        list2.add(1);
        list2.add(3);
        list2.add(1);
        list2.add(2);
        list2.add(1);
        list2.add(1);

        System.out.println("Array1: " + list1);
        System.out.println("Array2: " + list2);

//        Collections.sort(list1);
//        Collections.sort(list2);
//
//        System.out.println("Array1 sorted: " + list1);
//        System.out.println("Array2 sorted: " + list2);

        ArrayList<Integer> result = commonElements(list1, list2);
        System.out.println("Common elements are: \n" + result);
    }

    public static ArrayList<Integer> commonElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> resultList = new ArrayList<>();
        for (Integer number : list1) {
            if (list2.contains(number)) {
                resultList.add(number);
                list2.remove(number);
            }
        }
        return resultList;
    }
}
