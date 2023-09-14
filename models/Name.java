package models;

import randompms.MyRandomPersonData;

/*

Explanation:

Instance Variables: The class has four private instance variables representing different components of a person's name.

Constructors:

Default Constructor: Initializes the Name object with random values for title, first name, middle initial (using a method that retrieves a random first name which might be misleading), and last name.
Parameterized Constructor: Initializes the Name object with the provided values. The other parameter seems to be unused, and you might want to consider removing it if it's not required.
Getter and Setter Methods: Standard methods to retrieve or modify the values of the instance variables.

toString() Method: Overrides the default toString() method to provide a formatted string representation of the Name object.

* */

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
