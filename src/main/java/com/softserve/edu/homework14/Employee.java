package com.softserve.edu.homework14;

import javax.annotation.Nullable;
import java.util.Objects;

public class Employee {
    private int id;
    private String name;
    private String email;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name) &&
                Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int)this.id;
        result = prime * result + ((this.getEmail() == null) ? 0 : this.getEmail().hashCode());
        result = prime * result + ((this.getName() == null) ? 0 : this.getEmail().hashCode());
        return result;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee(int id, String name,@Nullable String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
