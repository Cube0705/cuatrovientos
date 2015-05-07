package org.cuatrovientos.methods;

import java.io.*;
import java.util.*;

public class Menu {
	
	public static void options() {
		
		System.out.println("Please select: ");
		System.out.println("1) Say Hello");
		System.out.println("2) Insult me");
		System.out.println("3) Say that you love me");
		System.out.println("4) Exit");
		System.out.println("");
		
	}
	
	public static void menuRes(String option) {
		
		switch (option) {
		case "1":
			System.out.println("Hello!!!");
			break;
		case "2":
			insult();
			break;
		case "3":
			System.out.println("<3 <3 I love You <3 <3");
			break;
		case "4":
			System.out.println("Bye Bye !!!");
		default:
			System.out.println("Incorrect option !!");
			break;
		}
		
		System.out.println("");
	}
	
	public static void insult() {
		String[] insult = {"Cocksucker","Queer","Faggot","Bitch","Madafucker"};
		Random random = new Random();
		int index = random.nextInt(insult.length);
		System.out.println(insult[index]);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String option = "";

		do {

			options();
			
			option = reader.readLine();
			System.out.println("");
			
			menuRes(option);
			
		} while (!option.equals("4"));

	}


}