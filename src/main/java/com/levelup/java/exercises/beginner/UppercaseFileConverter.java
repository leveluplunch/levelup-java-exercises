package com.levelup.java.exercises.beginner;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * This java example will demonstrate a solution for the upper case file
 * converter exercise.
 * 
 * @author Justin Musgrove
 * @see <a href=
 *      'http://www.leveluplunch.com/java/exercises/uppercase-file-converter/'>Uppercase
 *      File Converter</a>
 */
public class UppercaseFileConverter {

	public static void main(String[] args) throws IOException,
			URISyntaxException {

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Ask user for file name
		System.out.print("Enter the input file name: ");
		String fileToRead = keyboard.nextLine();

		// Ask user for output file name
		System.out.print("Enter the output file name: ");
		String outputFileName = keyboard.nextLine();

		// Find the path of file in class path
		String fileLocation = getFileLocation(fileToRead);

		// read all lines into file
		Path inputPath = Paths.get(fileLocation);
		List<String> fileLines = java.nio.file.Files.readAllLines(inputPath);

		// iterate each line in file calling toUpperCase
		// using java 8 streams
		List<String> linesToUpperCase = fileLines.stream()
				.map(s -> s.toUpperCase()).collect(Collectors.toList());

		// write to file
		Path outputPath = Paths.get(outputFileName);
		java.nio.file.Files.write(outputPath, linesToUpperCase,
				StandardOpenOption.CREATE, StandardOpenOption.WRITE);

		keyboard.close();
	}

	/**
	 * Method will just return the location of the file in the class path
	 * 
	 * @param fileName
	 * @return
	 */
	static String getFileLocation(String fileName) {
		return UppercaseFileConverter.class.getResource(fileName).getPath();
	}

}
