package org.cuatrovientos.controlstructure;
import java.io.*;

/**
 * Simple class to say what number is bigger
 * @author Cube
 *
 */
public class BiggerThan {
	
	public static void main (String [] args) throws NumberFormatException, IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num1;
		int num2;
		
		System.out.print("Input the first number: ");
		num1 = Integer.parseInt(reader.readLine());
		
		System.out.print("Input the second number: ");
		num2 = Integer.parseInt(reader.readLine());
		
		if (num1 == num2){
			System.out.println("The first number is equal to the second number");
		} else {
			if (num1 > num2) {
				System.out.println("The first number is bigger than the second number");
				
			} else {
				System.out.println("The second number is bigger than the first number");
				
			}
		}
	}

}
