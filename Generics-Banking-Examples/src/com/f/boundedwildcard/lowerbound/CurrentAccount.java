package com.f.boundedwildcard.lowerbound;

/**
 * @author Samarth Narula
 *
 */

public class CurrentAccount extends Account {

	public CurrentAccount(String customerName) {
		super(customerName);
	}

	String message = "Thank you MR/Mrs " + customerName + " for opening current account with us";

	@Override
	public String toString() {
		return "CurrentAccount [message=" + message + "]";
	}

}
