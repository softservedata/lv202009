package com.softserve.edu11;

import java.util.Set;
import java.util.TreeSet;

public class FindDups {
    public static void main(String[] args) {
        /*-
        Set<String> s = new HashSet<>();
        //Set<String> s = new TreeSet<>();
        //List<String> s = new LinkedList<>();
        for (int i = 0; i < args.length; i++) {
            if (!s.add(args[i])) {
                System.out.println("Duplicate detected: " + args[i]);
            }
        }
        System.out.println("Elements: " + s);
        */
        // /*-
        //Set<Employee> s = new HashSet<>();
        //Set<Employee> s = new TreeSet<>();
        //Set<Employee> s = new TreeSet<>(new Employee.ByName());
//        Set<Employee> s = new TreeSet<>((Employee em1, Employee em2) -> {
//            return em1.getName().compareTo(em2.getName());
//        });
        Set<Employee> s = new TreeSet<>((em1, em2) -> em1.getName().compareTo(em2.getName()));
        //
        boolean b;
        b = s.add(new Employee(123, "Ivan"));
        System.out.println("s.add(new Employee(123, Ivan)) = " + b);
        b = s.add(new Employee(120, "Petro"));
        System.out.println("s.add(new Employee(124, Petro)) = " + b);
        b = s.add(new Employee(123, "Ivan"));
        System.out.println("s.add(new Employee(123, Ivan)) = " + b);
        //
        System.out.println("Employee: " + s);
        //        for (Employee current : s) {
        //            System.out.println("employee: " + current + "  hashCode():" + current.hashCode());
        //        }
        // */
    }
}
