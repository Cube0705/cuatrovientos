package org.cuatrovientos.client;

import java.util.*;

public class Contacts {

	private String owner;
	private Hashtable<String,Customer> customers;
	
	/**
	 * Constructor
	 * @param owner
	 */
	public Contacts(String owner) {
		super();
		this.owner = owner;
		customers = new Hashtable<String,Customer>();
	}
	
	/**
	 * Add a customer
	 * @param c
	 */
	public void addCustomer(Customer customer) {
		customers.put(customer.getDni(), customer);
	}
	
	/**
	 * Search a Customer in the Hashtable
	 * @param dni
	 * @return cus
	 */
	public Customer searchCustomer(String dni) {
		
		Customer cus = null;
		cus = customers.get(dni);
		return cus;
	}
	
	/**
	 * Remove a data of the Hashtable
	 * @param dni
	 */
	public void removeCustomer(String dni) {
		customers.remove(dni);
	}
	
	/**
	 * Show all the data in the Hashtable
	 * @return allCustomers;
	 */
	public String showAll() {
		String allCustomers = "";
		
		Enumeration<String> keys = customers.keys();
		
		while (keys.hasMoreElements()) {
			String dni = keys.nextElement();
			allCustomers = allCustomers + customers.get(dni).toString() + "\n";
					
		}
		
		return allCustomers;
	
	}
}
