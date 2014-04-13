package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link MassAndWeight}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/mass-and-weight/'>Mass and weight</a>
 * 
 */
public class MassAndWeightTest {

	@Test
	public void test_validWeight_lt10() {
		
		String message = MassAndWeight.validWeight(9);
		
		assertEquals("The object is to light", message);
	}

	@Test
	public void test_validWeight_gt1000() {

		String message = MassAndWeight.validWeight(1001);
		
		assertEquals("The object is to heavy", message);
	}

	@Test
	public void test_validWeight() {

		String message = MassAndWeight.validWeight(500);
		
		assertEquals("", message);
	}

	@Test
	public void test_calculateWeightInNewtons() {
		
		double weight = MassAndWeight.calculateWeightInNewtons(100);
		
		assertEquals(980.0000000000001, weight, 0);
	}	
}