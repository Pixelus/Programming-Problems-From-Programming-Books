import java.util.Locale;
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        /* Prompt the user for input */
        System.out.print("Enter a temperature in Celsius: ");
        Scanner in = new Scanner(System.in);

        /* Read a double from the keyboard */
        double temperatureInCelsius = in.nextDouble();

        /* Convert celsius in fahrenheit */
        double temperatureInFahrenheit = temperatureInCelsius * 9/5 + 32;

        /* Display the output */
        System.out.printf(Locale.US, "%.1f C = %.1f F", temperatureInCelsius, 
        temperatureInFahrenheit);
        in.close();
        System.out.println();
    }
}