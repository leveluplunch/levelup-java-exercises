package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link LandCalculation}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/excercises'></a>
 * 
 */
public class LandCalcuationTest {
	
	@Test
	public void calculateAcres () {
		assertEquals(68.87105142332415, LandCalculation.calculateAcres(3000023), 0);
	}

}
