package org.cuatrovientos.devices;

public class Mobile extends Device {

	public Mobile(String name, String brand, String price) {
		super(name, brand, price);
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "Mobile [number=" + number + "]";
	}


	private String number;
	
	public String call(int call){
		return "Llamando a número : " + call;
	}
	
	
}
