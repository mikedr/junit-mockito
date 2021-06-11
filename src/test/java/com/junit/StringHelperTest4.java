package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest4 {

	StringHelper stringHelper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions_Condition_AACD() {
		String actual = stringHelper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected, actual);
	}

	@Test
	public void testTruncateAInFirst2Positions_Condition_ACD() {
		String actual = stringHelper.truncateAInFirst2Positions("ACD");
		String expected = "CD";
		assertEquals(expected, actual);
	}
}
