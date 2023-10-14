import acm.program.ConsoleProgram;

public class Problem15 extends ConsoleProgram{
	
	public void run() {
		println("This program calculates the arithmetic average of two numbers");
		int a = readInt("Enter a:");
		int b = readInt("Enter b:");
		int arithmetic average = a / 2 + b / 2;
		println("Arithmetic average is" + arithmetic average + ".");
	}
}
