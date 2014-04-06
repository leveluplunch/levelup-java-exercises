package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This program demonstrates how to convert number to Roman numeral.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/roman-numerals/'>Roman Numerals Converter</a>
 */
public class RomanNumerals {

	public static void main(String[] args) {
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get a number from the user.
		System.out.print("Enter a number in the range of 1 - 10: ");
		
		int number = keyboard.nextInt(); // User inputed number

		//close stream
		keyboard.close();
		
		// Get Roman numeral.
		String romanNumerals = convertNumberToRomanNumeral(number);
		
		// Output to user
		System.out.println(romanNumerals);
	}

	/**
	 * Method should return a Roman numeral that represents 
	 * the number input. 
	 * 
	 * @param number
	 * @return String that represents a Roman numeral
	 */
	static String convertNumberToRomanNumeral(Integer number) {

		switch (number) {
		case 1:
			return "I";

		case 2:
			return "II";

		case 3:
			return "III";

		case 4:
			return "IV";

		case 5:
			return "V";

		case 6:
			return "VI";

		case 7:
			return "VII";

		case 8:
			return "VIII";

		case 9:
			return "IX";

		case 10:
			return "X";

		default:
			return "Invalid number.";

		}
	}

}
