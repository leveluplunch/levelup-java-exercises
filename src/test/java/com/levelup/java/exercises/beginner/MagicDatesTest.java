package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Test;

/**
 * Unit test for {@link MagicDates}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/magic-dates/'>Magic
 *      dates</a> *
 */
public class MagicDatesTest {

	@Test
	public void test_magic_date() {

		boolean magicDate = MagicDates.magicDate(LocalDate.of(1960, Month.JUNE,
				10));

		assertTrue(magicDate);
	}

	@Test
	public void test_magic_not_date() {
		
		boolean magicDate = MagicDates.magicDate(LocalDate.of(1961, Month.JUNE,
				11));

		assertFalse(magicDate);
	}
}
