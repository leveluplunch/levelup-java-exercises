package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This java example will demonstrate a solution to the present value exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/present-value/'>Present value</a>
 */
public class PresentValue {

	public static void main(String[] args) {

		// Scanner object to get input
		Scanner keyboard = new Scanner(System.in);

		// Desired future value
		System.out.print("Future value? ");
		double futureValue = keyboard.nextDouble();

		// Annual interest rate.
		System.out.print("Annual interest rate? ");
		double annualInterestRate = keyboard.nextDouble();

		// Number of years investment to draw interest
		System.out.print("Number of years? ");
		int numberOfYears = keyboard.nextInt();

		// close scanner
		keyboard.close();

		double present = calculatePresentValue(futureValue, annualInterestRate,
				numberOfYears);

		// Display the result to user
		System.out.println("You need to invest $" + present);
	}

	/**
	 * Method should calculate present value
	 * 
	 * @param futureValue
	 * @param annualInterestRate
	 * @param numberOfYears
	 * @return present value
	 */
	public static double calculatePresentValue(double futureValue,
			double annualInterestRate, int numberOfYears) {

		return futureValue / Math.pow((1 + annualInterestRate), numberOfYears);
	}
}