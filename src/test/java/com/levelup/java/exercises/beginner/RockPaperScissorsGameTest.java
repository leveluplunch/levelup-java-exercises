package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

/**
 * Unit test for {@link RockPaperScissorsGame}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/rock-paper-scissors-game/'>Rock paper scissors game</a>
 */
public class RockPaperScissorsGameTest {

	@Test
	public void test_computerChoice () {
		assertNotNull(RockPaperScissorsGame.computerChoice());;
	}
	
	@Test
	public void test_getChoice_1 () {
		assertEquals("rock", RockPaperScissorsGame.getChoice(1));
	}
	
	@Test
	public void test_getChoice_2 () {
		assertEquals("paper", RockPaperScissorsGame.getChoice(2));
	}

	@Test
	public void test_getChoice_3 () {
		assertEquals("scissors", RockPaperScissorsGame.getChoice(3));
	}

	@Test
	public void test_getChoice_null () {
		assertNull(RockPaperScissorsGame.getChoice(4));
	}
	
}
