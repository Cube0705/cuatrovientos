package org.cuatrovientos.controlstructure;
import java.io.*;

/**
 * Simple class to convert cash
 * @author Cube
 *
 */

public class Conversor {
	public static void main (String [] args) throws NumberFormatException, IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		float euros, yen, libra, dolar;
		String s;
		
		System.out.print("Insert the cuantee in Euros: ");
		euros = Float.parseFloat(reader.readLine());
		
		dolar = (float) (euros * 1.27);
		yen = (float) (euros * 137);
		libra = (float) (euros * 0.78);
		
		System.out.print("For convert to Dolar(D), for Yen(Y) and for Libra(L): ");
		s = reader.readLine();
		
		switch (s) {
			case "D":
				System.out.println(euros + " euros was " + dolar + " dolars");
				break;
			case "d":
				System.out.println(euros + " euros was " + dolar + " dolars" );
				break;
			case "Y":
				System.out.println(euros + " euros was " + yen + " yens" );
				break;
			case "y":
				System.out.println(euros + " euros was " + yen + " yens" );
				break;
			case "L":
				System.out.println(euros + " euros was " + libra + " Libras" );
				break;
			case "l":
				System.out.println(euros + " euros was " + libra + " Libras" );
				break;
		}
	}
	
}
