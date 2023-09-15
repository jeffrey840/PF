package models;
 
import randompms.MyRandomPersonData;

/**
 * The Contact class represents a contact detail, specifically a phone number.
 *
 * Attributes:
 * - phone: A unique phone number associated with the contact.
 *
 * Methods:
 * - Contact(): Default constructor that initializes a Contact object with a random phone number sourced from MyRandomPersonData.
 * - Contact(Long phone): Parameterized constructor that initializes a Contact object with the provided phone number.
 * - getPhone(): Getter method that returns the phone number of the contact.
 * - setPhone(Long phone): Setter method that allows for the setting or updating of the phone number.
 * - toString(): Overrides the default toString() method to provide a string representation of the Contact object.
 *
 * This class provides a model for contact details, specifically focusing on phone numbers, and allows for the creation, modification, and representation of contact details.
 */

public class Contact {

	// Instance variable representing the phone number of the contact
	private Long phone;

	// Default constructor that initializes the Contact object with a random phone number
	public Contact() {
		super();
		this.phone = Math.abs( MyRandomPersonData.random(214_111_1111L, 214_999_9999L));
	}

	// Parameterized constructor that initializes the Contact object with a provided phone number
	public Contact(Long phone) {
		super();
		this.phone = phone;
	}

	// Getter method for phone number
	public Long getPhone() {
		return phone;
	}

	// Setter method to set/update the phone number
	public void setPhone(Long phone) {
		this.phone = phone;
	}

	// Overrides the default toString() method to provide a string representation of the Contact object
	@Override
	public String toString() {
		return " Contact [phone=" + phone + "]";
	}
	
	

}
