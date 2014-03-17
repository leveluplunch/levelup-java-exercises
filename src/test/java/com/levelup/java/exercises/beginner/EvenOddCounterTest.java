package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * Unit test for {@link EvenOddCounter}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/even-odd-counter/'>Even odd counter</a>
 * 
 */
public class EvenOddCounterTest {

	@Test
	public void test_isEven_even () {
		
		assertTrue(EvenOddCounter.isEven(10));
	}
	
	@Test
	public void test_isEven_odd () {
		
		assertFalse(EvenOddCounter.isEven(9));
	}
	
}
