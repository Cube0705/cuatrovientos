package org.cuatrovientos.loops;

/**
 * Simple class to make all the tables of multiply
 * @author Cube
 *
 */
public class Tables {
	public static void main (String [] args) {

	int counter1 = 0;
	int counter2 = 0;
	
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				System.out.println(counter1 + "x" + counter2 + "=" + (counter1*counter2));
				counter2 = counter2 + 1;
			}
			counter2 = 0;
			counter1 = counter1 + 1;
			System.out.println("");
		}
	}
}
