package models;

/*

Explanation:

Instance Variables: The class has private instance variables representing various details of a person - their identification, name, location, contact, and financial details.

Constructors:

Default Constructor: Initializes the Person object with default values for each attribute. The ID is uniquely generated based on the hashcode of the string representation of all attributes combined.
Parameterized Constructor: Initializes the Person object with provided values for each attribute.
Copy Constructor: Initializes a new Person object by copying the values from an existing Person object.
Getter and Setter Methods: Standard methods to retrieve or modify the values of the instance variables.

display() Method: Prints a comprehensive view of the Person object to the console.

toString() Method: Overrides the default toString() method to provide a concise string representation of the Person object highlighting key attributes like ID, name, phone number, and current balance.

* */

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
