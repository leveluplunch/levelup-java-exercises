package com.levelup.java.exercises.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This java example will demonstrate a solution to the budget analysis problem.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/budget-analysis/'>Budget analysis</a>
 */
public class BudgetAnalysis {

	public static void main(String[] args) {

		// Create a DecimalFormat object to format output.
		DecimalFormat dollar = new DecimalFormat("#,##0.00");

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the budget amount.
		System.out.print("Enter your budget for the month: ");
		double monthlyBudget = keyboard.nextDouble();

		// Get each expense, keep track of total.
		double expense; 
		double totalExpenses = 0.0;
		do {
			// Get an expense amount.
			System.out.print("Enter an expense, or a negative "
					+ "number to quit: ");
			expense = keyboard.nextDouble();

			totalExpenses += expense;
			
		} while (expense >= 0);

		// Display the amount after expenses.
		double balance = calculateAmountOverBudget(monthlyBudget, totalExpenses);
		if (balance < 0) {
			System.out.println("You are OVER budget by $"
					+ dollar.format(Math.abs(balance)));
		} else if (balance > 0) {
			System.out.println("You are UNDER budget by $"
					+ dollar.format(balance));
		} else {
			System.out.println("You spent the budget amount exactly.");
		}
		
		keyboard.close();
	}

	static double calculateAmountOverBudget(double monthlyBudget,
			double totalExpenses) {
		return monthlyBudget - totalExpenses;
	}

}
