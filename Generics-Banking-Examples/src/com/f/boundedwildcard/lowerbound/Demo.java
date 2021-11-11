package com.f.boundedwildcard.lowerbound;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Samarth Narula
 *
 */

public class Demo {
	
	public static void main(String[] args) {
		AccountOpeningMessagePrinter accountOpeningMessagePrinter = new AccountOpeningMessagePrinter();
		List<Account> accounts = new ArrayList<Account>();
		accounts.add(new SavingAccount("Samarth Narula"));
		accounts.add(new SavingAccount("Ankit Garg"));
		accounts.add(new CurrentAccount("Sagar Zaveri"));
		List<CurrentAccount> currentAccounts = new ArrayList<CurrentAccount>();
//		currentAccounts.add(new CurrentAccount("Sagar Zaveri"));
//		accountOpeningMessagePrinter.print(currentAccounts);
	}
}
