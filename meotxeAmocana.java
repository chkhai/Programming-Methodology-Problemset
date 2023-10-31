import acm.program.ConsoleProgram;

public class meotxeAmocana extends ConsoleProgram {

	public void run() {
		int a = readInt("Enter integer: ");
		int b = readInt("Enter integer: ");
		double c = calculatePythagoreanTheorem(a, b);
		println(c);
	}

	private double calculatePythagoreanTheorem(int a, int b) {
		double y = Math.sqrt(a*a +b*b);
		return y;
	}
}
