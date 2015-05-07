package org.cuatrovientos.loops;

import java.io.*;
/**
 * Simple class for make the factorial of the number
 * @author Cube
 *
 */
public class Factorial {
	
	public static void main (String [] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num1;
		int fact = 0;
		
		System.out.print("Insert the number: ");
		num1 = Integer.parseInt(reader.readLine());
		
		//While
		
		fact = num1;
		num1 = num1 - 1;
		
		while (num1 > 1){
			fact = fact * num1;
			num1 = num1 - 1;
		}
		
		//For
		
		// for (int i = num1; i>1; i--) {
		
		System.out.println("The factorial number is " + fact );
		}
		
		
	}

