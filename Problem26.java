import acm.program.ConsoleProgram;

public class Problem26 extends ConsoleProgram{
	public void run() {
		int a = readInt("Enter integer :");
		int b = readInt("Enter integer :");
		int k = gcd(a, b);
	}

	private int gcd(int a, int b) {
		while(a != 0 && b != 0){
			if(a > b){
				a %= b;
			}else{
				b %= a;
			}
		}
		if(a > b){
			return a;
		}
		return b;
	}
}
