package main;

import models.Person;
import randompms.MyRandomPersonData;

/**
 * The TestStackOfPersons class provides a testing environment to demonstrate the functionalities of the StackOfPersons class.
 *
 * Main Method:
 * - main(String[] args): Demonstrates the following functionalities:
 *   1. Generates an array of random Person objects using the MyRandomPersonData utility.
 *   2. Initializes a StackOfPersons object and pushes all the generated Person objects onto the stack.
 *   3. Demonstrates the peek functionality of the stack.
 *   4. Creates a new Person object and pushes it onto the stack.
 *   5. Prints all the Person objects currently in the stack.
 *   6. Updates a Person object in the stack.
 *   7. Deletes a Person object from the stack.
 *   8. Pushes a bulk of Person objects onto the stack.
 *   9. Searches for a Person object in the stack by their ID.
 *
 * This class serves as a test driver to showcase the operations and methods of the StackOfPersons class.
 */


public class TestStackOfPersons {
    public static void main(String[] args) {
        int size = 100;
        Person[] people = MyRandomPersonData.randomNumPeople(size);

        StackOfPersons stack = new StackOfPersons(); 
        for (int i = 0; i < size; i++) {
           
			stack.push( people[i]); 
        }

        Person p = people[people.length - 1];
        System.out.println("Last in Person[] => " + p);

        System.out.println("Peek PersonStacks => " + stack.peek());

        // Add more functionalities

        // Create a person automatically
        Person newPerson = new Person();
        stack.push(newPerson);

        // Read all persons in stack or array
        System.out.println("All persons in stack:");
        stack.printAllPersons();

        // Update a person
        Person updatedPerson = new Person();
        stack.updatePerson(p, updatedPerson);

        // Delete a person
        stack.deletePerson(newPerson);

        // Create bulk number of persons
        int bulkSize = 5;
        Person[] bulkPeople = MyRandomPersonData.randomNumPeople(bulkSize);
        for (Person person : bulkPeople) {
            stack.push(person);
        }

        // Search for a person by ID
        Long searchId = stack.peek().getId(); // Replace with the desired ID
        Person foundPerson = stack.searchPersonById(searchId);
        if (foundPerson != null) {
            System.out.println("Found person with ID " + searchId + ": " + foundPerson);
        } else {
            System.out.println("Person with ID " + searchId + " not found.");
        }
    }
}
