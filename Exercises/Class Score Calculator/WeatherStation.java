import java.util.Scanner;

public class WeatherStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysInWeek = 7;
        double[] temperatures = new double[daysInWeek];

        for (int day = 1; day <= daysInWeek; day++) {
            System.out.print("Enter the temperature for day " + day + ": ");
            double temperature = scanner.nextDouble();

            if (temperature < -273.15) {
                System.out.println("Temperature cannot be below absolute zero (-273.15°C). Skipping this day.");
                continue;
            }

            temperatures[day - 1] = temperature;
        }

        if (temperatures.length == 0) {
            System.out.println("No valid temperatures were entered.");
        } else {
            // Find the highest and lowest temperatures
            double highestTemperature = temperatures[0];
            double lowestTemperature = temperatures[0];

            for (double temp : temperatures) {
                if (temp > highestTemperature) {
                    highestTemperature = temp;
                }
                if (temp < lowestTemperature) {
                    lowestTemperature = temp;
                }
            }

            System.out.println("Highest temperature of the week: " + highestTemperature + "°C");
            System.out.println("Lowest temperature of the week: " + lowestTemperature + "°C");
        }

        scanner.close();
    }
}

