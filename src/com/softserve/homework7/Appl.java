package com.softserve.homework7;

import java.util.*;

public class Appl {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(12,22,55,44,13,27,27,27,12,12));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(22,12,44,55,27,13,13,22,55));
        Set<Integer> setForFirstList = new HashSet<>(firstList);
        Set<Integer> setForSecondList = new HashSet<>(secondList);

        if(setForFirstList.equals(setForSecondList)){
            System.out.println("Collections have the same content");
            System.out.println(setForFirstList);
            System.out.println(setForSecondList);
        } else {
            System.out.println("Collections are different!");
            Set<Integer> resultSet;
            if(setForFirstList.size()>setForSecondList.size()){
                setForFirstList.removeAll(setForSecondList);
                resultSet = setForFirstList;
            } else {
                setForSecondList.removeAll(setForFirstList);
                resultSet = setForSecondList;
            }
            System.out.println("Different content: " + resultSet);
        }
    }
}
