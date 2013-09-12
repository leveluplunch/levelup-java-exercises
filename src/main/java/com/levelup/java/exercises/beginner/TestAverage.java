package com.levelup.java.exercises.beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestAverage {

	// Descripton: Write a program that asks the user to enter in test scores.
	// The program should display each test score as well as the average
	//  
	
	// Breaking the problem into subtasks:
	// 1) create a data structure that will hold test scores
	// 2) write a method that will average the values
	// 3) ask users to input test scores
	// 4) output test scores and average
	//
	// TODO: 1) limit the number of total test scores (could someone really take
	// million tests?)
	// 2) add formatter to the average 
	// 3) while the averageScore works, what other library could you resuse?
	// 4) what would a do/while loop allow you to remove?
	// 5) is there a better way to output the list?

	public static void main(String[] args) {

		List<Double> scores = new ArrayList<Double>();
		double average; // Average of the test scores

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
