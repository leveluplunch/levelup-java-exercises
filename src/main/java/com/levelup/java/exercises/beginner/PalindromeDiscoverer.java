package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This program demonstrates a solution to the to the palindrome exercise
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/'></a>
 * 
 */
public class PalindromeDiscoverer {

//	Write program in java that accepts users input and validates if the input is a palindrome.  
//	A http://en.wikipedia.org/wiki/Palindrome is a word that reads the same forwards as it does backwards.
//	For this example we will consider a palindrome a palindrome without punctuation.
	
//	Levelup:
//	validate input
//	allow user to enter in more than one check
//	a palindrome is often considered true excluding spaces or punctuation, enhance the program to punctuation 
	
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
