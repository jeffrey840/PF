


package module02.objectclassestopics;

public class PersonArray {

    private Person[] persons;

    public PersonArray(int size) {
        persons = new Person[size];
    }

    public PersonArray(Person[] p) {
        persons = p;
    }

    public void setPerson(int index, Person person) {
        index = index < 0 ? 0 : index;
        index = index > persons.length - 1 ? persons.length - 1 : index;
        if (index >= 0 && index < persons.length) {
            persons[index] = person;
        }
    }

    public Person getPersonByIndex(int index) {
        if (index >= 0 && index < persons.length) {
            return persons[index];
        }
        return null;
    }

    public int getSize() {
        return persons.length;
    }

    public void displayAll() {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null) {
                System.out.println("Person " + i + ":");
                persons[i].display();
            }
        }
    }

    public void updateByPerson(Person person) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].getId().equals(person.getId())) {
                persons[i] = person;
                return;
            }
        }
    }

    public void updateByPerson(Long id, Person updatedPerson) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].getId().equals(id)) {
                persons[i] = updatedPerson;
                return;
            }
        }
    }

    public void deleteByPerson(Person person) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].getId().equals(person.getId())) {
                persons[i] = null;
                return;
            }
        }
    }

    public void deleteByPerson(Long id) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i] != null && persons[i].getId().equals(id)) {
                persons[i] = null;
                return;
            }
        }
    }

    public void createBulkPersons(int num) {
        num = num > 1 ? num : 1;
        persons = new Person[num];
        for (int i = 0; i < num; i++) {
            persons[i] = new Person();
        }
    }

    public void print() {
        for (int i = 0; i < persons.length; i++) {
            Person person = persons[i];
            System.out.println(i + " : " + person.printPerson());
        }
    }
}
