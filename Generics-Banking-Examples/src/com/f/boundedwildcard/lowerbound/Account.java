package com.f.boundedwildcard.lowerbound;


/**
 * @author Samarth Narula
 *
 */
public class Account {

	protected String customerName;

	public Account(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
