package com.softserve.homework8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Appl {

    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 22, 3, 1, 44, 13, 27, 44, 22, 27, 12, 12, 88, 22));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(22, 12, 44, 55, 27, 1, 13, 22, 1, 3));
        List<Integer> result = createListWithSameElementsFromTwoLists(firstList, secondList);
        System.out.println("List of same elements: \n" + result);
    }

    public static List<Integer> createListWithSameElementsFromTwoLists(List<Integer> firstList,
                                                                       List<Integer> secondList) {
        List<Integer> resultList = new ArrayList<>();
        for (Integer number : firstList) {
            if (secondList.contains(number)) {
                resultList.add(number);
                secondList.remove(number);
            }
        }
        return resultList;
    }
}
