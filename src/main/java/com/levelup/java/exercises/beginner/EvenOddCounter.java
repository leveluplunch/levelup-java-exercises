package com.levelup.java.exercises.beginner;

import java.util.Random;

/**
 * This java example will demonstrate how to determine if 
 * a number is even or odd.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/even-odd-counter/'>Even odd counter</a>
 */
public class EvenOddCounter {

	private static int RANDOM_NUMBERS = 100;

	public static void main(String[] args) {

		int evenNumberCount = 0;
		int oddNumberCount = 0;

		Random randomValue = new Random();

		// Generate 100 random numbers.
		for (int i = 1; i <= RANDOM_NUMBERS; i++) {
			// Determine if the number was even or odd.
			if (isEven(randomValue.nextInt(i))) {
				evenNumberCount++;
			} else {
				oddNumberCount++;
			}
		}

		System.out.println("Number of even numbers: " + evenNumberCount);
		System.out.println("Number of odd numbers: " + oddNumberCount);

	}

	/**
	 * @param num to check
	 * @return true if the num is true otherwise false
	 */
	public static boolean isEven(int num) {
		boolean isEvenNumber = false;

		if ((num % 2) == 0) {
			isEvenNumber = true;
		}
		return isEvenNumber;
	}
}