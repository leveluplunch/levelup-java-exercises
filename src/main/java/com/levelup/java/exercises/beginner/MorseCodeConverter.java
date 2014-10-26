package com.levelup.java.exercises.beginner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCodeConverter {

	static Map<String, String> LETTER_TO_MORSE_CODE = new HashMap<>();

	static {
		LETTER_TO_MORSE_CODE.put(" ", " ");
		LETTER_TO_MORSE_CODE.put(",", "--..--");
		LETTER_TO_MORSE_CODE.put(".", ".-.-.-");
		LETTER_TO_MORSE_CODE.put("?", "..--..");
		LETTER_TO_MORSE_CODE.put("0", "-----");
		LETTER_TO_MORSE_CODE.put("1", ".----");
		LETTER_TO_MORSE_CODE.put("2", "..---");
		LETTER_TO_MORSE_CODE.put("3", "...--");
		LETTER_TO_MORSE_CODE.put("4", "....-");
		LETTER_TO_MORSE_CODE.put("5", ".....");
		LETTER_TO_MORSE_CODE.put("6", "-....");
		LETTER_TO_MORSE_CODE.put("7", "--...");
		LETTER_TO_MORSE_CODE.put("8", "---..");
		LETTER_TO_MORSE_CODE.put("9", "----.");
		LETTER_TO_MORSE_CODE.put("A", ".-");
		LETTER_TO_MORSE_CODE.put("B", "-...");
		LETTER_TO_MORSE_CODE.put("C", "-.-.");
		LETTER_TO_MORSE_CODE.put("D", "-..");
		LETTER_TO_MORSE_CODE.put("E", ".");
		LETTER_TO_MORSE_CODE.put("F", "..-.");
		LETTER_TO_MORSE_CODE.put("G", "--.");
		LETTER_TO_MORSE_CODE.put("H", "....");
		LETTER_TO_MORSE_CODE.put("I", "..");
		LETTER_TO_MORSE_CODE.put("J", ".---");
		LETTER_TO_MORSE_CODE.put("K", "-.-");
		LETTER_TO_MORSE_CODE.put("L", ".-..");
		LETTER_TO_MORSE_CODE.put("M", "--");
		LETTER_TO_MORSE_CODE.put("N", "-.");
		LETTER_TO_MORSE_CODE.put("O", "---");
		LETTER_TO_MORSE_CODE.put("P", ".--.");
		LETTER_TO_MORSE_CODE.put("Q", "--.-");
		LETTER_TO_MORSE_CODE.put("R", ".-.");
		LETTER_TO_MORSE_CODE.put("S", "...");
		LETTER_TO_MORSE_CODE.put("T", "-");
		LETTER_TO_MORSE_CODE.put("U", "..-");
		LETTER_TO_MORSE_CODE.put("V", "...-");
		LETTER_TO_MORSE_CODE.put("W", ".--");
		LETTER_TO_MORSE_CODE.put("X", "-..-");
		LETTER_TO_MORSE_CODE.put("Y", "-.--");
		LETTER_TO_MORSE_CODE.put("Z", "--..");
	}

	public static void main(String[] args) {

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get a string from the user.
		System.out.println("Enter a string to convert to Morse code.");
		System.out.print("> ");

		// String to hold the user's input.
		String userInput = keyboard.nextLine();

		// close keyboard
		keyboard.close();

		// split string into array and upper case
		userInput
				.toUpperCase()
				.chars()
				.forEach(
						s -> System.out.println(LETTER_TO_MORSE_CODE
								.get(Character.toString((char) s))));
	}
}
