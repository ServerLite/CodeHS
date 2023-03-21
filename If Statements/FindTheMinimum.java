public class FindMinimum extends ConsoleProgram {
	public void run() {
	
		// Create largest number possible
		// We will compare this number to see
		//	IF this is the minimum to the number from user input.
		int minimum = 9999999;
		
		// We have to take 3 integer inputs from the user
		int first_integer = readInt("Input a random number: "); // Getting a number from the user.
		int second_integer = readInt("Input another random number: "); // Getting another number from the user.
		int third_integer = readInput("I am sorry, but input another random number: "); // Getting another number from the user.
		
		// Check to see if the numbers are truly minimum
		if (first_integer < minimum) {
			minimum = first_integer; // Replace minimum if 'first_integer' is minimum
		};
		
		if (second_integer < minimum) {
			minimum = second_integer; // Replace minimum if 'second_integer' is minimum
		};
		
		if (third_integer < minimum) {
			minimum = third_integer; // Replace minimum if 'thrid_integer' is minimum
		};
		
		System.out.println(minimum);
	};
};
