package com.seb.networks;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PersonTest {

	@Test
	public void addingComment() {
		String comment = "new comment";
		Person person = new Person("John", "Hammond");
		person.addComment(comment);
		List<String> comments = person.getComments();
		assertTrue(comments.contains(comment));
	}
	
	@Test
	public void testGivenName() {
		String originalname = "John";
		String newName = "John2";
		Person person = new Person(originalname, "Hammond");
		assertEquals(originalname, person.getGivenName());
		person.setGivenName(newName);
		assertEquals(newName, person.getGivenName());
	}
	
	@Test
	public void testLastName() {
		String originalname = "Hammond";
		String newName = "Hammond the second";
		Person person = new Person("John", originalname);
		assertEquals(originalname, person.getSurname());
		person.setSurname(newName);
		assertEquals(newName, person.getSurname());
	}
	
	@Test
	public void testToString() {
		String firstname = "john";
		String surname = "Hammond";
		String comment = "This is a comment";
		Person person = new Person(firstname, surname);
		person.addComment(comment);
		String expected = firstname + " " + surname + " [" + comment +"]";
		assertEquals(expected, person.toString());
	}
	
	@Test
	public void testComparisonLogic_theSameObject() {
		String firstname = "john";
		String surname = "Hammond";
		Person person = new Person(firstname, surname);
		Person person2 = person;
		assertTrue(person.equals(person2));
	}
	
	@Test
	public void testComparisonLogic_nullObject() {
		String firstname = "john";
		String surname = "Hammond";
		Person person = new Person(firstname, surname);
		Person person2 = null;
		assertFalse(person.equals(person2));
	}

	@Test
	public void testComparisonLogic_equalObject() {
		String firstname = "john";
		String surname = "Hammond";
		Person person = new Person(firstname, surname);
		Person person2 = new Person(firstname, surname);
		assertTrue(person.equals(person2));
	}
}
