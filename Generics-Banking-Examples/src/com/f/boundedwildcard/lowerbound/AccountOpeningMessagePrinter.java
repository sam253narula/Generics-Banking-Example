package com.f.boundedwildcard.lowerbound;

import java.util.List;
 
/**
 * @author Samarth Narula
 *
 */

//Lower Bound Wildcard example
public class AccountOpeningMessagePrinter {
// Method argument list can be list of any class which is SavingAccount or its parent or its parent parent etc
	public void print(List<? super SavingAccount> accounts) {
		//System.out.println(accounts);
		for (Object account : accounts) {
			System.out.println(account.toString());
		}
	}
}
