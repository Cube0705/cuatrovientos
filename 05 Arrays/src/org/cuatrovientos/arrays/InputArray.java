package org.cuatrovientos.arrays;

import java.io.*;

/**
 * Simple class for input Strings in the array and show in console
 * 
 * @author Luis Mi�o
 *
 */
public class InputArray {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		String[] word = { "", "", "", "" };
		int counter = 1;

		for (int i = 0; i < word.length; i++) {
			System.out.print("The name n�" + counter + " : ");
			counter = counter + 1;
			word[i] = reader.readLine();
		}

		System.out.println("");

		counter = 1;
		for (int i = 0; i < word.length; i++) {
			System.out.println("The name n�" + counter + " is " + word[i]);
			counter = counter + 1;
		}
	}

}
