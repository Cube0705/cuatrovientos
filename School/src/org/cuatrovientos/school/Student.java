package org.cuatrovientos.school;

/**
 * 
 * @author Luis Miño
 *
 */
public class Student {

	private String course;
	private String degree;
	
	public Student(String course, String degree){
		this.course = course;
		this.degree = degree;
	}

	/**
	 * @return the course
	 */
	public String getCourse() {
		return course;
	}

	/**
	 * @param course the course to set
	 */
	public void setCourse(String course) {
		this.course = course;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + "Student [course=" + course + ", degree=" + degree + "]";
	}
	
	
}
