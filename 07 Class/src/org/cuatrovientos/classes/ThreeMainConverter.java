/**
 * 
 */
package org.cuatrovientos.classes;

import java.io.*;

/**
 * @author Cube
 *
 */
public class ThreeMainConverter {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		ThreeConversor myConver = new ThreeConversor();
		
		double cantidad = 0;

		System.out.print("Insert the quantity : ");
		cantidad = Integer.parseInt(reader.readLine());
		
		System.out.println("The value in € of " + cantidad + " ptas. is :" + myConver.pesetasAEuros(cantidad));
		System.out.println("");

		System.out.println("The value in Ptas. of " + cantidad + " € is :" + myConver.eurosAPesetas(cantidad));
		System.out.println("");
		
		System.out.println("The value in Dolares. of " + cantidad + " € is :" + myConver.eurosADolares(cantidad));
		System.out.println("");
		
		System.out.println("The value in Euros of " + cantidad + " $ is :" + myConver.dolaresAEuros(cantidad));
		System.out.println("");
		
		System.out.println("The value in Libras of " + cantidad + " € is :" + myConver.eurosALibras(cantidad));
		System.out.println("");
		
		System.out.println("The value in Euros of " + cantidad + " Libras is :" + myConver.librasAEuros(cantidad));
		System.out.println("");
	}

}
