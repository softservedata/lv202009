package com.softserve.homework7;

import com.softserve.homework5.Product;
import com.softserve.homework6.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

public class Appl {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 1, 6, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 3, 2, 2, 5, 1, 1));

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        if(list1.equals(list2)){
            System.out.println("List 1 and 2 are equals");
        } else {
            HashSet<Integer> set1 = new HashSet<>();
            set1.addAll(list1);
            HashSet<Integer> set2 = new HashSet<>();
            set2.addAll(list2);

            if(set1.equals(set2))
            {
                System.out.println("List 1 and 2 have the same content");
            } else {
                HashSet<Integer> set1Copy = new HashSet<>(set1);
                set1Copy.removeAll(set2);
                set2.removeAll(set1);

                if(!set1Copy.isEmpty()){
                    System.out.println("Elements which are present in list 1 and noy present in list 2: " + set1Copy);
                }
                if(!set2.isEmpty()){
                    System.out.println("Elements which are present in list 2 and noy present in list 1: " + set2);
                }
            }
        }

    }
}
