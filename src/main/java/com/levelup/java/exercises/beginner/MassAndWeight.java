package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This program demonstrates a solution to mass and weight.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/mass-and-weight/'>Mass and weight</a>
 */
public class MassAndWeight {

	public static void main(String[] args) {
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Describe to the user what the program will do.
		System.out.println("Enter the object's mass:");

		double mass = keyboard.nextDouble();

		//close scanner
		keyboard.close();
		
		// pass mass to calculate weight
		double weight = calculateWeightInNewtons(mass);
		
		System.out.println("The object's weight is: " + weight);

		// get message per requirement
		String message = validWeight(weight);
		
		if (message.length() > 0) {
			System.out.println(message);
		}
		
	}
	
	/**
	 * Method should return a message if weight is greater
	 * than 1000 or less than 10. If it is between the range
	 * an empty string will be returned
	 * 
	 * @param weight
	 * @return message
	 */
	static String validWeight (double weight) {
		
		if (weight > 1000) {
			return "The object is to heavy";
		} else if (weight < 10) {
			return "The object is to light";
		} else {
			return "";
		}
	}
	
	/**
	 * Method will calculate weight in Newtons
	 * 
	 * @param mass
	 * @return weight
	 */
	static double calculateWeightInNewtons(double mass) {
		return mass * 9.8;
	}

}
