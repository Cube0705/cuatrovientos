package org.cuatrovientos.classes;

public class ThreeConversor {

	public ThreeConversor() {

	}

	public double pesetasAEuros(double cantidad) {
		double conver = 0;

		conver = cantidad / 166.386;
		return conver;
	}

	public double eurosAPesetas(double cantidad) {
		double conver = 0;
		
		conver = cantidad * 166.386;
		return conver;
	}

	public double eurosADolares(double cantidad) {
		double conver = 0;
		
		conver = cantidad * 1.255;
		return conver;

	}

	public double dolaresAEuros(double cantidad) {
		double conver = 0;
		
		conver = cantidad / 1.255;
		return conver;

	}

	
	public double eurosALibras(double cantidad) {
		double conver = 0;
		
		conver = cantidad * 0.79;
		return conver;
	}
	public double librasAEuros(double cantidad) {
		double conver = 0;
		
		conver = cantidad / 0.79;
		return conver;

	}

}
