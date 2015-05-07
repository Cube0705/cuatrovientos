package org.cuatrovientos.oop;

/**
 * Main class for the project
 * 
 * @author Luis Miño
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person onePerson = new Person();
		
		onePerson.name = "Luis";
		onePerson.age = 19;
		
		System.out.println(onePerson.sayHello());
		
		Student oneStudent = new Student();
		oneStudent.name = "Miño";
		
	}

}
