package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link ResturantBill}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/excercises'>Resturant Bill</a>
 * 
 */
public class ResturantBillTest {

	@Test
	public void calculateTax() {
		double meal = 100;
		assertEquals(6.75, ResturantBill.calculateTax(meal), 0);	
	}

	@Test
	public void calculateTip() {
		double meal = 100;
		assertEquals(15, ResturantBill.calculateTip(meal), 0);
	}

	@Test
	public void calculateTotal() {
		double mealCharge = 100;
		double tax = 6.75;
		double tip = 15;
		assertEquals(121.75, ResturantBill.calculateTotal(mealCharge, tax, tip), 0);	
	}

	
}
