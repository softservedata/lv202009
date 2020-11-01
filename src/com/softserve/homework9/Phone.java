package com.softserve.homework9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
	public static void main(String[] args) {
		Map<Object, String> phoneNum = new HashMap<>();
		phoneNum.put(1, "093 987 65 43");
		phoneNum.put(2, "(050)1234567");
		phoneNum.put(3, "12-345");
		phoneNum.put(4, "067-21-436-57");
		phoneNum.put(5, "050-2345678");
		phoneNum.put(6, "0939182736");
		phoneNum.put(7, "224-19-28");
		phoneNum.put(8, "(093)-11-22-334");
		phoneNum.put(9, "044 435-62-18");
		phoneNum.put(10, "721-73-45");

//        for (Map.Entry<Object, String> entry : phoneNum.entrySet()) {
//            System.out.println("phone = " + entry.getValue());
//        }

		for (Iterator<Entry<Object, String>> i = phoneNum.entrySet().iterator(); i.hasNext();) {
			Map.Entry<Object, String> entry = i.next();
			// for (int j = 1; j < phoneNum.size(); j++) {
			// System.out.println("phone = " + j + " " + entry.getValue());
			// }

			// System.out.println("phone = " + entry.getValue());

			// String pattern = "(050|044|093|067)[^()][ -a-zA-Z_0-9]+";

			String pattern = "050|044|093|067";
			Pattern p = Pattern.compile(pattern);
			Matcher m = p.matcher(entry.getValue());

			String pattern1 = "[ |-]+[ -a-zA-Z_0-9]+";
			Pattern p1 = Pattern.compile(pattern1);
			Matcher m1 = p1.matcher(entry.getValue());

//			while (m.find()) {
//				System.out.print(entry.getValue().substring(m.start(), m.end()) + " = " + "\n");
//			}

			while (m.find() && m1.find()) {
				System.out.print(entry.getValue().substring(m.start(), m.end()) + " = "
						+ entry.getValue().substring(m1.start(), m1.end()) + "\n");
			}

		}

	}
}