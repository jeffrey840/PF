package models;

import randompms.MyRandomPersonData;

/**
 * The Name class represents the full name details of a person, including title, first name, middle initial, and last name.
 *
 * Attributes:
 * - title: Represents the title of a person (e.g., Mr., Mrs.).
 * - fname: Represents the first name of a person.
 * - mi: Represents the middle initial of a person.
 * - lname: Represents the last name of a person.
 *
 * Methods:
 * - Name(): Default constructor that initializes a Name object with random values for title, first name, middle initial, and last name sourced from MyRandomPersonData.
 * - Name(String title, String fname, String mi, String lname, String other): Parameterized constructor that initializes a Name object with the provided values.
 * - getTitle(), setTitle(String title): Getter and setter methods for the title.
 * - getFname(), setFname(String fname): Getter and setter methods for the first name.
 * - getMi(), setMi(String mi): Getter and setter methods for the middle initial.
 * - getLname(), setLname(String lname): Getter and setter methods for the last name.
 * - toString(): Overrides the default toString() method to provide a string representation of the Name object.
 *
 * This class provides a model for name details, allowing for the creation, modification, and representation of full names.
 */
public class Name {

	// Instance variables to represent the title (e.g., Mr., Mrs.), first name, middle initial, and last name of a person.
	private String title;
	private String fname;
	private String mi;
	private String lname;
	// Default constructor that initializes the Name object with random values for its attributes.
	public Name() {
		super();
		this.title = MyRandomPersonData.randomTitle();
		this.fname = MyRandomPersonData.randomFname();
		this.mi = MyRandomPersonData.randomFname();
		this.lname = MyRandomPersonData.randomLname(); 
	}

	// Parameterized constructor that initializes the Name object with provided values.
	public Name(String title, String fname, String mi, String lname, String other) {
		super();
		this.title = title;
		this.fname = fname;
		this.mi = mi;
		this.lname = lname; 
	}

	// Getter and Setter methods for the title, first name, middle initial, and last name.
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMi() {
		return mi;
	}
	public void setMi(String mi) {
		this.mi = mi;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}

	// Overrides the default toString() method to provide a string representation of the Name object.
	@Override
	public String toString() {
		return " Name [title=" + title + ", fname=" + fname + ", mi=" + mi + ", lname=" + lname  + "]";
	}
	
	

}
