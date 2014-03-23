package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link StockCommission}
 * 
 * @author Justin Musgrove
 * @see <a
 *      href='http://www.leveluplunch.com/java/exercises/stock-commission/'>Stock
 *      commission</a>
 * 
 */
public class StockCommissionTest {

	@Test
	public void test_calculateStockCost() {

		double cost = StockCommission.calculateStockCost(10, .10);

		assertEquals(1, cost, 0);
	}

	@Test
	public void test_calculateCommission() {

		double commission = StockCommission.calculateCommission(10, .10);

		assertEquals(1, commission, 0);
	}
}
