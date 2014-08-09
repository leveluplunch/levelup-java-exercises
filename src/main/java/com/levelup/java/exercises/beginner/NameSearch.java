package com.levelup.java.exercises.beginner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * This java exercises will demonstrate how to search for name within a file.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/name-search/'>Name search</a>
 */
public class NameSearch {

	public static void main(String args[]) throws IOException {

		Path boysNamesPath = Paths
				.get("src/main/resources/com/levelup/java/exercises/beginner/BoyNames.txt")
				.toAbsolutePath();

		Path girlsNamePath = Paths
				.get("src/main/resources/com/levelup/java/exercises/beginner/GirlNames.txt")
				.toAbsolutePath();

		// read boys names
		List<String> boysNames = Files.lines(boysNamesPath).collect(
				Collectors.toList());

		// ready girls names
		List<String> girlsNames = Files.lines(girlsNamePath).collect(
				Collectors.toList());

		// ask user get name from user
		String searchName = getNamesFromUser();

		displaySearchResults(searchName, boysNames, girlsNames);

	}

	/**
	 * Method should ask user to input a name
	 * 
	 * @return name to be searched
	 */
	public static String getNamesFromUser() {

		// Create a Scanner object to read input.
		Scanner keyboard = new Scanner(System.in);

		// Get a name from user
		System.out.println("Popular Name Search");
		System.out.print("Enter a name: ");

		String name = keyboard.nextLine();

		keyboard.close();

		return name;
	}

	/**
	 * Method should determine and output if a name is contained with in lists
	 * passed
	 * 
	 * @param searchName
	 * @param boysNames
	 * @param girlsNames
	 * @throws IOException
	 */
	public static void displaySearchResults(String searchName,
			List<String> boysNames, List<String> girlsNames) throws IOException {

		System.out.println("\nHere are the search results:\n");

		boolean popularBoyName = boysNames.stream().anyMatch(
				p -> p.equalsIgnoreCase(searchName));
		boolean popularGirlName = girlsNames.stream().anyMatch(
				p -> p.equalsIgnoreCase(searchName));

		// Display the results.
		if (popularBoyName) {
			System.out.println(searchName + " is a popular boy's name.");
		}
		if (popularGirlName) {
			System.out.println(searchName + " is a popular girl's name.");
		}
		if (!popularBoyName && !popularGirlName) {
			System.out.println(searchName + " is not a popular name.");
		}
	}

}
