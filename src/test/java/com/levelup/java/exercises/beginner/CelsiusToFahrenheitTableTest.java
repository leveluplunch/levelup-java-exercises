package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link CelsiusToFahrenheitTable}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/celsius-to-fahrenheit-table/'></a>
 * 
 */
public class CelsiusToFahrenheitTableTest {
	
	@Test
	public void test_celsius () {
		assertEquals(35, CelsiusToFahrenheitTable.celsius(95), 0);
	}
	
}
