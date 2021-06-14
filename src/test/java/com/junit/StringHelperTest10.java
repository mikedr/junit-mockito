package com.junit;

import java.util.Arrays;

import org.junit.Test;

public class StringHelperTest10 {

	@Test(timeout=1000)
	public void test() {
		int[] actual = {4,1,7,2};
		for(int i=0;i<100000;i++) {
			actual[0] = i; 
			Arrays.sort(actual);
		}
	}

}
