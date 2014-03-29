package com.levelup.java.exercises.beginner;

/**
 * This program demonstrates a solution to the energy drink exercise. 
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/energy-drink-consumption/'>Energy drink consumption</a>
 */
public class EnergyDrinkConsumption {

	// constants
	final static int NUMBERED_SURVEYED = 12467;
	final static double PURCHASED_ENERGY_DRINKS = 0.14;
	final static double PREFER_CITRUS_DRINKS = 0.64;

	public static void main(String[] args) {

		// Variables
		double energyDrinkers = calculateEnergyDrinkers(NUMBERED_SURVEYED);
		double preferCitrus = calculatePreferCitris(NUMBERED_SURVEYED);

		// Display the results.
		System.out.println("Total number of people surveyed "
				+ NUMBERED_SURVEYED);
		System.out.println("Approximately " + energyDrinkers
				+ " bought at least one energy drink");
		System.out.println(preferCitrus + " of those "
				+ "prefer citrus flavored energy drinks.");
	}

	/**
	 * Calculate the number of energy drinkers.
	 * 
	 * @param numberSurveyed
	 * @return
	 */
	public static double calculateEnergyDrinkers(int numberSurveyed) {
		return numberSurveyed * PURCHASED_ENERGY_DRINKS;
	}

	/**
	 * Calculate the number of energy drinkers that prefer citrus flavor.
	 * 
	 * @param numberSurveyed
	 * @return
	 */
	public static double calculatePreferCitris(int numberSurveyed) {
		return numberSurveyed * PREFER_CITRUS_DRINKS;
	}

}
