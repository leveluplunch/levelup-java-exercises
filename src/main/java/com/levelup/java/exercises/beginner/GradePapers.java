package com.levelup.java.exercises.beginner;

import java.util.List;
import java.util.Scanner;

import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;
import com.google.common.math.DoubleMath;

/**
 * This program demonstrates a solution to the to the grade papers exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/grade-papers/'>Grade papers</a>
 * 
 */
public class GradePapers {

	static RangeMap<Integer, String> gradeScale = TreeRangeMap.create();
	static {
		gradeScale.put(Range.closed(0, 60), "F");
		gradeScale.put(Range.closed(61, 70), "D");
		gradeScale.put(Range.closed(71, 80), "C");
		gradeScale.put(Range.closed(81, 90), "B");
		gradeScale.put(Range.closed(91, 100), "A");
	}

	public static void main(String[] args) {

		// create a list to hold test scores
		List<Double> grades = Lists.newArrayList();
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		// Get the user's selection.
		System.out.print("Enter test score (-1 to exit): ");
		double selection = keyboard.nextDouble();

		while (selection != -1) {
			System.out.print("Enter test score (-1 to exit): ");
			selection = keyboard.nextDouble();
			if (selection != -1) {
				grades.add(new Double (selection));	
			}
		}

		// average test scores
		double averageOfAllTestScores = getTestScoreAverages (grades);
		
		String letterGrade = getLetterGrade (averageOfAllTestScores);
		
		System.out.println("Average of test scores: " + averageOfAllTestScores);
		System.out.println("Your overall average grade is: " + letterGrade);
		
		keyboard.close();
	}
	
	/**
	 * Method should calculate the average scores 
	 * 
	 * @param grades
	 * @return
	 */
	static double getTestScoreAverages (List<? extends Number> grades) {
		return DoubleMath.mean(grades);
	}

	/**
	 * Method should return the letter grade based on scale
	 * 
	 * @param averageOfAllTestScores
	 * @return
	 */
	static String getLetterGrade (double averageOfAllTestScores) {
		return gradeScale.get((int) averageOfAllTestScores);
	}
	
	
	
	
}
