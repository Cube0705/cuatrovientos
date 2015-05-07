package org.cuatrovientos.classes;

import java.io.IOException;

public class FourMainArreglo {
	
	public static void main (String [] args ) throws NumberFormatException, IOException {
		FourArreglo myArreglo = new FourArreglo();
		
		int Arreglo[] = {0,0,0,0,0,0,0,0,0,0};
		
		myArreglo.show(Arreglo);
		myArreglo.initial(Arreglo);
		myArreglo.show(Arreglo);
		myArreglo.addOne(Arreglo);
		myArreglo.show(Arreglo);
		myArreglo.decOne(Arreglo);
		myArreglo.show(Arreglo);
		myArreglo.Pair(Arreglo);
		myArreglo.show(Arreglo);
		
		
	}
	

}
