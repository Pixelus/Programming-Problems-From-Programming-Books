import java.util.Scanner;

public class TimeConverter {
   public static void main(String[] args) {

        /* Prompt the user for input */
        System.out.print("Enter a time in seconds: ");
        Scanner in = new Scanner(System.in);

        /* Read an integer from the keyboard */
        int secondsAtTheBeginning = in.nextInt();

        /* Convert seconds to hours, minutes, and seconds */
        final int SECONDS_BY_HOUR = 3600;
        final int SECONDS_BY_MINUTE = 60;
        int hours = secondsAtTheBeginning / SECONDS_BY_HOUR;
        int minutes = (secondsAtTheBeginning - SECONDS_BY_HOUR * hours) / SECONDS_BY_MINUTE;
        int seconds = secondsAtTheBeginning - SECONDS_BY_HOUR * hours - 60 * minutes;

        /* Display the output */
        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds.",secondsAtTheBeginning, hours, minutes, seconds);
        in.close();
        System.out.println();
   }
}