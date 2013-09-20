package com.levelup.java.exercises.beginner;

import java.util.Scanner;

import static com.google.common.base.Preconditions.*;

/**
 * This program demonstrates a solution to the to the speed of sound exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/'></a>
 * 
 */
public class SpeedOfSound {

	// The following table shows the approximate speed of sound in air, water,
	// and steel.
	//
	// Medium Speed
	// Air 1,100 feet per second
	// Water 4,900 feet per second
	// Steel 16,400 feet per second
	//
	// Write a program that displays a menu allowing the user to select air,
	// water, or steel.
	// After the user has made a selection, he or she should ask to enter the
	// distance a sound wave will travel in the selected medium.
	// The program will then display the amount of time it will take.( round the
	// answer to 4 decimal places).
	// Input validation: check that the user has selected one of the available
	// choices from the menu.
	// Do not accept distances less than 0.

	// levelup:
	// 1) Validate the users inputs for air/water/steel
	// 2) Create ENUM OR constants for air/water/steel, be sure to update the test!
	// 3) have the ability to show the feet per second in time.
	// 4) adjust the getDistanceTraveledInSeconds -> getDistancedTraveled

	// Create 2 variables for distance and medium
	// Ask the user for input
	//

	public static void main(String[] args) {

		double distance = 0.0; // Distance
		String medium; // To hold "air", "water", or "steel"
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the user's medium of choice.
		System.out.print("Enter one of the following: air, water, or steel: ");
		medium = keyboard.nextLine();

		// Get the distance.
        System.out.print("Enter the distance the sound wave will travel: ");
        distance = keyboard.nextDouble();
        
        // calculate 
        double distanceTravelled = getDistanceTraveledInSeconds(medium, distance);
        
        // display output
        System.out.println("It will take " + distanceTravelled + " seconds.");
		
	}

	/**
	 * Method should return the distance traveled in seconds.  
	 * 
	 * @param medium
	 * @param distance
	 * @throws NullPointerException when medium is null
	 * 
	 * @return distance traveled 
	 */
	static double getDistanceTraveledInSeconds(String medium, double distance) {

		checkNotNull(medium);
		
		if (medium.equalsIgnoreCase("air")) {
			return distance / 1100.0;
		} else {
			if (medium.equalsIgnoreCase("water")) {
				return distance / 4900.0;
			} else {
				if (medium.equalsIgnoreCase("steel")) {
					return distance / 16400.0;
				}
			}
		}
		return 0.0;
	}

}
