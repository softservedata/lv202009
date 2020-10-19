package com.softserve.edu09.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ApplSort {
    public static void main(String[] args) {
        /*-
        int[] x = new int[10];
        Random rand = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextInt(20);
        }
        //System.out.println("x = " + x);
        System.out.println("Original Array:\n" 
                + Arrays.toString(x)
                    .replace("[", "").replace("]", ""));
        Arrays.sort(x);
        System.out.println("Sorted Array: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  ");
        }
        */
        /*-
        String[] arrStr = { "222", "1", "1111", "10" };
        //System.out.println("arrStr = " + arrStr);
        System.out.println("arrStr = " + Arrays.toString(arrStr));
        //
        List<String> lstStr = Arrays.asList(arrStr);
        System.out.println("lstStr = " + lstStr);
        arrStr[1] = "01";
        //lstStr.clear(); // Runtime Error
        System.out.println("Changed lstStr = " + lstStr);
        Arrays.sort(arrStr);
        //Collections.sort(lstStr);
        //lstStr.sort((a,b)->a.compareTo(b));
        System.out.println("Sorted lstStr = " + lstStr);
        */
        /*-
        List<String> lstStr = new ArrayList<>();
        lstStr.add("222");
        lstStr.add("1");
        lstStr.add("1111");
        lstStr.add("10");
        System.out.println("Original: lstStr = " + lstStr);
        lstStr.add(2,"3333");
        System.out.println("add 3333: lstStr = " + lstStr);
        Collections.sort(lstStr);
        System.out.println("Sorted: lstStr = " + lstStr);
        */
        /*-
        List<Student> lstStr = new ArrayList<>();
        lstStr.add(new Student(143, "Stepan"));
        lstStr.add(new Student(234, "Petro"));
        lstStr.add(new Student(233, "Petro"));
        lstStr.add(new Student(235, "Petro"));
        lstStr.add(new Student(567, "Ira"));
        lstStr.add(new Student(123, "Ivan"));
        System.out.println("Original: lstStr = " + lstStr);
        //Collections.sort(lstStr);
        //Collections.sort(lstStr, new Student.ByName());
        //Collections.sort(lstStr, new Student.ById());
        Collections.sort(lstStr, new Student.ByNameId());
        System.out.println("Sorted: lstStr = " + lstStr);
        */
        //
        // /*-
        List<String> list = new ArrayList<>();
        list.add("First element");
        list.add("Second element");
        list.add(0, "One more first element");
        list.add("Second element");
        //
        //System.out.println("Origin list = " + list);
//        System.out.println("\tOrigin list");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println("element[" + i + "] = " + list.get(i));
//        }
        //
//        String element2 = list.get(1);
//        System.out.println("element[2] = " + element2);
        for (String current : list) {
            System.out.println(current);
        }
        //
        /*-
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            System.out.println(current);
        }
        */
        /*-
        // Invalid Approach
        System.out.println("\tDelete Element contains 'Second'");
        //int n = list.size();
        for (int i = 0; i < list.size(); i++) {
        //for (int i = 0; i < n; i++) {
            System.out.println(list.get(i));
            if (list.get(i).contains("Second")) {
                list.remove(i); // Architecture Error
            }
        }
        //
        System.out.println("\nDeleting ...");
        for (String current : list) {
            System.out.println(current);
            if (current.contains("Second")) {
                list.remove(current);
            }
        }
        */
        /*-
        System.out.println("\nDeleting ...");
        Iterator<String> iterat = list.iterator();
        while(iterat.hasNext()) {
            String current = iterat.next();
            System.out.println(current);
            if (current.contains("Second")) {
                iterat.remove();
            }
        }
        //
        System.out.println("\tUpdated list");
        for (String current : list) {
            System.out.println(current);
        }
        */
    }
}
