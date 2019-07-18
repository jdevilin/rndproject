package org.com.number;

import java.util.Arrays;

/**
 * @author Saurabh
 * QuickSort Program 
 *
 */
public class QuickSortAlgorthim {

	public static void main(String[] args) {

		int[] unsorted = { 6, 5, 3, 1, 8, 7, 2, 4 };

		System.out.println("Unsorted Array " + Arrays.toString(unsorted));

		QuickSort algorthim = new QuickSort();
		algorthim.sort(unsorted);

		System.out.println("Sorted Array " + Arrays.toString(unsorted));

	}

}
