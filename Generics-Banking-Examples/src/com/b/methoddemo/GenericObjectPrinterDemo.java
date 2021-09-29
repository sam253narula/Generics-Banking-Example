package com.b.methoddemo;

import com.a.classdemo.Account;

/**
 * @author Samarth Narula
 * 
 */

public class GenericObjectPrinterDemo {

	public static void main(String[] args) {
		GenericObjectPrinter printAccountDetailsUtil = new GenericObjectPrinter();

		Account<String> account_1 = new Account<String>();
		account_1.setNumber("1");
		account_1.setOwnerName("Samarth Narula");

		Account<Integer> account_2 = new Account<Integer>();
		account_2.setNumber(2);
		account_2.setOwnerName("Saif Patel");

		Account[] accounts = { account_1, account_2 };
		printAccountDetailsUtil.print(accounts);

		Bank<String> hdfcBank = new Bank<String>();
		hdfcBank.setBankIdentificationCode("HDFCINBBXXX");
		hdfcBank.setName("HDFC Bank");

		Bank<Integer> iciciBank = new Bank<>();
		iciciBank.setBankIdentificationCode(1234);
		iciciBank.setName("ICICI Bank");

		Bank[] banks = { hdfcBank, iciciBank };
		printAccountDetailsUtil.print(banks);

	}
}
