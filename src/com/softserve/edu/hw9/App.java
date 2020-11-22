package com.softserve.edu.hw9;

import java.util.*;

public class App {
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    
    public static void main(String[] ARGS) {
        
        List<String> numbers = new ArrayList();
        List<String> list093 = new ArrayList();
        List<String> list050 = new ArrayList();
        List<String> list067 = new ArrayList();
        List<String> list044 = new ArrayList();
        List<String> listLoc = new ArrayList();
        List<String> listErr = new ArrayList();
        
        Map<String, List> groupedNumbers = new HashMap();
        
        groupedNumbers.put("093", list093);
        groupedNumbers.put("050", list050);
        groupedNumbers.put("067", list067);
        groupedNumbers.put("044", list044);
        groupedNumbers.put("loc", listLoc);
        groupedNumbers.put("err", listErr);
        
        App appl = new App();
        
        numbers.add("093 987 65 43");
        numbers.add("(050)1234567");
        numbers.add("12-345");
        numbers.add("067-21-436-57");
        numbers.add("050-2345678");
        numbers.add("0939182736");
        numbers.add("224-19-28");
        numbers.add("(093)-11-22-334");
        numbers.add("044 435-62-18");
        numbers.add("721-73-45");
        
        for (int i = 0; i < numbers.size(); i++) {
            
            numbers.set(i, appl.clearFormat(numbers.get(i)));
            
            if (numbers.get(i).substring(0, 3).equals("093") & numbers.get(i).length() == 10) {
                list093.add(numbers.get(i).substring(3));
            } else if (numbers.get(i).substring(0, 3).equals("050") & numbers.get(i).length() == 10) {
                list050.add(numbers.get(i).substring(3));
            } else if (numbers.get(i).substring(0, 3).equals("067") & numbers.get(i).length() == 10) {
                list067.add(numbers.get(i).substring(3));
            } else if (numbers.get(i).substring(0, 3).equals("044") & numbers.get(i).length() == 10) {
                list044.add(numbers.get(i).substring(3));
            } else if ((!numbers.get(i).substring(0).equals("0")) & numbers.get(i).length() == 7) {
                listLoc.add(numbers.get(i));
            } else
                listErr.add(numbers.get(i));
        }
        
        System.out.println("Map - " + Arrays.asList(groupedNumbers));
        
    }
    
    public String clearFormat(String str) {
        str = str.replace(" ", "").replace("(", "").replace(")", "").replace("-", "").trim();
        return str;
    }
}