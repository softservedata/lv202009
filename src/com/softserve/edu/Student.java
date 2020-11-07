package com.softserve.edu;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    // def constr
    public Student() {
        name = "";
        age = 0;
    }

    // constructor generated
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }



    // getters/setters generated
    public String getName() {
        // code
        return name;
    }

    public void setName(String name) {
        // code
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     // equals + hash code

    // equals - порівнює 2 обєкти
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if ((o == null) || (getClass() != o.getClass())) {
            return false;
        }

        Student other = null;
        if (o instanceof Student) { // ще одна перевірка на тип - чи він дійсно типу Студента?
            other = (Student) o;
        }

        if ( (other == null) || (age != other.age)
                || ((name == null) && (other.name != null))
                || ((name != null) && (other.name == null)) ) {
            return false;
        }

        if ((name == null) && (other.name == null)) {
            return true;
        }
        return name.equals(other.name);
    }



//        if (!(o instanceof Student))
//            return false;
//        Student student = (Student) o;
//        return getAge() == student.getAge() &&
//                getName().equals(student.getName());
//    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }


    // to string
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // compare to

}
