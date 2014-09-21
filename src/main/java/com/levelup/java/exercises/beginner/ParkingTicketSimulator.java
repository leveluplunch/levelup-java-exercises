package com.levelup.java.exercises.beginner;

/**
 * This program demonstrates a solution to the parking ticket simulator program
 * 
 * @author Justin Musgrove
 * @see <a href=
 *      'http://www.leveluplunch.com/java/exercises/parking-ticket-simulator-program/'>Parking
 *      ticket simulator program</a>
 * 
 */
public class ParkingTicketSimulator {

	/**
	 * This class should simulate a parked car, see exercise for description of
	 * responsibilities
	 * 
	 */
	class ParkedCar {

		private String make;
		private String model;
		private String color;
		private String licenseNumber;
		private int minutesParked;

		public ParkedCar(String make, String model, String color,
				String licenseNumber, int minutesParked) {
			super();
			this.make = make;
			this.model = model;
			this.color = color;
			this.licenseNumber = licenseNumber;
			this.minutesParked = minutesParked;
		}

		public String getMake() {
			return make;
		}

		public void setMake(String make) {
			this.make = make;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getLicenseNumber() {
			return licenseNumber;
		}

		public void setLicenseNumber(String licenseNumber) {
			this.licenseNumber = licenseNumber;
		}

		public int getMinutesParked() {
			return minutesParked;
		}

		public void setMinutesParked(int minutesParked) {
			this.minutesParked = minutesParked;
		}
	}

	/**
	 * This class should simulate a parking ticket, see exercise for description
	 * of responsibilities
	 * 
	 */
	class ParkingMeter {

		private int minutesPurchased;

		public ParkingMeter(int minutesPurchased) {
			super();
			this.minutesPurchased = minutesPurchased;
		}

		public int getMinutesPurchased() {
			return minutesPurchased;
		}

		public void setMinutesPurchased(int minutesPurchased) {
			this.minutesPurchased = minutesPurchased;
		}
	}

	/**
	 * This class should simulate a police officer inspecting parked cars.
	 * 
	 */
	class PoliceOfficer {

		private String name;
		private String badgeNumber;

		public PoliceOfficer(String name, String badgeNumber) {
			super();
			this.name = name;
			this.badgeNumber = badgeNumber;
		}

		public ParkingTicket patrol(ParkedCar car, ParkingMeter meter) {

			ParkingTicket ticket = null;

			// Calculate the total number of minutes parked over minutes
			// purchased
			int illegalMinutes = car.getMinutesParked()
					- meter.getMinutesPurchased();

			// if illegalMinutes, give ticket
			if (illegalMinutes > 0) {
				// Yes, it is illegally parked.
				ticket = new ParkingTicket(car, this, illegalMinutes);
			}

			return ticket;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getBadgeNumber() {
			return badgeNumber;
		}

		public void setBadgeNumber(String badgeNumber) {
			this.badgeNumber = badgeNumber;
		}
	}

	/**
	 * This class should simulate a parking ticket.
	 * 
	 */
	class ParkingTicket {

		private ParkedCar car;
		private PoliceOfficer officer;
		private double fine;
		private int minutes;

		public final double BASE_FINE = 25.0;
		public final double HOURLY_FINE = 10.0;

		public ParkingTicket(ParkedCar car, PoliceOfficer officer, int minutes) {
			super();
			this.car = car;
			this.officer = officer;
			this.minutes = minutes;

			calculateFine();
		}

		private void calculateFine() {

			double hours = minutes / 60.0;
			int hoursAsInt = (int) hours;

			if ((hours - hoursAsInt) > 0) {
				hoursAsInt++;
			}

			// Assign the base fine.
			fine = BASE_FINE;

			// Add the additional hourly fines.
			fine += (hoursAsInt * HOURLY_FINE);
		}

		public ParkedCar getCar() {
			return car;
		}

		public void setCar(ParkedCar car) {
			this.car = car;
		}

		public PoliceOfficer getOfficer() {
			return officer;
		}

		public void setOfficer(PoliceOfficer officer) {
			this.officer = officer;
		}

		public double getFine() {
			return fine;
		}

		public void setFine(double fine) {
			this.fine = fine;
		}

		public int getMinutes() {
			return minutes;
		}

		public void setMinutes(int minutes) {
			this.minutes = minutes;
		}

		@Override
		public String toString() {
			return "ParkingTicket [car=" + car + ", officer=" + officer
					+ ", fine=" + fine + ", minutes=" + minutes
					+ ", BASE_FINE=" + BASE_FINE + ", HOURLY_FINE="
					+ HOURLY_FINE + "]";
		}

	}

	public static void main(String[] args) {

		// A green car was parked for 125 minutes
		ParkingTicketSimulator parkingTicketSimulator = new ParkingTicketSimulator();
		ParkedCar car = parkingTicketSimulator.new ParkedCar("Toyota", "2005",
				"Green", "ABC123", 125);

		// 60 minutes of time was purchased
		ParkingMeter meter = parkingTicketSimulator.new ParkingMeter(60);

		// Officer Jack was on duty
		PoliceOfficer officer = parkingTicketSimulator.new PoliceOfficer(
				"Sargent Jack Johnson", "8909");

		ParkingTicket ticket = officer.patrol(car, meter);

		// Did the officer issue a ticket?
		if (ticket != null) {
			System.out.println(ticket);
		} else {
			System.out.println("No crimes committed!");
		}
	}

}
