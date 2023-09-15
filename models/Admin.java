package models;

import randompms.MyRandomAdminData;

/*
package module04.oop.models;
import module04.oop.randompms.MyRandomAdminData;
import module04.oop.
* */

/**
 * The Admin class represents an administrative user with attributes such as ID, username, and password.
 *
 * Attributes:
 * - id: A unique identifier for the admin.
 * - user: The username of the admin.
 * - pass: The password of the admin.
 *
 * Methods:
 * - Admin(Long id, String user, String pass): Constructor that initializes an Admin object with the provided ID, username, and password.
 * - Admin(Admin admin): Copy constructor that creates a new Admin object based on another Admin object.
 * - Admin(): Default constructor that initializes an Admin object with random data sourced from MyRandomAdminData.
 * - getId() and setId(Long id): Getter and setter methods for the ID attribute.
 * - getUser() and setUser(String user): Getter and setter methods for the username attribute.
 * - getPass() and setPass(String pass): Getter and setter methods for the password attribute.
 * - toString(): Overrides the default toString() method to provide a string representation of the Admin object.
 *
 * This class provides a model for administrative users, allowing for the creation, modification, and representation of admin details.
 */

public class Admin {

    // Instance variables representing the attributes of an admin
    private Long id;
    private String user;
    private String pass;


    // Constructor that takes id, user, and pass as parameters and initializes the corresponding attributes
    public Admin(Long id, String user, String pass) {
        this.id = id;
        this.user = user;
        this.pass = pass;
    }

    // Copy constructor that creates a new Admin object from another Admin object
    public Admin(Admin admin) {
        this.id = admin.getId();
        this.user = admin.getUser();
        this.pass = admin.getPass();
    }

    // Default constructor that creates a new Admin object with random data from MyRandomAdminData
    public Admin() {
        Admin generatedAdmin = MyRandomAdminData.generateRandomAdmin();
        this.id = generatedAdmin.getId();
        this.user = generatedAdmin.getUser();
        this.pass = generatedAdmin.getPass();
    }

    // Getter and Setter methods for id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter methods for user (username)
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    // Getter and Setter methods for pass (password)
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    // Overrides the default toString() method to provide a string representation of an Admin object
	@Override
	public String toString() {
		return "Admin [id=" + id + ", user=" + user + ", pass=" + pass + "]";
	}
    
    
}
