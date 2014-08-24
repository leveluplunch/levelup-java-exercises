package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This java exercise demonstrates a solution for the geometry calculator.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/geometry-calculator/'>Geometry Calculator</a>
 */
public class GeometryCalculator {

	public static class Geometry {
		public static double areaOfCircle(double radius) {
			return Math.PI * radius * radius;
		}

		public static double areaOfRectangle(double length, double width) {
			return length * width;
		}

		public static double areaOfTriangle(double base, double h) {
			return base * h * 0.5;
		}
	}

	public static void main(String[] args) {

		int choice; // The user's menu choice

		do {
			// Get the user's menu choice.
			choice = getMenu();

			if (choice == 1) {
				calculateCircleArea();
			} else if (choice == 2) {
				calculateRectangleArea();
			} else if (choice == 3) {
				calculateTriangleArea();
			} else if (choice == 4) {
				System.out.println("Thanks for calculating!");
			}

		} while (choice != 4);
	}

	public static int getMenu() {

		int userChoice;

		// keyboard input
		Scanner keyboard = new Scanner(System.in);

		// Display the menu.
		System.out.println("Geometry Calculator\n");
		System.out.println("1. Calculate the Area of a Circle");
		System.out.println("2. Calculate the Area of a Rectangle");
		System.out.println("3. Calculate the Area of a Triangle");
		System.out.println("4. Quit\n");
		System.out.print("Enter your choice (1-4) : ");

		// get input from user
		userChoice = keyboard.nextInt();

		// validate input
		while (userChoice < 1 || userChoice > 4) {
			System.out.print("Please enter a valid range: 1, 2, 3, or 4: ");
			userChoice = keyboard.nextInt();
		}

		return userChoice;
	}

	public static void calculateCircleArea() {

		double radius;

		// Get input from user
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is the circle's radius? ");
		radius = keyboard.nextDouble();

		// Display output
		System.out.println("The circle's area is "
				+ Geometry.areaOfCircle(radius));
	}

	public static void calculateRectangleArea() {
		double length;
		double width;

		// Get input from user
		Scanner keyboard = new Scanner(System.in);

		// Get length
		System.out.print("Enter length? ");
		length = keyboard.nextDouble();

		// Get width
		System.out.print("Enter width? ");
		width = keyboard.nextDouble();

		// Display output
		System.out.println("The rectangle's area is "
				+ Geometry.areaOfRectangle(length, width));
	}

	public static void calculateTriangleArea() {

		double base;
		double height;

		// Get input from user
		Scanner keyboard = new Scanner(System.in);

		// Get the base
		System.out.print("Enter length of the triangle's base? ");
		base = keyboard.nextDouble();

		// Get the height
		System.out.print("Enter triangle's height? ");
		height = keyboard.nextDouble();

		// Display the triangle's area.
		System.out.println("The triangle's area is "
				+ Geometry.areaOfTriangle(base, height));
	}

}
