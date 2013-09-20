package com.levelup.java.exercises.beginner;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * This program demonstrates a solution to character counter exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercise'></a>
 * 
 */
public class CharacterCounter {

	// Write a program that asks the user to enter a string and then asks the
	// user to enter a character.
	// The program should count and display the number of times that the
	// specified character appears in the string.
	
	// level up:
	// 1) instead of using apache common's StringUtils what the algroithm look like
	// 2) validate users input
	// 3) is there an easier way to output the information
	

	public static void main(String[] args) {

		String stringToSearch; // The string to search
		String letter = null; // The letter to count

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a string.");
		stringToSearch = keyboard.next();
		
		
		// Get a string from the user.
		System.out.println("Enter a letter contained in the string.");
		stringToSearch = keyboard.next();

		// Get the letter to count.
		double numberOfLettersInString = countLetters(stringToSearch, letter);
		
		// Retrieve the letter.
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
