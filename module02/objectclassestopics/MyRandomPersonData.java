package module02.objectclassestopics;

import java.util.Date;
import java.util.Random;

public class MyRandomPersonData {

    private static final Random random = new Random();

    private static final String[] FIRST_NAMES = {"John", "Jane", "Sam", "Lucy", "Michael", "Sarah"};
    private static final String[] LAST_NAMES = {"Smith", "Doe", "Johnson", "Williams", "Brown", "Jones"};
    private static final String[] STREET_NAMES = {"Main St", "High St", "Park Ave", "Elm St", "2nd St"};
    private static final String[] CITIES = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"};
    private static final String[] STATES = {"NY", "CA", "IL", "TX", "AZ"};

    public static String getRandomFirstName() {
        return FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
    }

    public static String getRandomLastName() {
        return LAST_NAMES[random.nextInt(LAST_NAMES.length)];
    }

    public static String getRandomStreetName() {
        return STREET_NAMES[random.nextInt(STREET_NAMES.length)];
    }

    public static short getRandomStreetNo() {
        return (short) (random.nextInt(1000) + 1);
    }

    public static String getRandomCity() {
        return CITIES[random.nextInt(CITIES.length)];
    }

    public static String getRandomState() {
        return STATES[random.nextInt(STATES.length)];
    }

    public static int getRandomZip() {
        return random.nextInt(90000) + 10000;  // Zip codes from 10000 to 99999
    }

    public static long getRandomPhone() {
        return 1000000000L + random.nextInt(900000000);  // 10 digit phone number
    }

    public static float getRandomSalary() {
        return random.nextFloat() * 100000;  // Salary between 0.00 to 100000.00
    }

    public static Date getRandomCreationDate() {
        // Generate random dates in the last 10 years
        long tenYearsInMillis = 10L * 365 * 24 * 60 * 60 * 1000;
        return new Date(System.currentTimeMillis() - random.nextInt((int) tenYearsInMillis));
    }

    public static boolean getRandomIsMember() {
        return random.nextBoolean();
    }

    public static String getRandomPassword() {
        // Here, I'm generating a random 8 character password (simple example, might not be secure)
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(chars.charAt(random.nextInt(chars.length())));
        }
        return password.toString();
    }
}
