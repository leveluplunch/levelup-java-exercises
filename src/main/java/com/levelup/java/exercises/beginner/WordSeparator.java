package com.levelup.java.exercises.beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * This java example will demonstrate how to split a word on capital letter.
 * 
 * @author Justin Musgrove
 * @see <a
 *      href='http://www.leveluplunch.com/java/exercises/word-separator/'>Word
 *      separator</a>
 */
public class WordSeparator {

	public static void main(String[] args) {

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get a string from the user.
		System.out.println("Enter a sentence with no spaces "
				+ "between the words and each " + "word is capitalized.");
		System.out.println("An example is: StopAndSmellTheRoses");
		System.out.print("> ");

		// get user input
		String userInput = keyboard.nextLine();

		// close keyboard
		keyboard.close();

		List<String> sentenceElements = Arrays.stream(
				userInput.split("(?=[A-Z])")).collect(Collectors.toList());

		// properly format sentence
		List<String> sentence = new ArrayList<>();
		for (int x = 0; x < sentenceElements.size(); x++) {
			if (x == 0) {
				sentence.add(sentenceElements.get(x));
			} else {
				sentence.add(sentenceElements.get(x).toLowerCase());
			}
		}

		System.out.println(String.join(" ", sentence));
	}

}
