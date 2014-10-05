package com.levelup.java.exercises.beginner;

/**
 * This java exercise will demonstrate a solution to the area class program.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/area-class-program/'>Area class program</a>
 */
public class AreaClassProgram {

	public static class Area {

		/**
		 * Method should calculate the area of a circle
		 * 
		 * @param radius
		 * @return area of a circle
		 */
		public static double getArea(double radius) {
			return Math.PI * radius * radius;
		}

		/**
		 * Method should calculate the area of a rectangle
		 * 
		 * @param length
		 * @param width
		 * 
		 * @return area of a rectangle
		 */
		public static double getArea(int length, int width) {
			return length * width;
		}

		/**
		 * Method should calculate the area of a cylinder
		 * 
		 * @param radius
		 * @param height
		 * 
		 * @return area of a cylinder
		 */
		public static double getArea(double radius, double height) {
			return Math.PI * radius * radius * height;
		}
	}

	public static void main(String[] args) {

		// Area of a circle
		System.out.printf("The area of a circle with a "
				+ "radius of 10.0 is %6.2f\n", Area.getArea(10.0));

		// Area of a rectangle
		System.out.printf("The area of a rectangle with a "
				+ "length of 15 and a width of 25 is %6.2f\n",
				Area.getArea(15, 25));

		// Area of cylinder
		System.out.printf("The area of a cylinder with a "
				+ "radius of 12.0 and a height " + "of 17.0 is %6.2f\n",
				Area.getArea(12.0, 17.0));
	}

}
