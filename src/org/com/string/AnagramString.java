package org.com.string;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		String strValueOne = "Keep";
		String strValueTwo = "Peek";

		checkAngramString(strValueOne, strValueTwo);
	}

	private static void checkAngramString(String strValueOne, String strValueTwo) {

		String s1 = strValueOne.replace("\\s", "");
		String s2 = strValueTwo.replace("\\s", "");

		boolean status = true;
		if (s1.length() != s2.length()) {
			status = false;
		} else {
			char[] arrayS1 = s1.toLowerCase().toCharArray();
			char[] arrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arrayS1);
			Arrays.sort(arrayS2);
			status = Arrays.equals(arrayS1, arrayS2);

		}

		if (status)
			System.out.println(s1 + " and " + s2 + " are anagram");
		else
			System.out.println(s1 + " and " + s2 + " are anagram");

	}

}
