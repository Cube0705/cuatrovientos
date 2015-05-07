package org.cuatrovientos.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Simke class for write * with a _ in the middle the times that we write
 * @author Cube
 *
 */
public class NumberAs2 {
	public static void main (String [] args) throws NumberFormatException, IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int number;
	
	System.out.print("Insert a positive and even : ");
	number = Integer.parseInt(reader.readLine());
	
	if (number % 2 == 0){
		System.out.print("*");
		for (int i = 0; i < number - 1; i++){
		System.out.print("_*");
		}
		
	} else {
		System.out.println("Is not a even number");
	return;
	}
  }
}
