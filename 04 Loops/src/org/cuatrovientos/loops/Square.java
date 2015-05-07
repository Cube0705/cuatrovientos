package org.cuatrovientos.loops;
import java.io.*;
/**
 * Simple class to made a square with *
 * @author Cube
 *
 */
public class Square {
	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = 0;
		int num2 = 0;
		num2 = num2 + 1;
		int num3 = 0;
		num3 = num3 + 1;
		
		System.out.print("Insert a number: ");
		num1 = Integer.parseInt(reader.readLine());
		
		for (int b = 0; b < num1; b++) {
			for (int i = 0; i < num1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
  }
}
