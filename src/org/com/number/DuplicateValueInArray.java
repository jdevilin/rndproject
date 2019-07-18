package org.com.number;

import java.util.ArrayList;

//Program to find duplicate element in array

public class DuplicateValueInArray {

	public static void main(String[] args) {
		int[] numbers = new int[] { 0, 1, 2, 3, 2, 4, 5, 6, 1, 3, 4, 5, 6, 6,7,8,9 };
		
		findDuplicateValueInArray(numbers);
		
	}

	private static void findDuplicateValueInArray(int[] numbers) {
	    ArrayList arr = new ArrayList();
		for(int i=0;i<numbers.length;i++)
			for(int j=i+1; j<numbers.length;j++) {
				if(numbers[i]==numbers[j] && !arr.contains(numbers[i]))
					arr.add(numbers[i]);
			}
		
		System.out.println("Repaeted Number in to array");
		for(int i=0;i<arr.size();i++)
			System.out.println(arr.get(i));
	}
}
