package com.e.boundedwildcard.upperbound;

import java.util.ArrayList;

/**
 * @author Samarth Narula
 *
 */

import java.util.List;
// Upper Bound demo
public class TradeDemo {

	public static void main(String[] args) {
		List<NSE> nseBuyCalls = new ArrayList<NSE>();
		Stock lindeIndia = new Stock("Linde India", 500, 2668.0d);
		nseBuyCalls.add(new NSE(lindeIndia));

		List<BSE> bseBuyCalls = new ArrayList<BSE>();
		Stock zomato = new Stock("Zomato", 500, 138.50d);
		Stock sansera = new Stock("Sansera",15, 801.90d);
		
		bseBuyCalls.add(new BSE(zomato));
		bseBuyCalls.add(new BSE(sansera));

		Trade executeTrade = new Trade();
		executeTrade.buyCall(nseBuyCalls);
		executeTrade.buyCall(bseBuyCalls);
	}
}
