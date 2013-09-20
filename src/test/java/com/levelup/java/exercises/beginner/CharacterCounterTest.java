package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for {@link CharacterCounter}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/'></a>
 * 
 */
public class CharacterCounterTest {
	
	@Test(expected=NullPointerException.class)
	public void count_letters_null_to_search () {
		CharacterCounter.countLetters(null, "");
	}

	@Test(expected=NullPointerException.class)
	public void count_letters_null_letter () {
		CharacterCounter.countLetters("", null);
	}
	
	@Test
	public void count_letters () {
		
		double count = CharacterCounter.countLetters("aaaa", "a");
		assertTrue(count == 4);
		
	}


}
