package com.levelup.java.exercises.beginner;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.google.common.base.Splitter;

/**
 * This java example will demonstrate a solution to the triva game.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/trivia-game-program/'>Triva game</a>
 */
public class TrivaGame {

	List<Question> questions;

	TrivaGame() throws IOException {
		questions = readQuestions();
	}

	/**
	 * This class represents question object
	 */
	class Question {

		private String question;
		private List<String> possibleAnswers;
		private int answer;

		@Override
		public String toString() {
			return "Question [question=" + question + ", possibleAnswers="
					+ possibleAnswers + ", answer=" + answer + "]";
		}
	}

	/**
	 * This class represents player object
	 */
	class Player {

		int playerNumber;
		int points;

	}

	/**
	 * Function will accept a string based on the following format and transform
	 * it into a Question object
	 */
	Function<String, Question> mapLineToQuestion = new Function<String, Question>() {

		public Question apply(String line) {

			Question question = new Question();

			List<String> questionPieces = Splitter.on("|").trimResults()
					.omitEmptyStrings().splitToList(line);

			question.question = questionPieces.get(0);
			question.possibleAnswers = Splitter.on(",").trimResults()
					.omitEmptyStrings().splitToList(questionPieces.get(1));
			question.answer = Integer.parseInt(questionPieces.get(2));

			return question;
		}
	};

	/**
	 * Method will read each line of a file then mapping it to a question
	 * object.
	 * 
	 * @return
	 * @throws IOException
	 */
	public List<Question> readQuestions() throws IOException {

		List<Question> questions = Files
				.lines(Paths
						.get("src/main/resources/com/levelup/java/exercises/beginner/trivia.txt"))
				.map(mapLineToQuestion).collect(Collectors.toList());

		return questions;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	/**
	 * Method should generate random number based total number of questions
	 * 
	 * @param numberOfQuestions
	 * @return
	 */
	public static int getRandomQuestionNumber(int numberOfQuestions) {

		Random random = new Random();
		OptionalInt questionNumber = random.ints(1, numberOfQuestions)
				.findFirst();

		return questionNumber.getAsInt();
	}

	/**
	 * Method should display a question passed
	 * 
	 * @param q
	 * @param playerNum
	 */
	public static void displayQuestion(Question q, int playerNum) {

		// Display the player number.
		System.out.println("Question for player #" + playerNum);
		System.out.println("------------------------");

		// Display the question.
		System.out.println(q.question);
		for (int i = 0; i < q.possibleAnswers.size(); i++) {
			System.out.println((i + 1) + ". " + q.possibleAnswers.get(i));
		}
	}

	/**
	 * Method will output summary stats and declare a winner
	 * 
	 * @param players
	 */
	public static void showGameResults(Player[] players) {

		// Display the stats.
		System.out.println("Game Over!");
		System.out.println("---------------------");
		System.out.println("Player 1's points: " + players[0].points);
		System.out.println("Player 2's points: " + players[1].points);

		// Declare the winner.
		if (players[0].points > players[1].points) {
			System.out.println("Player 1 wins!");
		} else if (players[1].points > players[0].points) {
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("It's a TIE!");
		}

	}

	static int NUMBER_OF_PLAYERS = 2;
	static int NUMBER_OF_CHANCES = 5;

	public static void main(String args[]) throws IOException {

		// Initiate trivia game
		TrivaGame trivaGame = new TrivaGame();

		Scanner keyboard = new Scanner(System.in);

		// how many total questions exist
		int numberOfQuestions = trivaGame.getQuestions().size();

		// create array of players
		Player[] players = { trivaGame.new Player(), trivaGame.new Player() };

		// Play the game for each player defined and number of chances
		for (int x = 0; x < players.length; x++) {

			Player currentPlayer = players[x];

			for (int i = 0; i < NUMBER_OF_CHANCES; i++) {

				// get random question
				Question question = trivaGame.getQuestions().get(
						getRandomQuestionNumber(numberOfQuestions));

				displayQuestion(question, x + 1);

				// ask user to enter question
				System.out.print("Enter the number of the correct answer: ");
				int currentAnswer = keyboard.nextInt();

				// answer logic
				if (currentAnswer == question.answer) {
					// The player's chosen answer is correct.
					System.out.println("Correct!\n");
					currentPlayer.points += 1;
				} else {

					// The player chose the wrong answer.
					System.out.println("Sorry, that is incorrect. The correct "
							+ "answer is " + question.answer + ".\n");
				}

			}
		}

		// close keyboard
		keyboard.close();

		// display game results
		showGameResults(players);
	}

}
