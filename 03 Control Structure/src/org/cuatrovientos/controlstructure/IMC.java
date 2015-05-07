package org.cuatrovientos.controlstructure;

import java.io.*;

/**
 * Simple calass to say if you are FAT
 * @author Cube
 *
 */
public class IMC {

	public static void main (String [] args) throws NumberFormatException, IOException{
		
		int weight, height, result;
	
		// This create a reader of strings
		BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
		
		// This take the number of Kg that you write
		System.out.print("Input your wheight in Kg : ");
		weight = Integer.parseInt(reader.readLine());
		
		// This take the number of Cm that you write
		System.out.print("Input your height in cm : ");
		height = Integer.parseInt(reader.readLine());
		
		// This is the operation that save the resutl in the variable resutl.
		result = ((weight / (height * height)) * 10000);
		
		System.out.println(result);
		
		if (result <= 15) {
			System.out.println("You need eat more");
		} else {
			if (result < 25){
				System.out.println("You are OK");
			} else {
				if (result <= 30) {
					System.out.println("Be careful!! Your health is very important");
				} else {
					System.out.println("GO TO THE HOSPITAL !!!!!");
				}
			}
		}
	}
}

