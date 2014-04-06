package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link RomanNumerals}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/roman-numerals/'>Roman Numerals Converter</a>
 * 
 */
public class RomanNumeralsTest {

	@Test
	public void test_convertNumberToRomanNumeral(){
		
		String five = RomanNumerals.convertNumberToRomanNumeral(5);
		
		assertEquals("V", five);
	}
	
	@Test
	public void test_convertNumberToRomanNumeral_invalid(){

		String five = RomanNumerals.convertNumberToRomanNumeral(100);
		
		assertEquals("Invalid number.", five);
	}
	
}
