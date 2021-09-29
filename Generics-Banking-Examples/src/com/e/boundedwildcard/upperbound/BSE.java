package com.e.boundedwildcard.upperbound;


/**
 * @author Samarth Narula
 *
 */

public class BSE implements Market {
	private Stock stock;

	public BSE(Stock stock) {
		this.stock = stock;
	}

	@Override
	public void buy() {
		System.out.printf("Buy Stock Name: %s, Stock Price: %f, Stock Quantity: %d, Trade in BSE \n",
				stock.getStockName(), stock.getPrice(), stock.getQuantity());
	}

	@Override
	public void sell() {
		System.out.printf("Sell Stock Name: %s, Stock Price: %f, Stock Quantity: %d, Trade in BSE \n",
				stock.getStockName(), stock.getPrice(), stock.getQuantity());
	}

}
