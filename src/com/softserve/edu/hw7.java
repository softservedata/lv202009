package com.softserve.edu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class hw7{
    public static void main(String[] args) {

        // Task 7
//        1) Задати два списки (ArrayList), які містять цілі значення.
//        Кількість елементів у списках може бути різною, а самі елементи можуть дублюватися.
//        Вияснити, чи контент елементів у списках співпадає.
//        Наприклад, вміст наступних списків є однаковий [1, 2, 1, 2, 3] та [3, 3, 2, 2, 1, 1]
//        Для коду використати пакет com.softserve.homework6


        // Collection (List)
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(2, 200);

        list2.add(3);
        list2.add(3);
        list2.add(2);
        list2.add(2);
        list2.add(1);
        list2.add(1);

        System.out.println("Array1: " + list1);
        System.out.println("Array2: " + list2);

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println("Array1 sorted: " + list1);
        System.out.println("Array2 sorted: " + list2);

        // System.out.println("list equals list2: " + (list1.containsAll(list2) && list2.containsAll(list1)));

        Set<Integer> setList1 = new HashSet<>(list1);
        Set<Integer> setList2 = new HashSet<>(list2);

        if (setList1.equals(setList2)){
            System.out.println("Lists have the same content");
            //System.out.println(setList1);
            //System.out.println(setList2);
        } else {
            System.out.println("Content in lists are not the same");
            Set<Integer> resultSet;
            if (setList1.size() > setList2.size()) {
                setList1.removeAll(setList2);
                resultSet = setList1;
            } else {
                setList2.removeAll(setList1);
                resultSet = setList2;
            }
            // System.out.println("Differences are: " + resultSet);
        }
    }
    }

