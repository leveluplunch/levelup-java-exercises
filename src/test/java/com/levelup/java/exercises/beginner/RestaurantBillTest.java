package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link RestaurantBill}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/beginner/resturant-bill/'>Restaurant bill</a>
 * 
 */
public class RestaurantBillTest {

	@Test
	public void calculateTax() {
		double meal = 100;
		assertEquals(6.75, RestaurantBill.calculateTax(meal), 0);	
	}

	@Test
	public void calculateTip() {
		double meal = 100;
		assertEquals(15, RestaurantBill.calculateTip(meal), 0);
	}

	@Test
	public void calculateTotal() {
		double mealCharge = 100;
		double tax = 6.75;
		double tip = 15;
		assertEquals(121.75, RestaurantBill.calculateTotal(mealCharge, tax, tip), 0);	
	}

	
}
