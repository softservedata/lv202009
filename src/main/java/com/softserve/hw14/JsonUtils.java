package com.softserve.hw14;



import java.util.List;

import com.fasterxml.jackson.databind.util.JSONPObject;

public class JsonUtils {
	public List<Employee> parse(String json) {
		JSONPObject employee = new JSONPObject("[{\"id\":\"123\",\"name\":\"Ivan\",\"email\":\"ivan@gmail.com\"},{\"id\":\"124\",\"name\":\"Petro\"}]", json, null);
		System.out.println(employee.getValue());
		return null;


	}

}
