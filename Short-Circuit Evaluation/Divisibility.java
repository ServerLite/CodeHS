public class Divisibility extends ConsoleProgram {
	public void run() {
		int dividend = readInt("Enter the dividend: "); // Getting the dividend integer from the user
		int divisor = readInt("Enter the divisor: "); // Getting the divisor integer from the user
		
		// Checking to see if divisor is greater than 0
		// Checking to see if the dividend is divisible by the divisor *is equal to* the same but in doubled format
		if (divisor > 0 && dividend / divisor == (double) dividend / divisor) {
			System.out.println(dividend + " is divisible by " + divisor + "!"); // Prints if true
		} else {
			System.out.println(dividend + " is not divisible by " + divisor); // Prints if false
		};
	};
};
