package org.cuatrovientos.controlstructure;
import java.io.*;

/**
 * Simple class to say if the first number is multiply of the second number
 * @author Cube
 *
 */
public class Multiply {
	public static void main (String [] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num1;
		int num2;
		
		System.out.print("Insert the first number: ");
		num1 = Integer.parseInt(reader.readLine());
		
		System.out.print("Insert the second number: ");
		num2 = Integer.parseInt(reader.readLine());
		
		if (num2 % num1 == 0) {
			System.out.println("The " + num2 + " is multiple of " + num1 );
		} else {
			System.out.println("The " + num1 + " is not multiple of " + num2);
			
		}
	}
	
	
}
