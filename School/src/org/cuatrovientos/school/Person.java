package org.cuatrovientos.school;

/**
 * 
 * @author Luis Miño
 *
 */
public class Person {
	
	/**
	 * Attribute for the name
	 */
	protected String name;
	
	/**
	 * Attribute for the age
	 */
	protected int age;
	
	/**
	 * Empty Constructor
	 */
	public Person() {
		
	}
	
	/**
	 * Constructor with the attributes
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
