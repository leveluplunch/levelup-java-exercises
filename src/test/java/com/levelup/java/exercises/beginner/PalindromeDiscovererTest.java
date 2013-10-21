package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


/**
 * Unit test for {@link PalindromeDiscoverer}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/beginner/palindrome-discoverer/'>Palindrome discoverer</a>
 * 
 */
public class PalindromeDiscovererTest {

	
	@Test
	public void is_a_palindrome_single_char () {
		assertTrue(PalindromeDiscoverer.isPalindrome("A"));
	}
	
	@Test
	public void is_a_palindrome () {
		assertTrue(PalindromeDiscoverer.isPalindrome("bob"));
	}

	@Test
	public void is_a_palindrome_mixed_case () {
		assertTrue(PalindromeDiscoverer.isPalindrome("A but tuba"));
	}

	@Test
	public void is_a_palindrome_longer_phrase () {
		assertTrue(PalindromeDiscoverer.isPalindrome("Able was I ere I saw Elba"));
	}
	
	@Test
	public void is_not_a_palindrome () {
		assertFalse(PalindromeDiscoverer.isPalindrome("Free beer, I am there..."));
	}
	
	
}
