package org.cuatrovientos.controlstructure;

import java.io.*;
/**
 * Simple class to say if the number is positive or negative
 * @author Cube
 *
 */
public class PositiveOrNegative {
	public static void main (String [] args) throws NumberFormatException, IOException {
		
		int ValueOne;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Insert a number: ");
		ValueOne = Integer.parseInt(reader.readLine());
		
		if (ValueOne == 0) {
			System.out.println("The number is 0");
			
		} else {
			if (ValueOne > 0 ){
				System.out.println("The number is positive");
				
			} else {
				System.out.println("The number is negative");
				
			}
		}
	}
	
	
	
	
}
