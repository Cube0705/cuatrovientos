/**
 * 
 */
package org.cuatrovientos.classes;

import java.util.Random;

/**
 * @author Cube
 *
 */
public class ZeroDice {

	private int sides;

	/**
	 * Default Constructor
	 */
	public ZeroDice() {
		sides = 6;
	}

	/**
	 * Constructor with sides defined
	 * 
	 * @param sides
	 */
	public ZeroDice(int sides) {
		this.sides = sides;
	}

	/**
	 * Roll the dice
	 * 
	 * @return
	 */
	public int roll() {
		int result = 0;
		Random random = new Random();
		result = random.nextInt(sides) + 1;

		return result;
	}

	/**
	 * @return the sides
	 */
	public int getSides() {
		return sides;
	}

	/**
	 * @param sides
	 *            the sides to set
	 */
	public void setSides(int sides) {
		this.sides = sides;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
