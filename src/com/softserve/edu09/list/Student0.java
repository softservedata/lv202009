package com.softserve.edu09.list;

import java.util.Comparator;

public class Student0 implements Comparable<Student0> {
    
    public static class ByNameId implements Comparator<Student0> {
        @Override
        public int compare(Student0 st1, Student0 st2) {
            int result = st1.getName().compareTo(st2.getName());
            if (result == 0) {
                result = - st1.getId() + st2.getId();
            }
            return result;
        }
    }
    
    public static class ByName implements Comparator<Student0> {
        @Override
        public int compare(Student0 st1, Student0 st2) {
            return -st1.getName().compareTo(st2.getName());
        }
    }
    
    public static class ById implements Comparator<Student0> {
        @Override
        public int compare(Student0 st1, Student0 st2) {
            return st1.getId() - st2.getId();
        }
    }
    
    private int id;
    private String name;

    public Student0() {
        id = -1;
        name = "";
    }
    
    public Student0(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student0 student) {
        return name.compareTo(student.getName());
        //return id - student.getId();
    }
    
    @Override
    public String toString() {
        return "\nStudent [id=" + id
                + ", name=" + name
                + "]";
    }

}
