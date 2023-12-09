import acm.program.ConsoleProgram;

public class LogarithmProblem extends ConsoleProgram{
	
	public void run() {
		int m = readInt("Enter natural number:");
		int n = readInt("Enter natural number:");
		int k = log(m, n);
		println(k);
	}

	private int log(int m, int n) {
		
		for(int i = 0; i < n; i++){
			if(power(m, i) > n){
				return i -1;
			}else if(power(m, i) == n){
				return i;
			}
		}
		return 0;
	}

	private int power(int m, int i) {
		int multiply = 1;
		for (int j = 0; j < i; j++) {
			multiply *= m;
		}
		return multiply;
		
	}
}