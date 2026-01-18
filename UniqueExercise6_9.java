public class UniqueExercise6_9 {

    // Converts a length in feet to meters
    public static double convertFeetToMeters(double feetLength) {
        return feetLength * 0.305;
    }

    // Converts a length in meters to feet
    public static double convertMetersToFeet(double metersLength) {
        return metersLength * 3.279;
    }

    public static void main(String[] args) {

        System.out.println("Feet  Meters  Meters    Feet");
        System.out.println("");

        double metersColumn = 20.0;  // Starting value for meters

        // Loop through feet 1 to 10
        for (int f = 1; f <= 10; f++) {

            double metersFromFeet = convertFeetToMeters(f);
            double feetFromMeters = convertMetersToFeet(metersColumn);

            // Print both columns with a different format style
            System.out.printf("%-4d | %-6.2f   %-6.1f | %-6.2f%n",
                    f, metersFromFeet, metersColumn, feetFromMeters);

            metersColumn += 5; // Increment meters column by 5 for next row
        }


    }
}
