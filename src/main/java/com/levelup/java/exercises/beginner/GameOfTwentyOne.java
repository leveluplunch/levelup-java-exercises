package com.levelup.java.exercises.beginner;

import java.util.Random;
import java.util.Scanner;

/**
 * This java example will demonstrate a solution to the game of twenty one.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/game-twenty-one-blackjack-variation-program/'>Game of twenty one</a>
 */
public class GameOfTwentyOne {

	static class Die {

		private final int NUMBER_OF_SIDES = 6;
		private int value;

		/**
		 * Constructor will call the roll method to set the value of the die
		 * 
		 */
		Die() {
			roll();
		}

		/**
		 * The roll method sets the value of the die to a random number.
		 */

		public void roll() {
			Random randomValue = new Random();

			value = randomValue.nextInt(NUMBER_OF_SIDES) + 1;
		}

		/**
		 * Get roll value
		 * 
		 * @return number that represents roll
		 */
		public int getValue() {
			return value;
		}
	}

	/**
	 * Method should return a value that represents the sum of both die
	 * 
	 * @return int value
	 */
	public static int getRollValue() {

		Die die = new Die();

		// roll first die
		int roll1Value = die.getValue();

		// roll second die
		die.roll();

		int roll2Value = die.getValue();

		// Return the sum of the value of the dice.
		return roll1Value + roll2Value;
	}

	/**
	 * Method will determine if the game limit has been met
	 * 
	 * @param value
	 * @return false if value gt 21
	 */
	public static boolean isUnderGameLimit(int value) {

		if (value > 21) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Method will ask user to enter if they would like to play again
	 * 
	 * @return true if user wants to play again
	 */
	public static boolean playAgain() {

		Scanner keyboard = new Scanner(System.in);

		// Ask the user to roll the dice.
		System.out.print("Roll the dice? (y/n) : ");
		String userResponse = keyboard.nextLine(); // Get a line of input.
		char letter = userResponse.charAt(0); // Get the first character.

		if (letter == 'Y' || letter == 'y') {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Method is responsible for handling displaying results to user
	 * 
	 * @param computerScore
	 * @param userScore
	 */
	public static void displayResults(int computerScore, int userScore) {

		// Display the computer and user's points.
		System.out.println("\nGame Over\n");
		System.out.println("User's Points: " + userScore);
		System.out.println("Computer's Points: " + computerScore);

		System.out.println(getWinnerMessage(computerScore, userScore));

	}

	/**
	 * Method should return a message on who wins the game
	 * 
	 * @param computer
	 *            score
	 * @param user
	 *            score
	 * @return String representing winner
	 */
	public static String getWinnerMessage(int computerScore, int userScore) {

		if (userScore > computerScore && isUnderGameLimit(userScore)) {
			return "Congrats, you win!!!";
		} else if (isUnderGameLimit(userScore)
				&& !isUnderGameLimit(computerScore)) {
			return "Congrats, you win!!!";
		} else if (userScore == 21 && computerScore != 21) {
			return "Congrats, you win!!!";
		} else if (userScore == computerScore) {
			return "Tie game!";
		} else if (!isUnderGameLimit(userScore)
				&& !isUnderGameLimit(computerScore)) {
			return "This game has ended without a winner.";
		} else {
			return "The computer wins!";
		}
	}

	public static void main(String[] args) {

		int computerPoints = 0;
		int userPoints = 0;

		while (playAgain()) {

			computerPoints += getRollValue();
			userPoints += getRollValue();

			// break the game if either user or computer go over the limit
			if (!isUnderGameLimit(userPoints)
					|| !isUnderGameLimit(computerPoints)) {
				break;
			}

			System.out.println("User Points: " + userPoints);
		}

		if (userPoints == 0 && computerPoints == 0) {
			System.out.println("Gotta play to win!!!");
		} else {
			displayResults(computerPoints, userPoints);
		}
	}

}
