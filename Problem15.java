import acm.program.ConsoleProgram;

public class Problem15 extends ConsoleProgram{
	
	public void run() {
		println("This program calculates the arithmetic average of two numbers");
		double a = readInt("Enter a:");
		double b = readInt("Enter b:");
		double arithmetic average = a / 2 + b / 2;
		println("Arithmetic average is" + arithmetic average + ".");
	}
}
