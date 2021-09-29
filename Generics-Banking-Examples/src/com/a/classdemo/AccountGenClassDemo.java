package com.a.classdemo;

/**
 * 
 * @author Samarth Narula
 * 
 * Type Parameter :
 * 1. T -> Type
 * 2. E -> Element
 * 3. K -> Key
 * 4. N -> Number
 * 5. V -> Value
 *
 */
public class AccountGenClassDemo {
	
	public static void main(String[] args) {
		Account<String> account_1 = new Account<String>();
		account_1.setNumber("1");
		account_1.setOwnerName("Samarth Narula");
		System.out.printf("Account number : %s , Account owner name: %s \n", account_1.getNumber(), account_1.getOwnerName());
		
		Account<Integer> account_2 = new Account<Integer>();
		account_2.setNumber(2);
		account_2.setOwnerName("Saif Patel");
		System.out.printf("Account number : %s , Account owner name: %s", account_2.getNumber(), account_2.getOwnerName());		
	}
}
