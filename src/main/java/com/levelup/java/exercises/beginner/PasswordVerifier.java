package com.levelup.java.exercises.beginner;

import java.util.Scanner;
import java.util.function.Predicate;

/**
 * This program demonstrates a solution to the password verifier.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/password-verifier/'>Password Verifier</a>
 * 
 */
public class PasswordVerifier {
	
	static class Password {

		private String password;

		public Password(String password) {
			this.password = password;
		}

		public boolean isValid() {
			return hasUpperCase.and(hasLowerCase).and(hasLengthOfSix)
					.and(hasAtLeastOneDigit).test(this.password);
		}

		Predicate<String> hasAtLeastOneDigit = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.chars().anyMatch(Character::isDigit);
			}
		};

		Predicate<String> hasLengthOfSix = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.length() >=6 ? true : false;
			}
		};

		Predicate<String> hasLowerCase = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.chars().anyMatch(Character::isLowerCase);
			}
		};

		Predicate<String> hasUpperCase = new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.chars().anyMatch(Character::isUpperCase);
			}
		};
	}

	public static void main(String[] args) {

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// get password to verify logic
		System.out.print("Enter a string to represent password: ");
		String input = keyboard.nextLine();

		// close keyboard
		keyboard.close();

		// validate
		Password password = new Password(input);

		boolean validPassword = password.isValid();

		System.out.println("The password of " + input + "is "
				+ (validPassword ? " valid password " : "an invalid password"));

	}

}
