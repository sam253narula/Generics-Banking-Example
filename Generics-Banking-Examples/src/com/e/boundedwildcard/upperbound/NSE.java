package com.e.boundedwildcard.upperbound;

/**
 * @author Samarth Narula
 *
 */

public class NSE implements Market {

	private Stock stock;

	public NSE(Stock stock) {
		this.stock = stock;
	}
	
	@Override
	public void buy() {
		System.out.printf("Buy Stock Name: %s, Stock Price: %f Stock Quantity: %d, Trade in NSE \n",
				stock.getStockName(), stock.getPrice(), stock.getQuantity());
	}

	@Override
	public void sell() {
		System.out.printf("Sell Stock Name: %s, Stock Price: %f, Stock Quantity: %d, Trade in NSE \n",
				stock.getStockName(), stock.getPrice(), stock.getQuantity());
	}

}
