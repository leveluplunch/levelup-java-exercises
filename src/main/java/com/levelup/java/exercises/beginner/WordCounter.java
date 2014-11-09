package com.levelup.java.exercises.beginner;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * This java exercise demonstrates a solution for word counter exercises.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/word-counter/'>Word counter</a>
 */

public class WordCounter {

	public static void main(String[] args) throws IOException {

		// Scanner for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a string to count words: ");

		// Get input from user
		String input = keyboard.nextLine();

		// close keyboard
		keyboard.close();

		int numberOfWords = wordCount(input);

		// Call word count
		System.out.println("The string has " + numberOfWords + " words in it.");
	}

	/**
	 * Word count should return the number of words contained within a string.
	 * 
	 * @param String
	 * @return number of words
	 */
	static int wordCount(String str) {
		StringTokenizer strTok = new StringTokenizer(str);
		return strTok.countTokens();
	}

}
