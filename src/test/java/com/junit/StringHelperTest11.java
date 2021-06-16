package com.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperTest11 {

	StringHelper stringHelper = new StringHelper();
	private String input;
	private String output;
	
	public StringHelperTest11(String input, String output) {
		super();
		this.input = input;
		this.output = output;
	}
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String[][] expectedOutputs = {{"AACD","CD"},{"ACD","CD"}};
		return Arrays.asList(expectedOutputs);
	}

	@Test
	public void testTruncateAInFirst2Positions_Condition_AACD() {
		String actual = stringHelper.truncateAInFirst2Positions(input);
		assertEquals(output, actual);
	}

	@Test
	public void testTruncateAInFirst2Positions_Condition_ACD() {
		String actual = stringHelper.truncateAInFirst2Positions(input);
		assertEquals(output, actual);
	}
}
