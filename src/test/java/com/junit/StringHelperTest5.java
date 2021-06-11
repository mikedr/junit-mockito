package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest5 {

	StringHelper stringHelper = new StringHelper();
	
	@Test
	public void tesTareFirstAndLastTwoCharactersTheSame_Condition_ABADSAAB() {
		boolean actual = stringHelper.areFirstAndLastTwoCharactersTheSame("ABADSAAB");
		assertTrue(actual);
	}

	@Test
	public void testTruncateAInFirst2Positions_Condition_ACD() {
		boolean actual = stringHelper.areFirstAndLastTwoCharactersTheSame("ACD");
		assertFalse(actual);
	}
}
