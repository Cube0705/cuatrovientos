package org.cuatrovientos.hellokitty;

/**
 * 
 * @author Luis Mi�o
 *
 */
public class Candy extends Food {

	private int cal;

	public Candy(String name, float weight) {
		super(name, weight);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "Candy [cal=" + cal + "]";
	}
	
	

}
