package com.seb.networks;

public class UserInterfaceManager {

	public UserInterfaceManager() {
		// Set up people
		People people = new People();

		// Run console loop
		runLoop(people);
	}

	private void runLoop(People people) {
		while (true) {
			CLI.write("PeopleManager >>");
			String input = CLI.readInput();
			if (input.equals("list")) {
				System.out.println(people);
			} else if (input.equals("exit")) {
				System.exit(0);
			} else if (input.equals("import")){
				CLI.write("Filename: ");
				String filename = CLI.readInput();
				people.importFile(filename);
			} else if (input.equals("details")){
				CLI.write("Contact: ");
				String contactName = CLI.readInput();
				System.out.println(people.getPersonDetails(contactName));
			}
		}
	}
}
