package com.levelup.java.exercises.beginner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for {@link StockTransaction}
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/beginner/stock-transaction/'>Stock transaction</a>
 * 
 */
public class StockTransactionTest {

	@Test
	public void test_totalAmountRecieved () {
		assertEquals(7.5, StockTransaction.totalAmountRecieved(10d, 2.50), 0);
	}
	
	@Test
	public void test_totalAmountPaid () {
		assertEquals(12.5, StockTransaction.totalAmountPaid(10d, 2.50), 0);
	}
	
	@Test
	public void test_stockSale () {
		assertEquals(25, StockTransaction.stockSale(10d, 2.50), 0);
	}
	
	@Test
	public void test_stockPurcasePrice () {
		assertEquals(25, StockTransaction.stockPurchasePrice(10d, 2.50), 0);
	}
	
	@Test
	public void test_profitORLoss_positive () {
		assertEquals(100, StockTransaction.profitOrLoss(200, 100), 0);
	}
	
	@Test
	public void test_profitORLoss_negative () {
		assertEquals(-100, StockTransaction.profitOrLoss(100, 200), 0);
	}
	

	@Test
	public void test_selling_commission () {
		assertEquals(150, StockTransaction.sellingCommission(150, 50, .02), 0);
	}

	@Test
	public void test_brokers_commission () {
		assertEquals(5000, StockTransaction.brokersCommission(100, 50), 0);
	}

}
