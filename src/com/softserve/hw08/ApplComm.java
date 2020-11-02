package com.softserve.hw08;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ApplComm {
    public static void main(String[] args) {
        List<Integer> lst1 = Arrays.asList(1, 2, 1, 7, 2, 3);
        List<Integer> lst2 = Arrays.asList(3, 3, 2, 5, 2, 1, 1);
        //
        System.out.println("lst1 = " + lst1);
        System.out.println("lst2 = " + lst2);
        //
        // 2.
        Set<Integer> common = new HashSet<>(lst1);
        common.retainAll(lst2);
        System.out.println("common = " + common);
    }

}
