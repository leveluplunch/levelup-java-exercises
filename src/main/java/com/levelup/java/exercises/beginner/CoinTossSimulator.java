package com.levelup.java.exercises.beginner;

import java.util.Random;

/**
 * This java example will demonstrate the coin toss simulation program.
 * 
 * @author Justin Musgrove
 * @see <a
 *      href='http://www.leveluplunch.com/java/exercises/coin-toss-simulator/'>Coin toss Simulator</a>
 */
public class CoinTossSimulator {

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

	static final int NUMBER_OF_TOSSES = 20;

	public static void main(String args[]) {

		// Create an instance of the Coin class.
		CoinTossSimulator coinTossSimulator = new CoinTossSimulator();
		Coin myCoin = coinTossSimulator.new Coin();

		// Display initial toss
		System.out.println("The side initially facing up: "
				+ myCoin.getSideUp());

		// Toss the coin repeatedly.
		System.out.println("Now I will toss the coin " + NUMBER_OF_TOSSES
				+ " times.");

		int headCount = 0;
		for (int i = 0; i < NUMBER_OF_TOSSES; i++) {

			// Toss the coin.
			myCoin.toss();

			// Display the side facing up.
			System.out.println("Toss: " + myCoin.getSideUp());

			if ("heads".equals(myCoin.getSideUp())) {
				headCount++;
			}
		}

		System.out.println("Heads facing up: " + headCount);
		System.out
				.println("Tails facing up: " + (NUMBER_OF_TOSSES - headCount));
	}

}
