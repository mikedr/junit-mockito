package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest2 {

	@Test
	public void test() {
		StringHelper stringHelper = new StringHelper();
		String actual = stringHelper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected, actual);
	}

}
