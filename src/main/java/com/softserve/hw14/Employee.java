package com.softserve.hw14;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	private Map<String, String> employee;
	private String id;
	private String name;
	private String email;

	public Employee() {
		init();
	}

	private void init() {
		employee = new HashMap<>();
		employee.put("123", "Ivan");
		employee.put("124", "Petro");
		employee.put("125", "Zahar");
		employee.put("126", "Olga");
		employee.put("127", "Mila");
		employee.put("128", "Natan");
		employee.put("129", "Iren");

		id = "";
		name = "";
		email = "";

		for (Map.Entry<String, String> entry : employee.entrySet()) {
			id = id + entry.getKey();
			name = name + entry.getValue();
		}
		System.out.println("\tid = " + id);
		System.out.println("\tname = " + name);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((employee == null) ? 0 : employee.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employee == null) {
			if (other.employee != null)
				return false;
		} else if (!employee.equals(other.employee))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Employee(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public Map<String, String> getEmployee() {
		return employee;
	}

	public void setEmployee(Map<String, String> employee) {
		this.employee = employee;
	}

}
