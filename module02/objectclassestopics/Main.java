package module02.objectclassestopics;

import java.util.Scanner;

public class Main {
	private static final int MAX_PERSONS = 100; // Example capacity
	private static PersonArray persons = new PersonArray(MAX_PERSONS);
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		// Initializing data and getting user inputs
		int colsInDatabase = 10; // Simplified, as you've already defined the number of columns before
		String adminDatabase = "[root21,password123]\n[admin2,pass55]\n[cosc1436,pass65]\n";

		System.out.println("Enter the Max # people in this Database, max size? = ");
		int maxPersons = Integer.parseInt(input.nextLine());
		persons = new PersonArray(maxPersons);

		persons.addPerson(new Person(12345L, "Henry", "James", (short) 32767, "Main St.", "Bloomington", "CA", 50798, 123456789L, 3.14F,20191012,true,"123"));

		persons.addPerson(new Person(67890L, "Jeffrey", "Cabrera", (short) 12311, "Main St.", "Bloomington", "CA", 50798, 1233354444L, 30000.14F,20231012,true,"222"));

		System.out.println(adminDatabase);
		introDisplay();

		// Main loop to keep the application running until the user decides to exit
		boolean againStartLogin;
		do {
			loginMenu();
			System.out.println("Go back to Start Login Menu? Yes or No ");
			againStartLogin = input.nextLine().toUpperCase().charAt(0) == 'Y';
		} while (againStartLogin);

		System.out.println("Program has Ended");
		input.close();
	}

	private static void introDisplay() {
		System.out.println("Welcome to the Person Management System (PMS)");
		// Add more details: objectives, topics, developer info, etc.
	}

	private static void loginMenu() {
		boolean isLoggedIn = false;
		while (!isLoggedIn) {
			System.out.println("1. Login");
			System.out.println("2. Sign Up");
			System.out.println("3. Exit");
			int choice = input.nextInt();

			switch (choice) {
				case 1:
					isLoggedIn = loginScreen();
					break;
				case 2:
					signUpMenu();
					break;
				case 3:
					System.exit(0);
				default:
					System.out.println("Invalid choice. Try again.");
			}
		}
	}

	private static boolean loginScreen() {
		// In a real-world application, you'll use hashing and proper data storage.
		System.out.println("Enter username:");
		String username = input.next();
		System.out.println("Enter password:");
		String password = input.next();

		// Dummy check; you'd check against a proper database in a real-world scenario.
		if (username.equals("admin") && password.equals("admin123")) {
			return true;
		} else {
			System.out.println("Invalid credentials.");
			return false;
		}
	}

	private static void signUpMenu() {
		System.out.println("Signup functionality here");
		// Implement your signup logic. Add the user to your "database" or collection.
	}

	private static void mainMenu() {
		boolean exit = false;
		while (!exit) {
			System.out.println("1. Add Person");
			System.out.println("2. Display Persons");
			System.out.println("3. Update Person");
			System.out.println("4. Delete Person");
			// Add other functionalities like shuffle, sum salaries, etc.
			System.out.println("X. Exit");

			int choice = input.nextInt();

			switch (choice) {
				case 1:
					// Add a person to the PersonArray
					System.out.println("Adding a person:");
					// ... Add logic for adding a person
					break;
				case 2:
					// Display persons in the PersonArray
					System.out.println("Displaying all persons:");
					persons.displayPersons();
					break;
				case 3:
					// Update person details
					System.out.println("Updating a person:");
					// ... Add logic for updating a person's details
					break;
				case 4:
					// Delete a person from PersonArray
					System.out.println("Deleting a person:");
					// ... Add logic for deleting a person
					break;
				case 'X':
				case 'x':
					exit = true;
					break;
				default:
					System.out.println("Invalid choice. Try again.");
			}
		}
	}
}
