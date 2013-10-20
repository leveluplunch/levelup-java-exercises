package com.levelup.java.exercises.beginner;

/**
 * This java example will demonstrate a stock transaction program.
 * 
 * @author Justin Musgrove
 * @see <a href='http://www.leveluplunch.com/java/exercises/beginner/stock-transaction/'>Stock transaction</a>
 * 
 */
public class StockTransaction {

	// Named constants
	static final int NUM_SHARES = 1000; // Number of shares
	static final double PURCHASE_PRICE = 32.87; // Purchase price per share
	static final double SELLING_PRICE = 33.92; // Selling price per share
	static final double BROKER_COMM_RATE = 0.02; // Broker commission rate
	
	
	public static void main(String[] args) {
		
		double stockPurchase = stockPurchasePrice (NUM_SHARES, PURCHASE_PRICE);

		double purchaseComm = brokersCommission (stockPurchase, BROKER_COMM_RATE) ;

		double amountPaid = totalAmountPaid (stockPurchase, purchaseComm);

		double stockSale = stockSale(NUM_SHARES, SELLING_PRICE);

		double sellingComm = sellingCommission(NUM_SHARES, SELLING_PRICE, BROKER_COMM_RATE);

		double amountRecieved = totalAmountRecieved (stockSale, sellingComm);

		double profitOrLoss = profitOrLoss (amountRecieved, amountPaid);

		// Display the results.
		System.out.println("You paid $" + stockPurchase + " for the stock.");
		System.out.println("You paid his broker a commission of $"
				+ purchaseComm + " on the purchase.");
		System.out.println("So, You paid a total of $" + amountPaid + "\n");

		System.out.println("You sold the stock for $" + stockSale);
		System.out.println("You paid his broker a commission of $"
				+ sellingComm + " on the sale.");
		System.out.println("So, You recieved a total of $" + amountRecieved
				+ "\n");
		System.out.println("You's profit or loss: $" + profitOrLoss);
	}
	
	
	
	/**
	 * Method should calculate the purchase price of stock not including 
	 * brokers fees.
	 * 
	 * @param numberOfShares
	 * @param purchasePrice
	 * @return stock purchase price
	 */
	static double stockPurchasePrice (double numberOfShares, double purchasePrice) {
		return numberOfShares * purchasePrice;
	}
	
	/**
	 * Method should calculate the brokers commission
	 * @param stockPurchase
	 * @param brokersCommissionRate
	 * @return brokers commission
	 */
	static double brokersCommission (double stockPurchase, double brokersCommissionRate) {
		return stockPurchase * brokersCommissionRate;
	}
	
	/**
	 * Method should calculate the total amount paid which is 
	 * sum of stock purchase price and the commission of the sale.
	 * 
	 * @param stockPurchase
	 * @param purchaseComm
	 * @return total amount paid
	 */
	static double totalAmountPaid (double stockPurchase, double purchaseComm) {
		return stockPurchase + purchaseComm;
	}
	
	/**
	 * Method should calculate the amount of stock sale
	 * 
	 * @param numberOfShares
	 * @param sellingPrice
	 * @return stock sale amount
	 */
	static double stockSale (double numberOfShares, double sellingPrice) {
		return numberOfShares * sellingPrice;
	}
	
	/**
	 * Method should calculate the commission on a sale 
	 * 
	 * @param numberOfShares
	 * @param sellingPrice
	 * @param brokersCommissionRate
	 * @return commission from the sale 
	 */
	static double sellingCommission (double numberOfShares, double sellingPrice, double brokersCommissionRate) {
		return (numberOfShares * sellingPrice) * brokersCommissionRate;
	}

	/**
	 * Method should calculate the total amount received from the sale.  This amount
	 * is the total sale of the stock - the selling commission. 
	 * 
	 * @param stockSale
	 * @param sellingCommission
	 * @return total amount received from sale
	 */
	static double totalAmountRecieved (double stockSale, double sellingCommission) {
		return stockSale - sellingCommission;
	}
	
	/**
	 * Method should calculate a profit or loss.  If a profit was made, the amount
	 * will be positive. If a loss was incurred, the amount will be negative.
	 * 
	 * @param amountRecieved
	 * @param amountPaid
	 * @return profit OR loss
	 */
	static double profitOrLoss (double amountRecieved, double amountPaid) {
		return amountRecieved - amountPaid;
	}
	
}
