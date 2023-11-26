import acm.program.ConsoleProgram;

public class LogarithmProblem extends ConsoleProgram{
	
	public void run() {
		int m = readInt("Enter natural number:");
		int n = readInt("Enter natural number:");
		int k = log(m, n);
		println(k);
	}

	private int log(int m, int n) {
		int multiply = 1;
		int count = 0;
		while(multiply < n){
			multiply = multiply * m;
			count++;
		}
		return count;
	}
}
