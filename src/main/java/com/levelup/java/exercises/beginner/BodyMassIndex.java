package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This program demonstrates a solution to the to the Body Mass Index exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/body-mass-index/'>Calculate Body Mass Index</a>
 * 
 */
public class BodyMassIndex {

	public static void main(String[] args) {

		// Variables
		double weight; // The user's weight
		double height; // The user's height
		double bmi; // The user's BMI

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		// Tell the user what the program will do.
		System.out.println("This program will calculate your body mass index, or BMI.");
		
		// Get the user's weight.
		System.out.print("Enter your weight, in pounds: ");
		weight = keyboard.nextDouble();
		
		// Get the user's height.
		System.out.print("Enter your height, in inches: ");
		height = keyboard.nextDouble();

		// Calculate the user's body mass index.
		bmi =  calculateBMI(height, weight);
		
		// Display the user's BMI.
		System.out.println("Your body mass index (BMI) is " + bmi);
		
		System.out.println(bmiDescription(bmi));
	}

	/**
	 * Method should calcuate bmi
	 * 
	 * @param height
	 * @param weight
	 * @return
	 */
	static double calculateBMI (double height, double weight) {
		return weight * 703 / (height * height);
	}
	
	/**
	 * Method should return description based on bmi
	 * 
	 * @param bmi
	 * @return string
	 */
	static String bmiDescription (double bmi) {
		if (bmi < 18.5) {
			return "You are underweight.";
		} else {
			if (bmi > 25) {
				return "You are overweight.";
			} else {
				return "Your weight is optimal.";
			}
		}
	}
	
	
}
