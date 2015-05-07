package org.cuatrovientos.arrays;

import java.io.*;

/**
 * Simple class for input numbers and show it
 * 
 * @author Luis Miño
 *
 */
public class ArrayPlus {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int counter = 0;
		int[] num = { 5, 10, 125, 11, 64, 10, 96, 52, 90, 69 };

		for (int i = 0; i < num.length; i++) {
			System.out.print("The element nº" + counter + " is :");
			num[i] = Integer.parseInt(reader.readLine());
			counter = counter + 1;
		}

		for (int i = 0; i < num.length; i++) {
			num[i] = num[i] + 1;
			System.out.println("Element nº" + counter + " = " + num[i]);
			counter = counter + 1;
		}

	}
}
