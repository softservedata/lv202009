package com.softserve.edu11;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
    
    public static class ById implements Comparator<Employee> {
        @Override
        public int compare(Employee em1, Employee em2) {
            return em1.getId() - em2.getId();
        }
    }
    
    public static class ByName implements Comparator<Employee> {
        @Override
        public int compare(Employee em1, Employee em2) {
            return em1.getName().compareTo(em2.getName());
        }
    }
    
    private int id;
    private String name;

    public Employee() {
        id = 0;
        name = "";
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) 
                || (getClass() != obj.getClass())) {
            return false;
        }
        Employee other = null;
        if (obj instanceof Employee) {
            other = (Employee) obj;
        }
        if ( (other == null) || (id != other.id)
                || ((name == null) && (other.name != null))
                || ((name != null) && (other.name == null)) ) {
            return false;
        }
        if ((name == null) && (other.name == null)) {
            return true;
        }
        return name.equals(other.name);
    }
    
    @Override
    public int compareTo(Employee employee) {
        return id - employee.id;
    }
    
    @Override
    public String toString() {
        return "\nEmployee [id=" + id + ", name=" + name + "]";
    }
    
}
