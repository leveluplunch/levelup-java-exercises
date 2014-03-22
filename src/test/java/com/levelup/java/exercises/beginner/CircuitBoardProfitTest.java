package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link CircuitBoardProfit}
 * 
 * @author Justin Musgrove
 * @see <a href=
 *      'http://www.leveluplunch.com/java/exercises/circuit-board-profit/'>Circui
 *      t board profit</a>
 * 
 */

public class CircuitBoardProfitTest {

	@Test
	public void test_calculateProfit() {
		
		double value = CircuitBoardProfit.calculateProfit(100);
		
		assertEquals(40, value, 0);
	}
	
}
