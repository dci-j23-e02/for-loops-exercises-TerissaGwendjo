import java.util.Scanner;

public class WeatherStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysInWeek = 7; //  declares an integer variable named daysInWeek and initializes it with the value 7.
        double[] temperatures = new double[daysInWeek];
        // This line declares a double array named temperatures and initializes it as an array of double values.
        // In this case, it's set to 7, so the array temperatures is created with a length of 7.
        // The purpose of this array is likely to store temperature values for each day of the week,
        // such as the daily high temperatures for seven consecutive days.
        // he purpose of this array is likely to store temperature values for each day of the week,
        // such as the daily high temperatures for seven consecutive days

        for (int day = 1; day <= daysInWeek; day++) {
            System.out.print("Enter the temperature for day " + day + ": ");
            double temperature = scanner.nextDouble(); // The user is expected to enter the temperature for the current
            // day, and that value is stored in the temperature variable.

            if (temperature < -273.15) {
                // checks whether the entered temperature is below absolute zero (-273.15°C).
                System.out.println("Temperature cannot be below absolute zero (-273.15°C). Skipping this day.");
                continue;
                // The continue statement moves to the next iteration of the loop without executing the remaining code for the current day.
            }

            temperatures[day - 1] = temperature;

            // Since array indices are 0-based, it uses day - 1 to access the appropriate slot for the current day.
            // For example, for "day 1," it accesses temperatures[0].
        }

        if (temperatures.length == 0) {
            System.out.println("No valid temperatures were entered.");
            // This is an if-else statement that checks if the temperatures array is empty, i.e.,
            // if no valid temperatures were entered. If the array is empty (length is 0), it prints "No valid
            // temperatures were entered."If the array is not empty, it proceeds to find the highest and lowest temperatures.

        } else {
            // Find the highest and lowest temperatures
            double highestTemperature = temperatures[0]; // Initializes a variable highestTemperature with the first temperature in the array.
            double lowestTemperature = temperatures[0];

            for (double temp : temperatures) { // This is an enhanced for loop that iterates through each element
                // (temperature) in the temperatures array.
                if (temp > highestTemperature) {
                    highestTemperature = temp; // highest temp updated.This way, it keeps track of the highest temperature encountered.
                }
                if (temp < lowestTemperature) {
                    lowestTemperature = temp;
                }
            }

            System.out.println("Highest temperature of the week: " + highestTemperature + "°C");
            System.out.println("Lowest temperature of the week: " + lowestTemperature + "°C");
        }

        // In summary, this code first checks if any temperatures were entered. If valid temperatures exist,
        // it finds and prints the highest and lowest temperatures from the provided data. If no valid temperatures
        // were entered, it informs the user that no valid temperatures were recorded.

        scanner.close();
    }
}

