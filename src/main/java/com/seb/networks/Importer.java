package com.seb.networks;

import java.util.ArrayList;
import java.util.List;

public class Importer {

	List<Person> people = new ArrayList<Person>();

	public Importer(List<String> csv) throws Exception {
		for (String line : csv) {
			String[] name = extractName(line).split(" ");
			Person p = new Person(name[0], name[1]);
			people.add(p);
		}
	}

	private String extractName(String line) throws Exception {
		String name = "";
		if (line.trim().length() > 0) {
			String[] csvsplit = line.split(",");
			if (csvsplit.length >= 2) {
				name = csvsplit[1];
			} else {
				throw new Exception("CSV format unexpected");
			}
		} 
		return name;
	}

	public List<Person> getContacts() {
		return people;
	}
}
