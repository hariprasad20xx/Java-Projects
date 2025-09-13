import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // NUMBER GUESSING GAME

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declare Variables
        int randomNumber = random.nextInt(1, 101);
        int attempts = 0;
        int guess;

        System.out.println("Number Guessing Game");
        System.out.println("I have a number between 1 and 100. Guess it in ten attempts");

        // Game logic
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > randomNumber) {
                System.out.println("TOO HIGH! Try again.");
            } else if (guess < randomNumber) {
                System.out.println("TOO LOW! Try again.");
            } else {
                System.out.println("CORRECT! You guess it in " + attempts + " attempts");
            }
        } while (guess != randomNumber);

        scanner.close();
    }
}
