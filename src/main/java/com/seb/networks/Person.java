package com.seb.networks;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private List<String> comments = new ArrayList<String>();
    private String givenName;
    private String surname;

    public Person(String givenName, String surname) {
        setGivenName(givenName);
        setSurname(surname);
    }

    public void addComment(String comment) {
        this.comments.add(comment);
    }

    public void batchAddComments(List<String> comments) {
        for (String comment : comments) {
            addComment(comment);
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other == this)
            return true;
        if (other == null)
            return false;
        if (getClass() != other.getClass())
            return false;
        Person otherPerson = (Person) other;
        return (getGivenName().equals(otherPerson.getGivenName()) && getSurname()
                .equals(otherPerson.getSurname()));
    }

    public String getGivenName() {
        return givenName;
    }

    public String getSurname() {
        return surname;
    }

    public List<String> readComments() {
        return comments;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return getGivenName() + " " + getSurname() + " " + comments.toString(); 
    }
}
