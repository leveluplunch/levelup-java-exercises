package com.levelup.java.exercises.beginner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * This java exercise will demonstrate a solution to the world series champion
 * program.
 * 
 * @author Justin Musgrove
 * @see <a href=
 *      'http://www.leveluplunch.com/java/exercises/world-series-champions-program-counter/'>Wor
 *      l d Series Champions</a>
 */
public class WorldSeriesChampion {

	public static void main(String args[]) throws IOException {

		Path worldSeriesWinners = Paths
				.get("src/main/resources/com/levelup/java/exercises/beginner/WorldSeriesWinners.txt")
				.toAbsolutePath();

		// read all lines of file into arraylist
		List<String> winners = Files.lines(worldSeriesWinners).collect(
				Collectors.toList());

		// ask user to enter a team
		String teamName = getTeamName();

		// use a stream to filter elements based on user input
		// count the number of elements left
		long numberOfWins = winners.stream()
				.filter(p -> p.equalsIgnoreCase(teamName)).count();

		// show output
		output(teamName, numberOfWins);

	}

	/**
	 * This method should return a string which represents a world series
	 * champion entered by a user.
	 * 
	 * @return string
	 */
	public static String getTeamName() {

		Scanner keyboard = new Scanner(System.in);

		System.out.println("World Series Champions");
		System.out.print("Enter the name of a team: ");

		// Return the name input by the user.
		String team = keyboard.nextLine();

		// close scanner
		keyboard.close();

		return team;
	}

	/**
	 * This method will format the output to the user
	 * 
	 * @param teamName
	 * @param numberOfWins
	 */
	public static void output(String teamName, long numberOfWins) {

		// Display the result
		System.out.println(teamName + " won the World Series a total of "
				+ numberOfWins + " times.");

	}

}
