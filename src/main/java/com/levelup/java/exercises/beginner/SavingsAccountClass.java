package com.levelup.java.exercises.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This java example will provide a solution to the Savings Account class
 * exercise.
 * 
 * @author Justin Musgrove
 * @see <a href=
 *      'http://www.leveluplunch.com/java/exercises/savings-account-class-program/'>SavingsAccount
 *      class</a>
 */
public class SavingsAccountClass {

	/**
	 * Savings account class
	 * 
	 */
	class SavingsAccount {

		private double accountBalance;
		private double annualInterestRate;
		private double lastAmountOfInterestEarned;

		public SavingsAccount(double balance, double interestRate) {

			accountBalance = balance;
			annualInterestRate = interestRate;
			lastAmountOfInterestEarned = 0.0;
		}

		public void withdraw(double withdrawAmount) {
			accountBalance -= withdrawAmount;
		}

		public void deposit(double depositAmount) {
			accountBalance += depositAmount;
		}

		public void addInterest() {

			// Get the monthly interest rate.
			double monthlyInterestRate = annualInterestRate / 12;

			// Calculate the last amount of interest earned.
			lastAmountOfInterestEarned = monthlyInterestRate * accountBalance;

			// Add the interest to the balance.
			accountBalance += lastAmountOfInterestEarned;
		}

		public double getAccountBalance() {
			return accountBalance;
		}

		public double getAnnualInterestRate() {
			return annualInterestRate;
		}

		public double getLastAmountOfInterestEarned() {
			return lastAmountOfInterestEarned;
		}
	}

	public static void main(String args[]) {

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Ask user to enter starting balance
		System.out.print("How much money is in the account?: ");
		double startingBalance = keyboard.nextDouble();

		// Ask user for annual interest rate
		System.out.print("Enter the annual interest rate:");
		double annualInterestRate = keyboard.nextDouble();

		// Create class
		SavingsAccountClass savingAccountClass = new SavingsAccountClass();
		SavingsAccount savingsAccount = savingAccountClass.new SavingsAccount(
				startingBalance, annualInterestRate);

		// Ask how long account was opened
		System.out.print("How long has the account been opened? ");
		double months = keyboard.nextInt();

		double montlyDeposit;
		double monthlyWithdrawl;
		double interestEarned = 0.0;
		double totalDeposits = 0;
		double totalWithdrawn = 0;

		// For each month as user to enter information
		for (int i = 1; i <= months; i++) {

			// Get deposits for month
			System.out.print("Enter amount deposited for month: " + i + ": ");
			montlyDeposit = keyboard.nextDouble();
			totalDeposits += montlyDeposit;

			// Add deposits savings account
			savingsAccount.deposit(montlyDeposit);

			// Get withdrawals for month
			System.out.print("Enter amount withdrawn for " + i + ": ");
			monthlyWithdrawl = keyboard.nextDouble();
			totalWithdrawn += monthlyWithdrawl;

			// Subtract the withdrawals
			savingsAccount.withdraw(monthlyWithdrawl);

			// Add the monthly interest
			savingsAccount.addInterest();

			// Accumulate the amount of interest earned.
			interestEarned += savingsAccount.getLastAmountOfInterestEarned();
		}

		// close keyboard
		keyboard.close();

		// Create a DecimalFormat object for formatting output.
		DecimalFormat dollar = new DecimalFormat("#,##0.00");

		// Display the totals and the balance.
		System.out.println("Total deposited: $" + dollar.format(totalDeposits));
		System.out
				.println("Total withdrawn: $" + dollar.format(totalWithdrawn));
		System.out
				.println("Interest earned: $" + dollar.format(interestEarned));
		System.out.println("Ending balance: $"
				+ dollar.format(savingsAccount.getAccountBalance()));
	}

}
