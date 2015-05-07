/**
 * 
 */
package org.cuatrovientos.mehcanic;

import java.util.*;

/**
 * @author Luis Miño
 * @version 1.5.0
 */
public class Deck  {
	private String Number[]= {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
	private String Suit[] = {"Spades","Hearths","Clubs","Diamonds"};
	private Vector<Deck> Baraja;

	/**
	 * Default Constructor, initialize the vector
	 */
	public Deck () {
		
		Baraja = new Vector<Deck>();
		String Card = "";
		int count = 0;
		for (int i = 0; i<Suit.length;i++) {
			for (int j = 0; j<Number.length;j++) {
				count++;
				Card = Number[j] + Suit[i];
				Baraja.add(count,Card);
			}
				
			}
	}
	 

}
	
