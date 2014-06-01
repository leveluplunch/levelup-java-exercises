package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This java example will demonstrate a solution to the Freezing and boiling exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/freezing-boiling-points/'>Freezing and Boiling Points</a>
 */
public class FreezingAndBoilingPoints {

	public class FreezeAndBoiling {

		private double temperature;

		public FreezeAndBoiling(double t) {
			temperature = t;
		}

		public double getTemperature() {
			return temperature;
		}

		/**
		 * Method should check if the temperature is freezing
		 * 
		 * @return true if Ethyl is freezing
		 */
		public boolean isEthylAlchoolFreezing() {

			if (temperature <= -173.0) {
				return true;
			} else {
				return false;
			}
		}

		/**
		 * Method should check if the temperature is boiling
		 * 
		 * @return true if Ethyl is boiling
		 */
		public boolean isEthylAlchoolBoiling() {

			if (temperature >= 172.0) {
				return true;
			} else {
				return false;
			}
		}

		/**
		 * Method should check if the temperature is freezing
		 * 
		 * @return true if Oxygen is freezing
		 */
		public boolean isOxygenFreezing() {

			if (temperature <= -362.0) {
				return true;
			} else {
				return false;
			}
		}

		/**
		 * Method should check if the temperature is boiling
		 * 
		 * @return true if Oxygen is boiling
		 */
		public boolean isOxygenBoiling() {

			if (temperature >= -306.0) {
				return true;
			} else {
				return false;
			}
		}

		/**
		 * Method should check if the temperature is freezing
		 * 
		 * @return true if Water is freezing
		 */
		public boolean isWaterFreezing() {

			if (temperature <= 32.0) {
				return true;
			} else {
				return false;
			}
		}

		/**
		 * Method should check if the temperature is boiling
		 * 
		 * @return true if Water is boiling
		 */
		public boolean isWaterBoiling() {

			if (temperature >= 212.0) {
				return true;
			} else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
	
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
	
		System.out.print("Enter a temperature: ");
		double temperature = keyboard.nextDouble();
	
		// close keyboard
		keyboard.close();
	
		FreezingAndBoilingPoints freezeAndBoilingPoints = new FreezingAndBoilingPoints();
		FreezeAndBoiling freezeAndBoiling = freezeAndBoilingPoints.new FreezeAndBoiling(
				temperature);
	
		// Display elements will freeze.
		if (freezeAndBoiling.isEthylAlchoolBoiling()) {
			System.out.println("Ethyl alcohol will freeze.");
		}
	
		if (freezeAndBoiling.isOxygenFreezing()) {
			System.out.println("Oxygen will freeze.");
		}
	
		if (freezeAndBoiling.isWaterFreezing())
			System.out.println("Water will freeze.");
	
		// Display if elements will boil.
		if (freezeAndBoiling.isEthylAlchoolBoiling()) {
			System.out.println("Ethyl alcohol will boil.");
		}
	
		if (freezeAndBoiling.isOxygenBoiling()) {
			System.out.println("Oxygen will boil.");
		}
	
		if (freezeAndBoiling.isWaterBoiling()) {
			System.out.println("Water will boil.");
		}
	}

}
