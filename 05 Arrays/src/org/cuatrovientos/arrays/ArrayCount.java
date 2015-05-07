package org.cuatrovientos.arrays;

import java.io.*;

/**
 * Simple Class to count the positive, negatives and Zero Numbers in the array
 * @author Luis Miño
 *
 */

public class ArrayCount {
	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		int group[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int count = 1;
		int countPos = 0;
		int countNeg = 0;
		int countZero = 0;
		int i;

		for (i = 0; i < 10; i++) {

			System.out.print("Insert the " + count + " number: ");
			group[i] = Integer.parseInt(reader.readLine());
			count = count + 1;

		}
		for (i = 0; i < 10; i++) {
			if (group[i] != 0) {
				if (group[i] > 0) {
					countPos = countPos + 1;
				}
				if (group[i] < 0) {
					countNeg = countNeg + 1;
				}
			} else {
				countZero = countZero + 1;
			}
		}

		System.out.println("");
		System.out.println("The array have " + countPos + " positive Numbers");
		System.out.println("The array have " + countNeg + " negative Numbers");
		System.out.println("The array have " + countZero + " Zeros ");
	}
}
