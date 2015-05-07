package org.cuatrovientos.arrays;

import java.io.*;

/**
 * Simple class for know if the number is repeated in the array
 * 
 * @author Luis Miño
 *
 */
public class ArrayRepeat {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int[] num = { 5, 10, 125, 11, 64, 10, 96, 52, 90, 69 };
		int counter = 1;
		String line = "";

		for (int i = 0; i < num.length; i++) {
			System.out.print("The element nº" + counter + " is :");

			num[i] = Integer.parseInt(reader.readLine());
			counter = counter + 1;
		}

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; i++) {
				if (num[i] == num[j]) {
					System.out.println("Number Repeated");
				} else {
					System.out.println("Numbers no repeated");
				}
				return;
			}
		}
	}
}
