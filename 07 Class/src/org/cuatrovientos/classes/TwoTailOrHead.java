package org.cuatrovientos.classes;

import java.util.Random;

/**
 * Simple class to flip a coin
 * @author Cube
 *
 */
public class TwoTailOrHead {


	private static String Tail = "Tail";
	
	private static String Head = "Head";
	
	public static String result () {
		int res;
		String flip;
		Random random = new Random();
		
		res = random.nextInt(2);
		
		if (res == 0) {
			flip = Tail;
		} else {
			flip = Head;
		}
		return flip;
	}
	

	
	public static void main (String [] args) {
		
		System.out.println("In the coin we can see the " + result());
		
	}
}
