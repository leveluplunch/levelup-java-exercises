package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for {@link NumberIsPrime}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/java/exercises/is-prime-number-program/'>Is number prime</a>
 * 
 */
public class NumberIsPrimeTest {

	
	@Test
	public void is_prime() {
		assertTrue(NumberIsPrime.isPrime(31));
	}

	@Test
	public void is_not_prime() {
		assertFalse(NumberIsPrime.isPrime(66));
	}
}
