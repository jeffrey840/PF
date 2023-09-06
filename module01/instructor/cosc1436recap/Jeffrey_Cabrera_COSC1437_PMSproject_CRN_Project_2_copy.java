package module01.instructor.cosc1436recap;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This class handles the main functionalities for the Person Management System.
 * It offers methods for initializing, displaying introductory information,
 * and managing the login and sign-up operations.
 */

public class Jeffrey_Cabrera_COSC1437_PMSproject_CRN_Project_2_copy {

    public static void main(String[] args) {
        boolean againStartLogin = false;
        String[] templ = { "2023002", "Henry", "James", "13205", "Brown Rd.", "Magnolias", "CA", "68566", "5386493703", "41488.00" };
        int colsInDatabase = indexTable(templ);
        // System.exit(0);
        String adminDatabase = "[root21,password123]\n[admin2,pass55]\n[cosc1436,pass65]\n";
        // Prompt user to enter the maximum number of people in the database and create
        // the database accordingly.
        System.out.println("Enter the Max # people in this Database, max size? = ");
        Scanner input = new Scanner(System.in);
        int rows = Integer.parseInt(input.nextLine());
        String[][] pDatabase = new String[rows][colsInDatabase];
        System.out.println("Max limit = " + rows);
        // Default starting data for the database.
        pDatabase[0] = new String[] { "2023002", "Henry", "James", "13205", "Brown Rd.", "Magnolias", "CA", "68566",
                "5386493703", "41488.00" };
        pDatabase[1] = new String[] { "2023003", "Henry", "James", "13014", "Main St.", "Bloomington", "CA", "50798",
                "6248089606", "65463.00" };
        pDatabase[2] = new String[] { "2023004", "Sue", "James", "15056", "Main St.", "Magnolias", "FL", "76579",
                "6786884725", "51037.00" };
        pDatabase[3] = new String[] { "2023005", "Henry", "Willis", "16755", "Brown Rd.", "Magnolias", "FL", "61019",
                "7687218941", "107242.00" };
        System.out.println(adminDatabase);
        introDisplay();
        // Start the login menu and keep running until the user decides to exit.
        do {
            loginMenu(pDatabase, adminDatabase, input, rows, colsInDatabase);
            System.out.println("Go back to Start Login Menu? Yes or No ");
            againStartLogin = input.nextLine().toUpperCase().charAt(0) == 'Y' ? true : false;
        } while (againStartLogin);
        System.out.println("Program has Ended");

        input.close();
    }


    private static int indexTable(String[] templ) {
        int count = 0;
        for (int i = 0; i < templ.length; i++) {
            String string = templ[i];
            if (string.length() > 0)
                count++;
        }
        return count;
    }

    public static void introDisplay() {
        System.out.println("  =============================================== ");
        System.out.println("            Person Management System              ");
        System.out.println("  =============================================== ");

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

    }


    public static void mainMenu(String[][] pDatabase, Scanner input, int rows, int colsInDatabase) {
        int menuOptionMain;
        int menuOptionCreate;
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
                    menuOptionCreate = Integer.parseInt(input.nextLine());
                    if (menuOptionCreate == 1) {
                        String[] newPerson = autoCreatePerson(pDatabase, input);
                        pDatabase = addPersonToDatabase(pDatabase, newPerson);
                    } else if (menuOptionCreate == 2) {
                        String[] newPerson = normalCreatePerson(pDatabase, input);
                        pDatabase = addPersonToDatabase(pDatabase, newPerson);
                    } else {
                        System.out.println("Enter @ CREATE Menu");
                    }
                    printArr(pDatabase);
                    break;
                case 2:
                    System.out.println("[READ] Person Menu Option");
                    System.out.println("List of Person:");
                    readMenuOption(pDatabase);
                    break;
                case 3:
                    System.out.println("[UPDATE] Person Menu Option");
                    System.out.println("Enter id# to change data:");
                    pDatabase = updatePerson(pDatabase, input);
                    break;
                case 4:
                    System.out.println("[DELETE] Person Menu Option");
                    System.out.println("Enter id# to change data:");
                    pDatabase = deletePerson(pDatabase, input);
                    break;
                case 5:
                    System.out.println("[FIND] Person Menu Option");
                    System.out.println("Enter id# to find data:");
                    findPerson(pDatabase, input);
                    break;
                case 6:
                    System.out.println("[BULK] Create (x) Persons Menu Option");
                    bulkCreatePersons(pDatabase, input);
                    break;
                case 7:
                    System.out.println("[COUNT] Persons Menu Option");
                    int totalCount = countPersons(pDatabase);
                    System.out.println("Total number of persons: " + totalCount);
                    break;
                case 8:
                    System.out.println("[CLEAR] Persons Menu Option");
                    pDatabase = clearPersons(pDatabase, input, rows, colsInDatabase);
                    break;
                default:
                    System.out.println("Enter @ Main Menu");
            }

