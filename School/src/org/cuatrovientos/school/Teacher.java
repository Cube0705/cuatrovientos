package org.cuatrovientos.school;

import java.util.Arrays;

/**
 * 
 * @author Luis Miño
 *
 */
public class Teacher extends Person {

	private String degree;
	private String [] subjects = {"Maths", "Gym", "Spanish", "History"};
	
	public Teacher (String name, int age,String degree, String [] subjets) {
		super (name, age);
		this.degree = degree;
		this.subjects = subjets;
		
	}
	
	

	/**
	 * @return the degree
	 */
	public String getDegree() {
		return degree;
	}

	/**
	 * @param degree the degree to set
	 */
	public void setDegree(String degree) {
		this.degree = degree;
	}

	/**
	 * @return the subjects
	 */
	public String[] getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "Teacher [degree=" + degree + ", subjects="
				+ Arrays.toString(subjects) + "]";
	}
	
	
}
