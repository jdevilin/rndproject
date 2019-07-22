package org.com.string;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComprableExample {

	public static void main(String[] args) {
		ArrayList<StudentComparable> arrList = new ArrayList<>();
		StudentComparable studentOne = new StudentComparable(1, "Sameer", "23", "44", 20);
		arrList.add(studentOne);
		StudentComparable studentTwo = new StudentComparable(2, "Sachin", "24", "7/80 GramPur", 19);
		arrList.add(studentTwo);
		StudentComparable studentThree = new StudentComparable(2, "Seema", "25", "79/80 Hosirpur", 21);
		arrList.add(studentThree);
		System.out.println("Before Sort Array ");
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("After Sort Array");
		Collections.sort(arrList);
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}

}
