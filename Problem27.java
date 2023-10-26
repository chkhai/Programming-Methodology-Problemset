import acm.program.ConsoleProgram;
//მომხმარებელს შეყავს n და m დაბეჭდეთ n^m
public class Problem27 extends ConsoleProgram{
	public void run() {
		int n = readInt("Enter integer: ");
		int m = readInt("Enter integer: ");
		int k = 1;
		for(int i = 0; i < m; i++) {
			k = k * n;
		}
		println("n powered by n is " + k);
	}
}
