package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This program demonstrates basic string manipulation.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/string-manipulator/'>String manipulator</a>
 */
public class StringManipulator {

	public static void main(String[] args) {
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the user's favorite city.
		System.out.print("Enter the name of your favorite city: ");
		
		String city = keyboard.nextLine();

		// close stream
		keyboard.close();
		
		// Display the number of characters.
		System.out.println("Number of characters: " + city.length());

		// Display the city name in uppercase characters.
		System.out.println(city.toUpperCase());

		// Display the city name in lowercase characters.
		System.out.println(city.toLowerCase());

		// Display the first character in the city name.
		System.out.println(city.charAt(0));
	}

}
