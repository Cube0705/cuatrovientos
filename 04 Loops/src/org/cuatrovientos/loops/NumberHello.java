package org.cuatrovientos.loops;
import java.io.*;

/**
 * Simple class for say hello the number of times that you write
 * @author Cube
 *
 */
public class NumberHello {
	public static void main (String [] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int enter;
		
		System.out.print("Insert a number: ");
		enter = Integer.parseInt(reader.readLine());
		
		if (enter > 0){
			for (int i = 0; i < enter; i++) {
				System.out.println((i + 1) + " Hello !!");
			}
		} else {
				System.out.println("Only positive numbers");
				return;
		}
	}
}
