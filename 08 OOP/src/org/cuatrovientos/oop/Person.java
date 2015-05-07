package org.cuatrovientos.oop;

/**
 * Represents a regular person
 * 
 * @author Luis Miño
 *
 */

public class Person {

	public String name;
	protected int age;
	private String phone;

	/**
	 * Default constructor
	 */
	public Person() {

		name = "Cube";
		age = 20;
		phone = "000000000";

	}

	/**
	 * Say Hello
	 * 
	 * @return Hello
	 */
	public String sayHello() {
		return "Hello";
	}

	/**
	 * Returns hello
	 * 
	 * @return hello
	 */
	private String hello() {
		return "hello";
	}
}
