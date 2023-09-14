package main;

import models.Person;

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
