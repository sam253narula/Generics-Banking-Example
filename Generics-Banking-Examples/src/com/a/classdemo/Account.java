package com.a.classdemo;
/**
 * @author Samarth Narula
 * 
 */

public class Account<T> {

	private T number;
	private String ownerName;

	public T getNumber() {
		return number;
	}

	public void setNumber(T number) {
		this.number = number;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", ownerName=" + ownerName + "]";
	}

	
}
