package com.levelup.java.exercises.beginner;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 * This java example will demonstrate a solution for 
 * fishing game simulator.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/fishing-game-simulator/'>Fishing game simulator</a>
 */
public class FishingGameSimulator {

	public class Die {

		private final int SIDES = 6;
		private int value;

		/**
		 * Default constructor will call the roll
		 */
		Die() {
			roll();
		}

		/**
		 * The roll method sets the value of the die to a random number.
		 */

		public void roll() {
			// Create a random object.
			Random randomValue = new Random();

			// Set the value to a random number.
			value = randomValue.nextInt(SIDES) + 1;
		}

		public int getValue() {
			return value;
		}
	}
	
	/**
	 * This class will represent roll outcome.
	 * 
	 */
	public class RollOutcome {
		
		String message;
		Integer points;
		
		public RollOutcome(String message, Integer points) {
			super();
			this.message = message;
			this.points = points;
		}
		
		public String getMessage() {
			return message;
		}
		public Integer getPoints() {
			return points;
		}
	}
	
	public static void main(String args[]) {

    	// instance of class
    	FishingGameSimulator feSim = new FishingGameSimulator();

		// set up outcome map
		Map<Integer, RollOutcome> outComeMap = new HashMap<>();
		outComeMap.put(1, feSim.new RollOutcome("huge fish", 10));
		outComeMap.put(2, feSim.new RollOutcome("an old shoe", 20));
		outComeMap.put(3, feSim.new RollOutcome("little fish", 30));
		outComeMap.put(4, feSim.new RollOutcome("30 inch walleye", 40));
		outComeMap.put(5, feSim.new RollOutcome("Salt water redfish", 50));
		outComeMap.put(6, feSim.new RollOutcome("52 inch muskellunge", 60));
		
	    // Create a Scanner object for keyboard input.
	    Scanner keyboard = new Scanner(System.in);

	    String continuePlay = "";
	    Integer totalFishingPoints = 0;

    	System.out.println("Lets go fishing!");

    	do {

	    	Die die = feSim.new Die();
	    	
	    	RollOutcome outcome = outComeMap.get(die.getValue());
	    	
	    	System.out.println("You rolled: \t\t" + die.getValue());
	    	System.out.println("You caught: \t\t" + outcome.getMessage());
	    	System.out.println("Points: \t\t" + outcome.getPoints());

	    	// track points 
	    	totalFishingPoints += outcome.getPoints();
	    	
	    	// ask user to play again
	    	System.out.println("");
	    	System.out.println("Lets go fishing! Enter Y to play: ");
	    	continuePlay = keyboard.next();

		} while (continuePlay.equalsIgnoreCase("Y"));

    	System.out.println("Thanks for playing, total points: " + totalFishingPoints);

    	//Game over message
    	if (totalFishingPoints < 100) {
    		System.out.println("Better Luck next time");
    	} else {
    		System.out.println("BOOM, lets get the grill started");
    	}
    	
	    // close keyboard
	    keyboard.close();
	}
		
}
