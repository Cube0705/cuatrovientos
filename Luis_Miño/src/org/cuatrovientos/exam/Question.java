package org.cuatrovientos.exam;

/**
 * Simple class with the properties of the question
 * 
 * @author Luis Miño
 * @version 1.0.0
 */
public class Question {

	private String question;
	private String answer;

	/**
	 * 
	 * @param question
	 * @param answer
	 */
	public Question(String question, String answer) {
		this.question = question;
		this.answer = answer;
	}

	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}

	/**
	 * @param question
	 *            the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Question [Question=" + question + ", Answer=" + answer + "]";
	}

	/**
	 * @return the answer
	 */
	public String getAnswer() {
		return answer;
	}

	/**
	 * @param answer
	 *            the answer to set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}

}
