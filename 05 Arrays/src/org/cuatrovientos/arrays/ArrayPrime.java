package org.cuatrovientos.arrays;

import java.io.*;

public class ArrayPrime {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		int group[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int count = 1;
		int countPri = 0;
		int countNoP = 0;
		int i;
		int divisor = 2;
		boolean resul = false;

		for (i = 0; i < 10; i++) {

			System.out.print("Insert the " + count + " number: ");
			group[i] = Integer.parseInt(reader.readLine());
			count = count + 1;

		}
		
		System.out.println("");

		count = 0;
		for (i = 0; i < 10; i++) {
			resul = false;
			count = count + 1;
			divisor = 2;

			while (!resul && divisor < group[i]) {

				if (group[i] % divisor == 0) {

					resul = true;

				} else {
					divisor++;
				}

			}

			if (resul) {
				System.out.println("The number " + count + " isn't prime");
				countNoP = countNoP + 1;

			} else {
				System.out.println("The number " + count + " is prime");
				countPri = countPri + 1;
			}

		}

		System.out.println("");
		System.out.println("The array have " + countPri + " prime numbers");
		System.out.println("The array have " + countNoP + " no prime numbers");

	}
}
