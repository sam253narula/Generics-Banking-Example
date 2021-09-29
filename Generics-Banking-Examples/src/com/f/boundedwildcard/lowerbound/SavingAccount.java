package com.f.boundedwildcard.lowerbound;

/**
 * @author Samarth Narula
 *
 */

public class SavingAccount extends Account {

	public SavingAccount(String customerName) {
		super(customerName);
	}

	String message = "Thank you MR/Mrs " + customerName + " for opening saving account with us";

	@Override
	public String toString() {
		return "SavingAccount [message=" + message + "]";
	}

}
