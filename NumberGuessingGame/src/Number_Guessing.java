import java.util.Random;
import java.util.Scanner;
public class Number_Guessing {

	 public static void main(String[] args) {
	        // Generate a random number between 1 and 100
	        Random random = new Random();
	        int secretNumber = random.nextInt(100) + 1;

	        // Ask the user to guess the number
	        Scanner scanner = new Scanner(System.in);
	        int guess;
	        int attempts = 0;
	        boolean hasWon = false;

	        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
	        while (attempts < 5) {
	            System.out.print("Enter your guess: ");
	            guess = scanner.nextInt();
	            attempts++;

	            if (guess == secretNumber) {
	                hasWon = true;
	                break;
	            } else if (guess < secretNumber) {
	                System.out.println("Your guess is too low.");
	            } else {
	                System.out.println("Your guess is too high.");
	            }
	        }

	        // Display the results
	        if (hasWon) {
	            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	        } else {
	            System.out.println("Sorry, you did not guess the number. The number was " + secretNumber + ".");
	        }
	    }

	}
