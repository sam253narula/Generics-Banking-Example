package com.a.classdemo;

/**
 * @author Samarth Narula
 * 
 */

public class BankAndItsAccounts<T, U> {

	private T bank;
	private U account;

	public T getBank() {
		return bank;
	}

	public void setBank(T bank) {
		this.bank = bank;
	}

	public U getAccount() {
		return account;
	}

	public void setAccount(U account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Bank And Its Accounts [bank=" + bank + ", account=" + account + "]";
	}

}
