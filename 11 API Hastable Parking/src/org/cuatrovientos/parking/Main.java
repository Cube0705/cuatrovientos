package org.cuatrovientos.parking;

public class Main {
	public static void main(String [] args) {
		Parking parking = new Parking("Nuestra señora del Gorrilla",42);
		Car sampleCar = new Car ("0666EVL","Opel Corsa", "Red");
		Car otherCar = new Car ("0042FER", "Ferrari Enzo","Blue");
		
		parking.addCar(sampleCar);
		parking.addCar(otherCar);
	
		System.out.println("Parking cars: " + parking.showAll());
		
		Car found = parking.searchCar("0666EVL");
		
		if (null != found) {
			System.out.println("Car found : " + found.toString());
		}
	
		parking.removeCar("0666EVL");
		
		System.out.println("Parking cars: " + parking.showAll());
	}
}
