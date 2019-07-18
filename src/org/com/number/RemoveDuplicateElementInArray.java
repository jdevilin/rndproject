package org.com.number;

import java.util.Arrays;

/**
 * @author saurabh
 * Code for remove duplicate element in to array
 *
 */
public class RemoveDuplicateElementInArray {

	public static void main(String[] args) {

		int[] numbers = new int[] { 0,1, 2, 3, 2, 4, 5, 6, 1, 3, 4, 5, 6, 6, 7, 8, 9 };

		int[] newResult = removeDuplicateElement(numbers);

		System.out.println(Arrays.toString(newResult));

	}

	private static int[] removeDuplicateElement(int[] numbers) {
		Arrays.sort(numbers);
		/*
		 * for (int i = 0; i < numbers.length; i++) System.out.println(numbers[i]);
		 * 
		 * System.out.println("*****************************");
		 */
		int[] result = new int[numbers.length];
		int previous = numbers[0];
		result[0] = previous;

		for (int i = 1, j = 1; i < numbers.length; i++) {
			int ch = numbers[i];
			if (previous != ch) {
				result[j] = ch;
				j++;
			}

			previous = ch;
		}

		return result;
	}

}
