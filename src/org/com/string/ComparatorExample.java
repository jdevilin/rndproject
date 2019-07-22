package org.com.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {

		ArrayList<StudentComparator> arrList = new ArrayList<StudentComparator>();

		StudentComparator studentOne = new StudentComparator(1, "Sameer", "23", "44", 20);
		arrList.add(studentOne);
		StudentComparator studentTwo = new StudentComparator(2, "Sachin", "24", "7/80 GramPur", 19);
		arrList.add(studentTwo);
		StudentComparator studentThree = new StudentComparator(2, "Seema", "25", "79/80 Hosirpur", 21);
		arrList.add(studentThree);
		StudentComparator studentfour = new StudentComparator(2, "Zarra", "25", "79/80 Hosirpur", 18);
		arrList.add(studentfour);
		StudentComparator studentfive = new StudentComparator(2, "Abhishek", "25", "79/80 Hosirpur", 24);
		arrList.add(studentfive);
		System.out.println("Before Sort Array ");
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
		System.out.println("After Sort Array");
		Collections.sort(arrList, new CompratorImplemention());
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

	}

}
