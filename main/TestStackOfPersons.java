package main;

import models.Person;
import randompms.MyRandomPersonData;

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
