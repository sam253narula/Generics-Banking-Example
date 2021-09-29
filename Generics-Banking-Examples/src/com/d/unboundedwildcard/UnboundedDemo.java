package com.d.unboundedwildcard;

import java.util.ArrayList;
import java.util.List;

import com.a.classdemo.Account;
import com.a.classdemo.BankAndItsAccounts;
import com.b.methoddemo.Bank;
import com.b.methoddemo.GenericObjectPrinter;

/**
 * @author Samarth Narula
 *
 */

public class UnboundedDemo {

	public static void main(String[] args) {
		MyUnboundedWildCard unboundedWildCard = new MyUnboundedWildCard();
		// Basic code demo below:
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		unboundedWildCard.printTheList(list1);
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Samarth");
		list2.add("Abhishek");
		list2.add("Shiva");
		unboundedWildCard.printTheList(list2);
		
		// Advance code Demo below:
		List<BankAndItsAccounts<Bank, Account>> bankAndItsAccounts = new ArrayList();
		
		//Creating Banks
		Bank<String> hdfcBank = new Bank<String>();
		hdfcBank.setBankIdentificationCode("HDFCINBBXXX");
		hdfcBank.setName("HDFC Bank");

		Bank<Integer> iciciBank = new Bank<>();
		iciciBank.setBankIdentificationCode(1234);
		iciciBank.setName("ICICI Bank");
		
		//Creating Accounts
		Account<String> account_1 = new Account<String>();
		account_1.setNumber("1");
		account_1.setOwnerName("Samarth Narula");

		Account<Integer> account_2 = new Account<Integer>();
		account_2.setNumber(2);
		account_2.setOwnerName("Saif Patel");
		
		//Creating Banks and its account objects
		BankAndItsAccounts<Bank, Account> hdfcBankAndItsAccounts = new BankAndItsAccounts<Bank, Account>();
		hdfcBankAndItsAccounts.setBank(hdfcBank);
		hdfcBankAndItsAccounts.setAccount(account_1);
		
		BankAndItsAccounts<Bank, Account> iciciBankAndItsAccounts = new BankAndItsAccounts<Bank, Account>();
		hdfcBankAndItsAccounts.setBank(iciciBank);
		hdfcBankAndItsAccounts.setAccount(account_2);
		
		//Adding the mapped bank and its account to bankAndItsAccounts list
		bankAndItsAccounts.add(hdfcBankAndItsAccounts);
		bankAndItsAccounts.add(hdfcBankAndItsAccounts);

		// Initializing the Generic Object printer
		GenericObjectPrinter genericObjectPrinter = new GenericObjectPrinter();
		genericObjectPrinter.printList(bankAndItsAccounts);

		
	}
}
