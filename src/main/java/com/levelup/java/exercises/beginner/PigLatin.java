package com.levelup.java.exercises.beginner;

import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

/**
 * This java example will demonstrate how to convert a phrase to pig latin.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/pig-latin-translator/'>Pig latin translator</a>
 */
public class PigLatin {

	public static void main(String[] args) {
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Ask user to enter a string to translate
		System.out.println("Enter a string to translate to Pig Latin.");
		System.out.print("> ");
		String input = keyboard.nextLine();

		// close the keyboard
		keyboard.close();

		List<String> elementsInString = Lists.newArrayList(Splitter.on(" ")
				.split(input));

		Function<String, String> swapFirstLastChar = new Function<String, String>() {
			@Override
			public String apply(String s) {
				if (s.length() <= 1) {
					return s;
				} else {
					return s.substring(1, s.length()) + s.charAt(0);
				}
			}
		};

		List<String> translatedString = elementsInString.stream()
				.map(String::trim).map(String::toUpperCase)
				.map(swapFirstLastChar).map((String s) -> {
					return s + "AY";
				}).collect(Collectors.toList());


		System.out.println("Translated sentence is: "
				+ String.join(" ", translatedString));
	}
}