package main;

import models.Person;

/*
package module04.oop.main;
import module04.oop.models.Person;

* */

/**
 * The StackOfPersons class models a stack structure specifically designed to manage Person objects.
 *
 * Attributes:
 * - stack: An array used to store Person objects in a stack format.
 * - top: A pointer indicating the topmost element in the stack.
 * - capacity: The maximum number of elements the stack can hold.
 *
 * Methods:
 * - StackOfPersons(): Default constructor that initializes the stack to a fixed size of 500.
 * - StackOfPersons(int capacity): Parameterized constructor that initializes the stack based on the provided capacity.
 * - StackOfPersons(Person[] stack): Constructor that initializes the stack from a provided array of Person objects.
 * - getPersonCount(): Returns the current number of persons in the stack.
 * - getCapacity(): Returns the total capacity of the stack.
 * - push(Person person): Adds a new person onto the stack if there's space.
 * - pop(): Removes and returns the topmost person from the stack if it's not empty.
 * - peek(): Returns the topmost person without removing it, if the stack is not empty.
 * - printAllPersons(): Prints all persons currently in the stack.
 * - updatePerson(Person oldPerson, Person newPerson): Updates the details of a given person with new details.
 * - deletePerson(Person person): Deletes a given person from the stack by shifting elements.
 * - createBulkPersons(Person[] persons): Adds multiple persons onto the stack from a given array.
 * - searchPersonById(long searchId): Searches for a person by their ID and returns the person if found.
 * - setCapacity(int input): Updates the capacity of the stack.
 * - clear(): Resets the stack by initializing a new stack with the existing capacity.
 *
 * This class provides a comprehensive stack management system for Person objects, including functionalities
 * for adding, updating, deleting, and searching for persons, as well as other utility operations.
 */

// This class models a stack to manage Person objects.
public class StackOfPersons {
	private Person[] stack; // Array used to store Person objects in a stack
	private int top; // Top pointer to keep track of the topmost element in the stack
	private int capacity; // Maximum number of elements the stack can hold


	// Default constructor initializes the stack to a fixed size of 500
	public StackOfPersons() {
		this.stack = new Person[500]; // Assuming a maximum of 500 persons
		capacity = stack.length;
		top = -1;
	}

	// Parameterized constructor allowing dynamic stack size based on the provided capacity
	public StackOfPersons(int capacity) {
		stack = new Person[capacity]; // Assuming a maximum of x persons
		this.capacity = capacity;
		top = -1;
	}

	// Constructor that initializes the stack from a provided array of Person objects
	public StackOfPersons(Person[] stack) {
		this.stack = stack; 
		top=stack.length-1;
		capacity=stack.length;
	}

	// Method to get the current number of persons in the stack
	public int getPersonCount() {
		return top + 1;
	}

	// Method to get the total capacity of the stack
	public int getCapacity() {
		return capacity;
	}

	// Push a new person onto the stack if there's space
	public void push(Person person) {
		if (top < stack.length - 1) {
			top++;
			stack[top] = person;
		} else {
			System.out.println("Stack is full. Cannot push more persons.");
		}
	}

	// Remove and return the topmost person from the stack if it's not empty
	public Person pop() {
		if (top >= 0) {
			Person person = stack[top];
			stack[top] = null;
			top--;
			return person;
		} else {
			System.out.println("Stack is empty. Cannot pop.");
			return null;
		}
	}

	// Return the topmost person without removing it, if the stack is not empty
	public Person peek() {
		if (top >= 0) {
			return stack[top];
		} else {
			System.out.println("Stack is empty. Cannot peek.");
			return null;
		}
	}

	// Print all persons currently in the stack
	public void printAllPersons() {
		for (int i = 0; i <= top; i++) {
			System.out.println(i+" "+stack[i]);
		}
	}

	// Update the details of a given person (oldPerson) with a new person's details (newPerson)
	public void updatePerson(Person oldPerson, Person newPerson) {
		for (int i = 0; i <= top; i++) {
			if (stack[i] == oldPerson) {
				stack[i] = newPerson;
				break;
			}
		}
	}

	// Delete a given person from the stack by shifting elements
	public void deletePerson(Person person) {
		for (int i = 0; i <= top; i++) {
			if (stack[i] == person) {
				for (int j = i; j < top; j++) {
					stack[j] = stack[j + 1];
				}
				stack[top] = null;
				top--;
				break;
			}
		}
	}

	// Push multiple persons onto the stack from a given array
	public void createBulkPersons(Person[] persons) {
		for (Person person : persons) {
			push(person);
		}
	}

	// Search for a person by their ID and return the person if found
	public Person searchPersonById(long searchId) {
		if(top>1) {
		for (int i = 0; i <= top; i++) {
			if (stack[i].getId() == searchId) {
				return stack[i];
			}
		}}else {
			System.out.println("Only 1 person in database");
		}
		return null;
	}

	// Update the capacity of the stack
	public void setCapacity(int input) {
		capacity=input;
	}


	// Reset the stack by initializing a new stack with the existing capacity
	public void clear() {
		stack=new Person[capacity];
		top=0;
	}
 

}
