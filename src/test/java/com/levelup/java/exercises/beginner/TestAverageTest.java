package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Unit test for {@link TestAverage}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/test-average/'>Test average</a>
 * 
 */
public class TestAverageTest {

	@Test
	public void average_score () {
		List<Double> scores = new ArrayList<Double>();
		scores.add(new Double(10));
		scores.add(new Double(10));
		scores.add(new Double(10));
		scores.add(new Double(10));
		scores.add(new Double(10));
		scores.add(new Double(10));
		scores.add(new Double(10));
		scores.add(new Double(10));
		scores.add(new Double(10));
		
		assertTrue(TestAverage.averageScore(scores) == 10);
	}
	
	
}