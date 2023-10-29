import acm.program.ConsoleProgram;

public class meotxeAmocana extends ConsoleProgram{
	
	public void run() {
		int a = readInt("Enter integer: ");
		int b = readInt("Enter integer: ");
		double y = Math.sqrt(a * a + b * b);
		println(y);
	}	
}
