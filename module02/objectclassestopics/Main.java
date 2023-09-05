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

		persons.addPerson(new Person(12345L, "Henry", "James", (short) 32767, "Main St.", "Bloomington", "CA", 50798, 123456789L, 3.14F, 20191012, true, "123"));

		persons.addPerson(new Person(67890L, "Jeffrey", "Cabrera", (short) 12311, "Main St.", "Bloomington", "CA", 50798, 1233354444L, 30000.14F, 20231012, true, "222"));

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

	public static void introDisplay() {
		System.out.println("  ====== intro ========================================= ");

	}

	private static boolean signUpMenu(String adminDatabase, Scanner input) {
		boolean goodLogin = false;
		String currentUser = "", currentPass = "";
		System.out.println(" SignUp Menu - Screen ");
		System.out.println("Enter username (ex. code21");
		currentUser = input.nextLine();
		System.out.println("Enter password (ex. password123");
		currentPass = input.nextLine();
		adminDatabase += "[" + currentUser + "," + currentPass + "]\n";
		System.out.println("Verify your admin account!");
		System.out.println("[1] Please, Enter your username:");
		currentUser = input.nextLine();
		if (adminDatabase.contains(currentUser)) {
			System.out.println("User exist");
			int index = adminDatabase.indexOf(currentUser + ",");
			String checkPass = adminDatabase.substring(index + (currentUser + ",").length());
			checkPass = checkPass.substring(0, checkPass.indexOf(']'));
			System.out.println("password=[" + checkPass + "]");
			System.out.println("[2] Enter your password:");
			currentPass = input.nextLine();
			if (currentPass.equals(checkPass)) {
				System.out.println("Access Granted ");
				goodLogin = true;
			} else {
				System.out.println("Bad password...");
				System.out.println("Denied Access...");
				goodLogin = false;
			}
		} else {
			System.out.println("User does not exist");
			System.out.println("Denied Access...");
			goodLogin = false;
		}
		return goodLogin;
	}

	private static void loginMenu(String[][] pDatabase, String adminDatabase, Scanner input, int rows, int colsInDatabase) {
		int menuOptionLogin = -1;
		boolean goodLogin = false;
		System.out.println(" Login Menu ");
		System.out.println(" 1 - [SignUp] Admin ");
		System.out.println(" 2 - [Login] Admin ");
		System.out.println(" 3 - [Exit]  ");
		// menuOptionLogin = Byte.parseByte(input.nextLine());
		menuOptionLogin = 2;
		if (menuOptionLogin == 1) {
			goodLogin = signUpMenu(adminDatabase, input);
		} else if (menuOptionLogin == 2) {
			goodLogin = loginScreen(adminDatabase, input);
		} else {
			System.exit(0);
		}
		if (goodLogin) {
			mainMenu(pDatabase, input, rows, colsInDatabase);
			goodLogin = false;
		}

		private static boolean loginScreen (String adminDatabase, Scanner input){
			boolean goodLogin = false;
			String currentUser = "", currentPass = "";
			System.out.println("Verify your admin account!");
			System.out.println("[1] Please, Enter your username:");
			// currentUser = input.nextLine();
			currentUser = "cosc1436";
			if (adminDatabase.contains(currentUser)) {
				System.out.println("User exist");
				int index = adminDatabase.indexOf(currentUser + ",");
				String checkPass = adminDatabase.substring(index + (currentUser + ",").length());
				checkPass = checkPass.substring(0, checkPass.indexOf(']'));
				System.out.println("password=[" + checkPass + "]");
				System.out.println("[2] Enter your password:");
				// currentPass = input.nextLine();
				currentPass = "pass65";
				if (currentPass.equals(checkPass)) {
					System.out.println("Access Granted ");
					goodLogin = true;
				} else {
					System.out.println("Bad password...");
					System.out.println("Denied Access...");
					goodLogin = false;
				}
			} else {
				System.out.println("User does not exist");
				System.out.println("Denied Access...");
				goodLogin = false;
			}
			return goodLogin;
		}


		public static void mainMenu (PersonArray personsArray, Scanner input){
			int menuOptionMain;
			boolean againMainMenu = true;
			while (againMainMenu) {
				System.out.println(" Main Menu ");
				System.out.println(" 1 - [CREATE] Person ");
				System.out.println(" 2 - [READ] Persons ");
				System.out.println(" 3 - [UPDATE] Person ");
				System.out.println(" 4 - [DELETE] Person ");
				System.out.println(" 5 - [FIND] Person ");
				System.out.println(" 6 - [BULK] Create (x)Persons ");
				System.out.println(" 7 - [COUNT] Persons ");
				System.out.println(" 8 - [CLEAR] Person ");
				System.out.println("  ");
				System.out.println("Please input 1-7 : ");
				menuOptionMain = Integer.parseInt(input.nextLine());
				System.out.println("  ========================== ");
				System.out.println(" [user-input-auto-select] = " + menuOptionMain);
				System.out.println("  ========================== ");
				System.out.println("  ");
				switch (menuOptionMain) {
					case 1:
						System.out.println("[CREATE] Person Menu Option");
						System.out.println("1 - AUTO - CREATE PERSON FORM");
						System.out.println("2 - NORMAL - CREATE PERSON FORM");
						int menuOptionCreate = Integer.parseInt(input.nextLine());
						if (menuOptionCreate == 1) {
							Person newPerson = autoCreatePerson(); // This function should now return a Person object
							personsArray.addPerson(newPerson);
						} else if (menuOptionCreate == 2) {
							Person newPerson = normalCreatePerson(); // This function should now return a Person object
							personsArray.addPerson(newPerson);
						} else {
							System.out.println("Enter @ CREATE Menu");
						}
						personsArray.displayAllPersons();
						break;
					case 2:
						System.out.println("[READ] Person Menu Option");
						System.out.println("List of Person:");
						personsArray.displayAllPersons();
						break;
					case 3:
						System.out.println("[UPDATE] Person Menu Option");
						updatePerson(personsArray, input);  // This function should now work directly with PersonArray
						break;
					case 4:
						System.out.println("[DELETE] Person Menu Option");
						deletePerson(personsArray, input);  // This function should now work directly with PersonArray
						break;
					case 5:
						System.out.println("[FIND] Person Menu Option");
						findPerson(personsArray, input);  // This function should now work directly with PersonArray
						break;
					case 6:
						System.out.println("[BULK] Create (x) Persons Menu Option");
						bulkCreatePersons(personsArray, input);  // This function should now work directly with PersonArray
						break;
					case 7:
						System.out.println("[COUNT] Persons Menu Option");
						System.out.println("Total number of persons: " + personsArray.countPersons());
						break;
					case 8:
						System.out.println("[CLEAR] Persons Menu Option");
						personsArray.clearPersons();
						break;
					default:
						System.out.println("Enter @ Main Menu");
				}

				System.out.println("Go back to Main Menu? Yes or No ");
				againMainMenu = input.nextLine().toUpperCase().charAt(0) == 'Y' ? true : false;
			}
		}


	}

	private static boolean loginScreen(String adminDatabase, Scanner input) {
		boolean goodLogin = false;
		String currentUser = "", currentPass = "";
		System.out.println("Verify your admin account!");
		System.out.println("[1] Please, Enter your username:");
		// currentUser = input.nextLine();
		currentUser = "cosc1436";
		if (adminDatabase.contains(currentUser)) {
			System.out.println("User exist");
			int index = adminDatabase.indexOf(currentUser + ",");
			String checkPass = adminDatabase.substring(index + (currentUser + ",").length());
			checkPass = checkPass.substring(0, checkPass.indexOf(']'));
			System.out.println("password=[" + checkPass + "]");
			System.out.println("[2] Enter your password:");
			// currentPass = input.nextLine();
			currentPass = "pass65";
			if (currentPass.equals(checkPass)) {
				System.out.println("Access Granted ");
				goodLogin = true;
			} else {
				System.out.println("Bad password...");
				System.out.println("Denied Access...");
				goodLogin = false;
			}
		} else {
			System.out.println("User does not exist");
			System.out.println("Denied Access...");
			goodLogin = false;
		}
		return goodLogin;
	}

	public static void mainMenu(PersonArray personsArray, Scanner input) {
		int menuOptionMain;
		boolean againMainMenu = true;
		while (againMainMenu) {
			System.out.println(" Main Menu ");
			System.out.println(" 1 - [CREATE] Person ");
			System.out.println(" 2 - [READ] Persons ");
			System.out.println(" 3 - [UPDATE] Person ");
			System.out.println(" 4 - [DELETE] Person ");
			System.out.println(" 5 - [FIND] Person ");
			System.out.println(" 6 - [BULK] Create (x)Persons ");
			System.out.println(" 7 - [COUNT] Persons ");
			System.out.println(" 8 - [CLEAR] Person ");
			System.out.println("  ");
			System.out.println("Please input 1-7 : ");
			menuOptionMain = Integer.parseInt(input.nextLine());
			System.out.println("  ========================== ");
			System.out.println(" [user-input-auto-select] = " + menuOptionMain);
			System.out.println("  ========================== ");
			System.out.println("  ");
			switch (menuOptionMain) {
				case 1:
					System.out.println("[CREATE] Person Menu Option");
					System.out.println("1 - AUTO - CREATE PERSON FORM");
					System.out.println("2 - NORMAL - CREATE PERSON FORM");
					int menuOptionCreate = Integer.parseInt(input.nextLine());
					if (menuOptionCreate == 1) {
						Person newPerson = autoCreatePerson(); // This function should now return a Person object
						personsArray.addPerson(newPerson);
					} else if (menuOptionCreate == 2) {
						Person newPerson = normalCreatePerson(); // This function should now return a Person object
						personsArray.addPerson(newPerson);
					} else {
						System.out.println("Enter @ CREATE Menu");
					}
					personsArray.displayAllPersons();
					break;
				case 2:
					System.out.println("[READ] Person Menu Option");
					System.out.println("List of Person:");
					personsArray.displayAllPersons();
					break;
				case 3:
					System.out.println("[UPDATE] Person Menu Option");
					updatePerson(personsArray, input);  // This function should now work directly with PersonArray
					break;
				case 4:
					System.out.println("[DELETE] Person Menu Option");
					deletePerson(personsArray, input);  // This function should now work directly with PersonArray
					break;
				case 5:
					System.out.println("[FIND] Person Menu Option");
					findPerson(personsArray, input);  // This function should now work directly with PersonArray
					break;
				case 6:
					System.out.println("[BULK] Create (x) Persons Menu Option");
					bulkCreatePersons(personsArray, input);  // This function should now work directly with PersonArray
					break;
				case 7:
					System.out.println("[COUNT] Persons Menu Option");
					System.out.println("Total number of persons: " + personsArray.countPersons());
					break;
				case 8:
					System.out.println("[CLEAR] Persons Menu Option");
					personsArray.clearPersons();
					break;
				default:
					System.out.println("Enter @ Main Menu");
			}

			System.out.println("Go back to Main Menu? Yes or No ");
			againMainMenu = input.nextLine().toUpperCase().charAt(0) == 'Y' ? true : false;
		}
	}



}