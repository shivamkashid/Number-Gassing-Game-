import java.util.*;
import java.util.Random;
public class numberGame {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Random random = new Random();
	
			int randomNumber = random.nextInt(100) + 1; // Generate a number between 1 and 100
			int userGuess = 0; // Initialize user guess
			int attempts = 0; // Count attempts
	
			System.out.println("Welcome to the Guessing Game!");
			System.out.println("I have selected a number between 1 and 100. Can you guess it?");
	
			// Loop until the user guesses the correct number
			while (userGuess != randomNumber) {
				System.out.print("Enter your guess: ");
				userGuess = scanner.nextInt();
				attempts++;
	
				if (userGuess < randomNumber) {
					System.out.println("Too low! Try again.");
				} else if (userGuess > randomNumber) {
					System.out.println("Too high! Try again.");
				} else {
					System.out.println("Congratulations! You've guessed the number " + randomNumber + " in " + attempts + " attempts.");
				}
			}
		
	}
	
}
