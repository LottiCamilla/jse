package com.example.jse.m10.s03;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.jse.m04.s04.Simple;

class ExerciseTest {
	private Exercise ex;
	
	@BeforeEach
    void init() {
		ex = new Exercise();
    }

	@Test
	void testEvensRaw() {
		int[] data = { 9, 2, 3, 4 };
		int[] result = ex.evensRaw(data);
		
		int[] expected = {2, 4};
		
//		assertThat(result).isEqualTo(expected);
		assertEquals(expected.length, result.length);
		for(int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result[i]);
		}
	}
	
	@Test
	void testEvensRaw2() {
		int[] data = { 9, 2, 3, 4 };
		int[] result = ex.evensRaw2(data);
		
		int[] expected = {2, 4};
		
		assertEquals(expected.length, result.length);
		for(int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result[i]);
		}
	}
	
	@Test
	void testEvens() {
		int[] data = { 9, 2, 3, 4 };
		List<Integer> result = ex.evens(data);
		List<Integer> expected = List.of(2, 4);
		assertThat(result).isEqualTo(expected);
	}
	
	@Test
	void testSingles() {
		int[] data = { 1, 2, 3, 3, 4, 4, 5 };
		List<Integer> result = ex.singles(data);
		List<Integer> expected = List.of(1, 2, 5);
		assertThat(result).isEqualTo(expected);
	}

}
