package com.levelup.java.exercises.beginner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This java exercise will demonstrate solution for bar chart exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/bar-chart/'>Bar
 *      chart</a>
 */
public class BarChart {

	static int CHAR_PER_SALE = 100;

	public static void main(String[] args) {

		double sales;
		List<Double> storeSales = new ArrayList<>();

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		do {
			// ask user for input
			System.out.print("Enter today's sales for store 1: ");
			sales = keyboard.nextDouble();

			// add input to collection
			storeSales.add(new Double(sales));

		} while (sales != -1);

		// close scanner
		keyboard.close();

		// Display the bar chart heading.
		System.out.println("\nSALES BAR CHART");

		// Display chart bars
		for (Double sale : storeSales) {
			System.out.println("Store:" + getBar(sale));
		}
	}

	/**
	 * Method should return the number of chars to make up the bar in the chart.
	 * 
	 * @param sales
	 * @return
	 */
	static String getBar(double sales) {

		int numberOfChars = (int) (sales / CHAR_PER_SALE);

		StringBuffer buffer = new StringBuffer();
		for (int i = 0; i < numberOfChars; i++) {
			buffer.append("*");
		}

		return buffer.toString();
	}

}
