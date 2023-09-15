package randompms;

import java.util.Random;
import models.Person;

/**
 * The MyRandomPersonData class provides utility methods to generate random person-related data.
 *
 * Attributes:
 * - random: An instance of the Random class to generate random values.
 *
 * Methods:
 * - randomTitle(): Returns a random title (e.g., Mr., Ms., Dr.).
 * - randomFname(): Returns a random first name.
 * - randomLname(): Returns a random last name.
 * - random(long min, long max): Returns a random long value between the specified min and max values.
 * - randomStreet(): Returns a random street name.
 * - randomCity(): Returns a random city name.
 * - randomState(): Returns a random state abbreviation.
 * - randomNumPeople(int size): Generates and returns an array of random Person objects of the specified size.
 *
 * This class is useful for simulating the creation of random person data, especially for testing or mock data generation purposes.
 */

public class MyRandomPersonData {

    private static Random random = new Random();

    public static String randomTitle() {
        // Add more titles as desired
        String[] titles = {"Mr.", "Ms.", "Mrs.", "Dr.", "Prof."};
        return titles[random.nextInt(titles.length)];
    }

    public static String randomFname() {
        // Add more names as desired
        String[] firstNames = {"John", "Jane", "Robert", "Anna", "Mike"};
        return firstNames[random.nextInt(firstNames.length)];
    }

    public static String randomLname() {
        // Add more names as desired
        String[] lastNames = {"Smith", "Doe", "Johnson", "Brown", "White"};
        return lastNames[random.nextInt(lastNames.length)];
    }

    public static long random(long min, long max) {
        return min + (long)(random.nextDouble() * (max - min));
    }

    public static String randomStreet() {
        String[] streets = {"Main St.", "First Ave.", "Park Ave.", "Elm St.", "Broadway"};
        return streets[random.nextInt(streets.length)];
    }

    public static String randomCity() {
        String[] cities = {"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"};
        return cities[random.nextInt(cities.length)];
    }

    public static String randomState() {
        String[] states = {"NY", "CA", "IL", "TX", "AZ"};
        return states[random.nextInt(states.length)];
    }

    // Method to generate an array of random people
    public static Person[] randomNumPeople(int size) {
        Person[] people = new Person[size];
        for (int i = 0; i < size; i++) {
            people[i] = new Person();  // Assuming you have a Person class with a default constructor
        }
        return people;
    }
}
