package com.levelup.java.exercises.beginner;

import static com.google.common.base.Preconditions.checkElementIndex;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.google.common.base.Joiner;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multiset.Entry;
import com.google.common.collect.Multisets;

/**
 * This program demonstrates a solution to the slot machine simulation.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/'></a>
 * 
 */
public class SlotMachineSimulation {

	// Slot Machine Simulation
	// A slot machine is a gambling device that the user inserts money into and
	// then pulls a lever (or presses a button). The slot machine then displays
	// a set of random images. If two or more of the images match, the user wins
	// an amount of money that the slot machine dispenses back to the user.
	//
	// Create a program YI_SlotMachineSim.java that simulates a slot machine.
	// When the program runs, it should do the following:
	//
	// Ask the user to enter the amount of money he or she wants to enter into
	// the slot machine.
	//
	// Instead of displaying images, the program will randomly select a word
	// from the following list: Cherries, Oranges, Plums, Bells, Melons, Bars
	//
	// To select a word, the program can generate a random number in the range
	// of 0 through 5. If the number is 0, the selected word is Cherries; if the
	// number is 1, the selected word is Oranges; and so forth. The program
	// should randomly select a word from the list three times and display all
	// three of the words.
	//
	// If none of the randomly selected words match, the program will inform the
	// user that he or she has won $0.
	
	// If two of the words match, the program will inform the user that he or
	// she was won two times the amount entered.
	
	// If three of the words match, the program will inform the user that he or
	// she has won three times the amount entered.
	//
	// The program will ask whether the user wants to play again. If so, these
	// steps are repeated. If not, the program displays the total amount of
	// money entered into the slot machine and the total amount won.

	// Levelup
	// 1) randomly allocate the number a pool of $
	// 2) make output look more like a slot machine
	// 3) make getReel more efficient
	// 4) change parameter type to Enum
	// 5) instead of making it a reel of 3, what about 4
	// 6) determine the algorithim flaw with the output

	static String[] reels = { "Cherries", "Oranges", "Plums", "Bells", "Melons", "Bars" };
	static int numberOfReels = 3;

	public static void main(String[] args) {

		char playAgain;
		double amountBet = 0;
		double totalWon = 0;
		DecimalFormat dollar = new DecimalFormat("#,##0.00");


		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Play the slot machine once, and repeat the game as long
		// as the user confirms they want to continue to play.
		do {
			System.out.println("Welcome to the Slot Machine Simulation.");

			// Get the amount the user wants to bet.
			System.out.print("\nEnter the amount you would like to bet: $");
			amountBet = keyboard.nextDouble();

			// Skip a line.
			System.out.println();

			// generate random reels
			List<String> reels = Lists.newArrayList();
			for (int x = 0; x < numberOfReels; x++) {
				reels.add(getRandomReel());
			}

			// display reels
			System.out.println(Joiner.on("--").join(reels));

			// determine the payout percentage
			int payoutPercentage = determinePayOutPercentage(reels);

			// calcuate the amount won
			double amountWon = payoutPercentage * amountBet;

			// keep running total of amount won
			totalWon += amountWon;

			// Display the amount won.
			System.out.println("\nYou win $" + dollar.format(amountWon));

			// Prompt the user to play again.
			System.out.println("\nWould you like to play again?");
			System.out.print("Enter Y for yes or N for no: ");
			String input = keyboard.next(); // Read a string.
			playAgain = input.charAt(0); // Get the first character.

		} while (playAgain == 'Y' || playAgain == 'y');

		// Display the totals.
		System.out.println("You won a total of $" + dollar.format(totalWon));

	}

	/**
	 * Method should return the number of times an occurrence of a reel
	 * 
	 * @param reels
	 * @return
	 */
	static int determinePayOutPercentage(List<String> reels) {

		Multiset<String> reelCount = HashMultiset.create();
		reelCount.addAll(reels);

		// order the number of elements by the higest
		ImmutableMultiset<String> highestCountFirst = Multisets.copyHighestCountFirst(reelCount);

		int count = 0;
		for (Entry<String> entry : highestCountFirst.entrySet()) {
			count = entry.getCount();
			break;
		}
		return count;
	}

	/**
	 * Method should get a reel randomly
	 * 
	 * @return string representing reel
	 */
	static String getRandomReel() {

		// Create a Random object, set seed to the number of elements in array
		Random randomNumber = new Random();
		return getReel(randomNumber.nextInt(reels.length));
	}

	/**
	 * Method should return reel based on index of array 0 - cherries 1 -
	 * oranges 2 - plums 3 - bells 4 - melons 5 - bars
	 * 
	 * @param element
	 * @throws IndexOutOfBoundsException
	 *             if {@code index} is negative or is not less than 6
	 * @return reel
	 */
	static String getReel(int index) {

		checkElementIndex(index, reels.length);

		return reels[index];

	}

}
