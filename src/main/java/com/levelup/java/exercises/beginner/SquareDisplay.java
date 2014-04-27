package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This java exercises will solve for the square display problem.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/square-display-asterisk/'>Square display</a>
 * 
 */
public class SquareDisplay {

	public static void main(String[] args) {

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get a number from the user.
		System.out.print("Enter a number between 1-15: ");
		int number = keyboard.nextInt();

		//validate users input
		validateNumber(keyboard, number);

		//produce matrix
		outputMatrix("X", number);
		
		//close scanner
		keyboard.close();

	}

	/**
	 * Method should validate a input number and continue to ask if the number
	 * is now within range
	 * 
	 * @param keyboard
	 * @param number
	 */
	static void validateNumber(Scanner keyboard, int number) {

		// Validate the input.
		while (number < 1 || number > 15) {
			// Get a number from the user.
			System.out.println("Sorry, that's an invalid number.");
			System.out.print("Enter an integer in the range of 1-15: ");
			number = keyboard.nextInt();
		}
	}

	/**
	 * Method should output a row/column of char specified
	 * 
	 * @param charToOutput
	 * @param number
	 */
	static void outputMatrix(String charToOutput, int number) {

		// display square made of char
		for (int row = 0; row < number; row++) {

			// display row
			for (int column = 0; column < number; column++) {
				System.out.print(charToOutput);
			}

			// Advance to the next line.
			System.out.println();
		}
	}

}
