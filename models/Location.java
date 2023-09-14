package models;

import randompms.MyRandomPersonData;

/*

Explanation:

Instance Variables: The class has six private instance variables representing various components of a location.

Constructors:

Default Constructor: Initializes the Location object with random values for street number, street name, city, state, and zip code. It then combines these attributes into a single string and computes a unique locationID based on the combined string's characters' ASCII values.
Parameterized Constructor: Initializes the Location object with the provided values for street number, street name, city, state, and zip code, and then computes the locationID in the same way.
charsDecimalValuesOfString(String input): This private method calculates a unique locationID by iterating through each character of the input string and summing up their ASCII values.

Getter and Setter Methods: Standard methods to retrieve or modify the values of the instance variables.

showZip() Method: Returns the zip code as a string with leading zeros (ensures it's 5 characters long).

toString() Method: Overrides the default toString() method to provide a formatted string representation of the Location object.

* */

public class Location {
	// Instance variables to represent a location's unique ID, street number, name, city, state, and zip code.
	private Long locationID;
	private Short streetNo;
	private String streetName;
	private String city;
	private String state;
	private Integer zip;

	// Default constructor that initializes the Location object with random values for its attributes.
	public Location() {
		super();
		this.streetNo =(short) Math.abs( MyRandomPersonData.random(1, 21222) );
		this.streetName =  MyRandomPersonData.randomStreet();
		this.city =  MyRandomPersonData.randomCity();
		this.state =  MyRandomPersonData.randomState();
		this.zip = (int)Math.abs( MyRandomPersonData.random(21222, 92992) );
		//this.zip = 00_002;
		// Combine all the attributes into a single string.
		String combinedValue = streetNo + streetName + city + state + zip;
		// Calculate the unique locationID based on the combined string.
		this.locationID = charsDecimalValuesOfString(combinedValue);
	}

	// Parameterized constructor initializes the Location object with provided values and also calculates locationID.
	public Location(Short streetNo, String streetName, String city, String state, Integer zip) {
		super();
		this.streetNo = streetNo;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.zip = zip;
		String combinedValue = streetNo + streetName + city + state + zip;
		this.locationID = charsDecimalValuesOfString(combinedValue);
	}

	// Method to calculate locationID by summing up the ASCII values of characters in the input string.
	private long charsDecimalValuesOfString(String input) {
	    long result = 0;
	    for (char c : input.toCharArray()) {
	        result += (long) c; // Adding the decimal value of the character
	    }
	    return result;
	}

	// Getter and Setter methods for locationID, street number, street name, city, state, and zip code.
	public Long getLocationID() {
		return locationID;
	}
	public void setLocationID(Long locationID) {
		this.locationID = locationID;
	}
	public Short getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(Short streetNo) {
		this.streetNo = streetNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
	// Method to return zip code formatted with leading zeros.
	private String showZip() { 
		return String.format("%05d", zip); 
	}

	// Overrides the default toString() method to provide a string representation of the Location object.
	@Override
	public String toString() {
		return " Location [locationID=" + locationID + ", streetNo=" + streetNo + ", streetName=" + streetName
				+ ", city=" + city + ", state=" + state + ", zip=" + showZip() + "]";
	}


}
