package com.levelup.java.exercises.beginner;

import static java.lang.Double.valueOf;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This java example will provide a solution to the deposit and withdrawal
 * exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/deposit-withdrawal-files/'>Deposit and Withdrawal files</a>
 */
public class DepositAndWithdrawalFiles {

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

	public static void main(String args[]) throws IOException {

		// Create a Scanner to read keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Ask user to enter annual interest rate
		System.out.print("Enter the savings account's "
				+ "annual interest rate: ");
		double interestRate = keyboard.nextDouble();

		// close keyboard
		keyboard.close();

		DepositAndWithdrawalFiles depositAndWithdrawalFiles = new DepositAndWithdrawalFiles();
		SavingsAccount savingsAccount = depositAndWithdrawalFiles.new SavingsAccount(
				500, interestRate);

		// create a path to the deposit file
		Path depositPath = Paths
				.get("src/main/resources/com/levelup/java/exercises/beginner/Deposits.txt")
				.toAbsolutePath();

		// sum all lines in file and setting value in saving account
		double totalDeposits = Files.lines(depositPath)
				.mapToDouble(Double::valueOf).sum();

		savingsAccount.deposit(totalDeposits);

		// create a path to the withdrawls file
		Path withdrawlsPath = Paths
				.get("src/main/resources/com/levelup/java/exercises/beginner/Withdrawls.txt")
				.toAbsolutePath();

		// sum all lines in file and setting value in saving account
		double totalWithdrawls = Files.lines(withdrawlsPath)
				.mapToDouble(Double::valueOf).sum();

		savingsAccount.withdraw(totalWithdrawls);

		// Get the balance before adding interest.
		double priorBalance = savingsAccount.getAccountBalance();

		// Add the interest.
		savingsAccount.addInterest();

		// Get the interest earned.
		double interestEarned = savingsAccount.getLastAmountOfInterestEarned();

		// Create a DecimalFormat object for formatting output.
		DecimalFormat dollar = new DecimalFormat("#,##0.00");

		// Show user interest earned and balance.
		System.out
				.println("Interest earned: $" + dollar.format(interestEarned));

		System.out.println("Prior balance: $" + dollar.format(priorBalance));

		System.out.println("Ending balance: $"
				+ dollar.format(savingsAccount.getAccountBalance()));

	}

}
