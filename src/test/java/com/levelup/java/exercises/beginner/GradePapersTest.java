package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.google.common.collect.Lists;

/**
 * Unit test for {@link GradePapers}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/'></a>
 * 
 */
public class GradePapersTest {
	
	@Test
	public void test_score_averages () {
		List<Integer> testScores = Lists.newArrayList(50, 50, 75, 75);
		
		double average = GradePapers.getTestScoreAverages(testScores);
		
		assertEquals(62.5, average, 0);
	}
	
	@Test
	public void letter_grade_a() {
		String letterGrade = GradePapers.getLetterGrade(92);
		
		assertEquals("A", letterGrade);
	}

	@Test
	public void letter_grade_b() {
		String letterGrade = GradePapers.getLetterGrade(82);
		
		assertEquals("B", letterGrade);
	}

	@Test
	public void letter_grade_c() {
		String letterGrade = GradePapers.getLetterGrade(72);
		
		assertEquals("C", letterGrade);
	}

	@Test
	public void letter_grade_d() {
		String letterGrade = GradePapers.getLetterGrade(62);
		
		assertEquals("D", letterGrade);
	}
	
	@Test
	public void letter_grade_f() {
		String letterGrade = GradePapers.getLetterGrade(52);
		
		assertEquals("F", letterGrade);
	}
	

}
