package com.b.methoddemo;

import java.util.List;

/**
 * @author Samarth Narula
 * 
 */

public class GenericObjectPrinter {

	public <E> void print(E[] elements) {
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
	}

	public <E> void printList(List<E> elements) {
		for (int i = 0; i < elements.size(); i++) {
			System.out.println(elements.get(i));
		}
	}

}
