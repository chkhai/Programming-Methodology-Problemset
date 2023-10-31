import acm.program.ConsoleProgram;

public class meotxeAmocana extends ConsoleProgram {

	public void run() {
		int a = readInt("Enter integer: ");
		int b = readInt("Enter integer: ");
		double c = calculatePithagoraemTheorem(a, b);
		println(c);
	}

	private double calculatePithagoraemTheorem(int a, int b) {
		double y = Math.sqrt(a*a +b*b);
		return y;
	}
}
