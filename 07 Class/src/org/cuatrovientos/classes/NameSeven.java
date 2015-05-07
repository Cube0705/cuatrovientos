package org.cuatrovientos.classes;

import java.util.*;
import java.io.*;

public class NameSeven {
	private static String Name (int lec){
		
		Random random = new Random();
		
		String name = "";
		String voc = "";
		String con = "";
		
		
		String conson[] = {"q","w","r","t","y","p","s","d","f","g","h","j","k","l","ñ","z","x","c","v","b","n","m"};
		String vocals[] = {"a","e","i","o","u"};
		
		for (int i = 0;i < lec; i++) {
			
			int nu1 = random.nextInt(2);
			int numv = random.nextInt(5);
			int numc = random.nextInt(21);
			
			if (nu1 == 1) {
				voc = vocals[numv];
			}
			
			if (nu1 == 0) {
				con = conson[numc];
			}
			
			nu1 = random.nextInt(2);
			
			if (nu1 == 0) {
				name = name + voc;
				
			} else {
				name = name + con;
				
			}
			
		}
		
		return name;
	
	}
	
	public static void main (String [] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String lec = "";
		
		while (lec != "exit") { 
			
		System.out.print("Insert the name lenght :");
		lec = reader.readLine();
		
		int num = 0;
		num = Integer.parseInt(lec);
		
		System.out.println(Name(num));
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
