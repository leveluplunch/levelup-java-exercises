package com.levelup.java.exercises.beginner;

import java.util.Scanner;

/**
 * This java exercise will show a solution to the test scores class exercise.  
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/test-scores-class-program/'>TestScores class program</a>
 */
public class TestScoresClassProgram {

	public class TestScores {

		private double score1;
		private double score2;
		private double score3;

		public TestScores(double score1, double score2, double score3) {
			this.score1 = score1;
			this.score2 = score2;
			this.score3 = score3;
		}

		public void setScore1(double score) {
			score1 = score;
		}

		public void setScore2(double score) {
			score2 = score;
		}

		public void setScore3(double score) {
			score3 = score;
		}

		public double getScore1() {
			return score1;
		}

		public double getScore2() {
			return score2;
		}

		public double getScore3() {
			return score3;
		}

		public double getAverageScore() {
			return (score1 + score2 + score3) / 3;
		}
	}

	public static void main(String[] args) {

		double test1;
		double test2;
		double test3;

		// Create a scanner for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter test score: ");
		test1 = keyboard.nextDouble();

		System.out.print("Enter test score: ");
		test2 = keyboard.nextDouble();

		System.out.print("Enter test score: ");
		test3 = keyboard.nextDouble();

		// close scanner
		keyboard.close();

		TestScoresClassProgram classProgram = new TestScoresClassProgram();
		TestScores scores = classProgram.new TestScores(test1, test2, test3);

		// Display average
		System.out.println("The average test score: "
				+ scores.getAverageScore());
	}

}
