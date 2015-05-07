package org.cuatrovientos.controlstructure;
import java.io.*;

/**
 * Simple class to say if the number is Odd or Even
 * @author Cube
 *
 */
public class OddEven {
	public static void main (String [] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int res;
		
		System.out.print("Write a number: ");
		res = Integer.parseInt(reader.readLine());
		
		if (res % 2 == 0){
			System.out.println("The number " + res + " is even");
			
		} else {
			System.out.println("The numer " + res + " is odd");
		}
		
	}

}
