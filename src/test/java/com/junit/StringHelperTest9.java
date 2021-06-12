package com.junit;

import java.util.Arrays;

import org.junit.Test;

public class StringHelperTest9 {

	@Test(expected=NullPointerException.class)
	public void test() {
		int[] actual = null;
		Arrays.sort(actual);
	}

}
