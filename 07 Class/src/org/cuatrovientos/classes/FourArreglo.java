package org.cuatrovientos.classes;
import java.io.*;

/**
 * Class with the methods for works with an array
 * 
 * @author Cube
 *
 */
public class FourArreglo {

	
	public void show(int Arreglo[]) {
		
		System.out.println("--------------");
		System.out.println("The array have");
		System.out.println("--------------");

		for (int i = 0; i < Arreglo.length; i++) {

			System.out.println((i+1) + ") " + Arreglo[i]);
			
		}
		
		System.out.println("--------------");
	}

	/**
	 * Initialize the Array with 0
	 * 
	 * @param Arreglo
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public void initial(int[] Arreglo) throws NumberFormatException, IOException {	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < Arreglo.length; i++) {

			Arreglo[i] = Integer.parseInt(reader.readLine());
		}
	}

	/**
	 * +1 for the elements in the array
	 * 
	 * @param Arreglo
	 */
	public void addOne(int[] Arreglo) {
		for (int i = 0; i < Arreglo.length; i++) {
			Arreglo[i] = Arreglo[i] + 1;
		}
	}

	/**
	 * -1 for the elements in the array
	 * 
	 * @param Arreglo
	 */
	public void decOne(int[] Arreglo) {
		for (int i = 0; i < Arreglo.length; i++) {
			Arreglo[i] = Arreglo[i] - 1;
		}
	}

	public void Pair(int[] Arreglo) {
		int pair = 0;
		for (int i = 0; i < Arreglo.length; i++) {
			if (Arreglo[i] % 2 == 0) {
				pair = pair + 1;
				System.out.println("The pair numbers: " + Arreglo[i]);
			}
		}
		
		System.out.println("The array have " + pair + " numbers");
	}

}
