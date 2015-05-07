package org.cuatrovientos.loops;

import java.io.*;

/**
 * Simple class to say if the number is prime
 * @author Cube
 *
 */
public class NumPri {
	
	public static void main (String [] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		


		int num;
		int divisor=2;
		boolean resul=false;

		System.out.println("Insert a number: " ) ;
		num = Integer.parseInt(reader.readLine());

		while(!resul && divisor<num) { 
			if (num%divisor==0) {
				resul=true;
			} else { 
				divisor++;
			}
		}
		
		if (resul) {
			System.out.println("Isn't a prime number" ) ; 
		} else {
			System.out.println("Is a prime number" ) ;
		}
	}
}
