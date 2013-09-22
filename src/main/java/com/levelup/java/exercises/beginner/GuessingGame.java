package com.levelup.java.exercises.beginner;

import java.util.Random;
import java.util.Scanner;

/**
 * This program demonstrates a solution to the guessing game exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/'></a>
 * 
 */
public class GuessingGame {

	// Write a program that generates a random number and asks the user to
	// usersGuess what the number is. If the user's usersGuess is higher than
	// the random number,
	// the program should display "Too high, try again." if the user's
	// usersGuess is lower than the random number, the program should display
	// "Too low, try again."
	// The program should use a loop that repeats until the user correctly
	// usersGuesses the random number. You shall also keep a count of the number
	// of usersGuesses that
	// the user makes. When the user correctly usersGuesses the random number,
	// the program should display the number of usersGuesses. Now add another
	// loop to ask the user
	// if he or she wishes to play the usersGuessing game again. If so, the loop
	// should repeat, otherwise it should terminate.

	// Level up: add validation, verify they are betwen the range ie - enter a
	// number between MAX_NUMBER < 0?
	// add option for user to choose a different number
	// if a user guesses a number in < some number, display they won some prize - create a getPrize method
	// what is one flaw in this program?  Hint: placement of random number?

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
