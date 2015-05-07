package org.cuatrovientos.methods;
import java.io.*;

/**
 * Simple class for Calculate
 * 
 * @author Luis Miño
 * @version 1.0.1
 * 
 */
public class Calculator {
	/**
	 * Simple method for sum
	 * 
	 * @param numA
	 * @param numB
	 * @return the result
	 */
	public static int add(int numA, int numB) {
		int result = 0;
		result = numA + numB;
		return result;
	}

	/**
	 * Simple method for substract
	 * 
	 * @param numA
	 * @param numB
	 * @return the result
	 */
	public static int sub(int numA, int numB) {
		int result = 0;
		result = numA - numB;
		return result;
	}

	/**
	 * Simple method for divide
	 * 
	 * @param numA
	 * @param numB
	 * @return the result
	 */
	public static int div(int numA, int numB) {
		int result = 0;
		result = numA / numB;
		return result;
	}

	/**
	 * Simple method for multiply
	 * 
	 * @param numA
	 * @param numB
	 * @return the result
	 */
	public static int mul(int numA, int numB) {
		int result = 0;
		result = numA * numB;
		return result;
	}
	
	/**
	 * 
	 * @return the typed number
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static int readNumber() throws NumberFormatException, IOException {
		int enter = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Write a number: ");
		enter = Integer.parseInt(reader.readLine());
		System.out.println("The writed number was " + enter);
		return enter;
	}
	
	/**
	 * Simple method for use the other methods
	 * @param args
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	public static void main (String [] args) throws NumberFormatException, IOException {
		int numA = 0;
		int numB = 0;
		
		numA = readNumber();
		numB = readNumber();
		
		System.out.println("");
		System.out.println("The add of the two number is: " + add(numA,numB) );
		System.out.println("The substract of the two number is: " + sub(numA,numB));
		System.out.println("The Divide of the two number is : " + div(numA,numB));
		System.out.println("The Multiply of the two number is : " + mul(numA,numB));
		
		
	}
	
	
}
