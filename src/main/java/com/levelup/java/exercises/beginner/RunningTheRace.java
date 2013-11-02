package com.levelup.java.exercises.beginner;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;

/**
 * This program demonstrates a solution to the to the Running the race exercise.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/running-the-race/'>Running the race</a>
 * 
 */
public class RunningTheRace {

	class Runner {
		
		private String name;
		private double timeToCompleteRace;
		
		public Runner(String name, double timeToCompleteRace) {
			super();
			this.name = name;
			this.timeToCompleteRace = timeToCompleteRace;
		}
		
		@Override
		public String toString() {
			
			return Objects.toStringHelper(this)
					.add("name", name)
					.add("time to complete", timeToCompleteRace)
					.toString();
		}

		public String getName() {
			return name;
		}

		public double getTimeToCompleteRace() {
			return timeToCompleteRace;
		}
		
	}
	
	public static void main(String[] args) {
		
		List<Runner> race = Lists.newArrayList();
		
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		double raceTime;
		
		RunningTheRace runningTheRace = new RunningTheRace();
		
		// Get the user's selection.
		do {
			System.out.print("Enter name: ");
			name = keyboard.next();
			
			System.out.print("Enter race time:  (-1 to exit):  ");
			raceTime = keyboard.nextDouble();
			
			if (!name.equals("-1")) {
				race.add(runningTheRace.new Runner(name,  raceTime));	
			}
			
		} while (!name.equals("-1"));
		
		// sort collection based on time
		Collections.sort(race, byRaceTime);

		// output runners in race
		System.out.println("Name" + "\t" + "Time");
		System.out.println("---------------------");

		for (Runner runner : race) {
			System.out.println(runner.getName() + "\t" + runner.getTimeToCompleteRace());
		}
	}

	
	/**
	 * Comparator byRaceTime 
	 */
	static Comparator<Runner> byRaceTime = new Comparator<Runner>() {
	    public int compare(Runner left, Runner right) {
	        return Double.compare(left.getTimeToCompleteRace(), right.getTimeToCompleteRace()) ; // use your logic
	    }
	};
	
	
}
