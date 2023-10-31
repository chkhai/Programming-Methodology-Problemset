import acm.program.ConsoleProgram;

public class Problem28 extends ConsoleProgram{
	private static final int SENTINEL = -1;
	
	public void run() {
		int count = 0;
		while(true){
			int n = readInt("Enter integer: ");
			if(n % 2 ==0){
				count++;
			}
			if(n == SENTINEL){
				break;
			}
		}
		println(count);
	
	}
}