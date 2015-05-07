package org.cuatrovientos.methods;

import java.util.*;

/**
 * Simple class for work with methods
 * 
 * @author Luis Miño
 * @version 1.0.1
 */
public class Methods {

	/**
	 * Simple Method for say Hello
	 */
	public static void SayHello() {
		System.out.println("Hello");
	}

	/**
	 * Simple Method for operate with param a and b
	 * 
	 * @param a
	 * @param b
	 * @return the result
	 */
	public static int add(int a, int b) {

		int result = 0;
		result = a + b;
		return result;

	}

	/**
	 * Simple Method for show the date with customized border
	 * 
	 * @param message
	 */
	public static void msg(String message) {
		drawLineCustom("*", 42);
		System.out.println(new Date().toString());
		System.out.println(message);
		drawLineCustom("/\\", 21);

	}

	/**
	 * Simple method for draw a Line
	 */
	public static void drawLine() {
		String line = "";
		for (int i = 0; i < 80; i++) {
			line = line + "-";
		}
		System.out.println(line);
	}

	/**
	 * Simple class for draw a customized Line
	 * 
	 * @param c
	 * @param length
	 */
	public static void drawLineCustom(String c, int length) {
		String line = "";
		for (int i = 0; i < length; i++) {
			line = line + c;
		}
		System.out.println(line);
	}

	/**
	 * Simple method for work with the other methods
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SayHello();
		int c = add(600, 66);
		msg("Result is " + c);

	}
}
