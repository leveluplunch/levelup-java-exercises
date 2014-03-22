package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This program will show circuit board profit.
 * 
 * @author Justin Musgrove
 * @see <a href=
 *      'http://www.leveluplunch.com/java/exercises/circuit-board-profit/'>Circui
 *      t board profit</a>
 */
public class CircuitBoardProfit {

	// profit as a percentage constant
	final static double PROFIT_AS_PERCENT = 0.4;

	public static void main(String[] args) {
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the number of years.
		System.out.print("Enter the circuit board's retail price: ");
		double retailPrice = keyboard.nextDouble();

		// Call method to calculate profit.
		double profit = calculateProfit(retailPrice); 
		
		// Display the amount of profit.
		System.out.println("Amount of profit: $" + profit);
		
		// close keyboard
		keyboard.close();
	}

	/**
	 * Method will return the profit based on the 
	 * retail price and PROFIT_AS_PERCENT constant.
	 * 
	 * @param retailPrice
	 * @return number representing profit
	 */
	public static double calculateProfit(double retailPrice) {
		return retailPrice * PROFIT_AS_PERCENT;
	}

}
