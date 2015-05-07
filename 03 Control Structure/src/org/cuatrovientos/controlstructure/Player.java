package org.cuatrovientos.controlstructure;
import java.io.*;

/**
 * Simple class to say the position of the player
 * @author Cube
 *
 */
public class Player {
	public static void main (String [] args) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int number;
		
		System.out.print("Insert the number of your T-Shirt: ");
		number = Integer.parseInt(reader.readLine());

		switch (number) {
			case 1:
			case 3:
			case 4:
			case 5:
				System.out.println("Goalkepper");
				break;
			case 6:
			case 8:
			case 11:
				System.out.println("Defense");
				break;
			case 9:
				System.out.println("Forward");
				break;
			default :
				System.out.println("Polivalent");
				break;
				
		}
	}
}
