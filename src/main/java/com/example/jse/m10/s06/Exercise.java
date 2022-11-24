package com.example.jse.m10.s06;

import java.util.HashSet;
import java.util.Set;

public class Exercise {
	/**
	 * Generate an array that contains only once each value (possibly duplicated) in
	 * the input array
	 * 
	 * <pre>
	 * Example: { 12, 53, 12, 35 } -> { 12, 35, 53 }
	 * 
	 * Note: Result is not expected in any specific order
	 * </pre>
	 * 
	 * @param data an array with duplicates
	 * @return the original array (but wrapped values) stripped of duplicates
	 */
	public Integer[] singles(int[] data) {
		Set<Integer> result = new HashSet<>(); // uso TreeSet se voglio gli elementi ordinati
		
		for (int i = 0; i < data.length; i++) {
			result.add(data[i]);
		}
		return result.toArray(new Integer[result.size()]);
	}
}
