package com.softserve.edu.homework8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Appl8 {

    public static void main(String [] ARGS){
    List<Integer> list1=new ArrayList();
    List<Integer> list2=new ArrayList();
    List<Integer> newList=new ArrayList<>();
        list1.add(7);
        list1.add(3);
        list1.add(22);
        list1.add(1);
        list1.add(34);
        list2.add(22);
        list2.add(3);
        list2.add(5);
        list2.add(9);
        list2.add(11);
        list2.add(1);
        System.out.println("List1: "+Arrays.asList(list1));
        System.out.println("List2: "+Arrays.asList(list2));

        for (int i : list1) {
            for (int j : list2) {
                if (i==j){
                    newList.add(i);
                }
            }
        }
        System.out.println("New list: "+Arrays.asList(newList));
}
}
