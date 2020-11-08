package com.softserve.edu.homework7;


import com.softserve.edu.homework5.Product;
import com.softserve.edu.homework6.*;

import java.util.*;

public class Appl7 {

    public static void main (String [] ARGS){
        List<NumbersList> list1=new ArrayList();
        List<NumbersList> list2=new ArrayList();

        list1.add(new NumbersList(1));
        list1.add(new NumbersList(3));
        list1.add(new NumbersList(22));
        list1.add(new NumbersList(1));
        list1.add(new NumbersList(9));
        list2.add(new NumbersList(22));
        list2.add(new NumbersList(3));
        list2.add(new NumbersList(3));
        list2.add(new NumbersList(9));
        list2.add(new NumbersList(9));
        list2.add(new NumbersList(1));
        System.out.println("Array1: "+Arrays.asList(list1));
        System.out.println("Array2: "+Arrays.asList(list2));
        Collections.sort(list1);
        Collections.sort(list2);
        Set set1=new TreeSet();
        Set set2=new TreeSet();
        set1.addAll(list1);
        set2.addAll(list2);
        System.out.println(set1 + "\n"+set2);
        if (set1.equals(set2)){
            System.out.println("hash1="+set1.hashCode()+"  \t hash2="+set2.hashCode());
            System.out.println("Numbers in the lists are the same");
        } else System.out.println("Numbers in the lists are different");


    }
}
