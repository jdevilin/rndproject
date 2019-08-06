package org.com.javaEight;

import java.util.stream.LongStream;

/**
 * @author Saurabh
 *
 */
public class FactorialStreams {

	private static long getFactorialStreams(long n) {
		return LongStream.rangeClosed(1, n).reduce(1, (long a, long b) -> a * b);

	}

	public static void main(String[] args) {
		Long longValue = FactorialStreams.getFactorialStreams(10);
		System.out.println(longValue);
	}

}
