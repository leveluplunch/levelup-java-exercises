package com.levelup.java.exercises.beginner;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Lists;

/**
 * This java example will demonstrate how to translates alphabetic characters to
 * numeric equivalent.
 * 
 * @author Justin Musgrove
 * @see <a href=
 *      'http://www.leveluplunch.com/java/exercises/alphabetic-telephone-number-translator/'>Alphabetic
 *      telephone number translator</a>
 */
public class AplhaTeleNumberTranslator {

	static ImmutableMultimap<String, String> numberAlphaTrans = null;

	static {
		numberAlphaTrans = new ImmutableMultimap.Builder<String, String>()
				.putAll("2", Lists.<String> newArrayList("A", "B", "C"))
				.putAll("3", Lists.<String> newArrayList("D", "E", "F"))
				.putAll("4", Lists.<String> newArrayList("G", "H", "I"))
				.putAll("5", Lists.<String> newArrayList("J", "K", "L"))
				.putAll("6", Lists.<String> newArrayList("M", "N", "O"))
				.putAll("7", Lists.<String> newArrayList("P", "Q", "R", "S"))
				.putAll("8", Lists.<String> newArrayList("T", "U", "V"))
				.putAll("9", Lists.<String> newArrayList("W", "X", "Y", "Z"))
				.build();
	}

	public static void main(String[] args) {

		// Create a Scanner to get keyboard input
		Scanner keyboard = new Scanner(System.in);

		// Get a phone number.
		System.out.print("Enter a phone number for translation: ");
		String phoneNumber = keyboard.nextLine();

		// close scanner
		keyboard.close();

		List<String> convertedPhone = Splitter
				.fixedLength(1)
				.splitToList(phoneNumber)
				.stream()
				.map(t -> {
					if (Character.isAlphabetic(t.codePointAt(0))) {
						return numberAlphaTrans.inverse().get(t).asList()
								.get(0);
					} else {
						return t;
					}
				}).collect(Collectors.toList());

		System.out.println(String.join("", convertedPhone));
	}
}
