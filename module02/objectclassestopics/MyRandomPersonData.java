package module02.objectclassestopics;

import java.util.Random;

public class MyRandomPersonData {
    private static final Random random = new Random();
    private static final String[] FIRST_NAMES = {"John", "Jane", "Sam", /* ... other names ... */};
    // similarly, arrays for last names, street names, cities, states etc.

    public static String getRandomFirstName() {
        return FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
    }

    // similarly, methods for last name, street name, city, state, zip etc.
}
