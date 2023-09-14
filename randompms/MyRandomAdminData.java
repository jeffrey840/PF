package randompms;

import models.Admin;

import java.util.Random;

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
