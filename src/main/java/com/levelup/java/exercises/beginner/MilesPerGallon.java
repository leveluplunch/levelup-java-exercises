package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This java exercises will demonstrate calculating miles per gallon.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/miles-per-gallon/'>Calculate Miles per Gallon</a>
 * 
 */
public class MilesPerGallon {
	
	public static void main(String[] args) {
		
		double miles; // Miles driven
		double gallons; // Gallons of fuel
		double mpg; // Miles-per-gallon

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Describe to the user what the program will do.
		System.out.println("This program will calculate miles per gallon.");

		// Get the miles driven.
		System.out.print("Enter the miles driven: ");
		miles = keyboard.nextDouble();

		// Get gallons of fuel
		System.out.print("Enter the gallons of fuel used: ");
		gallons = keyboard.nextDouble();

		// call calculateMilesPerGallon to run calculation
		mpg = calculateMilesPerGallon(miles, gallons);

		// Display the miles-per-gallon.
		System.out.print("The miles-per-gallon is " + mpg);
	}

	/**
	 * Method should calculate miles per gallon
	 * 
	 * @param miles
	 * @param gallons
	 * @return
	 */
	static double calculateMilesPerGallon(double miles, double gallons) {
		return miles / gallons;
	}
}
