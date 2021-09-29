package com.b.methoddemo;

/**
 * @author Samarth Narula
 * 
 */

public class Bank<T> {
	/*
	 * A BIC (Bank Identifier Code) is the SWIFT Address assigned to a bank in order
	 * to send automated payments quickly and accurately to the banks concerned. It
	 * uniquely identifies the name and country, (and sometimes the branch) of the
	 * bank involved
	 */
	private T bankIdentificationCode;
	
	private String name;

	public T getBankIdentificationCode() {
		return bankIdentificationCode;
	}

	public void setBankIdentificationCode(T bankIdentificationCode) {
		this.bankIdentificationCode = bankIdentificationCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bank [bankIdentificationCode=" + bankIdentificationCode + ", name=" + name + "]";
	}
	
}
