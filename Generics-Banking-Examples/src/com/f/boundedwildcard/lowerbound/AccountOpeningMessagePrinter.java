package com.f.boundedwildcard.lowerbound;

import java.util.List;
 
/**
 * @author Samarth Narula
 *
 */

//Lower Bound Wildcard example
public class AccountOpeningMessagePrinter {

	public void print(List<? super Account> accounts) {
		for (Object account : accounts) {
			System.out.println(account.toString());
		}
	}
}
