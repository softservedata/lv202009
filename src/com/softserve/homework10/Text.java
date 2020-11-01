package com.softserve.homework10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
	private Matcher m;

	public static void main(String[] args) {

		String pattern = "[a-z]";
		Pattern p = Pattern.compile(pattern);
		String text = "'('text, new')','{'home,work'}','['square brackets']'";

		Matcher m = p.matcher(text);

		while (m.find()) {
			System.out.print(text.substring(m.start(), m.end()));

		}
	}

	public boolean verifyBrackets(String text) {
		if (text.contains("()","() [] {}","{(())}","(\ ()")) {
		

	}

}
}
