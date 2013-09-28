package com.levelup.java.exercises.beginner;

import java.util.Random;


/**
 * This program demonstrates a solution to the dice game exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/'></a>
 * 
 */
public class DiceGame {

//	Write a program that plays a [simple dice game](http://en.wikipedia.org/wiki/Dice) between the computer and the user.
//	When the program runs, a loop should repeat 10 times.
//	Each iteration of the loop should do the following:
	//	Generate a random integer in the range of 1 through 6. This is the value of the computer’s die.
	//	Generate another random integer in the range of 1 through 6. This is the value of the user’s die.
	//	The die with the highest value wins. (In case of a tie, there is no winner for that particular roll of the dice.)
//	As the loop iterates, the program should keep count of the number of times the computer wins, and the number of times that the user wins. It should also display the results of each roll.
//	After the loop performs all of its iterations, the program should display who was the grand winner: the computer or the user.
	
// levelup:
//	* After each roll, display the dice as ASCII art
//	* Let the user determine when he/she is done w/ the game
//	* refactor code so that determining win is in its own method, write a unit test
//	* add a bet amount
	
	private static int numberOfGames = 10;

	public static void main(String[] args) {

		int computerWins = 0, computerRoll = 0;
		int userWins = 0, userRoll = 0;
		int tiedGames = 0;

		for (int round = 0; round < numberOfGames; round++) {

			computerRoll = rollDie();
			userRoll = rollDie();

			// determine who won the game
			if (computerRoll == userRoll) {
				tiedGames++;
			} else {
				if (computerRoll > userRoll) {
					computerWins++;
				} else {
					userWins++;
				}
			}
		}

		// Display the results.
		System.out.println("Computer...." + computerWins);
		System.out.println("User........" + userWins);
		System.out.println("Ties........" + tiedGames);

		// Determine the grand winner.
		if (computerWins > userWins) {
			System.out.println("You got beat by a computer!");
		} else {
			if (computerWins < userWins) {
				System.out.println("You beat the computer!");
			} else {
				System.out.println("The game has ended in a tie!");
			}
		}
	}

	/**
	 * Method should return a number that represents a
	 * side of a die in a random format.
	 * 
	 * @return number
	 */
	static int rollDie() {
		Random randValue = new Random();
		return randValue.nextInt(6) + 1;
	}
	
}
