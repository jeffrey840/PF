package module02.objectclassestopics;

public class PersonArray {
    private Person[] persons;
    private int count; // To keep track of the actual number of persons in the array

    // Constructor
    public PersonArray(int size) {
        this.persons = new Person[size];
        this.count = 0;
    }

    // Method to add a person
    public boolean addPerson(Person person) {
        if (count < persons.length) {
            persons[count] = person;
            count++;
            return true; // successfully added
        }
        return false; // array is full
    }

    // Method to find a person by ID
    private int findPersonById(Long id) {
        for (int i = 0; i < count; i++) {
            if (persons[i].getId().equals(id)) {
                return i;
            }
        }
        return -1; // not found
    }

    // Method to update a person's details (assumes Person class has setters)
    public boolean updatePerson(Long id, Person updatedPerson) {
        int index = findPersonById(id);
        if (index != -1) {
            persons[index] = updatedPerson; // Replaces the person at this index with updated details
            return true; // successfully updated
        }
        return false; // person not found
    }

    // Method to delete a person by ID
    public boolean deletePerson(Long id) {
        int index = findPersonById(id);
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                persons[i] = persons[i + 1]; // Shift the subsequent persons back
            }
            persons[count - 1] = null; // Remove the last duplicate reference
            count--; // Reduce the count
            return true; // successfully deleted
        }
        return false; // person not found
    }

    // Method to display all persons
    public void displayPersons() {
        for (int i = 0; i < count; i++) {
            System.out.println(persons[i].toString());
        }
    }

    // Getter for size of the array (i.e., actual number of persons added)
    public int getSize() {
        return count;
    }
}
