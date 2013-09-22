package com.levelup.java.exercises.beginner;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.number.OrderingComparison.lessThan;
import static org.junit.Assert.assertThat;

import org.junit.Test;

/**
 * Unit test for {@link GuessingGame}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/'></a>
 * 
 */
public class GuessingGameTest {
	
	@Test
	public void test_get_random_number () {
		assertThat(GuessingGame.getRandomNumber(), is(lessThan(GuessingGame.MAX_NUMBER)));
	}
	

}
