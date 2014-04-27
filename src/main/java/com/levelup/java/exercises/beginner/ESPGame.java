package com.levelup.java.exercises.beginner;

import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;

import com.google.common.collect.Lists;

/**
 * This java exercise shows a solution for the ESP question.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/esp-game/'>ESP game</a>
 */
public class ESPGame {

	static List<String> choices = Lists.newArrayList("red", "green", "orange", "blue", "yellow");

	public static void main(String[] args) {

		int correctGuesses = 0;
		
		String input;
		Scanner keyboard = new Scanner(System.in);

		// join list for display
		String colors = String.join(", ", choices);

		// Play the game for 10 rounds.
		for (int round = 1; round <= 10; round++) {

			System.out.print("I'm thinking of a color " + colors + ":");

			input = keyboard.next();

			while (!isValidChoice(input)) {
				System.out.print("Please enter " + colors + ":");
				input = keyboard.next();
			}
			
			if (computerChoice().equalsIgnoreCase(input)) {
				correctGuesses ++;
			}
		}

		//close scanner
		keyboard.close();
		
		// show output
		System.out.println("Number of correct guesses: " + correctGuesses);
	}

	/**
	 * Method should return computer choice
	 * 
	 * @return color
	 */
	static String computerChoice() {
		Random random = new Random();
		OptionalInt computerChoice = random.ints(0, choices.size() - 1).findFirst();

		return choices.get(computerChoice.getAsInt());
	}

	/**
	 * Check if input is contained within list
	 * 
	 * @param input
	 * @return
	 */
	static boolean isValidChoice(String input) {

		java.util.Optional<String> val = choices.stream()
				.filter(e -> e.equals(input.toLowerCase())).findAny();

		return val.isPresent();
	}
}
