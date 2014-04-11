package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link Mortgage}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/compute-loan-payments-mortgage/'>Mortgage</a>
 */
public class MortgageTest {

	@Test
	public void validatePayment() {
		
		double val = Mortgage.calculateMonthlyPayment(10000, 10, 10);
		
		assertEquals(132.15073688176193, val, 0);
	}
	
}
