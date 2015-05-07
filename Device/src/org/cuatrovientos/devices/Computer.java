package org.cuatrovientos.devices;

public class Computer extends Device {


	public Computer(String name, String brand, String price) {
		super(name, brand, price);
	}
	
	private String processor;

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "Computer [processor=" + processor + "]";
	}
	
	
}
