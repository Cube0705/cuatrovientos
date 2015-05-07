/**
 * 
 */
package org.cuatrovientos.mehcanic;

import java.util.Hashtable;

/**
 * @author Luis Miño
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<String,Deck> Decks = new Hashtable<String,Deck>();
		
		Deck myDeck = new Deck("AS",1);
		Decks.put("AS", myDeck);
		Decks.put("2S", new Deck("2S",2));
		Decks.put("3S", new Deck("3S",3));
		Decks.put("4S", new Deck("4S",4));
		Decks.put("5S", new Deck("5S",5));
		Decks.put("6S", new Deck("6S",6));
		Decks.put("7S", new Deck("7S",7));
		Decks.put("8S", new Deck("8S",8));
		Decks.put("9S", new Deck("9S",9));
		Decks.put("10S", new Deck("10S",10));
		Decks.put("JS", new Deck("JS",11));
		Decks.put("QS", new Deck("QS",12));
		Decks.put("KS", new Deck("KS",13));
		Decks.put("AH", new Deck("AH",14));
		Decks.put("2H", new Deck("2H",15));
		Decks.put("3H", new Deck("3H",16));
		Decks.put("4H", new Deck("4H",17));
		Decks.put("5H", new Deck("5H",18));
		Decks.put("6H", new Deck("6H",19));
		Decks.put("7H", new Deck("7H",20));
		Decks.put("8H", new Deck("8H",21));
		Decks.put("9H", new Deck("9H",22));
		Decks.put("10H", new Deck("10H",23));
		Decks.put("JH", new Deck("JH",24));
		Decks.put("QH", new Deck("QH",25));
		Decks.put("KH", new Deck("KH",26));
		Decks.put("AC", new Deck("AC",27));
		Decks.put("2C", new Deck("2C",28));
		Decks.put("3C", new Deck("3C",29));
		Decks.put("4C", new Deck("4C",30));
		Decks.put("5C", new Deck("5C",31));
		Decks.put("6C", new Deck("6C",32));
		Decks.put("7C", new Deck("7C",33));
		Decks.put("8C", new Deck("8C",34));
		Decks.put("9C", new Deck("9C",35));
		Decks.put("10C", new Deck("10C",36));
		Decks.put("JC", new Deck("JC",37));
		Decks.put("QC", new Deck("QC",38));
		Decks.put("KC", new Deck("KC",39));
		Decks.put("AD", new Deck("AD",40));
		Decks.put("2D", new Deck("2D",41));
		Decks.put("3D", new Deck("3D",42));
		Decks.put("4D", new Deck("4D",43));
		Decks.put("5D", new Deck("5D",44));
		Decks.put("6D", new Deck("6D",45));
		Decks.put("7D", new Deck("7D",46));
		Decks.put("8D", new Deck("8D",47));
		Decks.put("9D", new Deck("9D",48));
		Decks.put("10D", new Deck("10D",49));
		Decks.put("JD", new Deck("JD",50));
		Decks.put("QD", new Deck("QD",51));
		Decks.put("KD", new Deck("KH",52));
		
		
	}

}
