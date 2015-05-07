package org.cuatrovientos.client;

public class Main {
	public static void main(String[] args) {
		Contacts contacts = new Contacts("Luis Miño Picallo");
		Customer myCustomer = new Customer("47371981P", "Luis",
				"Personal@luis.es");
		Customer otherCustomer = new Customer("12345678A", "Enzo",
				"Personal@enzo.es");

		contacts.addCustomer(myCustomer);
		contacts.addCustomer(otherCustomer);

		System.out.println("Contacts: " + "\n" + contacts.showAll());

		Customer found = contacts.searchCustomer("47371981P");

		if (null != found) {
			System.out.println("Customer found : " + "\n" + found.toString()
					+ "\n");

		}

		contacts.removeCustomer("12345678A");

		System.out.println("Contacts: " + "\n" + contacts.showAll());

	}
}
