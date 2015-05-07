package org.cuatrovientos.arrays;

import java.io.*;
/**
 * Simple Class to input numbers in the array and add 1 more to the values
 * @author Luis Miño
 *
 */
public class Increase {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int group[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int count = 1;

		for (int i = 0; i < 10; i++) {
			System.out.print("Insert the " + count + " number: ");
			group[i] = Integer.parseInt(reader.readLine());
			count = count + 1;
		}
		
		count = 1;
		System.out.println("");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("The " + count + " inserted was: " + group[i]);
			count = count + 1;
		}
		
		System.out.println("");
		System.out.println("The result is.....");
		System.out.println("");
		
		count = 1;
		for (int i = 0; i < 10; i++) {
			group[i] = group[i] + 1;
			System.out.println("The " + count + " operated number is: " + group[i]);
			count = count + 1;
		}
	}
}
