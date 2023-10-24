import acm.program.ConsoleProgram;
//მომხმარებელს შეჰყავს ორი რიცხვი თქვენმა პროგრამამ უნდა დაბეჭდოს ამ ორი რიცხვის
//უმცირესი საერთო ჯერადი.
public class Problem25 extends ConsoleProgram{
	public void run() {
		int a = readInt("Enter integer: ");
		int b = readInt("Enter integer: ");
		int m = lcm(a, b);
		println(m);
		
	}

	private int lcm(int a, int b) {
		return a * b / gcd(a, b);
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
