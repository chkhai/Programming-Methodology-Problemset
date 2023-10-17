import acm.program.ConsoleProgram;

public class Problem16 extends ConsoleProgram{
	
	public void run() {
		double a = readInt("Enter a: ");
		double b = readInt("Enter b: ");
		double c = readInt("Enter c: ");
		double harmonicaverage = b * c * a / (b * c + c * a + a * b);
		println("Harmonic average is " + harmonicaverage + ".");
	}
}
