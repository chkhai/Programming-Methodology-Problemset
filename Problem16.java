import acm.program.ConsoleProgram;

public class Problem16 extends ConsoleProgram{
	
	public void run() {
		int a = readInt("Enter a: ");
		int b = readInt("Enter b: ");
		int c = readInt("Enter c: ");
		double harmonicaverage = b * c * a / (b * c + c * a + a * b);
		println("Harmonic average is " + harmonicaverage + ".");
	}
}
