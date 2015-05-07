package org.cuatrovientos.hellokitty;

public class Main {

	public static void main(String [] args){
		Basket myBasket = new Basket();
		
		Fruit oneFruit = new Fruit("Apple",4.2f);
		Candy oneSweet = new Candy("Bublegum",100.5f);
		
		myBasket.addtFood(oneFruit);
		myBasket.addtFood(oneSweet);
		
		myBasket.addtFood(new Fruit ("Potato",266.6f));
		
		System.out.println("Total width: ");
		System.out.println(myBasket.pesoTotal());
		
		System.out.println("Basket contents: ");
		System.out.println(myBasket.toString());
		
	}
}
