package org.cuatrovientos.arrays;

import java.io.*;

/**
 * Simple class for operate the average of the array Numbers
 * @author Luis Miño
 *
 */
public class ArrayAverage {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		double group[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int count = 1;
		double average = 0;
		int i;

		for (i = 0; i < 10; i++) {

			System.out.print("Insert the " + count + " number: ");
			group[i] = Integer.parseInt(reader.readLine());
			average = average + group[i];
			count = count + 1;

		}

		average = average / 10;
		System.out.print("The average of the array is : " + average);
	}
}