            System.out.println("Go back to Main Menu? Yes or No ");
            againMainMenu = input.nextLine().toUpperCase().charAt(0) == 'Y' ? true : false;
        }

    }


    private static void readMenuOption(String[][] pDatabase) {
        System.out.println("Read Option Menu");
        System.out.println("1 - Displaying Arrays");
        System.out.println("2 - Summing all elements ");
        System.out.println("3 - Shuffle/Random elements");
        int ans = Integer.parseInt(new Scanner(System.in).nextLine());
        ans = ans < 1 || ans > 3 ? 1 : ans;
        switch (ans) {
            case 1:
                readPeople(pDatabase);
                break;
            case 2:
                summingAllSalary(pDatabase);
                break;
            case 3:
                shuffleElements(pDatabase);
                break;
        }

    }

    private static void shuffleElements(String[][] pDatabase) {
        Random random = new Random();
        for (int r = pDatabase.length - 1; r > 0; r--) {
            int j = random.nextInt(r + 1);

            String[] tmpArr = pDatabase[r];
            pDatabase[r] = pDatabase[j];
            pDatabase[j] = tmpArr;

        }

    }

    private static void summingAllSalary(String[][] pDatabase) {
        double total = 0;
        for (int r = 0; r < pDatabase[0].length; r++) {

            for (int c = 0; c < pDatabase.length; c++) {
                String salaryString = pDatabase[r][9];
                total += Double.parseDouble(salaryString);
            }
        }

        System.out.printf("Total = $%,.2f\n", total);
    }

    private static void printArr(String[][] pDatabase) {

        for (int i = 0; i < pDatabase.length; i++) {
            if (pDatabase[i][0] != null) {
                String[] strings = pDatabase[i];
                System.out.print("[" + i + "]");
                for (int j = 0; j < strings.length; j++) {
                    String string = strings[j];
                    System.out.print(" " + string + " ");
                }
                System.out.println();
            }
        }
    }

    private static String[][] addPersonToDatabase(String[][] pDatabase, String[] newPerson) {
        int count = 0;
        for (int i = 0; i < pDatabase.length; i++) {
            if (pDatabase[i][0] != null && pDatabase[i][0].length() > 0) {
                count++;
            }
        }
        if (count < pDatabase.length) {
            pDatabase[count] = newPerson;
            System.out.println("Person added to the database!");
        } else {
            System.out.println("Database is full. Cannot add more persons.");
        }
        return pDatabase;
    }

    private static String[] autoCreatePerson(String[][] pDatabase, Scanner input) {

        String personFirstName = "null";
        String personLastName = "null";
        short personStreetNo = 0;
        String personStreetName = "null";
        String personCity = "null";
        String personState = "null";
        int personZipCode = 0;
        long personPhone = 0;
        double personSalary = 0;
        byte personCount = 0;
        int personID = 0;
        long startTime, endTime = 0;
        double elapsetTime = 0;
        byte personCreationHour, personCreationMin = 0;

        System.out.println("   ========================================== ");
        System.out.println("   ===AUTO===   CREATE Menu - form    ========= ");
        System.out.println("   ========================================== ");
        Random r = new Random();
        int rnd = r.nextInt(1, 3);
        startTime = System.currentTimeMillis();
        System.out.println("  ");
        personID = Integer.parseInt(getLastIdNumber(pDatabase)) + 1;
        System.out.println(" personCount = [" + personCount + "]");
        System.out.println(" personID = [" + personID + "]");
        rnd = r.nextInt(1, 3);
        personFirstName = randomFN();
        System.out.println(" personFirstName = [" + personFirstName + "]");
        rnd = r.nextInt(1, 3);
        personLastName = randomLN();
        System.out.println(" personLastName = [" + personLastName + "]");
        personStreetNo = (short) r.nextInt(1, 22000);
        System.out.println(" personStreetNo = [" + personStreetNo + "]");
        rnd = r.nextInt(1, 3);
        personStreetName = randomSN();
        System.out.println(" personStreetName = [" + personStreetName + "]");
        rnd = r.nextInt(1, 3);
        personCity = randomCI();
        System.out.println(" personCity = [" + personCity + "]");
        rnd = r.nextInt(1, 3);
        personState = randomST();
        System.out.println(" personState = [" + personState + "]");
        personZipCode = r.nextInt(11111, 99111);
        System.out.println(" personZipCode = [" + personZipCode + "]");
        personPhone = (long) (Math.random() * (9132229900L - 2132229900L) + 2132229900L);
        System.out.println(" personPhone = [" + personPhone + "]");
        personSalary = (long) (Math.random() * (125000 - 25000) + 25000);
        System.out.println(" personSalary = [" + personSalary + "]");

        endTime = System.currentTimeMillis();
        elapsetTime = ((endTime - startTime) / 1000) % 60;
        personCreationMin = (byte) ((((System.currentTimeMillis()) / 1000) / 60) % 60);
        personCreationHour = (byte) (((((System.currentTimeMillis()) / 1000) / 60) / 60) % 24);
        personCreationHour -= 5;
        personCreationHour = (personCreationHour < 0) ? (personCreationHour += 12) : personCreationHour;
        System.out.println(" Current TIme : [ " + personCreationHour + " : " + personCreationMin + "]  ");
        System.out.println("Person Creation TIme : [ " + elapsetTime + "] sec");
        System.out.println("   ========================================== ");
        personCount += 1;
        System.out.println("   ======  Person Add : id#" + personID + " ===== ");
        System.out.println("   ========================================== ");

        return new String[] { personID + "", personFirstName, personLastName, personStreetNo + "", personStreetName,
                personCity, personState, personZipCode + "", personPhone + "", personSalary + "" };

    }

    public static int ranArr(String[] arr) {
        double r = Math.random();
        int hi = arr.length - 1;
        int lo = 0;
        int randomValue = (int) (r * (hi - lo) + lo);
        return randomValue;
    }

    private static String randomFN() {
        String[] fnames = { "Sue", "Sara", "Toni", "Tyson", "Hannah", "Montana", "Vicky", "Becky", "Monica", "Henry",
                "James", "Jason", "Emma", "Olivia", "Noah", "Liam", "Ava", "Isabella", "Sophia", "Mia" };
        return fnames[ranArr(fnames)];
    }

    private static String randomLN() {
        String[] lnames = { "Willis", "Ramos", "Wei", "Wu", "Smits", "Dickinson", "Johns", "Johnson", "Gomez", "Tyler",
                "Nguyen", "Garcia", "Lee", "Martinez", "Brown", "Kim", "Rodriguez", "Chen", "Lopez", "Davis" };
        return lnames[ranArr(lnames)];
    }


    private static String randomSN() {
        String[] street = { "Main St.", "Wall Rd.", "West Ln.", "Fannin Rd.", "Westwood Ln.", "Apple St.", "Berry Ln.",
                "Maple Ave.", "Cedar Dr.", "Oak St.", "Pine Rd.", "Elm Ln.", "Birch Way", "Cherry Ct.", "Hickory Rd." };
        return street[ranArr(street)];
    }

    private static String randomCI() {
        String[] city = { "Austin", "NYC", "SF", "Miami", "Ball City", "Hamford", "Turtleville", "Appleton", "Chicago",
                "Los Angeles", "Seattle", "London", "Paris", "Tokyo", "Sydney", "Toronto", "Berlin", "Moscow" };
        return city[ranArr(city)];
    }

    private static String randomST() {
        String[] state = { "CA", "WY", "RI", "HI", "CO", "TX", "NY", "FL", "IL", "PA", "OH", "MI", "WA", "OR", "GA",
                "AZ", "NC", "VA", "MA", "WI", "MN" };
        return state[ranArr(state)];
    }

    private static String[] normalCreatePerson(String[][] pDatabase, Scanner input) {

        String personFirstName = "null";
        String personLastName = "null";
        short personStreetNo = 0;
        String personStreetName = "null";
        String personCity = "null";
        String personState = "null";
        int personZipCode = 0;
        long personPhone = 0;
        double personSalary = 0;
        byte personCount = 0;
        int personID = 0;
        long startTime, endTime = 0;
        double elapsetTime = 0;
        byte personCreationHour, personCreationMin = 0;

        System.out.println("   ========================================== ");
        System.out.println("   ======== NORMAL  CREATE Menu - form    ==== ");
        System.out.println("   ========================================== ");
        startTime = System.currentTimeMillis();
        System.out.println("  ");
        personID = Integer.parseInt(getLastIdNumber(pDatabase)) + 1;
        System.out.println(" personCount = [" + personCount + "]");
        System.out.println(" personID = [" + personID + "]");
        System.out.println("   Enter First name : ");
        personFirstName = input.nextLine();
        System.out.println(" personFirstName = [" + personFirstName + "]");
        System.out.println("   Enter Last name : ");
        personLastName = input.nextLine();
        System.out.println(" personLastName = [" + personLastName + "]");
        System.out.println("   Enter Street No [Address] : ");
        personStreetNo = Short.parseShort(input.nextLine());
        System.out.println(" personStreetNo = [" + personStreetNo + "]");
        System.out.println("   Enter Street Name [Address] : ");
        personStreetName = input.nextLine();
        System.out.println(" personStreetName = [" + personStreetName + "]");
        System.out.println("   Enter City [Address] : ");
        personCity = input.nextLine();
        System.out.println(" personCity = [" + personCity + "]");
        System.out.println("   Enter State [Address] : ");
        personState = input.nextLine();
        System.out.println(" personState = [" + personState + "]");
        System.out.println("   Enter Zip Code [Address] : ");
        personZipCode = Integer.parseInt(input.nextLine());
        System.out.println(" personZipCode = [" + personZipCode + "]");
        System.out.println("   Enter Phone [Address] : ");
        personPhone = Long.parseLong(input.nextLine());
        System.out.println(" personPhone = [" + personPhone + "]");
        System.out.println("Please Enter your current salary (ex. 25000 - 125000):");
        personSalary = Float.parseFloat(input.nextLine());
        System.out.println(" personSalary = [" + personSalary + "]");
        endTime = System.currentTimeMillis();
        elapsetTime = ((endTime - startTime) / 1000) % 60;
        personCreationMin = (byte) ((((System.currentTimeMillis()) / 1000) / 60) % 60);
        personCreationHour = (byte) (((((System.currentTimeMillis()) / 1000) / 60) / 60) % 24);
        personCreationHour -= 5;
        personCreationHour = (personCreationHour < 0) ? (personCreationHour += 12) : personCreationHour;
        System.out.println(" Current TIme : [ " + personCreationHour + " : " + personCreationMin + "]  ");
        System.out.println("Person Creation TIme : [ " + elapsetTime + "] sec");
        personCount++;
        System.out.println("   ===========================================  ");
        System.out.println("    ===  Person Add : id#" + personID + " ===  ");
        System.out.println("   ===========================================  ");

        return new String[] { personID + "", personFirstName, personLastName, personStreetNo + "", personStreetName,
                personCity, personState, personZipCode + "", personPhone + "", personSalary + "" };

    }

    private static void readPeople(String[][] pDatabase) {
        printArr(pDatabase);
    }

    private static String[][] updatePerson(String[][] pDatabase, Scanner input) {
        String id = input.nextLine();
        boolean found = false;
        String[][] updatedDatabase = new String[pDatabase.length][pDatabase[0].length];

        for (int i = 0; i < pDatabase.length; i++) {
            if (pDatabase[i][0] != null && pDatabase[i][0].equals(id)) {
                found = true;
                System.out.println("Person found!");
                System.out.println("Select an option to change:");
                System.out.println("1 - Change [fname]\n2 - Change [lname]\n3 - Change [street no.]");
                System.out.println("4 - Change [street name]\n5 - Change [city]\n6 - Change [state]");
                System.out.println("7 - Change [zip]\n8 - Change [phone]\n9 - Change [salary]");
                System.out.println("\n\n\n[row & id] skip! Can not be updated!");
                System.out.println();
                System.out.println("Please Enter (1-9): ");
                int option = Integer.parseInt(input.nextLine());

                // Copy the existing person data to updatedDatabase
                for (int j = 0; j < pDatabase[i].length; j++) {
                    updatedDatabase[i][j] = pDatabase[i][j];
                }

                int elementIndex = option;
                System.out.println("Current value: " + pDatabase[i][elementIndex]);
                System.out.println("Enter new value:");
                String newValue = input.nextLine();

                updatedDatabase[i][elementIndex] = newValue;
            } else {
                // Copy the existing person data to updatedDatabase
                for (int j = 0; j < pDatabase[i].length; j++) {
                    updatedDatabase[i][j] = pDatabase[i][j];
                }
            }
        }

        if (!found) {
            System.out.println("Person does not exist or wrong ID!");
        } else {
            System.out.println("Updated personDatabase:");
            for (String[] row : updatedDatabase) {
                if (row[0] != null) {
                    System.out.println(Arrays.toString(row));
                }
            }
        }
        return updatedDatabase;
    }


    private static String[][] deletePerson(String[][] pDatabase, Scanner input) {

        String id = input.nextLine();
        boolean found = false;
        String[] currentPerson = null;
        String[][] updatedDatabase = new String[pDatabase.length][pDatabase[0].length];
        int updatedIndex = 0;
        for (int i = 0; i < pDatabase.length; i++) {
            if (pDatabase[i][0].equals(id)) {
                found = true;
                currentPerson = pDatabase[i];
                System.out.println("Person found and deleted!");
                break;
            } else {
                for (int j = 0; j < pDatabase[i].length; j++) {
                    updatedDatabase[updatedIndex][j] = pDatabase[i][j];
                }
                updatedIndex++;
            }
        }
        if (!found) {
            System.out.println("Person does not exist or wrong ID!");
        } else {
            // Trim the updatedDatabase to remove empty rows at the end (if any)
            updatedDatabase = new String[updatedIndex][pDatabase[0].length];
            for (int i = 0; i < updatedIndex; i++) {
                for (int j = 0; j < pDatabase[i].length; j++) {
                    updatedDatabase[i][j] = pDatabase[i][j];
                }
            }
            System.out.println("Database updated after deletion.");
            printArr(currentPerson);
        }
        return updatedDatabase;
    }

    private static void printArr(String[] currentPerson) {
        for (int i = 0; i < currentPerson.length; i++) {
            String string = currentPerson[i];
            System.out.print(string + " ");
        }
        System.out.println();

    }

    private static void findPerson(String[][] pDatabase, Scanner input) {

        String id = input.nextLine();
        String[][] remainingData = pDatabase;
        String[] personInfo = null;

        for (String[] row : remainingData) {
            if (row[0].equals(id)) {
                // Remove the row number and ID brackets from the line to display only the
                // person's information.
                personInfo = row;
                break; // Break the loop once the person is found.
            }
        }

        if (personInfo != null) {
            System.out.println("Person found:");
            for (int i = 0; i < personInfo.length; i++) {
                System.out.print(personInfo[i]);
                if (i < personInfo.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Person does not exist or wrong ID!");
        }
    }

    private static String getLastIdNumber(String[][] pDatabase) {
        String lastId = "23032001"; // Start with a default value

        for (String[] row : pDatabase) {
            if (row[1] != null && !row[1].isEmpty()) {
                // Assuming the ID is stored in the second element (index 1) of each row
                String currentId = row[0];
                if (currentId.compareTo(lastId) > 0) {
                    lastId = currentId;
                }
            }
        }

        return lastId;
    }

    private static int countPersons(String[][] pDatabase) {
        int count = 0;
        for (String[] row : pDatabase) {
            if (row[0] != null && !row[0].isEmpty()) {
                count++;
            }
        }
        return count;
    }

    private static void bulkCreatePersons(String[][] pDatabase, Scanner input) {
        System.out.println("How many persons do you want to create?");
        int totalPersons = Integer.parseInt(input.nextLine());
        int batchCount = (totalPersons / 20) + (totalPersons % 20 == 0 ? 0 : 1);
        for (int batch = 1; batch <= batchCount; batch++) {
            int personsInBatch = Math.min(totalPersons, 20);
            totalPersons -= personsInBatch;
            for (int i = 0; i < personsInBatch; i++) {
                System.out.println("Creating person #" + (i + 1));
                String[] newPerson = autoCreatePerson(pDatabase, input); // Assuming you have a method for creating a
                // new person
                pDatabase = addPersonToDatabase(pDatabase, newPerson); // Assuming you have the
                // addPersonToDatabase method
                System.out.println("Person #" + (i + 1) + " created successfully!");
            }

            System.out.println("Batch #" + batch + " created with " + personsInBatch + " persons = ["
                    + (batch * personsInBatch) + "]");
        }
    }

    private static String[][] clearPersons(String[][] pDatabase, Scanner input, int rows, int colsInDatabase) {

        return new String[rows][colsInDatabase];
    }

}

