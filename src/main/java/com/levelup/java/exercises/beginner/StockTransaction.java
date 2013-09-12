package com.levelup.java.exercises.beginner;

public class StockTransaction {

	// description
	
	// breaking it apart:
	// define variables
	// ask user to enter input 
	// calculate methods
	// user output
	
	// levelup: 
	// formatting of decimal output
	// modify the program to prompt the user to enter in number of shares, purchase price, selling price and broker rate
	// have fun by adding a particular message for profit.  For instnace, if someone lost more than 15% in the sale
	// 		of the stock, then display a message 'Rough day - want to come over for a beer?'.  Vise versa
	//		in the event they had a killer day > 20 %, display a message 'Where we going out for dinner!'
	//		include the % of gain or loss 
	// similiar message to profit, if a user is using a broker that has a commission rate of > X%
	//		'hey you have heard of tdameritrade, right?' 
	
	// Named constants
	static final int NUM_SHARES = 1000; // Number of shares
	static final double PURCHASE_PRICE = 32.87; // Purchase price per share
	static final double SELLING_PRICE = 33.92; // Selling price per share
	static final double BROKER_COMM_RATE = 0.02; // Broker commission rate
	
	
	public static void main(String[] args) {
		
		double stockPurchase = stockPurcasePrice (NUM_SHARES, PURCHASE_PRICE);

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
	static double stockPurcasePrice (double numberOfShares, double purchasePrice) {
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
