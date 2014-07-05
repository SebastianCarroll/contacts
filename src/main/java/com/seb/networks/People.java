package com.seb.networks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class People {

    Map<Person, List<Person>> connections = new HashMap<Person, List<Person>>();

    List<Person> people = new ArrayList<Person>();
    
    // Add people to both connections to maintain symmetry
    public void addConnection(Person person1, Person person2) {
        addToConnections(person1, person2);
        addToConnections(person2, person1);
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    private void addToConnections(Person person1, Person person2) {
        if (connections.containsKey(person1)) {
            List<Person> personContacts = connections.get(person1);
            if (!personContacts.contains(person2)) {
                personContacts.add(person2);
            }
        } else {
            List<Person> personContacts = new ArrayList<Person>();
            personContacts.add(person2);
            connections.put(person1, personContacts);
        }
    }

    public List<Person> getConnections(Person person) {
        return connections.get(person);
    }

    public void importFile(String filename) {
    	List<String> lines = FileUtil.readByLine(filename);
    	Importer importer = null;
		try {
			importer = new Importer(lines);
		} catch (Exception e) {
			e.printStackTrace();
		}
        for (Person contact : importer.getContacts()) {
            addPerson(contact);
        }
    }

    @Override
    public String toString() {
        return "People [people=" + people + ", connections=" + connections
                + "]";
    }

}
