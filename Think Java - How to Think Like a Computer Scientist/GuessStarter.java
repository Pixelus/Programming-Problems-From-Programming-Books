import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {

        /* Pick a random number */
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        /* Prompt the user for input */
        System.out.println();
        System.out.print("I'm thinking of a number between 1 and 100 (including both). ");
        System.out.println("Can you guess what it is?");
        Scanner in = new Scanner(System.in);
        System.out.print("Type a number: ");
        
        /* Read an integer from the keyboard */
        int guessNumber = in.nextInt();
        System.out.println("Your guess is: " + guessNumber);

        /* Calculate the difference between the user's guess and the number */
        int difference = Math.abs(number - guessNumber);

        /* Display the output */
        System.out.println("The number I was thinking of is: " + number);
        System.out.println("You were off by: " + difference);
        in.close();
    }
}
