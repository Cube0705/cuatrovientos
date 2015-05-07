/**
 * 
 */
package org.cuatrovientos.exam;

import java.io.*;
import java.util.Random;

/**
 * Simple program to Ask and answer questions
 * 
 * @author Luis Miño
 * @version 1.0.0
 * 
 */
public class Main {

	/**
	 * Simple method for know if the user is a Teacher or a Student
	 * 
	 * @return
	 * @throws IOException
	 */
	public static boolean login() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		boolean log = false;
		String s = "";

		System.out.println("Are you teacher?");
		System.out.println("1. Yes");
		System.out.println("2. No");

		s = reader.readLine();
		switch (s) {
		case "1":
			log = true;
			break;
		case "2":
			log = false;
			break;

		default:
			System.out
					.println("You not select a incorrect option , and now you are like a Student");
			log = false;
			break;
		}

		return log;
	}

	/**
	 * Main Method
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		Random rnd = new Random();
		boolean val;
		val = login();

		QuestionList list = new QuestionList();

		if (val == true) {

			String s = "";
			String ques = "";
			String res = "";
			int option = 0;

			System.out.println("You select Teacher");
			System.out.println("What you want to do?");
			System.out.println("1. Add Question");
			System.out.println("2. Remove Question");
			System.out.println("3. Read All Questions");
			System.out.println("Any other character for exit");

			s = reader.readLine();
			switch (s) {
			case "1":
				System.out.println("You select Add Question");
				System.out.println("Write your Question");
				ques = reader.readLine();
				System.out.println("Write the Answer");
				res = reader.readLine();
				Question question = new Question(ques, res);
				list.addQuestion(question);
				break;
			case "2":
				System.out.println("You select Remove Question");
				System.out.println("Write the number of the Question");
				list.toString();
				option = Integer.parseInt(reader.readLine());

				list.removeEntry(option);
				break;

			case "3":
				System.out.println("You select read all the questions");
				list.readAll();
				break;
			default:
				System.out.println("You select exit from the program");
				break;
			}

		} else {
			String resp = "";
			int option = 0;

			System.out.println("You select Student");
			System.out
					.println("The Question list starts, for exit you only need write NO  and All the ANSWER is with Upper Letters");

			do {
				Question randQuestion = null;
				randQuestion = list.randomQuestion();
				System.out.println("You want chek the answer?");
				resp = reader.readLine();
				if ("YES".equals(resp)) {
					System.out.println("The correct answer is: ");
					randQuestion.getAnswer();
				} else {
					System.out.println("Continue with the Question List ");
				}
			} while (!"EXIT".equals(resp));
		}

	}
}
