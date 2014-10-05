package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This program demonstrates a solution to the carpet calculator program.
 * 
 * @author Justin Musgrove
 * @see <a href=
 *      'http://www.leveluplunch.com/java/exercises/carpet-calculator-program/'>Carpet
 *      calculator program</a>
 * 
 */
public class CarpetCalculatorProgram {

	/**
	 * This class should hold information about the room's dimensions such as
	 * the height and width.
	 * 
	 */
	public class RoomDimension {

		private double length;
		private double width;

		public RoomDimension(double length, double width) {
			super();
			this.length = length;
			this.width = width;
		}

		public double getLength() {
			return length;
		}

		public double getWidth() {
			return width;
		}

		public double getArea() {
			return length * width;
		}

		@Override
		public String toString() {
			return "RoomDimension [length=" + length + ", width=" + width + "]";
		}

	}

	/**
	 * RoomCarpet class should hold information for calculating the cost of
	 * carpet.
	 * 
	 */
	public class RoomCarpet {

		private RoomDimension roomDimensions;
		private double costOfCarpet;

		public RoomCarpet(RoomDimension roomDimensions, double costOfCarpet) {
			super();
			this.roomDimensions = roomDimensions;
			this.costOfCarpet = costOfCarpet;
		}

		public double getTotalCost() {
			return costOfCarpet * roomDimensions.getArea();
		}

		@Override
		public String toString() {
			return "RoomCarpet [roomDimensions=" + roomDimensions
					+ ", costOfCarpet=" + costOfCarpet + ", " + "total cost="
					+ getTotalCost() + "]";
		}

	}

	public static void main(String[] args) {

		final double CARPET_PRICE_PER_SQFT = 8.0;

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Display intro.
		System.out.println("This program will display the "
				+ "carpet cost of a room." + "\nPlease enter the room's "
				+ "dimension in feet.");

		// Get the length of the room.
		System.out.print("Enter the length of room: ");
		double length = keyboard.nextDouble();

		// Get the width of the room.
		System.out.print("Enter the width of room: ");
		double width = keyboard.nextDouble();

		// close keyboard
		keyboard.close();

		// Create RoomDimension and RoomCarpet objects.
		CarpetCalculatorProgram calculatorProgram = new CarpetCalculatorProgram();
		RoomDimension dimensions = calculatorProgram.new RoomDimension(length,
				width);
		RoomCarpet roomCarpet = calculatorProgram.new RoomCarpet(dimensions,
				CARPET_PRICE_PER_SQFT);

		// Print the object calling the toString
		System.out.println(roomCarpet);
	}

}
