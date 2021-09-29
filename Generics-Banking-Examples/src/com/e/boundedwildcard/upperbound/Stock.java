package com.e.boundedwildcard.upperbound;

/**
 * @author Samarth Narula
 *
 */

public class Stock {

	private String stockName;
	private int quantity;
	private double price;
	
	public Stock(String stockName, int quantity, double price) {
		super();
		this.stockName = stockName;
		this.quantity = quantity;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Stock [stockName=" + stockName + ", quantity=" + quantity + ", price=" + price + "]";
	}

	public String getStockName() {
		return stockName;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}
	
	
	
}
