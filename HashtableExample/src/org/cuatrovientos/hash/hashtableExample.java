package org.cuatrovientos.hash;

import java.util.*;

public class hashtableExample {

	public static void main(String[] args) {
		Hashtable<String, Car> cars = new Hashtable<String, Car>();

		Car myCar = new Car("0666EVL","Delorean");
		
		cars.put("0666EVL", myCar);
		
		Car otherCar = new Car ("0042ASI", "Opel Corsa");
		
		cars.put(otherCar.getMatricula(), otherCar);
		
		cars.put("0095MAQ", new Car("0095MAQ","Lightning Mcqueen"));
	
		System.out.println(cars.get("0666EVL").toString());
		
		cars.remove("0042ASI");
		
		if (cars.get("0042ASI") == null) {
			System.out.println("Thtat car doesn't exist");
		}
		
		Enumeration<String> keys = cars.keys();
		
		while (keys.hasMoreElements()) {
			String k = keys.nextElement();
			System.out.println(cars.get(k));
		}
	}
	
	

}
