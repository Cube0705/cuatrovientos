package org.cuatroviento.javakart;

public class Coche extends Vehiculo{

	public String matricula;
	
	public Coche(String nombre) {
		super(nombre);
		
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}
