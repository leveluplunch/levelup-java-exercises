package com.levelup.java.exercises.beginner;

import java.util.Random;

/**
 * This java example will demonstrate a solution for tossing coins for a dollar.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/tossing-coins-for-a-dollar/'>Tossing Coins For A Dollar</a>
 */
public class TossingCoinsForADollar {

	class Coin {

		private String sideUp;

		/**
		 * Default constructor
		 */
		public Coin() {
			// initialize sideUp
			toss();
		}

		/**
		 * This method will simulate the tossing of a coin. It should set the
		 * sideUp field to either "heads" or "tails".
		 */
		public void toss() {

			Random rand = new Random();

			// Get a random value, 0 or 1.
			int value = rand.nextInt(2);

			if (value == 0) {
				this.sideUp = "heads";
			} else {
				this.sideUp = "tails";
			}
		}

		/**
		 * 
		 * @return The side of the coin facing up.
		 */
		public String getSideUp() {
			return sideUp;
		}
	}

	// Constants
	static final double PLAY_TO = 1.00;
	static final double TWENTY_FIVE_CENTS = 0.25;
	static final double TEN_CENTS = 0.10;
	static final double FIVE_CENTS = 0.05;

	public static void main(String args[]) {

		TossingCoinsForADollar coinTossSimulator = new TossingCoinsForADollar();

		Coin quarter = coinTossSimulator.new Coin();
		Coin dime = coinTossSimulator.new Coin();
		Coin nickel = coinTossSimulator.new Coin();

		double balance = 0;

		System.out.println("Ready? Set? Go!");

		// Play the game while the balance
		// is less than the PLAY_TO constant
		while (balance < PLAY_TO) {

			// toss each coin
			quarter.toss(); 
			dime.toss(); 
			nickel.toss();

			// add appropriate value to balance
			if (isHeadsUp(quarter)) {
				balance += TWENTY_FIVE_CENTS;
			}

			if (isHeadsUp(dime)) {
				balance += TEN_CENTS;
			}

			if (isHeadsUp(nickel)) {
				balance += FIVE_CENTS;
			}
		}

		// Display balance to user
		System.out.printf("Balance: $%,1.2f\n", balance);

		// Display whether or not they won based
		// on the program requirement
		if (balance == PLAY_TO) {
			System.out.println("You win!");
		} else {
			System.out.println("You did not win.");
		}
	}

	/**
	 * Method will determine if the coin is heads up
	 * 
	 * @param coin
	 * @return true if coin is heads up
	 */
	public static boolean isHeadsUp(Coin coin) {

		if (coin.getSideUp().equals("heads")) {
			return true;
		} else {
			return false;
		}
	}

}
