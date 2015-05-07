package org.cuatrovientos.galactic;

public class Main {
	public static void main(String [] args) {
		/*
		 * Instancia de flota
		 */
		Fleet myFleet = new Fleet ("MuerteYDestruccón");
	
		/*
		 * Tres instancias de Commander
		 */
		Commander myCommander = new Commander ("Luis", 45);
		Commander otherCommander = new Commander ("Cube", 50);
		Commander myOtherCommander = new Commander ("Kone", 40);
		
		/*
		 * Tes intstancias Ship
		 */
		Ship myShip = new Ship (55,45,true,myCommander);
		Ship otherShip = new Ship (40, 60, false,otherCommander);
		Ship myOtherShip = new Ship (45,50, true,myOtherCommander);
	
		/*
		 * Introduciendo Ships en la Fleet
		 */
		myFleet.addShip(myShip);
		myFleet.addShip(otherShip);
		myFleet.addShip(myOtherShip);
		
		System.out.println(myFleet.showAll());
		
		myFleet.removeShip(myOtherCommander);
		
		System.out.println(myFleet.showAll());
		
	}

}
