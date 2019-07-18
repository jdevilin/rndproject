package org.com.number;

/**
 * @author Saurabh
 * 
 *         In this Program we find to pairs of number which equal to given
 *         numbers complexity of this solution is O(n^2)
 *
 */
public class FindPairsEqualToGivenNumber {

	public static void main(String[] args) {
		int[] numbers = new int[] { 0, 1, 2, 3, 2, 4, 5, 6, 1, 3, 4, 5, 6, 6 };
		findPairs(numbers, 5);

	}

	private static void findPairs(int[] numbers, int sum) {
		for (int i = 0; i < numbers.length; i++) {
			int first = numbers[i];
			for (int j = i + 1; j < numbers.length; j++) {
				int second = numbers[j];
				if ((first + second) == sum) {
					System.out.print("("+first+","+ second+")");
				}

			}
		}

	}
}
