package com.levelup.java.exercises.beginner;

/**
 * This program demonstrates a solution to the celsius to fahrenheit table.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/celsius-to-fahrenheit-table/'>Celsius To Fahrenheit</a>
 * 
 */
public class CelsiusToFahrenheitTable {
	
	public static void main(String[] args) {
		
		// Display the table header.
		System.out.println("Fahrenheit\tCelsius");
		System.out.println("====================");

		for (int x = 0; x <= 100; x++) {
	        
			System.out.print(x);
			System.out.print("\t\t");
			System.out.print(celsius(x));
			System.out.println();
	     }

	}

	/**
	 * The celsius method converts a Fahrenheit temperature to Celsius.
	 * 
	 * @param fahrenheit The Fahrenheit temperature.
	 * @return The equivalent Celsius temperature.
	 */
	static double celsius(double fahrenheit) {
		return ((5.0 / 9.0) * (fahrenheit - 32));
	}
	
}
