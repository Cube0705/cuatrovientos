/**
 * 
 */
package org.cuatrovientos.classes;

/**
 * @author Cube
 *
 */
public class ZeroMainDice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ZeroDice mySimpleDice = new ZeroDice();
		System.out.println("Roll result " + mySimpleDice.roll());

		ZeroDice myProDice = new ZeroDice(10);
		System.out.println("Roll result " + myProDice.roll());

		mySimpleDice.setSides(100);
		System.out.println("Roll result " + mySimpleDice.roll());
	}

}
