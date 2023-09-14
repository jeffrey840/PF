package models;
 
import randompms.MyRandomPersonData;

/*

Explanation:

Instance Variable: There's one private instance variable named phone of type Long, representing the phone number of the contact.

Constructors:

Default Constructor: This constructor initializes a Contact object with a random phone number generated using the MyRandomPersonData.random() method. The range for the phone number is between 214_111_1111L and 214_999_9999L. The Math.abs() ensures that the number is positive.
Parameterized Constructor: Initializes a Contact object with the provided phone number.
Getter and Setter Methods:

getPhone(): Returns the phone number of the contact.
setPhone(Long phone): Sets or updates the phone number of the contact.
toString() Method: Overrides the default toString() method to provide a string representation of the Contact object. It's useful for printing or logging the state of the object.

Miscellaneous: The code uses the super(); call in the constructors, which is a call to the parent class's constructor. Since Contact doesn't explicitly extend another class (other than implicitly extending Object), this call is redundant and can be safely removed.

* */

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
