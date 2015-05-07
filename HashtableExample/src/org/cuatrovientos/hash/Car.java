package org.cuatrovientos.hash;

public class Car {

	private String brand;
	private String plate;
	public Car(String plate, String brand) {
		super();
		this.brand = brand;
		this.plate = plate;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return plate;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.plate = matricula;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Car [Brand=" + brand + ", Matricula=" + plate + "]";
	}
	
	
}
