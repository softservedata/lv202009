package com.softserve.edu06;

public class AppComp {
    public static void main(String[] args) {
        //
        Student student1 = new Student("Ira", 25);
        Student student2 = new Student("Ira", 25);
        System.out.println("student1 == student2 : " + (student1 == student2)); // Architecture Error
        System.out.println("student1.equals(student2) : " + student1.equals(student2));
        System.out.println("student1.hashCode() = " + student1.hashCode());
        System.out.println("student2.hashCode() = " + student2.hashCode());
        //
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
    }
}