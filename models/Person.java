package models;

/**
 * The Person class represents an individual with various attributes such as ID, name, location, contact, and financial details.
 *
 * Attributes:
 * - id: Represents a unique identifier for the person.
 * - name: Represents the full name details of the person.
 * - location: Represents the location details of the person.
 * - contact: Represents the contact details of the person.
 * - funds: Represents the financial details of the person.
 *
 * Methods:
 * - Person(): Default constructor that initializes a Person object with default values for each attribute. The ID is computed based on a hashcode of the concatenated string representation of all attributes.
 * - Person(Long id, Name name, Location location, Contact contact, Funds funds): Parameterized constructor that initializes a Person object with the provided values.
 * - Person(Person p): Copy constructor that creates a new Person object based on another Person object.
 * - getId(), setId(Long id): Getter and setter methods for the ID.
 * - getName(), setName(Name name): Getter and setter methods for the name.
 * - getLocation(), setLocation(Location location): Getter and setter methods for the location.
 * - getContact(), setContact(Contact contact): Getter and setter methods for the contact.
 * - getFunds(), setFunds(Funds funds): Getter and setter methods for the financial details.
 * - display(): Method to display the full details of the Person object.
 * - toString(): Overrides the default toString() method to provide a customized string representation of the Person object, highlighting key attributes.
 *
 * This class provides a comprehensive model for an individual, allowing for the creation, modification, and representation of personal details.
 */

public class Person {
	// Instance variables representing different attributes of a person.

	private Long id;
	private Name name;
	private Location location;
	private Contact contact;
	private Funds funds;

	// Default constructor which initializes each attribute of the Person object.
	public Person() {
		super();
		this.name = new Name(); // Initializing with default Name object.
		this.location = new Location(); // Initializing with default Location object.
		this.contact =  new Contact(); // Initializing with default Contact object.
		this.funds =  new Funds(); // Initializing with default Funds object.

		// Computing a hashcode for the concatenated string representation of all attributes and taking its absolute value.
		this.id = (long) Math.abs( (name + "" + location
				+ "" + contact + "" + funds + "").hashCode() );

	}

	// Parameterized constructor for initializing a Person object with given attributes.
	public Person(Long id, Name name, Location location, Contact contact, Funds funds) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.contact = contact;
		this.funds = funds;
	}

	// Copy constructor to initialize a new Person object from another Person object.
	public Person(Person p) {
		super();
		this.id = p.getId();
		this.name = p.getName();
		this.location = p.getLocation();
		this.contact = p.getContact();
		this.funds = p.getFunds();
	}

	// Standard getters and setters for all the attributes.
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Funds getFunds() {
		return funds;
	}

	public void setFunds(Funds funds) {
		this.funds = funds;
	}


	// Method to display the full details of the Person object.
	public void display() {
		String print="Person [id=" + id + ", \n" +
	name + ", \n" + location + ", \n" + contact + ",\n"	+ funds + "]";
		System.out.println(print);
	}

	// Overrides the default toString() method to provide a customized string representation of the Person object.
	@Override
	public String toString() {
	 return "[ID=" + id + ", Name=" + name.getFname() + ", Phone=" + contact.getPhone() + ", CurrentBalance="+ funds.getCurrentBalance() + "]";
	}
}
