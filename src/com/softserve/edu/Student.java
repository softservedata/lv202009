package com.softserve.edu;

// CTR+SHIFT+F
public class Student { // Entity, POJO, Bean, DTO
    private String name; // null
    private int age;

    // Overload
    public Student() {
        name = "";
        age = 0;
    }

    // Overload
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void print() {
        System.out.println("Hello");
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Check
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name
                + ", age=" + age
                + "]";
    }

    
}