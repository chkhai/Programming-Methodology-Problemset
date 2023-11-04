import acm.program.ConsoleProgram;


public class Problem31 extends ConsoleProgram{
	public void run(){
		int n = readInt("Enter integer: ");
		int count = 0;
		checkPrime(n, count);
	}

	private int checkPrime(int n, int count) {
		for(int i = 1; i < n; i++){
			if(n % i == 0){
				count++;
			}
		}
		return count;
	}


}
