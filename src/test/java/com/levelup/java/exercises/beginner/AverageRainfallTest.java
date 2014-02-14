package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for {@link AverageRainfall}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/average-rainfall/'>Average rainfall</a>
 * 
 */
public class AverageRainfallTest {
	
	@Test
	public void test_calculateTotalRainFall () {
		
		List<Double> listToSum = new ArrayList<Double>();
		listToSum.add(new Double(10));
		listToSum.add(new Double(10));
		listToSum.add(new Double(10));
		listToSum.add(new Double(10));
		listToSum.add(new Double(10));
		
		Double sum = AverageRainfall.calculateTotalRainFall(listToSum);
		
		assertEquals(50, sum, 0);
	}

	@Test
	public void test_calculateAverageRainFall () {

		List<Double> listToSum = new ArrayList<Double>();
		listToSum.add(new Double(10));
		listToSum.add(new Double(10));
		listToSum.add(new Double(10));
		listToSum.add(new Double(10));
		listToSum.add(new Double(10));
		
		Double sum = AverageRainfall.calculateAverageRainFall(listToSum);
		
		assertEquals(10, sum, 0);
	}
}
