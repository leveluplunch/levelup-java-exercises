package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link SpeedOfSound}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/speed-of-sound/'>Speed of sound</a>
 * 
 */
public class SpeedOfSoundTest {

	@Test(expected=NullPointerException.class)
	public void get_distance_travelled_in_seconds_null_medium () {
		SpeedOfSound.getDistanceTraveledInSeconds(null, 333);
	}

	@Test
	public void get_distance_travelled_in_seconds_air () {
		double val = SpeedOfSound.getDistanceTraveledInSeconds("air", 1100);
		assertEquals(1, val, 0);
	}

	@Test
	public void get_distance_travelled_in_seconds_water () {
		double val = SpeedOfSound.getDistanceTraveledInSeconds("water", 4900);
		assertEquals(1, val, 0);
	}

	@Test
	public void get_distance_travelled_in_seconds_steel () {
		double val = SpeedOfSound.getDistanceTraveledInSeconds("steel", 16400);
		assertEquals(1, val, 0);
	}


	@Test
	public void get_distance_travelled_in_seconds_nothing () {
		double val = SpeedOfSound.getDistanceTraveledInSeconds("", 16400);
		assertEquals(0, val, 0);
	}

}
