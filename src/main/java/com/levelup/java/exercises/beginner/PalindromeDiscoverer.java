package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This program demonstrates a solution to the to the palindrome exercise
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/beginner/palindrome-discoverer/'>Palindrome discoverer</a>
 * 
 */
public class PalindromeDiscoverer {

	public static void main(String[] args) {
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get user input 
		System.out.print("Enter a word or phrase: ");
		String userInput = keyboard.nextLine();
		
		boolean isAPalindrome = isPalindrome(userInput);
		
		if (isAPalindrome) {
			System.out.print("The word or phrase is a palindrome");	
		} else {
			System.out.print("Sorry the word or phrase is NOT a palindrome");
		}
	}

	
	/**
	 * Method should return true if a string is identified as a palindrome. 
	 * There are many ways to do a palindrome check, this is just one of them.
	 * If you are performing checks on very, very long strings you may want to 
	 * consider another algorithm.
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isPalindrome(String str) {
	
		if (str.length() <= 1) {
			return true;
		} else {
			String toCompare = str.replaceAll("\\s+","");
			
			StringBuffer buffer = new StringBuffer(toCompare);
			String reversedString = buffer.reverse().toString();
			
			if (reversedString.equalsIgnoreCase(toCompare)) {
				return true;
			} else {
				return false;
			}
		}
	}
	
}
