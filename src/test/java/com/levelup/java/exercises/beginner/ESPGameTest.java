package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for {@link ESPGame}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/esp-game/'>ESP game</a>
 * 
 */
public class ESPGameTest {

	@Test
	public void test_computerChoice() {
		String val = ESPGame.computerChoice();
		
		assertTrue(val != null);
	}

	@Test
	public void test_isValidChoice() {
		boolean val = ESPGame.isValidChoice("green");
		
		assertTrue(val);
	}

	@Test
	public void test_isNotValidChoice() {
		boolean val = ESPGame.isValidChoice("greennn");
		
		assertFalse(val);
	}

}
