package com.example.jse.m10.s03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise {

	/**
	 * Extract from input the even values and return them in an array
	 * <p>
	 * Examples:
	 * <li>in {9, 2, 3, 4} -> out {2, 4}
	 * <li>in {6, 2, 4, 2} -> out {2, 2, 4, 6}
	 * <li>in {2, 3, 4, 6} -> out {2, 4, 6}
	 * 
	 * Do not use Collections in here!
	 * 
	 * @param data a bunch of integers
	 * @return even values from input
	 */
	public int[] evensRaw(int[] data) {

		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				count++;
			}
		}

		int[] dataResult = new int[count];
		int countPos = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				dataResult[countPos] = data[i];
				countPos++;
			}
		}

		Arrays.sort(dataResult);

		return dataResult;
	}

	public int[] evensRaw2(int[] data) {

		int[] dataTemp = new int[data.length];
		int countPos = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				dataTemp[countPos] = data[i];
				countPos++;
			}
		}
		int[] dataResult = Arrays.copyOf(dataTemp, countPos);

		Arrays.sort(dataResult);

		return dataResult;
	}

	/**
	 * Extract from input the even values and return them in a List
	 * <p>
	 * Example: in {2, 3, 4, 5} -> out {2, 4}
	 * 
	 * @param data a bunch of integers
	 * @return even values from input
	 * 
	 */
	public List<Integer> evens(int[] data) {
		List<Integer> dataResult = new ArrayList<>();

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 2 == 0) {
				dataResult.add(data[i]);
			}
		}
		dataResult.sort(null);
		return dataResult;
	}

	/**
	 * Extract non-duplicated values in input and return them in a list
	 * <p>
	 * Example: in {2, 3, 4, 4, 5, 5, 6, 7} -> out {2, 3, 6, 7}
	 * 
	 * @param data a bunch of integers
	 * @return only the non-duplicated values from input
	 */
	public List<Integer> singles(int[] data) {
		List<Integer> dataNew = new ArrayList<>(data.length);
		List<Integer> dataResult = new ArrayList<>();

		for (int i : data) {
			dataNew.add(i);
		}

		for (int i = 0; i < dataNew.size(); i++) {
			if (Collections.frequency(dataNew, dataNew.get(i)) == 1) {
				dataResult.add(dataNew.get(i));
			}
		}

		dataResult.sort(null);
		return dataResult;
	}
}
