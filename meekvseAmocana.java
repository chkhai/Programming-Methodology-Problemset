import acm.program.ConsoleProgram;

public class meekvseAmocana extends ConsoleProgram {

	public void run() {
		int n = readInt("Enter integer: ");
		int count = 0;
		while (true) {
			if (n % 2 == 0) {
				println(n + " is even so I take half: " + n / 2);
				n = n / 2;
				count ++;
			} else {
				println(n + " is odd, so I make 3n+1:" + (3 * n + 1));
				n = 3 * n + 1;
				count ++;
			}
			if (n == 1) {
				break;
			}
		}
		print("The process took" + count + " to 1.");
	}
}
