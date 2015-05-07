package org.cuatrovientos.hellokitty;

import java.util.Vector;

/**
 * 
 * @author Luis Miño
 *
 */
public class Basket {
	private Vector<Food> foods;
	
	public Basket () {
		foods =new Vector <Food>();
		
	}
	
	public void addtFood(Food food) {
		foods.add(food);
	}
	public float pesoTotal(){
		float total = 0;
		
		for (int i = 0; i<foods.size();i++) {
			total = total + foods.elementAt(i).getWeight();	
			}
	
		return total;
	}

	public String toString(){
		String content = "";
		
		for (int i = 0; i<foods.size();i++) {
			content = content + foods.elementAt(i).toString() + "\n" ;
			
			}
	
		return content;
	}

}
