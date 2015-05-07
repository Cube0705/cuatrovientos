package org.cuatrovientos.classes;

public class OneMainCustomer {

	public static void main(String [] args) {
		OneCustomer oneCustomer;
		OneCustomer anotherCustomer;
		
		oneCustomer = new OneCustomer();
		oneCustomer.setName("Luis");
		
		oneCustomer.sayHello();
		
		anotherCustomer = oneCustomer;
		
		anotherCustomer.sayHello();
	}
}
