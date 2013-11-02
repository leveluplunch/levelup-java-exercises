package com.levelup.java.exercises.beginner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.number.OrderingComparison.lessThan;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


/**
 * Unit test for {@link DiceGame}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/dice-game/'>Dice game</a>
 * 
 */
@RunWith(Parameterized.class)
public class DiceGameTest {

	@Parameterized.Parameters
	public static List<Object[]> data() {
		return Arrays.asList(new Object[100][0]);
	}

	@Test
	public void test_roll_die() {
		assertThat(DiceGame.rollDie(), is(lessThan(7)));
	}

}
