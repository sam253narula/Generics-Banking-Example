package com.e.boundedwildcard.upperbound;

import java.util.List;

/**
 * @author Samarth Narula
 *
 */

//Upper bound wildcard example
public class Trade {

	public void buyCall(List<? extends Market> buyCalls) {
		for (Market market : buyCalls) {
			market.buy();
		}
	}

	public void sellCall(List<? extends Market> sellCalls) {
		for (Market market : sellCalls) {
			market.sell();
		}
	}
}
