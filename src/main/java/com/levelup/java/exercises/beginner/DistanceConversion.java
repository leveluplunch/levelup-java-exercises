package com.levelup.java.exercises.beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This program demonstrates a solution to the distance conversion program
 * exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/distance-converter/'>Distance converter</a>
 * 
 */
public class DistanceConversion {

	public static void main(String[] args) {

		int selection; // Menu selection
		double distance; // Distance in meters

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get a distance.
		System.out.print("Enter a distance in meters: ");
		distance = keyboard.nextDouble();

		// Display the menu and process the user's
		// selection until 4 is selected.
		List<String> menuItems = getMenu();
		do {
			
			// Display the menu.
			for (int x = 0; x < menuItems.size(); x++) {
				System.out.println((x + 1) + ". " + menuItems.get(x));
			}

			// Get the user's selection.
			System.out.print("\nEnter your choice: ");
			selection = keyboard.nextInt();

			// Validate the user's selection.
			while (selection < 1 || selection > 4) {
				System.out.print("Invalid selection. Enter your choice: ");
				selection = keyboard.nextInt();
			}

			// Process the user's selection.
			switch (selection) {
				case 1:
				   System.out.println(distance + " meters is " +
						   calculateKilometers(distance) + " kilometers.");
					break;
				case 2:
				   System.out.println(distance + " meters is " +
						   calculateInches(distance) + " inches.");
					break;
				case 3:
				   System.out.println(distance + " meters is " +
						   calculateFeet(distance) + " feet.");
					break;
				case 4:
					System.out.println("Bye!");
			}

			System.out.println();

		} while (selection != 4);
		
		keyboard.close();

	}

	/**
	 * This method should return a collection of menu items.
	 * 
	 * @return
	 */
	static List<String> getMenu() {

		List<String> menuItems = new ArrayList<String>();
		menuItems.add("Convert to kilometers");
		menuItems.add("Convert to inches");
		menuItems.add("Convert to feet");
		menuItems.add("Quit the program");

		return menuItems;
	}

	/**
	 * The calculateKilometers method displays the kilometers that are equivalent to
	 * a specified number of meters.
	 * 
	 * @param meters
	 * @return the number of kilometers
	 */
	static double calculateKilometers(double meters) {

		double kilometers = meters * 0.001;

		return kilometers;
	}

	/**
	 * This method should calculate inches that are equivalent to a specified
	 * number of meters.
	 * 
	 * @param meters
	 * @return the number of inches
	 */
	static double calculateInches(double meters) {

		double inches = meters * 39.37;

		return inches;
	}

	/**
	 * This method should calculate the feet that are equivalent to a specified
	 * number of meters.
	 * 
	 * @param meters
	 * @return The number of feet.
	 */
	static double calculateFeet(double meters) {

		double feet = meters * 3.281;

		return feet;
	}

}
