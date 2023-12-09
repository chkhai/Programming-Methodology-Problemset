import acm.program.ConsoleProgram;

public class Problem55 extends ConsoleProgram{

	public void run() {
		int k = readInt("Enter natural numer: ");
		k = checkTheInput(k);
		
		
		
	}
	
	
	private int checkTheInput(int k) {
		while(k <= 0){
			println("Number must be positive!");
			k = readInt("Enter natural number: ");
		}
		return k;
	}
}
