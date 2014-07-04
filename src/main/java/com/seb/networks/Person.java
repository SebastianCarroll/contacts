package com.seb.networks;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String givenName;
	private String surname;
	private List<String> comments = new ArrayList<String>();
	
	public Person(String givenName, String surname) {
		setGivenName(givenName);
		setSurname(surname);
	}
	
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public List<String> readComments() {
		return comments;
	}
	public void batchAddComments(List<String> comments){
		for(String comment: comments){
			addComment(comment);
		}
	}
	public void addComment(String comment) {
		this.comments.add(comment);
	}
	
	@Override
	public boolean equals(Object other){
		if (other == this) return true;
	    if (other == null) return false;
	    if (getClass() != other.getClass()) return false;
	    Person otherPerson = (Person) other;
	    return (getGivenName().equals(otherPerson.getGivenName())
	    		&& getSurname().equals(otherPerson.getSurname()));
	}
	
	@Override
	public String toString(){
		return getGivenName() + " " + getSurname();
	}
}
