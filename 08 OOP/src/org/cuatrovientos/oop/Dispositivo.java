package org.cuatrovientos.oop;

public class Dispositivo {

	public Dispositivo() {
		
	}
	
	protected String Nombre() {
		String name = "";
		return name;
	}
	
	protected String Marca() {
		String marca = "";
		return marca;
	}
	
	protected String Precio() {
		String precio = "";
		return precio;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Dispositivo [Nombre()=" + Nombre() + ", Marca()=" + Marca()
				+ ", Precio()=" + Precio() + "]";
	}
	
	
}
