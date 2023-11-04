import acm.program.ConsoleProgram;


public class Problem31 extends ConsoleProgram{
	public void run(){
		double n = readInt("Enter integer: ");
		double count = 0;
		if(isPrime(n,count)){
			}
		}

	private boolean isPrime(double n, double count) {
		for(int i = 1; i < n; i++){
			if(n % i ==0){
				count++;
			}
		}
		if(count > 2){
			return false;
		}
	}	


}
