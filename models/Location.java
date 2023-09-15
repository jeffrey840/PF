package models;

import randompms.MyRandomPersonData;

/**
 * The Location class represents geographical details, including a location's unique ID, street number, name, city, state, and zip code.
 *
 * Attributes:
 * - locationID: A unique identifier associated with a location.
 * - streetNo: The street number.
 * - streetName: The name of the street.
 * - city: The city name.
 * - state: The state name.
 * - zip: The zip code.
 *
 * Methods:
 * - Location(): Default constructor that initializes a Location object with random values for its attributes sourced from MyRandomPersonData.
 * - Location(Short streetNo, String streetName, String city, String state, Integer zip): Parameterized constructor that initializes a Location object with the provided values and also calculates the locationID.
 * - charsDecimalValuesOfString(String input): Private method to calculate locationID by summing up the ASCII values of characters in the input string.
 * - getLocationID(), setLocationID(Long locationID): Getter and setter methods for locationID.
 * - getStreetNo(), setStreetNo(Short streetNo): Getter and setter methods for street number.
 * - getStreetName(), setStreetName(String streetName): Getter and setter methods for street name.
 * - getCity(), setCity(String city): Getter and setter methods for city.
 * - getState(), setState(String state): Getter and setter methods for state.
 * - getZip(), setZip(Integer zip): Getter and setter methods for zip code.
 * - showZip(): Private method to return zip code formatted with leading zeros.
 * - toString(): Overrides the default toString() method to provide a string representation of the Location object.
 *
 * This class provides a model for geographical details, allowing for the creation, modification, and representation of location data.
 */

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
