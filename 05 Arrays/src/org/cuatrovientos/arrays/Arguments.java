package org.cuatrovientos.arrays;

/**
 * Simple class for work with the arguments
 * 
 * @author Luis Miño
 *
 */
public class Arguments {
	public static void main(String[] args) {

		if (args.length == 2) {
			String argument1 = args[0];
			int argument2 = Integer.parseInt(args[1]);
			int cont = 1;

			System.out.println("First args " + argument1);
			System.out.println("Second args " + argument2);
			System.out.println("");
			for (int i = 0; i < argument2; i++) {
				System.out.println(cont + " " + argument1);
				cont = cont + 1;
			}
		}
	}
}