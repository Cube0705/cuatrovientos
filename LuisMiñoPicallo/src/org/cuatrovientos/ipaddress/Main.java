package org.cuatrovientos.ipaddress;

import java.io.*;
import java.util.*;

public class Main {

	/**
	 * Simple method for show the Menu
	 */
	public static void menu() {

		System.out.println("Select a option:");
		System.out.println("");
		System.out.println("1. Show the elements of the array");
		System.out.println("2. Put in the array random IP and show the array");
		System.out.println("3. Summary of the IP");
		System.out.println("4. Exit");
		System.out.println("");
		System.out.print("Type your option...: ");

	}

	/**
	 * Simple method for choose the Option
	 * 
	 * @param option
	 */
	public static void Options(String option, String[] ipAddresses,String ip, int num1 ) {

		switch (option) {
		case "1":
			showArray(ipAddresses);
			break;
		case "2":
			loadArray(ipAddresses, ip, num1);
			showArray(ipAddresses);
			break;
		case "3":
			summary(ipAddresses, num1);
			break;
		case "4":
			System.out.println("Bye Bye!!!!");
			break;
		default:
			System.out.println("Incorrect option");
			break;

		}
	}

	/**
	 * Simple method for show the values of the array
	 * 
	 * @param ipAddresses
	 */
	public static void showArray(String[] ipAddresses) {
		int cont = 1;

		for (int i = 0; i < ipAddresses.length; i++) {
			System.out.println("Position Array " + cont + " = "
					+ ipAddresses[i]);
			cont = cont + 1;
		}
		System.out.println("");
	}

	/**
	 * Simple method for generate random ip
	 * 
	 * @param ip
	 * @return ip
	 */
	public static String generateRandomIp(String ip, int num1) {
		Random random = new Random();

		num1 = random.nextInt(223);
		int num2 = random.nextInt(255);
		int num3 = random.nextInt(255);
		int num4 = random.nextInt(255);

		ip = num1 + "." + num2 + "." + num3 + "." + num4;
		return ip;
	}

	/**
	 * Simple method for load the array with randoms IP
	 * 
	 * @param ipAddresses
	 * @param ip
	 */
	public static void loadArray(String[] ipAddresses,String ip, int num1 ) {
		for (int i = 0; i < ipAddresses.length; i++) {

			ipAddresses[i] = generateRandomIp(ip, num1);

		}
	}

	/**
	 * Simple method for show the summary of the IP arrays
	 * 
	 * @param ipAddresses
	 * @param clase
	 * @param start
	 */
	public static int summary(String[] ipAddresses,int num1) {
		String tipo = "";
		String valor = "";

		for (int i = 0; i < ipAddresses.length; i++) {

			if (num1 > 0 && num1 < 127) {
				tipo = "Clase A";
			} else {
				if (num1 > 127 && num1 < 192) {
					tipo = "Clase B";
				} else {
					tipo = "Clase C";
				}
			}

			switch (num1) {
			case 1:
				valor = "The ip start with 1";
				break;
			case 2:
				valor = "The ip start with 2";
				break;
			case 3:
				valor = "The ip start with 3";
				break;
			case 4:
				valor = "The ip start with 4";
				break;
			case 5:
				valor = "The ip start with 5";
				break;
			case 6:
				valor = "The ip start with 6";
				break;
			case 7:
				valor = "The ip start with 7";
				break;
			case 8:
				valor = "The ip start with 8";
				break;
			case 9:
				valor = "The ip start with 9";
				break;
			default:
				valor = "No have classe";
				break;
			}

			System.out.println("The " + i + " " + valor + " and is from "
					+ tipo);
		}
		return num1;
		
	}

	/**
	 * The main method
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		String[] ipAddresses = new String[10];
		String option = "";
		String ip = "";
		int num1 = 0;

		for (int i = 0; i < ipAddresses.length; i++) {
			ipAddresses[i] = "0.0.0.0";
		}

		do {

			menu();
			option = reader.readLine();
			Options(option, ipAddresses, ip, num1);

		} while (!option.equals("4"));
	}

}
