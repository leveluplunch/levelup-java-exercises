package com.levelup.java.exercises.beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This java example will demonstrate asking the user for
 * test scores and find the average. 
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/test-average/'></a>
 * 
 */
public class TestAverage {

	public static void main(String[] args) {

		List<Double> scores = new ArrayList<Double>();

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the user's selection.
		System.out.print("Enter test score (-1 to exit): ");
		double selection = keyboard.nextDouble();

		// Validate the user's selection.
		while (selection != -1) {
			System.out.print("Enter test score (-1 to exit): ");
			selection = keyboard.nextDouble();
			if (selection != -1) {
				scores.add(selection);	
			}
		}

		// output list of scores
		System.out.println("The scores entered: " + scores);
		
		// output average
		System.out.print("The average: " + averageScore(scores));
		
		keyboard.close();
	}
	
	/**
	 * Method should return the average score
	 * 
	 * @param scores
	 * @return double
	 */
	static double averageScore(List<Double> scores) {
		double sum = 0;
		if (!scores.isEmpty()) {
			for (Double score : scores) {
				sum += score;
			}
			return sum / scores.size();
		}
		return sum;
	}
	

}
