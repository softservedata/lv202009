package com.softserve.edu;

public class Student {
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String name;
	public int age;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
