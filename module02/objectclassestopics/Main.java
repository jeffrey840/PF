package module02.objectclassestopics;


/*

random mps
- myRandomAdminData
- myRandomPersonData

* */


/*

main
- Main
- PersonManager
- stackOfPersons
- TestStackOfPerson

* */

public class Main {
    public static void main(String[] args) {
        int fixedContainerSize = 50;

        PersonArray container = new PersonArray(fixedContainerSize);
        System.out.println("Container Size = " + container.getSize());
        System.out.println("Persons in Container:");
        System.out.println("=====================");
        container.displayAll();
        System.out.println("=====================");
        System.out.println("Persons in Container:");
        int numOfPeople = 100;
        container.createBulkPersons(numOfPeople);
        container.print();
        System.out.println("=====================");
        System.out.println("Container Size = " + container.getSize());
    }
}





