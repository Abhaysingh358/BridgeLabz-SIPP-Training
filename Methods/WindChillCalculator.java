package Methods;
import java.util.Scanner;

public class WindChillCalculator {

    public double calculateWindChill(double temperature, double windSpeed) {
        if (temperature > 50 || windSpeed < 3) {
            System.out.println("Wind chill is not defined for temperature > 50°F or wind speed < 3 mph.");
            return Double.NaN;
        }

        double windChill = 35.74 + (0.6215 * temperature)
                         - (35.75 * Math.pow(windSpeed, 0.16))
                         + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
        return windChill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed in mph: ");
        double windSpeed = sc.nextDouble();

        WindChillCalculator wcc = new WindChillCalculator();
        double result = wcc.calculateWindChill(temperature, windSpeed);

        if (!Double.isNaN(result)) {
            System.out.printf("The wind chill temperature is: %.2f°F\n", result);
        }
    }
}
