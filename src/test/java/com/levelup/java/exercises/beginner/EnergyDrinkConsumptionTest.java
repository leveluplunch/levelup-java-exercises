package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link EnergyDrinkConsumption}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/energy-drink-consumption/'>Energy drink consumption</a>
 * 
 */
public class EnergyDrinkConsumptionTest {

	@Test
	public void test_calculateEnergyDrinkers() {

		double val = EnergyDrinkConsumption.calculateEnergyDrinkers(100);

		assertEquals(14.000000000000002, val, 0);
	}

	@Test
	public void test_calculatePreferCitris() {

		double val = EnergyDrinkConsumption.calculatePreferCitris(100);

		assertEquals(64, val, 0);

	}
}