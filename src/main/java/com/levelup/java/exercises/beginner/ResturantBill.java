package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This java example will demonstrate calculating the restaurant bill
 * which should include tax and tip.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/beginner/resturant-bill/'>restaurant bill</a>
 * 
 */
public class ResturantBill {

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
