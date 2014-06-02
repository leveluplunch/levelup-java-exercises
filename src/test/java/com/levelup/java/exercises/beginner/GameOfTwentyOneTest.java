package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for {@link GameOfTwentyOne}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/game-twenty-one-blackjack-variation-program/'>Game of twenty one</a>
 * 
 */
public class GameOfTwentyOneTest {

	@Test
	public void test_isUnderGameLimit_under () {
		boolean value = GameOfTwentyOne.isUnderGameLimit(10);
		assertTrue(value);
	}

	@Test
	public void test_isUnderGameLimit_over () {
		boolean value = GameOfTwentyOne.isUnderGameLimit(22);
		assertFalse(value);
	}

	
}
