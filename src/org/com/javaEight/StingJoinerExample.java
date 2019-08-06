package org.com.javaEight;

import java.util.StringJoiner;

public class StingJoinerExample {

	public static void main(String[] args) {

		StringJoiner stringJoiner =  new StringJoiner(".");
		stringJoiner.add("Hello").add("India");
		System.out.println(stringJoiner);
		
	}

}
