package com.levelup.java.exercises.beginner;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * This program demonstrates a solution to character counter exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/beginner/character-counter/'>Character counter</a>
 * 
 */
public class CharacterCounter {
	

	public static void main(String[] args) {

		String stringToSearch; // The string to search
		String letter = null; // The letter to count

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get a string from the user.
		System.out.print("Enter a string:");
		stringToSearch = keyboard.nextLine();

		// 	Retrieve the letter to count.
		System.out.print("Enter a letter contained in the string:");
		letter = keyboard.nextLine();

		// Get the letter to count.
		double numberOfLettersInString = countLetters(stringToSearch, letter);
		
		System.out.println("The letter " + letter + " appears " + numberOfLettersInString + " times in the string:\n" + stringToSearch);
	}

	/**
	 * This method should count the number of letters in a string.  
	 * 
	 * While it looks counter intuitive wrapping a utility method
	 * that already provides the need, it kind of is!  This is demonstration
	 * but if you wanted to refactor for some reason logic you could. 
	 * 
	 * @param stringToSearch
	 * @param letter
	 * @return number of letters in a string
	 */
	static double countLetters (String stringToSearch, String letter) {
		
		checkNotNull(stringToSearch);
		checkNotNull(letter);

		return StringUtils.countMatches(stringToSearch, letter);
	}

}
