package org.cuatroviento.javakart;

import java.util.Random;

public class Vehiculo {
	
	protected int velocidad;
	protected int aceleracion;
	protected int agarre;
	
	public Vehiculo (String nombre) {
		
	}

	private void inicialiar() {
		Random ran = new Random();
		int rand = 0;
		
		rand = ran.nextInt(18);
		velocidad = rand;
		rand = ran.nextInt(18 - velocidad);
		aceleracion = rand;
		agarre = 18 - (velocidad + aceleracion);
		
	}
	
	public int mover(){
		Random ran = new Random();
		int ret = 0;
		
		ret = velocidad+aceleracion+agarre+ran.nextInt(5);
		
		return ret;
	}
	
	public int maniobrar() {
		Random rand = new Random();
		int ret = 0;
		
		ret = agarre+rand.nextInt(5);
		
		return ret;
	}

	/**
	 * @return the velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * @return the aceleracion
	 */
	public int getAceleracion() {
		return aceleracion;
	}

	/**
	 * @param aceleracion the aceleracion to set
	 */
	public void setAceleracion(int aceleracion) {
		this.aceleracion = aceleracion;
	}

	/**
	 * @return the agarre
	 */
	public int getAgarre() {
		return agarre;
	}

	/**
	 * @param agarre the agarre to set
	 */
	public void setAgarre(int agarre) {
		this.agarre = agarre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Vehiculo [velocidad=" + velocidad + ", aceleracion="
				+ aceleracion + ", agarre=" + agarre + "]";
	}
	
}
