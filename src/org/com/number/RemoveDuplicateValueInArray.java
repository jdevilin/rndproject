package org.com.number;

import java.util.Arrays;

public class RemoveDuplicateValueInArray {

	public static void main(String[] args) {

		int[] numbers = new int[] { 1, 2, 3, 2, 4, 5, 6, 1, 3, 4, 5,6,6 };
		removeDuplicateValue(numbers);
	}

	private static void removeDuplicateValue(int[] numbers) {
		System.out.println("Array With Duplicate Value :");
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
		
		
		int noOfUniqueElement = numbers.length;
		for (int i = 0; i < noOfUniqueElement; i++) {
			for (int j = i + 1; j < noOfUniqueElement; j++) {
				if (numbers[i] == numbers[j]) {
					numbers[j] = numbers[noOfUniqueElement - 1];
					noOfUniqueElement--;
					j--;
				}
			}
		}
		System.out.println(noOfUniqueElement);

		int[] arrayWithoutDuplicates = Arrays.copyOf(numbers, noOfUniqueElement);
		System.out.println("**************************");
		System.out.println("Array Without Duplicate Element");
		for (int i=0; i<arrayWithoutDuplicates.length;i++)
			System.out.print(numbers[i]);
		
	}
}
