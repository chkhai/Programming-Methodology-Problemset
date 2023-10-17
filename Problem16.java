import acm.program.ConsoleProgram;
import java.lang.*;

public class Problem16 extends ConsoleProgram{
	
	public void run() {
		int a = readInt("Enter a: ");
		int b = readInt("Enter b: ");
		int c = readInt("Enter c: ");
		double harmonicaverage = 1.0 / (a+b+c);
		println("Harmonic average is " + harmonicaverage + ".");
	}

}
