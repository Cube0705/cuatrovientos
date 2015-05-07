package org.cuatrovientos.controlstructure;
import java.io.*;

/**
 * Simple class to say if the number is Even or Odd and positive or negative
 * @author Cube
 *
 */
public class OddEvenPosNeg {
	
	public static void main (String [] args) throws NumberFormatException, IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	int num;
	
	System.out.print("Insert a number: ");
	num = Integer.parseInt(reader.readLine());
	
	if (num == 0) {
		
		System.out.println("The number is 0");

	} else {
		if (num % 2 == 0){
			if (num > 0){
				
				System.out.println("The number " + num + " is even and positive");
				
				} else {
					
					System.out.print("The number " + num + " is even and negative");
					
				} 
		}
		
		if (num % 2 != 0){
			
			if (num > 0){
				
				System.out.println("The number " + num + " is odd and positive");	
				
			} else {
				
					System.out.println("The number " + num + " is odd and negative");
				
			}
		}
	}
	}
}
