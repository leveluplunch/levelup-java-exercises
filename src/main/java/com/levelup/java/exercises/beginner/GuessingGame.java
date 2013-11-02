package com.levelup.java.exercises.beginner;

import java.util.Random;
import java.util.Scanner;

/**
 * This program demonstrates a solution to the guessing game exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/guessing-game/'>Guessing game</a>
 * 
 */
public class GuessingGame {

	// Create a Random object.
	final static Random rand = new Random();

	// max number is the upward bound number
	static final int MAX_NUMBER = 10;

	public static void main(String[] args) {

		// Create variables to hold input in program
		int usersGuess; 
		int randomNumber; 
		int numberOfGuesses; 

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Ask the user to guess a number
		System.out.println("I'm thinking of a number.");
		System.out.print("Guess what it is: ");
		usersGuess = keyboard.nextInt();

		// initialize number of guesses
		numberOfGuesses = 1;
		
		// get random number
		randomNumber = getRandomNumber();

		// Respond to the user's usersGuess.
		while (usersGuess != randomNumber) {
			
			if (usersGuess < randomNumber) {
				System.out.println("No, that's too low.");
			} else if (usersGuess > randomNumber) {
				System.out.println("Sorry, that's too high.");
			}

			// Ask again
			System.out.print("Guess again: ");
			usersGuess = keyboard.nextInt();

			// Increment the usersGuess counter.
			numberOfGuesses++;
		}

		// output to user.
		System.out.println("Congratulations! You guessed it!");
		System.out.println("I was thinking of the number " + randomNumber + ".");
		System.out.println("You got it right in " + numberOfGuesses + " guesses.");
	}

	/**
	 * Method should return a random number within the upward bound MAX_NUMBER.
	 * @return
	 */
	static int getRandomNumber () {
		return rand.nextInt(MAX_NUMBER);
	}
	
	
}
