package com.softserve.edu.homework14;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonUtils {
    private List<Employee> employees;

    public List<Employee> parse(String json) {
        json=json.trim().replace(" ","").toLowerCase();
        employees=new ArrayList();
            if (!(json.charAt(0)=='[')&&(json.charAt(json.length()-1)==']')){
                throw new IllegalArgumentException ("Incorrect json");
            }
        System.out.println(json);
        String regexOut="";
        String pattern = "[\\[\\]]+|[{}]+";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(json);
        while (m.find()) {
            regexOut=regexOut.concat(json.substring(m.start(), m.end()));
        }
        for (int i=0; i<regexOut.length()-1;i++) {
            if (i>0&&i<regexOut.length()-1&&(regexOut.charAt(i) == '{') && !(regexOut.charAt(i+1) == '}')) {
                throw new IllegalArgumentException("Incorrect json: "+regexOut.charAt(i));
            } else if (i>0&&i<regexOut.length()-2&&(regexOut.charAt(i) == '}') && !(regexOut.charAt(i+1) == '{')) {
                throw new IllegalArgumentException("Incorrect json: "+regexOut.charAt(i));
            }
        }
        p = Pattern.compile("\\{\"[a-z]+[\\W]+[a-z0-9\\W]+\"\\}");
        m = p.matcher(json);
        while (m.find()) {
            System.out.print(json.substring(m.start(), m.end()));
        }
       // Gson gson = new Gson();
        //employees.add(gson.fromJson(json, Employee.class));
       // System.out.println(Arrays.asList(employees.get(0)));

       // employees.add(new Employee(0,"",""));
        return employees;
    }

    public static void main (String [] ARGS) {

        String Employee = "  [{\"id\":  \"123\",\"name   \":\"Ivan\",\"email\":\"ivan@gmail.com\"}," +
                "{\"id\":\"124\",\"name\":\"Petro\"}," +
                "{\"id\":\"125\",\"name\":\"Olena\"}]";
        JsonUtils json=new JsonUtils();
        json.parse(Employee);

    }
}
