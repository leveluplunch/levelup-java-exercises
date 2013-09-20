package com.levelup.java.exercises.beginner;

import java.util.Scanner;

public class ResturantBill {

	// Description: 
	// Write a program that computes the tax and tip for a restaurant bill. 
	//	User is to enter the total amount of the bill. Tax is 6.75% of the bill. 
//	The tip is 15% of the meal after tax has been added. The meal charge, tax, tip, and total should be printed on the screen..
	
	// Walk through:
	// you will notice that we seperate the calcuation from the user input/output.  This way these methods could be reused by another program.
	// define variables 
	// ask user for charge of the meal 
	// calculate values
	// output calculated values
	
	// TODO: 
	// allow tax rate and tip to be inputed by user
	// validate charge of the meal 	
	// make the output look pretty
	// since tax rate is typically by state, create a collection to look up state tax - most likely it would be a map "WI", .0675
	
	
	private static double TAX_RATE = 0.0675;
	private static double TIP_PERCENT = .15;
	
	
	public static void main(String[] args) {

		// Variables
		double mealCharge; // To hold the meal charge
		double tax; // To hold the amount of tax
		double tip; // To hold the tip amount
		double total; // To hold the total charge

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the charge for the meal.
		System.out.print("Enter the charge for the meal: ");
		mealCharge = keyboard.nextDouble();

		// Calculate the tax.
		tax = calculateTax (mealCharge);

		// Calculate the tip.
		tip = calculateTip (mealCharge);

		// Calculate the total.
		total = calculateTotal (mealCharge, tax, tip);

		// Display the results.
		System.out.println("Meal Charge: $" + mealCharge);
		System.out.println("Tax:         $" + tax);
		System.out.println("Tip:         $" + tip);
		System.out.println("Total:       $" + total);
	}
	
	
	/**
	 * Method should calculate tax based on meal charge and tax rate
	 * @param mealCharge
	 * @return
	 */
	static double calculateTax (double mealCharge) {
		return mealCharge * TAX_RATE;
	}
	
	/**
	 * Method should calculate tip based on meal charge and tip %.
	 * 
	 * @param mealCharge
	 * @return
	 */
	static double calculateTip (double mealCharge) {
		return mealCharge * TIP_PERCENT;
	}
	
	/**
	 * Method should calculate total due based on method parameters.
	 * 
	 * @param mealCharge
	 * @param tax
	 * @param tip
	 * @return
	 */
	static double calculateTotal (double mealCharge, double tax, double tip) {
		return mealCharge + tax + tip;
	}
	
	
}