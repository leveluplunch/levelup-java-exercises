package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for {@link BarChart}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/bar-chart/'>Bar chart</a>
 * 
 */

public class BarChartTest {

	@Test
	public void chart_length() {
		
		String chars = BarChart.getBar(1000);
		
		assertTrue(chars.length() == 10);
	}
	
}
