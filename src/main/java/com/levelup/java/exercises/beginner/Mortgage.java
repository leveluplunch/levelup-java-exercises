package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This java exercises will demonstrate how to computes loan payments.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/compute-loan-payments-mortgage/'>Mortgage</a >
 * 
 */
public class Mortgage {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);

		// ask user for input
		System.out.println("This program computes monthly loan payments.");
		System.out.print("Enter loan amount: ");
		double loanAmount = console.nextDouble();
		
		System.out.print("Enter number of years: ");
		int years = console.nextInt();
		
		System.out.print("Enter interest rate: ");
		double interestRate = console.nextDouble();
		System.out.println();

		//close stream
		console.close();
		
		// call method for payment
		double payment = calculateMonthlyPayment(loanAmount, years, interestRate);
		
		// output result
		System.out.println("Your loan payment = $" + (int) payment);
	}

	/**
	 * Method should calculate monthly payment
	 * 
	 * @param loanAmount
	 * @param years
	 * @param interestRate
	 * @return payment
	 */
	static double calculateMonthlyPayment(double loanAmount, int years,
			double interestRate) {

		int months = 12 * years;
		double c = interestRate / 12.0 / 100.0;
		double payment = loanAmount * c * Math.pow(1 + c, months)
				/ (Math.pow(1 + c, months) - 1);

		return payment;
	}

}
