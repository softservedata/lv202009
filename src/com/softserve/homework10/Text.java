package com.softserve.homework10;

public class Text {

	public static void main(String[] args) {

		String text = "'('Our, new')','{' home,' work'}','[' with square brackets']'";
		String replacedText = verifyBrackets(text);
		System.out.println(replacedText);

}

	private static String verifyBrackets(String text) {
		String replacedText = text.replaceAll("[()',{}\\]\\[]", "");
		if (replacedText.contains("Our new home work with square brackets"));
		return replacedText;
	}
}
