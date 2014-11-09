package com.levelup.java.exercises.beginner;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * This java exercise will demonstrate summing digits from a string
 * 
 * @author Justin Musgrove
 * @see <a
 *      href='http://www.leveluplunch.com/java/exercises/sum-of-digits-string/'>Sum
 *      of digits in string</a>
 * 
 */
public class SumOfDigits {

	public static void main(String[] args) {

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get a string of digits.
		System.out.print("Enter a string of digits: ");
		String input = keyboard.nextLine();

		// close keyboard
		keyboard.close();

		DoubleSummaryStatistics summaryStats = Stream.of(input.split(""))
				.mapToDouble(Double::valueOf).summaryStatistics();

		System.out.println("The sum of numbers " + summaryStats.getSum());
		System.out.println("The highest digit is " + summaryStats.getMax());
		System.out.println("The lowest digit is " + summaryStats.getMin());
	}

}
