import acm.program.ConsoleProgram;

public class test extends ConsoleProgram{
	public void run() {
		int a = readInt("Enter integer: ");
		int b = readInt("Enter integer: ");
		double c = calculatePythagoreanTheorem(a, b);
		println("c=" + c);
	}

	/*
	 * This method helps us compute pythagoreanTheorem. Firstly it calculates
	 * the sum of a^2 and b^2 and then it takes square root of it.
	 */
	private double calculatePythagoreanTheorem(int a, int b) {
		double y = Math.sqrt(a * a + b * b);
		return y;
	}
}
	