package org.cuatrovientos.hellokitty;

/**
 * 
 * @author Luis Miño
 *
 */
public class Fruit extends Food {

	private String vitamina;
	
	public Fruit(String name, float weight) {
		super(name, weight);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "Fruit [vitamina=" + vitamina + "]";
	}

	
}
