package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for {@link FatGramCalculator}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/fat-gram-calculator/'>Fat gram calculator</a>
 */
public class FatGramCalculatorTest {

	
	@Test
	public void test_calculateFatCalories() {
		
		double val = FatGramCalculator.calculateFatCalories(100);
		
		assertEquals(900, val, 0);
	}
	
	@Test
	public void test_calculateFatPercentatge() {

		double val = FatGramCalculator.calculateFatPercentatge(100, 100);
		
		assertEquals(1, val, 0);
	}
	
	@Test
	public void test_validateData() {
		
		boolean val = FatGramCalculator.validateData(100, 100);
		
		assertFalse(val);
	}
	
}
