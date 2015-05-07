package org.cuatrovientos.galactic;

import java.util.*;

public class Fleet {

	private String fleetName;
	private Hashtable<Commander, Ship> ships;

	public Fleet(String fleetName) {
		super();
		this.fleetName = fleetName;
		ships = new Hashtable<Commander, Ship>();
	}

	public String fleetName() {
		return fleetName;

	}

	public Ship searchShip(Commander commander) {

		Ship ship = null;
		ship = ships.get(commander);
		return ship;
	}

	public void removeShip(Commander commander) {
		ships.remove(commander);
	}
	
	public void addShip(Ship ship) {
		ships.put(ship.getCommander(), ship);
	}
	
	public String showAll() {
		String allShips = "";
		
		Enumeration<Commander> keys = ships.keys();
		
		while (keys.hasMoreElements()) {
			Commander name = keys.nextElement();
			allShips = allShips + ships.get(name).toString() + "\n";
					
		}
		
		return allShips;
	
	}

}
