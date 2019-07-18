package org.com.number;

public class LargestSmallestNumber {
	public static void main(String[] args) {

		int[] numbers = new int[] { 10, 2, 35, 21, 43, 51, 632, 121, 34, 44, 53, 692, 6 };
		findSamllAndMaxNumber(numbers);

	}

	private static void findSamllAndMaxNumber(int[] numbers) {

		int min = 0;
		int max = 1000;
		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] < max)
				max = numbers[i];
			if (numbers[i] > min)
				min = numbers[i];
		}

		System.out.println("Maximum Number in List " + max);
		System.out.println("Minimum Number In List" + min);

	}

}
