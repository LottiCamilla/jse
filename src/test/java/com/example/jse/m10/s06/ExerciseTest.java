package com.example.jse.m10.s06;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class ExerciseTest {

	@Test
	void testSingles() {
		int[] data = { 12, 53, 12, 35 };
		Integer[] result = new Exercise().singles(data);

		Integer[] expected = {12, 35, 53};
		assertThat(result).containsExactlyInAnyOrder(expected);
	}

}
