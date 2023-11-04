import acm.program.ConsoleProgram;


public class Problem31 extends ConsoleProgram{
	public void run(){
		double n = readInt("Enter integer: ");
		double count = 0;
		checkPrime(n, count);
		if(count == 2){
			println(n + " is prime number.");
		} else {
			println(n + " is not prime number.");
		}
	}

	private double checkPrime(double n, double count) {
		for(double i = 1; i < n; i++){
			if(n % i == 0){
				count++;
			}
		}
		return count;
	}


}
