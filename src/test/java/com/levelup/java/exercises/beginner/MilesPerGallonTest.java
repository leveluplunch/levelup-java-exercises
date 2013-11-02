package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for {@link MilesPerGallon}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/miles-per-gallon/'>Calculate Miles per Gallon</a>
 * 
 */
public class MilesPerGallonTest {
	
	@Test
	public void calculate_miles_per_gallon () {
		assertTrue(MilesPerGallon.calculateMilesPerGallon(555, 24) == 23.125);
	}
	
	@Test 
	public void calculate_miles_per_gallon_zero_gallons  () {
		assertTrue(MilesPerGallon.calculateMilesPerGallon(10, 0) == Double.POSITIVE_INFINITY);
	}

}
