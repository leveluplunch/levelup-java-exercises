package com.levelup.java.exercises.beginner;

import java.util.Scanner;

import static com.google.common.base.Preconditions.*;

/**
 * This program demonstrates a solution to the to the speed of sound exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/speed-of-sound/'>Speed of sound</a>
 * 
 */
public class SpeedOfSound {

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
