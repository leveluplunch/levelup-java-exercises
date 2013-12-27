package com.levelup.java.exercises.beginner;

import java.util.Scanner;

import org.apache.commons.math3.primes.Primes;

/**
 * This program demonstrates how to find prime numbers.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/java/exercises/is-prime-number-program/'>Is number prime</a>
 */
public class NumberIsPrime {

	public static void main(String[] args) {

		String message;
		int number;
		Scanner keyboard = new Scanner(System.in);

		// Get the number to check
		System.out.print("Enter a number: ");
		number = keyboard.nextInt();

		// Determine whether it is prime or not.
		if (isPrime(number)) {
			message = " is a prime number.";
		} else {
			message = " is not a prime number.";
		}
		
		// ouput results
		System.out.println("The number " + number 
				+ message);

		keyboard.close();
	}

	/**
	 * The isPrime method determines whether a number is prime.
	 * 
	 * {@link Primes} is a utility method found in apache commons.  
	 * In this instance I am wrapping this method but isn't necessary. 
	 * 
	 * @param num
	 *            The number to check.
	 * @return true if the number is prime, false otherwise.
	 */
	public static boolean isPrime(int number) {
		return Primes.isPrime(number);
	}

}
