package com.levelup.java.exercises.beginner;

/**
 * This program demonstrates how to calculate stock commission.
 * 
 * @author Justin Musgrove
 * @see <a
 *      href='http://www.leveluplunch.com/java/exercises/stock-commission/'>Stock
 *      commission</a>
 * 
 */
public class StockCommission {

	// Constants
	private static final int NUMBER_OF_SHARES = 600;
	private static final double STOCK_PRICE = 21.77;
	private static final double COMMISSION_PERCENT = 0.02;

	public static void main(String[] args) {

		// Calculate the stock cost.
		double stockCost = calculateStockCost(STOCK_PRICE, NUMBER_OF_SHARES);

		// Calculate the commission.
		double commission = calculateCommission(stockCost, COMMISSION_PERCENT);

		// Calculate the total.
		double total = stockCost + commission;

		// Display the results.
		System.out.println("Stock cost: $" + stockCost);
		System.out.println("Commission: $" + commission);
		System.out.println("Total:      $" + total);
	}

	/**
	 * Method should calculate total stock cost
	 * 
	 * @param stockPrice
	 * @param commission
	 * @return stock cost
	 */
	static double calculateStockCost(double stockPrice, double commission) {
		return stockPrice * commission;
	}

	/**
	 * Method should calculate commission of a stock
	 * 
	 * @param stockCost
	 * @param commissionPercent
	 * @return commission
	 */
	static double calculateCommission(double stockCost, double commissionPercent) {
		return stockCost * commissionPercent;
	}

}
