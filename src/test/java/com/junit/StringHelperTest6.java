package com.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest6 {

	StringHelper stringHelper;
	
	@Before
	public void setup() {
		System.out.println("Before Test");
		stringHelper = new StringHelper();		
	}
	
	@After
	public void destroy() {
		System.out.println("After Test");
	}
	
	@Test
	public void tesTareFirstAndLastTwoCharactersTheSame_Condition_ABADSAAB() {
		System.out.println("Test 1");
		boolean actual = stringHelper.areFirstAndLastTwoCharactersTheSame("ABADSAAB");
		assertTrue(actual);
	}

	@Test
	public void testTruncateAInFirst2Positions_Condition_ACD() {
		System.out.println("Test 2");
		boolean actual = stringHelper.areFirstAndLastTwoCharactersTheSame("ACD");
		assertFalse(actual);
	}
}
