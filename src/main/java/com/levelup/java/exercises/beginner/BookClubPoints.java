package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This program demonstrates a solution to the book club points exercise. 

 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/book-club-points/'>Book club points</a>
 */
public class BookClubPoints {

	public static void main(String[] args) {

		// Define variables
		int numberOfBooksPurchased;
		int pointsAwarded;

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the number of books purchased this month.
		System.out.print("How many books have you purchased? ");
		numberOfBooksPurchased = keyboard.nextInt();
		
		keyboard.close();

		// Determine the number of points to award.
		pointsAwarded = getPointsEarned(numberOfBooksPurchased);

		// Display the points earned.
		System.out.println("You have earned " + pointsAwarded + " points.");
	}

	/**
	 * Method should return the number of points earned based on the number of
	 * books purchased
	 * 
	 * @param numberOfBooksPurchased
	 * @return points earied
	 */
	public static int getPointsEarned(int numberOfBooksPurchased) {

		if (numberOfBooksPurchased < 1) {
			return 0;
		} else if (numberOfBooksPurchased == 1) {
			return 5;
		} else if (numberOfBooksPurchased == 2) {
			return 15;
		} else if (numberOfBooksPurchased == 3) {
			return 30;
		} else {
			return 60;
		}
	}

}
