package org.cuatrovientos.exam;

import java.util.Random;
import java.util.Vector;

/**
 * Simple class where you have all the Questions
 * 
 * @author Luis Miño
 * @version 1.0.0
 */

public class QuestionList {

	private Vector<Question> questions;

	/**
	 * Default constructor
	 */
	public QuestionList() {

		questions = new Vector<Question>();

	}

	/**
	 * Method for add a question to the Question list
	 * 
	 * @param question
	 */
	public void addQuestion(Question question) {
		questions.add(question);

	}

	/**
	 * Method for remove a question from the Question List
	 * 
	 * @param index
	 * @return
	 */
	public boolean removeEntry(int index) {
		if (index < questions.size()) {
			questions.remove(index);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Method for real all the Questions and Answers
	 * 
	 * @return
	 */
	public String readAll() {
		String result = "";

		for (Question question : questions) {
			result = result + questions.toString() + "\n";
		}

		return result;

	}

	/**
	 * Method for read a Random Question
	 * 
	 * @return
	 */
	public Question randomQuestion() {
		Random rnd = new Random();

		int rand = rnd.nextInt(questions.size() - 1);

		return questions.elementAt(rand);
	}
}
