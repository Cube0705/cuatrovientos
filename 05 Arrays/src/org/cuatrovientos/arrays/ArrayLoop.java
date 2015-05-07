package org.cuatrovientos.arrays;

/**
 * Simple class for show the elements of an Array
 * 
 * @author Luis Miño
 *
 */

public class ArrayLoop {
	public static void main(String[] args) {
		int[] num = { 5, 10, 125, 11, 64, 12, 96, 52, 90, 69 };
		int counter = 1;

		for (int i = 0; i < num.length; i++) {
			System.out.println("The element nº" + counter + " is " + num[i]);
			counter = counter + 1;
		}
	}

}
