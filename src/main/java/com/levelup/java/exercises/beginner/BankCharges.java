package com.levelup.java.exercises.beginner;

import java.util.Scanner;

import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.TreeRangeMap;

/**
 * This program demonstrates a solution bank charges.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/bank-charges/'>Bank charges</a>
 */
public class BankCharges {

	static double BASE_FEE = 10;
	
	public static void main(String[] args) {

		// define rages for checks
		RangeMap<Integer, Double> checkFee = TreeRangeMap.create();
		checkFee.put(Range.closed(0, 19), .1);
		checkFee.put(Range.closed(20, 39), .8);
		checkFee.put(Range.closed(40, 59), .6);
		checkFee.put(Range.closed(60, Integer.MAX_VALUE), .4);

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the number of checks written.
		System.out.print("Enter the number of checks written " + "this month: ");
		int numChecks = keyboard.nextInt();

		//close scanner
		keyboard.close();

		// calculate total fee
		double total = BASE_FEE + (checkFee.get(numChecks) * numChecks); 
		
		// Display the total bank fees.
		System.out.printf("The total fees are $%.2f\n", total);
	}

	
	
}
