package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.levelup.java.exercises.beginner.TossingCoinsForADollar.Coin;

/**
 * Unit test for {@link TossingCoinsForADollar}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/tossing-coins-for-a-dollar/'>Tossing Coins For A Dollar</a>
 * 
 */
public class TossingCoinsForADollarTest {

	@Test
	public void heads_up() {
		// use mockito to mock object
		Coin coin = mock(TossingCoinsForADollar.Coin.class);
		when(coin.getSideUp()).thenReturn("heads");

		assertTrue(TossingCoinsForADollar.isHeadsUp(coin));
	}

	@Test
	public void heads_down() {
		// use mockito to mock object
		Coin coin = mock(TossingCoinsForADollar.Coin.class);
		when(coin.getSideUp()).thenReturn("tails");

		assertFalse(TossingCoinsForADollar.isHeadsUp(coin));
	}

	@Test(expected = NullPointerException.class)
	public void heads_up_nullpointer() {
		TossingCoinsForADollar.isHeadsUp(null);
	}

}
