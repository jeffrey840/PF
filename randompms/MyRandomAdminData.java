package randompms;

import models.Admin;

import java.util.Random;

/*
package module04.oop.randompms;
import module04.oop.models.Admin;
import module04.oop.java.util.Random;
* */

/**
 * The MyRandomAdminData class provides utility methods to generate random admin data.
 *
 * Attributes:
 * - USERNAMES: An array of predefined usernames.
 * - PASSWORDS: An array of predefined passwords.
 * - random: An instance of the Random class to generate random values.
 *
 * Methods:
 * - generateRandomAdmin(): Generates and returns a random Admin object with a unique ID, random username, and password.
 *
 * This class is useful for simulating the creation of random admin accounts, especially for testing or mock data generation purposes.
 */
public class MyRandomAdminData {

    private static final String[] USERNAMES = {"admin123", "root", "masteradmin", "superuser", "adminhero"};
    private static final String[] PASSWORDS = {"password123", "adminpass", "rootpass", "secure123", "pass@123"};

    private static Random random = new Random();

    public static Admin generateRandomAdmin() {
        Long id = Math.abs(random.nextLong());
        String user = USERNAMES[random.nextInt(USERNAMES.length)];
        String pass = PASSWORDS[random.nextInt(PASSWORDS.length)];

        return new Admin(id, user, pass);
    }
}
