package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link PresentValue}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/present-value/'>Present value</a>
 * 
 */
public class PresentValueTest {

	@Test
	public void test_calculatePresentValue() {
		
		double value = PresentValue.calculatePresentValue(1000, .10, 10);
		
		assertEquals(385.5432894295314, value, 0);
	}
	
}
