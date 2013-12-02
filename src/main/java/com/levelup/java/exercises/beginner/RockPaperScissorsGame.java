package com.levelup.java.exercises.beginner;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Random;
import java.util.Scanner;

/**
 * This program demonstrates a solution to the rock, paper, scissor game.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/rock-paper-scissors-game/'>Rock paper scissors game</a>
 */
public class RockPaperScissorsGame {

	public static void main(String[] args) {
		
		String computer;
		String user;
		Scanner keyboard = new Scanner(System.in);

		// Play the game as long as there is a tie.
		do {
			// Get the computer's choice.
			computer = computerChoice();

			// Get the user's choice.
			user = userChoice(keyboard);

			// Determine the winner.
			String output = determineWinner(computer, user);
			System.out.println(output);
			
		} while (user.equalsIgnoreCase(computer));

		keyboard.close();
	}

	/**
	 * Method should generate a random number and then return the
	 * computers choice.
	 * 
	 * @return The computer's choice of "rock", "paper", or "scissors".
	 */
	public static String computerChoice() {
		
		// Create a Random object.
		Random rand = new Random();

		// Generate a random number in the range of
		// 1 through 3.
		int num = rand.nextInt(3) + 1;

		// Return the computer's choice.
		return getChoice (num) ;
	}
	
	/**
	 * Method will return null if an invalid choice is given. 
	 * 1=rock, 2=paper, or 3=scissors.
	 * 
	 * @param number
	 * @return string type
	 * 
	 */
	public static String getChoice (int number) {
		
		String choice;
		
		switch (number) {
			case 1:
				choice = "rock";
				break;
			case 2:
				choice = "paper";
				break;
			case 3:
				choice = "scissors";
				break;
			default:
				choice = null;
		}
		
		return choice;
	}
	
	/**
	 * Method should return the user's choice.
	 * 
	 * @return The user's choice of "rock", "paper", or "scissors".
	 */
	public static String userChoice(Scanner keyboard) {
		
		// Ask the user for input
		System.out.print("Enter 1 - rock, 2 - paper, or 3 - scissors: ");

		int userChoice = keyboard.nextInt();
		
		String play = getChoice (userChoice);
		
		// Validate the choice.
		while (play == null) {
			
			System.out.print("Enter 1 - rock, 2 - paper, or 3 - scissors: ");
			userChoice = keyboard.nextInt();
			play = getChoice (userChoice);
		}

		// Return the user's choice.
		return play;
	}

	/**
	 * The determineWinner method returns the output based on parameters
	 * 
	 * @param computerChoice The computer's choice.
	 * @param userChoice The user's choice.
	 */
	public static String determineWinner (String computerChoice, String userChoice) {
		
		checkNotNull(computerChoice, "computer must have a choice");
		checkNotNull(userChoice, "user must have a choice");
		
		String output;
		
		output = "The computer's choice was " + computerChoice + ".\n";
		output += "The user's choice was " + userChoice + ".\n\n";

		// check logic
		if (userChoice.equalsIgnoreCase("rock")) {
			if (computerChoice.equalsIgnoreCase("scissors"))
				output += "Rock beats scissors.\nThe user wins!";
			else if (computerChoice.equalsIgnoreCase("paper"))
				output += "Paper beats rock.\nThe computer wins!";
			else
				output += "The game is tied!\nPlay again...";
		} else if (userChoice.equalsIgnoreCase("paper")) {
			if (computerChoice.equalsIgnoreCase("scissors"))
				output += "Scissors beats paper.\nThe computer wins!";
			else if (computerChoice.equalsIgnoreCase("rock"))
				output += "Paper beats rock.\nThe user wins!";
			else
				output += "The game is tied!\nPlay again...";
		} else if (userChoice.equalsIgnoreCase("scissors")) {
			if (computerChoice.equalsIgnoreCase("rock"))
				output += "Rock beats scissors.\nThe computer wins!";
			else if (computerChoice.equalsIgnoreCase("paper"))
				output += "Scissors beats paper.\nThe user wins!";
			else
				output += "The game is tied!\nPlay again...";
		}
		
		return output;
	}

}
