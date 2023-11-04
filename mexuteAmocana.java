import acm.program.ConsoleProgram;

//not finished
public class mexuteAmocana extends ConsoleProgram {
	private static final int SENTINEL = 0;

	public void run() {
		println("This program finds smallest and largest numbers. ");
		int k = readInt("? ");
		int max = k;
		int min = k;
		while(true){
			int n = readInt("? ");
			if (n == SENTINEL){
				break;
			}
			max = compareMaxAndN(max, n);
			min = compareMinAndN(min, n);
		}
		println("largest: " + max);
		println("smallest: " + min);
	}

	private int compareMaxAndN(int max, int n) {
		if (n > max) {
			max = n;
		}
		return max;
	}
}