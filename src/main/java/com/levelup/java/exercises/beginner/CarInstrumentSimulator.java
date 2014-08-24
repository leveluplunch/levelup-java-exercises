package com.levelup.java.exercises.beginner;

/**
 * This java exercises will demonstrate a solution to the car instrument
 * simulator problem.
 * 
 * @author Justin Musgrove
 * @see <a href=
 *      'http://www.leveluplunch.com/java/exercises/car-instrument-simulator/'></a
 *      >
 */
public class CarInstrumentSimulator {

	class FuelGauge {

		final static int MAXIMUM_GALLONS = 15;

		private int gallons;

		public FuelGauge() {
			gallons = 0;
		}

		/**
		 * Constructor should initialize the number of gallons of gas. If the
		 * gallons is greater than the max it will default to the max.
		 * 
		 * TODO: If gallons is greater than max throw GasOverflowException
		 * 
		 * @param gallons
		 */
		public FuelGauge(int gallons) {
			if (gallons <= MAXIMUM_GALLONS) {
				this.gallons = gallons;
			} else {
				gallons = MAXIMUM_GALLONS;
			}
		}

		public int getGallons() {
			return gallons;
		}

		/**
		 * Method will add one gallon, if gallon is greater than the max for the
		 * tank then a message will be output.
		 */
		public void addGallons() {
			if (gallons < MAXIMUM_GALLONS) {
				gallons++;
			} else {
				// TODO: see constructor, throw GasOverflowException
				System.out.println("FUEL OVERFLOWING!!!");
			}
		}

		/**
		 * Burn fuel will reduce the gallons in the tank by 1, if the fuel tank
		 * is empty then a message will be outputed.
		 * 
		 * TODO: Instead of outputting out of fuel, throw a
		 * GasTankEmptyException
		 */
		public void burnFuel() {
			if (gallons > 0) {
				gallons--;
			} else {
				System.out.println("OUT OF FUEL!!!");
			}
		}
	}

	class Odometer {

		// Constant for the maximum mileage
		public final int MAXIMUM_MILEAGE = 999999;

		// Constant for the miles-per-gallon
		public final int MPG = 24;

		private int initialMileage;
		private int mileage;

		// Field to reference a FuelGauge object
		private FuelGauge fuelGauge;

		/**
		 * Constructor
		 * 
		 * @param m
		 *            Initial mileage.
		 * @param fg
		 *            A reference to a FuelGauge object.
		 */
		public Odometer(int mileage, FuelGauge fuelGauge) {
			this.initialMileage = mileage;
			this.mileage = mileage;
			this.fuelGauge = fuelGauge;
		}

		/**
		 * getMileage method
		 * 
		 * @returns The mileage.
		 */
		public int getMileage() {
			return mileage;
		}

		/**
		 * The addMileage method increments the mileage field. If mileage
		 * exceeds the maximum amount, it rolls over to 0.
		 */
		public void addMileage() {

			if (mileage < MAXIMUM_MILEAGE) {
				mileage++;
			} else {
				mileage = 0;
			}

			int driven = initialMileage - mileage;
			if (driven % MPG == 0) {
				fuelGauge.burnFuel();
			}
		}
	}

	public static void main(String[] args) {

		CarInstrumentSimulator carInstrumentSimulator = new CarInstrumentSimulator();

		FuelGauge fuel = carInstrumentSimulator.new FuelGauge();
		Odometer odometer = carInstrumentSimulator.new Odometer(0, fuel);

		for (int x = 0; x < FuelGauge.MAXIMUM_GALLONS; x++) {
			fuel.addGallons();
		}

		// dive until you can't drive no longer.
		while (fuel.getGallons() > 0) {

			// add mile driven
			odometer.addMileage();

			// Display the mileage.
			System.out.println("Mileage: " + odometer.getMileage());

			// Display the amount of fuel.
			System.out.println("Fuel level: " + fuel.getGallons() + " gallons");
			System.out.println("------------------------------");
		}
	}

}
