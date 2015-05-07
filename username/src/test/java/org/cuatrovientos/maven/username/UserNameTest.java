package org.cuatrovientos.maven.username;

import junit.framework.TestCase;

public class UserNameTest extends TestCase {

	public void testUserName() {
		
		UserName target = new UserName();
		String expectedName = "";
		String actualName = target.getName();
		
		assertEquals("Testing default cons.", expectedName,actualName);
	}

	public void testUserNameStringString() {
		fail("Not yet implemented");
	}

	public void testGenerate() {
		
		UserName target = new UserName("Jon","Snow");
		String expectedName = "jon_snow";
		String actualName = target.getName();
		
		assertEquals("Testing default cons.", expectedName,actualName);
	
	}
	
	public void testGenerateEmpty() {
		
		UserName target = new UserName();
		String expectedName = "-empty-";
		String actualName = target.getName();
		
		assertEquals("Testing default cons.", expectedName,actualName);
	
	}

}
