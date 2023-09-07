



package module02.objectclassestopics;

import java.util.Random;

public class MyRandomPersonData {

    private static final Random RANDOM = new Random();

    public static String randomFname() {
        String[] FIRST_NAMES = {
                "Emma", "Liam", "Olivia", "Noah", "Ava", "Isabella", "Sophia", "Mia",
                "Charlotte", "Amelia", "Harper", "Evelyn", "Abigail", "Emily", "Elizabeth", "Sofia",
                "Avery", "Ella", "Scarlett", "Grace", "Victoria", "Riley", "Aria", "Lily", "Aubrey",
                "Zoey", "Penelope", "Hannah", "Layla", "Nora", "Lily", "Lillian", "Addison",
                "Eleanor", "Natalie", "Ellie", "Leah", "Aubrey", "Hazel", "Violet", "Aurora",
                "Savannah", "Audrey", "Brooklyn", "Bella", "Claire", "Skylar", "Lucy", "Paisley", "Everly"
        };
        int randomIndex = RANDOM.nextInt(FIRST_NAMES.length);
        return FIRST_NAMES[randomIndex];
    }

    public static String randomLname() {
        String[] LAST_NAMES = {
                "Smith", "Johnson", "Brown", "Taylor", "Miller", "Jones", "Garcia", "Davis",
                "Rodriguez", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson",
                "Thomas", "Taylor", "Moore", "Jackson", "Martin"
                // ... Add more last names as needed
        };
        int randomIndex = RANDOM.nextInt(LAST_NAMES.length);
        return LAST_NAMES[randomIndex];
    }

    public static short randomNumber(long min, long max) {
        return (short) (RANDOM.nextLong() % (max - min + 1) + min);
    }

    public static int randomNumber(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }

    public static short randomNumberShort(int min, int max) {
        return (short) (RANDOM.nextInt(max - min + 1) + min);
    }

    public static String randomStreet() {
        String[] STREET_TYPES = {
                "St.", "Ave.", "Rd.", "Ln.", "Dr.", "Ct.", "Pl.", "Cir.", "Blvd.", "Way"
        };
        String[] STREET_NAMES = {
                "Maple", "Oak", "Cedar", "Pine", "Elm", "Birch", "Willow", "Hickory",
                "Ash", "Poplar", "Cherry", "Spruce", "Sycamore", "Cypress", "Alder",
                "Dogwood", "Juniper", "Magnolia", "Redwood", "Fir"
                // ... Add more street names as needed
        };
        int randomTypeIndex = RANDOM.nextInt(STREET_TYPES.length);
        int randomNameIndex = RANDOM.nextInt(STREET_NAMES.length);
        return STREET_NAMES[randomNameIndex] + " " + STREET_TYPES[randomTypeIndex];
    }

    public static String randomCity() {
        String[] CITIES = {
                "New York", "Los Angeles", "Chicago", "Houston", "Phoenix", "Philadelphia", "San Antonio",
                "San Diego", "Dallas", "San Jose", "Austin", "Jacksonville", "San Francisco", "Columbus",
                "Indianapolis", "Fort Worth", "Charlotte", "Seattle", "Denver", "Washington"

        };
        int randomIndex = RANDOM.nextInt(CITIES.length);
        return CITIES[randomIndex];
    }

    public static String randomState() {
        String[] STATES = {
                "Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
                "Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa",
                "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan",
                "Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada",
                "New Hampshire", "New Jersey"

        };
        int randomIndex = RANDOM.nextInt(STATES.length);
        return STATES[randomIndex];
    }

    public static Long randomBigNumber(long min, long max) {
        return RANDOM.nextLong() % (max - min + 1) + min;
    }
}
