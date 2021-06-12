package com.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest7 {

	StringHelper stringHelper;
	
	@Before
	public void setup() {
		System.out.println("Before Test");
		stringHelper = new StringHelper();		
	}
	
	@BeforeClass
	public static void setupClass() {
		System.out.println("Before everything");
	}
	
	@AfterClass
	public static void destroyClass() {
		System.out.println("After everything");
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
