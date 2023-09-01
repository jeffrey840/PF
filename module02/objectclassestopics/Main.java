package module02.objectclassestopics;

public class Main {
	public static void main(String[] args) {
		PersonArray persons = new PersonArray(100); // for example, an array of 100 persons

		// Adding 50 random persons to the array
		for (int i = 0; i < 50; i++) {
			Person randomPerson = new Person(
					(long) i,  // Using 'i' as ID just for demonstration purposes
					MyRandomPersonData.getRandomFirstName(),
					MyRandomPersonData.getRandomLastName(),
					MyRandomPersonData.getRandomStreetNo(),
					MyRandomPersonData.getRandomStreetName(),
					MyRandomPersonData.getRandomCity(),
					MyRandomPersonData.getRandomState(),
					MyRandomPersonData.getRandomZip(),
					MyRandomPersonData.getRandomPhone(),
					MyRandomPersonData.getRandomSalary(),
					MyRandomPersonData.getRandomCreationDate(),
					MyRandomPersonData.getRandomIsMember(),
					MyRandomPersonData.getRandomPassword()
			);
			persons.addPerson(randomPerson);
		}

		// Displaying all persons
		System.out.println("Displaying all persons:");
		persons.displayPersons();
		System.out.println("\nTotal number of persons: " + persons.getSize() + "\n");

		// Updating a person's data
		Long idToUpdate = 10L; // Let's say we want to update the person with ID 10
		Person updatedPerson = new Person(
				idToUpdate,
				"UpdatedFirstName",
				"UpdatedLastName",
				(short) 999,
				"UpdatedStreet",
				"UpdatedCity",
				"UpdatedState",
				99999,
				9999999999L,
				99999.99F,
				MyRandomPersonData.getRandomCreationDate(),
				false,
				"UpdatedPassword"
		);
		if (persons.updatePerson(idToUpdate, updatedPerson)) {
			System.out.println("Updated the person with ID: " + idToUpdate);
		} else {
			System.out.println("Couldn't find the person with ID: " + idToUpdate);
		}

		// Deleting a person
		Long idToDelete = 25L; // Let's say we want to delete the person with ID 25
		if (persons.deletePerson(idToDelete)) {
			System.out.println("Deleted the person with ID: " + idToDelete);
		} else {
			System.out.println("Couldn't find the person with ID: " + idToDelete);
		}

		// Displaying all persons after updates
		System.out.println("\nDisplaying all persons after updates:");
		persons.displayPersons();
		System.out.println("\nTotal number of persons after updates: " + persons.getSize());
	}
}

