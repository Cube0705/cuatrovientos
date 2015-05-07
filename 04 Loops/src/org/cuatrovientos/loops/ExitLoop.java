package org.cuatrovientos.loops;


import java.io.*;

/**
 * Simple class for finish the program when you write Exit
 * @author Cube
 *
 */
public class ExitLoop {
	public static void main (String [] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String enter = "";
		
		while (!"Exit".equals(enter)) {

			System.out.println("Insert a word, (Exit for stop the loop)");	
			enter = reader.readLine();
		}
		
		System.out.println("You Write Exit!!");
	}
  }
