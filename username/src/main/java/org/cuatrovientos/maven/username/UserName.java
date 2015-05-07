package org.cuatrovientos.maven.username;
/**
 * Simple UserName Generator
 * @author Cube
 *
 */
public class UserName {

	private String Name;
	private String SurName;
	
	/**
	 * Default Empty Constructor
	 */
	public UserName(){
		
	}
	
	/**
	 * Constructor of UserName with paramethers
	 * @param name
	 * @param surname
	 */
	public UserName(String name, String surname) {
		this.Name = name;
		this.SurName = surname;
	}
	
	/**
	 * Method to generate the userName
	 * @return result
	 */
	public String generate() {
		String result;
		
		if (Name.equals("") || SurName.equals("")) {
			result = "-empty-";
		} else {
		result = Name.toLowerCase() + "_" + SurName.toLowerCase();
		}
		
		return result;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	/**
	 * @return the surName
	 */
	public String getSurName() {
		return SurName;
	}

	/**
	 * @param surName the surName to set
	 */
	public void setSurName(String surName) {
		SurName = surName;
	}
	
	
}
