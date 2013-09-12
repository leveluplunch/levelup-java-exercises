package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This java exercises will demonstrate calculating miles per gallon.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/excercises'>Calculate Miles per Gallon</a>
 * 
 */
public class MilesPerGallon {
	
//	Description: 
//	A car's miles-per-gallon (MPG can be calculated with the following formula:
//	MPG= Miles driven / Gallons of gas used
//	Write a program that asks the user to input the number of miles driven and gas used.  It should calculate the car's miles-per gallon and display the result on the screen.

//	Breaking the problem into subtasks:
//	1) create variables to hold miles, gallons and calculation
//	2) ask user to input value
//	3) calculate
//	4) show results
	
// TODO: 1) format mpg 2) validation of values 3) what if you enter in 0 for gallons, how should you handle it?  
	
	public static void main(String[] args) {
		
		double miles; // Miles driven
		double gallons; // Gallons of fuel
		double mpg; // Miles-per-gallon

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Tell the user what the program will do.
		System.out.println("This program will calculate miles per gallonyour body mass index, or BMI.");

		// Get the miles driven.
		System.out.print("Enter the miles driven: ");
		miles = keyboard.nextDouble();

		// Get the user's height.
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
