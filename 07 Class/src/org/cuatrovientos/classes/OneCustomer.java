package org.cuatrovientos.classes;

/**
 * 
 * @author Luis Miño
 *
 */
public class OneCustomer {
	private String name;
	private String phone;

	public void sayHello() {
		System.out.println("Hello,my name is " + name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
