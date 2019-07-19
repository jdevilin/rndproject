package org.com.string;

public class StringPoolCheck {

	public static void main(String[] args) {
		
		String str1 = new String("Hello");
		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = new String("Hello");
		
		System.out.println("*************************");
		System.out.println(str1==str2);
		System.out.println("*************************");
		System.out.println(str1.equals(str2));
		System.out.println("*************************");
		System.out.println(str2==str3);
		System.out.println("*************************");
		System.out.println(str2.equals(str3));
		System.out.println("*************************");
		System.out.println(str1==str4);
		System.out.println("*************************");
		System.out.println(str1.equals(str4));

	}

}
