package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

/**
 * Unit test for {@link DistanceConversion}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/distance-conversion/'>Distance conversion</a>
 * 
 */
public class DistanceConversionTest {

	@Test
	public void test_getMenu () {
		
		assertNotNull(DistanceConversion.getMenu());
		assertEquals(4, DistanceConversion.getMenu().size());
	}

	@Test
	public void test_calculateKilometers () {
		
		double kilometers = DistanceConversion.calculateKilometers(10000);
		
		assertEquals(10, kilometers, 0);
	}

	@Test
	public void test_calculateInches () {
		
		double inches = DistanceConversion.calculateInches(1000);
		
		assertEquals(39370, inches, 0);
	}
	
	@Test
	public void test_calculateFeet () {
		
		double feet = DistanceConversion.calculateFeet(1000);
		
		assertEquals(3281, feet, 0);
	}
	
}
