package org.cuatrovientos.parking;

import java.util.Enumeration;
import java.util.Hashtable;

public class Parking {

	private String name;
	private int capacity;
	private Hashtable<String,Car> places;
	
	public Parking(String name, int capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
		places = new Hashtable<String,Car>();
		
	}
	
	public void addCar (Car car) {
		if (places.size() < capacity) {
		places.put(car.getPlate(), car);
		}
		
	}
	
	public Car searchCar(String plate) {
		
		Car car = null;
		car = places.get(plate);
		
		return car;
	}
	
	public void removeCar(String plate) {
		
		places.remove(plate);
		
	}
	
	public String showAll() {
		String allCars = "";
		
		Enumeration<String> keys = places.keys();
		
		while (keys.hasMoreElements()) {
			String plate = keys.nextElement();
			allCars = allCars + places.get(plate).toString() + "\n";
					
		}
		return allCars;
	}
}
