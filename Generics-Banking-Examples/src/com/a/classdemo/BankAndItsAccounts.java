package com.a.classdemo;

import java.util.List;

/**
 * @author Samarth Narula
 * 
 */

public class BankAndItsAccounts<T, U> {

	private T bank;
	private List<U> accounts;

	public T getBank() {
		return bank;
	}

	public void setBank(T bank) {
		this.bank = bank;
	}

	public List<U> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<U> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return "BankAndItsAccounts [bank=" + bank + ", accounts=" + accounts + "]";
	}




}
