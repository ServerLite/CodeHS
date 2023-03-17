public class Factorial extends ConsoleProgram {
	public void run() {
		int result = 1; // This would be the ending result of the factorial
		
		int factorial_number = readInt("Number to be factorialed: "); // Getting a number from the user
		
		// For looping from the "factorial_number" to 1
		for (int i = factorial_number; i > 0; i--) {
			result = result * i; // Multiplying the variable 'i' to the result
		};
		
		System.out.println(result); // Displaying the factorial result
	};
};
