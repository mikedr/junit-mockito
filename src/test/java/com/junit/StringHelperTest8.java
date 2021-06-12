package com.junit;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class StringHelperTest8 {

	@Test
	public void test() {
		int[] actual = {4,1,7,2};
		int[] expected = {1,2,4,7};
		Arrays.sort(actual);
		assertArrayEquals(expected, actual);
	}

}
