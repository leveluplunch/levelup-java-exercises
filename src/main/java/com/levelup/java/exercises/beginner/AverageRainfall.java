package com.levelup.java.exercises.beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This program demonstrates how to calculate the average rainfall.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/average-rainfall/'>Average rainfall</a>
 */
public class AverageRainfall {

	final static int NUM_MONTHS = 12; // Months per year

	public static void main(String[] args) {

		int years; // Number of years
		double monthRain;
		List<Double> rainFall = new ArrayList<Double>();

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the number of years.
		System.out.print("Enter the number of years: ");
		years = keyboard.nextInt();

		// Validate the input.
		while (years < 1) {
			System.out.print("Invalid. Enter 1 or greater: ");
			years = keyboard.nextInt();
		}

		System.out.println("Enter the rainfall, in inches, "
				+ "for each month.");

		for (int y = 1; y <= years; y++) {

			for (int m = 1; m <= NUM_MONTHS; m++) {

				// Get the rainfall for a month.
				System.out.print("Year " + y + " month " + m + ": ");
				monthRain = keyboard.nextDouble();

				// Accumulate the rainfall.
				rainFall.add(new Double(monthRain));
			}
		}

		// Display the statistics.
		System.out.println("\nNumber of months: " + (years * NUM_MONTHS));
		System.out.println("Total rainfall: "
				+ calculateTotalRainFall(rainFall) + " inches");
		System.out.println("Average monthly rainfall: "
				+ calculateAverageRainFall(rainFall) + " inches");
		
		
		keyboard.close();

	}

	/**
	 * Method should return the sum of all elements in list.
	 * 
	 * @param rainFall
	 * @return sum of elements
	 */
	static double calculateTotalRainFall(List<Double> rainFall) {

		Double sum = new Double(0);
		for (Double i : rainFall) {
			sum = sum + i;
		}
		return sum;
	}

	/**
	 * Method should return the average of elements
	 * passed in list.
	 * 
	 * @param rainFall
	 * @return average of elements
	 */
	static double calculateAverageRainFall(List<Double> rainFall) {

		Double sum = 0d;
		for (Double vals : rainFall) {
			sum += vals;
		}

		return sum = sum / rainFall.size();
	}

}
