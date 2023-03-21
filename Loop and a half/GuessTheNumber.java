public class GuessTheNumber extends ConsoleProgram {
	public void run() {
		// Secret number for the game
		int secretNumber = 6;
		
		// Printing the inital text for the game
		System.out.println("I'm thinking of a number between 1 and 10.");
		System.out.println("See if you can guess the number!");
		
		// Looping until the user gets the number right
		while (true) {
			int user_input = readInt("Enter your guess: "); // Getting the users input
			
			// Check to see if the user got it right!
			if (user_input == secretNumber) {
				break; // Stop the while loop if user got it right!
			};
			
			// Keeps printings until the loop breaks, because this is after the break statement.
			System.out.println("Try again!");
		};
		
		// When user gets it right! We print this statement
		System.out.println("Correct!");
	};
};
